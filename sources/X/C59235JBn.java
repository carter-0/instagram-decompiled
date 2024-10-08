package X;

import androidx.compose.ui.Modifier;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.JBn  reason: case insensitive filesystem */
public final class C59235JBn extends 0Yg implements 0sL {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59235JBn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A0A = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
        this.A07 = obj7;
        this.A08 = obj8;
        this.A09 = obj9;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                ((AnonymousClass5PJ) this.A0A).A08(C51966G9m.A0R(obj, obj2), this.A02, this.A03, this.A04, this.A05, this.A06, this.A07, this.A08, this.A09, C301445zH.A00(this.A01) | 1);
                break;
            case 1:
                Modifier modifier = (Modifier) this.A04;
                C231002qi r5 = (C231002qi) this.A09;
                C49725F3p f3p = (C49725F3p) this.A02;
                F2T f2t = (F2T) this.A0A;
                0sL r9 = (0sL) this.A06;
                I7A.A04(C51966G9m.A0R(obj, obj2), modifier, f3p, f2t, r5, (C62320sa) this.A07, (C62320sa) this.A08, (C62320sa) this.A05, r9, (AnonymousClass62P) this.A03, C51966G9m.A01(this.A01));
                break;
            default:
                JOX jox = (JOX) this.A04;
                JOX jox2 = (JOX) this.A07;
                0sP r7 = (0sP) this.A06;
                JOX jox3 = (JOX) this.A08;
                0sP r8 = (0sP) this.A02;
                C52741Gbt.A01(C51966G9m.A0R(obj, obj2), (C53396GnT) this.A0A, jox, jox2, jox3, (SettingsScreenViewModel) this.A03, r7, r8, (0sL) this.A05, (0sL) this.A09, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
