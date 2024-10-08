package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: X.TKq  reason: case insensitive filesystem */
public abstract class C13084TKq implements Runnable {
    public final C13567Tcn A00;

    public C13084TKq(Q6H q6h) {
        C13567Tcn tcn = q6h.A00;
        if (tcn == null) {
            tcn = new C12214SpE(q6h);
            q6h.A00 = tcn;
        }
        this.A00 = tcn;
    }

    public void A00() {
        C11474Sad sad;
        if (this instanceof QZ6) {
            QZ6 qz6 = (QZ6) this;
            C7365Q8i q8i = qz6.A01;
            UIManagerModule uIManagerModule = (UIManagerModule) q8i.A01.A01.A03(UIManagerModule.class);
            if (uIManagerModule != null) {
                int id = q8i.getId();
                02M r0 = qz6.A00;
                uIManagerModule.updateInsetsPadding(id, r0.A03, r0.A01, r0.A00, r0.A02);
            }
        } else if (this instanceof QZ4) {
            C7844QbS qbS = ((QZ4) this).A00;
            UIManagerModule uIManagerModule2 = (UIManagerModule) qbS.getReactContext().A01.A03(UIManagerModule.class);
            if (uIManagerModule2 != null) {
                uIManagerModule2.updateNodeSize(qbS.getId(), qbS.A01, qbS.A00);
            }
        } else if (this instanceof QZ5) {
            QZ5 qz5 = (QZ5) this;
            Window window = qz5.A00.getWindow();
            if (window != null) {
                boolean z = qz5.A01;
                View decorView = window.getDecorView();
                if (z) {
                    sad = C11474Sad.A00;
                } else {
                    sad = null;
                }
                decorView.setOnApplyWindowInsetsListener(sad);
                window.getDecorView().requestApplyInsets();
            }
        } else {
            QZ7 qz7 = (QZ7) this;
            Activity activity = qz7.A01;
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
                if (qz7.A02) {
                    ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), C51968G9o.A1Z(Integer.valueOf(window2.getStatusBarColor()), qz7.A00));
                    ofObject.addUpdateListener(new C11435SUp((Object) activity, 2));
                    ofObject.setDuration(300).setStartDelay(0);
                    ofObject.start();
                    return;
                }
                window2.setStatusBarColor(qz7.A00);
            }
        }
    }

    public final void run() {
        try {
            A00();
        } catch (RuntimeException e) {
            this.A00.handleException(e);
        }
    }
}
