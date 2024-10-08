package X;

import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentsSystrace;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7gf  reason: invalid class name and case insensitive filesystem */
public final class C337637gf implements C337647gg, C70852Wg {
    public final 2We A00;

    public final void EHQ(int i, int i2) {
        2We r1 = this.A00;
        if (r1.A08 == null) {
            r1.A01 = i;
            r1.A03 = 0;
            return;
        }
        r1.A0T.EKi(i, 0);
    }

    public final void EHg(Integer num, Object obj, int i) {
        int i2;
        2We r3 = this.A00;
        synchronized (r3) {
            i2 = 0;
            while (true) {
                List list = r3.A0i;
                if (i2 >= list.size()) {
                    i2 = -1;
                    break;
                }
                C338367hq A02 = ((C295015nP) list.get(i2)).A02();
                if (A02 != null && obj.equals(A02.Auo(PublicKeyCredentialControllerUtility.JSON_KEY_ID))) {
                    break;
                }
                i2++;
            }
        }
        r3.A0j(num, i2, 0);
    }

    public final boolean AFc() {
        return this.A00.A0E;
    }

    public final void AOO(int i) {
        this.A00.A0W(i);
    }

    public final void AOZ(int i, int i2) {
        this.A00.A0Z(i, i2);
    }

    public final int AnL(int i) {
        return this.A00.AnL(i);
    }

    public final void CNR(C338367hq r4, int i) {
        2We r2 = this.A00;
        AnonymousClass2VL.A00();
        2We.A0H(r2);
        if (C338337hn.A00) {
            r2.hashCode();
            r4.getName();
        }
        2We.A0R(r4);
        C295015nP A04 = 2We.A04(r2, r4);
        synchronized (r2) {
            if (!r2.A17) {
                r2.A0i.add(i, A04);
                r2.A0X.A00(r4);
            } else {
                throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
            }
        }
        r2.A0Q.notifyItemInserted(i);
        C338317hl r1 = r2.A0Y;
        boolean A03 = r1.A03(i, r2.A04);
        2We.A0O(r2, i, A03);
        r1.A01(A03);
    }

    public final void CNW(List list, int i, int i2) {
        2We r2 = this.A00;
        AnonymousClass2VL.A00();
        2We.A0H(r2);
        int i3 = 0;
        if (C338337hn.A00) {
            String[] strArr = new String[list.size()];
            for (int i4 = 0; i4 < list.size(); i4++) {
                strArr[i4] = ((C338367hq) list.get(i4)).getName();
            }
            r2.hashCode();
            list.size();
            Arrays.toString(strArr);
        }
        synchronized (r2) {
            int size = list.size();
            while (i3 < size) {
                C338367hq r4 = (C338367hq) list.get(i3);
                2We.A0R(r4);
                C295015nP A04 = 2We.A04(r2, r4);
                if (!r2.A17) {
                    r2.A0i.add(i + i3, A04);
                    r2.A0X.A00(r4);
                    i3++;
                } else {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
            }
        }
        r2.A0Q.notifyItemRangeInserted(i, list.size());
        C338317hl r1 = r2.A0Y;
        list.size();
        boolean A03 = r1.A03(i, r2.A04);
        2We.A0O(r2, i, A03);
        r1.A01(A03);
    }

    public final boolean Cey() {
        return this.A00.A0r;
    }

    public final void Cnv(2Sg r2, AnonymousClass2T3 r3, int i, int i2) {
        this.A00.Cnv(r2, r3, i, i2);
    }

    public final /* bridge */ /* synthetic */ void Cob(ViewGroup viewGroup) {
        this.A00.A0e((RecyclerView) viewGroup);
    }

    public final void Coc(int i, int i2) {
        this.A00.A0X(i, i2);
    }

    public final void Crl(C338387hs r4, boolean z) {
        2We r1 = this.A00;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("notifyChangeSetComplete");
        }
        try {
            if (C338337hn.A00) {
                r1.hashCode();
            }
            AnonymousClass2VL.A00();
            if (!r1.A17) {
                r4.D7k();
                r1.A0f.addLast(r4);
                2We.A0J(r1);
                if (z) {
                    2We.A0L(r1);
                }
                if (!isTracing) {
                    return;
                }
                return;
            }
            throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    public final void EHf(Integer num, int i, int i2) {
        this.A00.A0j(num, i, i2);
    }

    public final boolean Ez4() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void FIe(ViewGroup viewGroup) {
        this.A00.A0f((RecyclerView) viewGroup);
    }

    public final void FJV(C338367hq r2, int i) {
        this.A00.A0i(r2, i);
    }

    public final void FLK(List list, int i, int i2) {
        this.A00.A0c(i, list);
    }

    public final void detach() {
        this.A00.detach();
    }

    public C337637gf(2We r1) {
        this.A00 = r1;
    }
}
