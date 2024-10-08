package X;

import android.widget.CompoundButton;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.Iterator;

public final class LZI implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LZI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        0sP r1;
        int i;
        switch (this.A00) {
            case 0:
                if (z) {
                    int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    K84 k84 = ((C60582Jnr) this.A02).A00;
                    C60996Jus jus = ((C61171JyN) this.A01).A00;
                    0qQ.A0B(jus, 0);
                    String str = jus.A05;
                    ArrayList A0q = AnonymousClass7TF.A0q(str, 0);
                    05G r6 = ((C60175Jgu) k84.A03.getValue()).A02;
                    Iterator A1H = C51966G9m.A1H(r6.getValue());
                    while (A1H.hasNext()) {
                        Object obj = (C232262tL) A1H.next();
                        if (!(obj instanceof C64746LhN) && !(obj instanceof C64773Lhp)) {
                            if (obj instanceof C61171JyN) {
                                C60996Jus jus2 = ((C61171JyN) obj).A00;
                                obj = new C61171JyN(jus2, 0qQ.A0K(jus2.A05, str));
                            }
                        }
                        A0q.add(obj);
                    }
                    r6.Epw(A0q);
                    AnonymousClass0eM r2 = k84.A02;
                    DbX.A0R(r2).A00(new C64643LfV(jus));
                    JVF.A01(k84, AnonymousClass7TE.A0l(r2), AnonymousClass05K.A0X);
                    return;
                }
                return;
            case 1:
                if (z) {
                    int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    r1 = ((C61817KNg) this.A02).A01;
                    break;
                } else {
                    return;
                }
            case 2:
                if (z) {
                    int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    r1 = ((C61818KNh) this.A02).A02;
                    break;
                } else {
                    return;
                }
            case 3:
                LSk lSk = (LSk) this.A01;
                if (z) {
                    i = 3702;
                } else {
                    i = 3703;
                }
                LSk.A03(lSk, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "trial_settings", AnonymousClass000.A00(i));
                0sP r0 = ((K45) this.A02).A00;
                if (r0 != null) {
                    C51968G9o.A1O(r0, z);
                    return;
                }
                return;
            default:
                C61366K4k k4k = (C61366K4k) this.A02;
                AnonymousClass0eM r62 = k4k.A01;
                Boolean valueOf = Boolean.valueOf(z);
                ((C60296Jiu) r62.getValue()).A00.A01("IS_CAPTIONS_ENABLED", valueOf);
                AnonymousClass0eM r4 = k4k.A00;
                0lg A0X = DbT.A0X(r4);
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, A0X, 36322920674503337L) && 182.A06(r3, DbT.A0X(r4), 36322920674831022L)) {
                    IgdsListCell igdsListCell = (IgdsListCell) this.A01;
                    igdsListCell.setChecked(z);
                    igdsListCell.setEnabled(z);
                    C60296Jiu.A00(r62).A01("IS_CAPTIONS_TRANSLATIONS_ENABLED", valueOf);
                    return;
                }
                return;
        }
        r1.invoke(this.A01);
    }
}
