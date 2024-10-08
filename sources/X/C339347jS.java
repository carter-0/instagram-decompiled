package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7jS  reason: invalid class name and case insensitive filesystem */
public final class C339347jS implements C3495480u {
    public final /* synthetic */ C339297jN A00;

    public C339347jS(C339297jN r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Window window;
        int i;
        0qQ.A0B(obj, 0);
        C339297jN r3 = this.A00;
        if (obj == AnonymousClass80L.A00) {
            C339297jN.A00(r3);
            UserSession userSession = r3.A0E;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36318221980211199L)) {
                if (r3.A00 == null) {
                    View inflate = ((ViewStub) r3.A09.requireViewById(R.id.iglive_audience_pill_stub)).inflate();
                    r3.A00 = inflate;
                    if (inflate != null) {
                        AnonymousClass3NG r1 = new AnonymousClass3NG(inflate);
                        r1.A04 = new AZC(r3);
                        r1.A05 = AnonymousClass05K.A01;
                        r1.A00();
                        View requireViewById = inflate.requireViewById(R.id.iglive_audience_pill_icon);
                        0qQ.A07(requireViewById);
                        ImageView imageView = (ImageView) requireViewById;
                        r3.A01 = imageView;
                        AnonymousClass4DH r6 = r3.A0B;
                        Drawable A002 = C39806AAd.A00(r6.getContext(), r3.A04, true);
                        if (A002 != null) {
                            imageView.setImageDrawable(A002);
                        }
                        View requireViewById2 = inflate.requireViewById(R.id.iglive_audience_pill_text);
                        0qQ.A07(requireViewById2);
                        TextView textView = (TextView) requireViewById2;
                        textView.setText(C39806AAd.A01(r6.getContext(), userSession, r3.A04, true));
                        r3.A02 = textView;
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (!r3.A05 && (i = 1Au.A00(userSession).A01.getInt("live_pre_live_audience_pill_tooltip_view_count", 0)) < 2) {
                    Handler handler = r3.A08;
                    handler.removeCallbacksAndMessages((Object) null);
                    handler.postDelayed(new C41036AnK(r3, i), 2000);
                }
            }
            View view = r3.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            r3.A0H.A0A(r3.A09);
            C231002qi r0 = r3.A03;
            if (r0 != null) {
                r0.Dh3();
                r3.A0A.A06(1.0d);
                AnonymousClass4DH r2 = r3.A0B;
                Activity rootActivity = r2.getRootActivity();
                if (rootActivity != null) {
                    window = rootActivity.getWindow();
                } else {
                    window = null;
                }
                if (r2.isAdded() && window != null) {
                    window.addFlags(128);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (obj != AnonymousClass9QA.A00 || !1NM.A01(r3.A0E)) {
            C339297jN.A01(r3);
        } else {
            C339297jN.A01(r3);
            r3.A0I.A03(C391019sD.STORY);
            r3.A0A.A03();
        }
    }
}
