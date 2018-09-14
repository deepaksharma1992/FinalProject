package builditbigger;

import android.content.Context;
import android.support.test.filters.LargeTest;
import android.support.test.filters.SmallTest;
import android.test.AndroidTestCase;
import android.util.Pair;

import com.example.jokerzz.Jokes;
import com.udacity.gradle.builditbigger.MainActivity;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@LargeTest
public class JokesTest extends AndroidTestCase implements MainActivity.OnJokeListener {

    CountDownLatch signal;

    String joke;

    @SuppressWarnings("unchecked")
    @SmallTest
    public void test() {
        try {
            signal = new CountDownLatch(1);
            String randomJoke = Jokes.getJoke();
            MainActivity.EndpointsAsyncTask endpointsAsyncTask = new MainActivity.EndpointsAsyncTask(getContext(), this);
            endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), randomJoke));

            //Waiting for async tast to complete
            signal.await(10, TimeUnit.SECONDS);
            //assert test for testing the jokes
            assertNotNull(randomJoke, joke);
            assertFalse(randomJoke, joke.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            // the test will fail if exception will arise. I don't think that we need to pass the test in case of any exception
            fail();
        }

    }


    @Override
    public void onJokeStringData(String result) {
        this.joke = result;
        signal.countDown();
    }
}