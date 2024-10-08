package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* renamed from: X.35i  reason: invalid class name and case insensitive filesystem */
public final class C2368535i implements 1wn {
    public final /* synthetic */ AnonymousClass35W A00;

    public C2368535i(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(-1105245546);
        AnonymousClass3DR r10 = (AnonymousClass3DR) obj;
        int A032 = AnonymousClass0fD.A03(-1306294802);
        0qQ.A0B(r10, 0);
        AnonymousClass35W r1 = this.A00;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) r10.A00);
        0qQ.A07(copyOf);
        WeakReference weakReference = r1.A0b;
        C227802jw r2 = (C227802jw) weakReference.get();
        if (r2 != null) {
            C71162bE A08 = r2.A08();
            if (A08 != null) {
                str = A08.A02;
            } else {
                str = "";
            }
            if (r2.mView == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("triggered without view in MainFeedFragment  isDetatched: ");
                sb.append(r2.mDetached);
                sb.append(" isInLayout ");
                sb.append(r2.mInLayout);
                sb.append(" isResumed ");
                sb.append(r2.isResumed());
                sb.append(" isRemoving ");
                sb.append(r2.mRemoving);
                0wb.A03("quick_capture_camera_animation_error", sb.toString());
                AnonymousClass4DH r22 = (AnonymousClass4DH) weakReference.get();
                if (r22 != null) {
                    if (r22.getActivity() == null) {
                        r22.getRootActivity();
                    }
                    Activity activity = r22.mParentFragment;
                    if (!(activity instanceof 2ZS)) {
                        activity = r22.getRootActivity();
                        0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
                    }
                    2b7 r0 = ((2ZS) activity).A09;
                    r0.getClass();
                    AVK avk = r0.A02.A0E;
                    if (avk != null) {
                        avk.A02(str);
                    }
                }
            } else {
                r2.getScrollingViewProxy().Ejl(0);
                ViewGroup CEd = r2.getScrollingViewProxy().CEd();
                if (CEd != null) {
                    CEd.post(new C51490Fuy(r2, str, copyOf));
                }
            }
        }
        AnonymousClass0fD.A0A(-302173139, A032);
        AnonymousClass0fD.A0A(1491537643, A03);
    }
}
