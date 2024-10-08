package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.GuidanceTipResponse;
import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.JBm  reason: case insensitive filesystem */
public final class C59234JBm extends 0Yg implements 0sL {
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
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59234JBm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A0A = z;
        this.A05 = obj3;
        this.A08 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A09 = obj7;
        this.A04 = obj8;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C62320sa r6 = (C62320sa) this.A04;
            C62320sa r7 = (C62320sa) this.A08;
            OpalProfileData opalProfileData = (OpalProfileData) this.A06;
            boolean z = this.A0A;
            C61052Jvq jvq = (C61052Jvq) this.A07;
            AnonymousClass0iw r4 = (AnonymousClass0iw) this.A02;
            I7S.A03(A0R, (Modifier) this.A03, jvq, r4, opalProfileData, r6, r7, (0sL) this.A05, (0sL) this.A09, C51966G9m.A01(this.A01), z);
        } else {
            boolean z2 = this.A0A;
            C54932HYo.A00(A0R, (AchievementIntf) this.A02, (GuidanceTipResponse) this.A03, (Boolean) this.A04, (C62320sa) this.A05, (0sP) this.A08, (0sP) this.A06, (0sP) this.A07, (0sL) this.A09, C51966G9m.A01(this.A01), z2);
        }
        return C60340gF.A00;
    }
}
