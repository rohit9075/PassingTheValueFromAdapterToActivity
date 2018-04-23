package rohit.com.recyclerviewexample.Listner;

import android.view.View;

/**
 * Created by rohit on 11/20/2017.
 */

public interface RecyclerOnClickListner {

    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
