package X;

import android.view.View;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

public final class USH extends C19068WIz {
    public final void EhN(View view, Object obj, String str) {
        String str2;
        double A00;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    ReactProgressBarViewManager reactProgressBarViewManager = (ReactProgressBarViewManager) this.A00;
                    if (obj == null) {
                        A00 = 0.0d;
                    } else {
                        A00 = JTO.A00(obj);
                    }
                    reactProgressBarViewManager.setProgress(view, A00);
                    return;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    ReactProgressBarViewManager reactProgressBarViewManager2 = (ReactProgressBarViewManager) this.A00;
                    if (obj == null) {
                        str2 = "";
                    } else {
                        str2 = (String) obj;
                    }
                    reactProgressBarViewManager2.setTestID(view, str2);
                    return;
                }
                break;
            case -676876213:
                if (str.equals(ReactProgressBarViewManager.PROP_ATTR)) {
                    return;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    ((ReactProgressBarViewManager) this.A00).setColor(view, SPt.A00(view.getContext(), obj));
                    return;
                }
                break;
            case 633138363:
                if (str.equals(ReactProgressBarViewManager.PROP_INDETERMINATE)) {
                    ((ReactProgressBarViewManager) this.A00).setIndeterminate(view, Pxi.A1Y(obj, false));
                    return;
                }
                break;
            case 1118509918:
                if (str.equals(ReactProgressBarViewManager.PROP_ANIMATING)) {
                    ((ReactProgressBarViewManager) this.A00).setAnimating(view, Pxi.A1Y(obj, true));
                    return;
                }
                break;
            case 1804741442:
                if (str.equals(ReactProgressBarViewManager.PROP_STYLE)) {
                    String str3 = null;
                    ReactProgressBarViewManager reactProgressBarViewManager3 = (ReactProgressBarViewManager) this.A00;
                    if (obj != null) {
                        str3 = (String) obj;
                    }
                    reactProgressBarViewManager3.setStyleAttr(view, str3);
                    return;
                }
                break;
        }
        super.EhN(view, obj, str);
    }
}
