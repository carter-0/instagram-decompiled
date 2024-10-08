package X;

import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CwZ  reason: case insensitive filesystem */
public class C45446CwZ {
    public UndoStyle A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public ConfirmationStyle A05;
    public ConfirmationTitleStyle A06;
    public C246213eD A07;
    public MediaOptionStyle A08;
    public Boolean A09;
    public String A0A;
    public final AnonymousClass1eD A0B;

    public final 1eB A00() {
        ArrayList arrayList;
        String str = this.A01;
        String str2 = this.A02;
        ConfirmationStyle confirmationStyle = this.A05;
        String str3 = this.A03;
        ConfirmationTitleStyle confirmationTitleStyle = this.A06;
        Boolean bool = this.A09;
        List list = this.A04;
        C246203eC r4 = null;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41846B3n.A1X(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        C246213eD r0 = this.A07;
        if (r0 != null) {
            r4 = r0.F3E();
        }
        return new 1eB(confirmationStyle, confirmationTitleStyle, r4, this.A08, this.A00, bool, str, str2, str3, this.A0A, arrayList);
    }

    public C45446CwZ(AnonymousClass1eD r2) {
        this.A0B = r2;
        this.A01 = r2.Apv();
        this.A02 = r2.Apw();
        this.A05 = r2.Apx();
        this.A03 = r2.Apy();
        this.A06 = r2.Apz();
        this.A09 = r2.B1L();
        this.A04 = r2.B73();
        this.A07 = r2.B74();
        this.A0A = r2.getTitle();
        this.A08 = r2.C7w();
        this.A00 = r2.CBP();
    }
}
