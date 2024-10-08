package X;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Deprecated;

public interface X9N {
    @Deprecated(message = "")
    int addRootView(View view, C13948Tm8 tm8);

    void addUIManagerEventListener(X2X x2x);

    void dispatchCommand(int i, int i2, ReadableArray readableArray);

    void dispatchCommand(int i, String str, ReadableArray readableArray);

    void removeUIManagerEventListener(X2X x2x);

    View resolveView(int i);

    void sendAccessibilityEvent(int i, int i2);

    void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap);

    void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5);
}
