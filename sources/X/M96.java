package X;

import android.app.Activity;
import android.view.View;
import android.widget.ScrollView;
import com.instagram.igtv.widget.TitleDescriptionEditor;

public final /* synthetic */ class M96 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ScrollView A01;
    public final /* synthetic */ TitleDescriptionEditor A02;

    public /* synthetic */ M96(Activity activity, ScrollView scrollView, TitleDescriptionEditor titleDescriptionEditor) {
        this.A02 = titleDescriptionEditor;
        this.A01 = scrollView;
        this.A00 = activity;
    }

    public final void run() {
        TitleDescriptionEditor titleDescriptionEditor = this.A02;
        ScrollView scrollView = this.A01;
        Activity activity = this.A00;
        if (!titleDescriptionEditor.A0L && titleDescriptionEditor.A04 != 0) {
            int height = titleDescriptionEditor.A0K.getHeight() - titleDescriptionEditor.A0K.getBaseline();
            titleDescriptionEditor.A0K.setDropDownVerticalOffset(height);
            int height2 = (((scrollView.getHeight() - titleDescriptionEditor.A04) - titleDescriptionEditor.A05) - titleDescriptionEditor.A0F.getHeight()) - height;
            if (height2 > 0) {
                titleDescriptionEditor.A0K.setDropDownHeight(height2);
            }
            titleDescriptionEditor.A0L = true;
        }
        activity.getClass();
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && currentFocus.equals(titleDescriptionEditor.A0J)) {
            TitleDescriptionEditor.A00(titleDescriptionEditor, true);
        }
    }
}
