package X;

import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.9Lq  reason: invalid class name and case insensitive filesystem */
public final class C377389Lq extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377389Lq(LithoView lithoView, UserSession userSession, AnonymousClass4GS r4, C246653ex r5, AnonymousClass33B r6, C246853fL r7, AnonymousClass4DU r8, AnonymousClass3W1 r9, AnonymousClass4DV r10, WeakReference weakReference, C62320sa r12, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A09 = r9;
        this.A0C = r5;
        this.A04 = userSession;
        this.A07 = r8;
        this.A01 = i;
        this.A05 = r4;
        this.A08 = lithoView;
        this.A06 = r6;
        this.A0B = r7;
        this.A02 = weakReference;
        this.A0A = r10;
        this.A03 = r12;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3W1 r10;
        Object obj2 = obj;
        if (this.A00 != 0) {
            int intValue = ((Number) obj2).intValue();
            r10 = (AnonymousClass3W1) this.A09;
            r10.A0A = intValue;
        } else {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            r10 = (AnonymousClass3W1) this.A09;
            r10.A2Z = booleanValue;
        }
        UserSession userSession = (UserSession) this.A04;
        int i = this.A01;
        AnonymousClass4GS r5 = (AnonymousClass4GS) this.A05;
        LithoView lithoView = (LithoView) this.A08;
        AnonymousClass33B r7 = (AnonymousClass33B) this.A06;
        C246853fL r8 = (C246853fL) this.A0B;
        AnonymousClass4DV r11 = (AnonymousClass4DV) this.A0A;
        boolean A032 = C249223jK.A03(userSession);
        0qQ.A0B(userSession, 0);
        AnonymousClass4GQ.A00(lithoView, userSession, r5, (C246653ex) this.A0C, r7, r8, (AnonymousClass4DU) this.A07, r10, r11, (WeakReference) this.A02, (C62320sa) this.A03, i, A032, 182.A06(0Tu.A05, userSession, 36320652932096714L));
        return C60340gF.A00;
    }
}
