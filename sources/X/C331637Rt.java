package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Rt  reason: invalid class name and case insensitive filesystem */
public final class C331637Rt extends C331647Ru {
    public View A00;
    public C330077Li A01;
    public C330047Lf A02;
    public C333517Zg A03;
    public final AnonymousClass0eM A04 = new C227862kA(new AnonymousClass9L4(this, 44), new AnonymousClass9L4(this, 45), C317496nM.A00, new 0Yh(C331657Rv.class));
    public final boolean A05;
    public final AnonymousClass4DH A06;
    public final AnonymousClass0iw A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C331637Rt(AnonymousClass4DH r6, AnonymousClass0iw r7, C331627Rs r8, boolean z) {
        super(r8);
        0qQ.A0B(r7, 3);
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = z;
    }

    public static final void A00(Context context, C331637Rt r4, C330077Li r5, C333517Zg r6) {
        C331657Rv r2 = (C331657Rv) r4.A04.getValue();
        0qQ.A0B(context, 0);
        C333437Yy BCh = r6.BCh();
        AnonymousClass7LZ r0 = (AnonymousClass7LZ) BCh.AvG().getValue();
        if (r0 == null) {
            r0 = BCh.BHC();
        }
        C330147Lp A002 = C331657Rv.A00(context, r2, r0);
        if (A002 != null) {
            if (Systrace.A0E(1)) {
                0fS.A01("PrebindThreadHeader", -909695730);
            }
            try {
                r5.A02(A002);
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(1289817609);
                }
            }
        }
    }

    public static final void A01(C331637Rt r18) {
        C331637Rt r12 = r18;
        View view = r12.A00;
        String str = "parent";
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.direct_thread_header);
            viewGroup.setVisibility(0);
            Context context = viewGroup.getContext();
            View view2 = r12.A00;
            if (view2 != null) {
                LayoutInflater from = LayoutInflater.from(view2.getContext());
                0qQ.A07(from);
                View A012 = 2Su.A01(from, (ViewGroup.LayoutParams) null, viewGroup, R.layout.layout_direct_thread_header, true, true);
                C331627Rs r2 = r12.A00;
                UserSession userSession = r2.A00;
                AnonymousClass0iw r7 = r12.A07;
                C333517Zg r0 = r12.A03;
                str = "clientInfra";
                if (r0 != null) {
                    C330067Lh r9 = new C330067Lh(r7, userSession, r0);
                    AnonymousClass4DH r6 = r12.A06;
                    C330047Lf r10 = r12.A02;
                    if (r10 == null) {
                        str = "actionBarListener";
                    } else {
                        r12.A01 = new C330077Li(A012, r6, r7, userSession, r9, r10);
                        0qQ.A0A(context);
                        C333517Zg r1 = r12.A03;
                        if (r1 != null) {
                            C330077Li r02 = r12.A01;
                            if (r02 == null) {
                                str = "viewHolder";
                            } else {
                                A00(context, r12, r02, r1);
                                07U r102 = 07U.A05;
                                AnonymousClass07Z r13 = (AnonymousClass07Z) r2.A01.invoke();
                                AnonymousClass0xx A002 = AnonymousClass07a.A00(r13);
                                AnonymousClass9KM r92 = new AnonymousClass9KM((Object) r102, (Object) context, (Object) r12, (Object) r13, (AnonymousClass4D7) null, 10);
                                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r92, A002);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
