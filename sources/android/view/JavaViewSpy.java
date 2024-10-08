package android.view;

import android.content.Context;

public class JavaViewSpy extends View {
    public JavaViewSpy(Context context) {
        super(context);
        throw new UnsupportedOperationException("This class isn't meant to be instantiated");
    }

    public static int windowAttachCount(View view) {
        return view.getWindowAttachCount();
    }
}
