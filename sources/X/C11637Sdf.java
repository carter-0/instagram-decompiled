package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sdf  reason: case insensitive filesystem */
public final class C11637Sdf implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C11637Sdf(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj2;
        this.A02 = obj4;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        switch (this.A00) {
            case 0:
                SUj sUj = (SUj) obj;
                0qQ.A0B(sUj, 0);
                C8882RDz rDz = sUj.A00;
                if (rDz == C8882RDz.SUCCESS || rDz == C8882RDz.ERROR) {
                    0r1 r1 = (0r1) this.A01;
                    if (r1.A00) {
                        r1.A00 = false;
                        return;
                    }
                    Pxe.A1P(this, this.A02);
                    ((C12431SuI) this.A04).A00.A06 = Boolean.valueOf(C11353SOm.A01().A07("1302814060304063", DbS.A0y(), DbS.A0y()));
                    DbS.A1U(this.A03);
                    return;
                }
                return;
            case 1:
                SUj sUj2 = (SUj) obj;
                QC9 qc9 = (QC9) this.A01;
                qc9.A00.setVisibility(DbW.A01(SUj.A0T(sUj2) ? 1 : 0));
                if (SUj.A0V(sUj2)) {
                    Pxe.A1P(this, this.A04);
                    qc9.AVU((Bundle) this.A03, (C11330SNj) this.A02, (Throwable) null);
                    return;
                } else if (SUj.A0S(sUj2)) {
                    Pxe.A1P(this, this.A04);
                    qc9.AVU((Bundle) this.A03, (C11330SNj) null, sUj2.A02);
                    return;
                } else {
                    return;
                }
            case 2:
                String str = ((C10257RpH) obj).A00;
                boolean equalsIgnoreCase = "LOCKED".equalsIgnoreCase(str);
                TextView textView = (TextView) this.A04;
                int i = 2131962147;
                if (equalsIgnoreCase) {
                    i = 2131962150;
                }
                textView.setText(i);
                int A002 = DbW.A00("DELETED".equalsIgnoreCase(str) ? 1 : 0);
                textView.setVisibility(A002);
                ((View) this.A03).setVisibility(A002);
                ((View) this.A02).setVisibility(A002);
                return;
            default:
                C10957S2p s2p = (C10957S2p) this.A02;
                String str2 = s2p.A03;
                Map map = ((C10499RtE) this.A01).A00;
                Object obj2 = map.get(str2);
                if (obj2 == null) {
                    obj2 = C8884REb.UNKNOWN;
                }
                if (obj != obj2) {
                    C8884REb rEb = C8884REb.CONNECTED;
                    if (obj == rEb) {
                        ((List) this.A03).add(s2p);
                    }
                    0qQ.A0A(obj);
                    0qQ.A0B(obj, 1);
                    map.put(str2, obj);
                    Collection values = map.values();
                    if (values == null || !values.isEmpty()) {
                        for (Object next : values) {
                            if (next != rEb && next != C8884REb.UNSUCCESSFUL) {
                                if (obj == C8884REb.UNKNOWN || obj == C8884REb.FIRST_RETRY) {
                                    s2p.A00();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    ((2Fk) this.A04).A0B(this.A03);
                    return;
                }
                return;
        }
    }
}
