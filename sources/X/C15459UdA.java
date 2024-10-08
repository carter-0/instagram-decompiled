package X;

import android.content.Context;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.user.model.User;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.UdA  reason: case insensitive filesystem */
public final class C15459UdA extends C331047Ph {
    public boolean A00 = true;
    public boolean A01;
    public boolean A02;
    public final C15535UeO A03;
    public final UserSession A04;
    public final C19881WhA A05 = new C19881WhA();
    public final C337287g2 A06;
    public final C337287g2 A07 = new AnonymousClass7g1();
    public final TwD A08 = new TwD();
    public final C17962Viv A09 = new Object();
    public final C363288jT A0A;
    public final Set A0B = new HashSet();
    public final Set A0C = new HashSet();
    public final Set A0D = new HashSet();
    public final Set A0E = new HashSet();
    public final Context A0F;
    public final C15567Uev A0G;
    public final C46437Dez A0H;
    public final EAC A0I;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Viv, java.lang.Object] */
    public C15459UdA(Context context, C15395Uby uby, AnonymousClass0iw r9, UserSession userSession, C337287g2 r11, ArrayList arrayList) {
        Integer num;
        this.A0F = context;
        this.A04 = userSession;
        this.A0A = C363288jT.A00(userSession);
        this.A06 = r11;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ParcelableCommenterDetails parcelableCommenterDetails = (ParcelableCommenterDetails) it.next();
            Set set = this.A0B;
            Parcelable.Creator creator = User.CREATOR;
            User user = new User(new BigDecimal(parcelableCommenterDetails.A00).toPlainString(), parcelableCommenterDetails.A04);
            user.A1F(parcelableCommenterDetails.A06);
            if (parcelableCommenterDetails.A05) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A01;
            }
            user.A0q(num);
            user.A0t(parcelableCommenterDetails.A01);
            user.A0u(parcelableCommenterDetails.A03);
            user.A03.EhC(parcelableCommenterDetails.A02);
            set.add(new C66632Ma1(user));
        }
        Context context2 = this.A0F;
        C46437Dez dez = new C46437Dez(context2);
        this.A0H = dez;
        C15567Uev uev = new C15567Uev(context2);
        this.A0G = uev;
        C15535UeO ueO = new C15535UeO(context2, uby, r9, userSession);
        this.A03 = ueO;
        EAC eac = new EAC(context2, uby);
        this.A0I = eac;
        A0B(dez, uev, ueO, eac);
    }

    private void A00(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            C66632Ma1 ma1 = (C66632Ma1) it.next();
            C66966Mfz mfz = new C66966Mfz();
            mfz.A01 = i;
            mfz.A00 = i;
            mfz.A0D = this.A0B.contains(ma1);
            C66967Mg0 mg0 = new C66967Mg0(mfz);
            A09(this.A03, ma1.A06(), mg0);
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r6 = this;
            r6.A06()
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0037
            java.util.Set r1 = r6.A0B
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x002e
            java.util.Set r0 = r6.A0E
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002e
            r1 = 0
            X.Uev r0 = r6.A0G
        L_0x001a:
            r6.A08(r0, r1)
        L_0x001d:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x002a
            X.TwD r2 = r6.A08
            X.Viv r1 = r6.A09
            X.EAC r0 = r6.A0I
            r6.A09(r0, r2, r1)
        L_0x002a:
            r6.A07()
            return
        L_0x002e:
            r6.A00(r1)
            java.util.Set r0 = r6.A0E
            r6.A00(r0)
            goto L_0x001d
        L_0x0037:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0051
            X.WhA r0 = r6.A05
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0051
            android.content.Context r1 = r6.A0F
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            java.lang.String r1 = r1.getString(r0)
            X.Dez r0 = r6.A0H
            goto L_0x001a
        L_0x0051:
            X.WhA r5 = r6.A05
            r4 = 0
        L_0x0054:
            java.util.List r1 = r5.A00
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x001d
            java.lang.Object r3 = r1.get(r4)
            X.Mfb r3 = (X.C66942Mfb) r3
            X.Ma1 r3 = (X.C66632Ma1) r3
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r4
            java.util.Set r0 = r6.A0B
            boolean r0 = r0.contains(r3)
            r1.A0D = r0
            X.Mg0 r2 = new X.Mg0
            r2.<init>(r1)
            com.instagram.user.model.User r1 = r3.A06()
            X.UeO r0 = r6.A03
            r6.A09(r0, r1, r2)
            int r4 = r4 + 1
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15459UdA.A0C():void");
    }
}
