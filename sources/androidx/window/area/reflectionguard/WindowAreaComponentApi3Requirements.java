package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.core.util.function.Consumer;

public interface WindowAreaComponentApi3Requirements extends WindowAreaComponentApi2Requirements {
    void addRearDisplayPresentationStatusListener(Consumer consumer);

    void endRearDisplayPresentationSession();

    DisplayMetrics getRearDisplayMetrics();

    ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(Consumer consumer);

    void startRearDisplayPresentationSession(Activity activity, Consumer consumer);
}
