package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.8Cm  reason: invalid class name and case insensitive filesystem */
public final class C352228Cm {
    public C352218Cl A00;
    public final Context A01;
    public final View A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C3499482o A05;
    public final C352238Cn A06;
    public final C352208Cj A07;
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C377269Le(this, 17));
    public final C357638Yz A09;

    public C352228Cm(Context context, View view, AnonymousClass4DH r9, UserSession userSession, C357638Yz r11, C3499482o r12, C352208Cj r13) {
        0qQ.A0B(view, 4);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = r9;
        this.A02 = view;
        this.A07 = r13;
        this.A05 = r12;
        this.A09 = r11;
        this.A06 = new C352238Cn(view, r9, r13);
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r9.getViewLifecycleOwner());
        C376889Js r0 = new C376889Js(this, (AnonymousClass4D7) null, 34);
        19B r4 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r4, r0, A002);
        1Eo.A03(num, r4, new C376889Js(this, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(r9.getViewLifecycleOwner()));
    }

    public static final IgGltfSceneLayoutView A00(C352228Cm r3) {
        if (C39600A1q.A00(r3.A04, (C279284yO) r3.A09.A08.A00, r3.A05.A0D())) {
            return (IgGltfSceneLayoutView) r3.A08.getValue();
        }
        return null;
    }
}
