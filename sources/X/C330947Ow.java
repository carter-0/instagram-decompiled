package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.7Ow  reason: invalid class name and case insensitive filesystem */
public final class C330947Ow implements Runnable {
    public final /* synthetic */ C330497Nb A00;
    public final /* synthetic */ boolean A01;

    public C330947Ow(C330497Nb r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void run() {
        2HY r0;
        View A1D;
        View findViewById;
        Object A0W;
        AnonymousClass758 CEa;
        1Xj BPr;
        C330737Nz r7;
        if (this.A01) {
            C330497Nb r1 = this.A00;
            Object value = r1.A0D.getValue();
            0qQ.A07(value);
            if (((Boolean) value).booleanValue() && (r7 = r1.A09) != null && r7.A00 == null) {
                Set singleton = Collections.singleton(78);
                0qQ.A07(singleton);
                RecyclerView recyclerView = r1.A05;
                r7.A02(r1.A04, recyclerView, singleton, 182.A06(0Tu.A05, r1.A06, 36322065975945141L));
                return;
            }
        }
        C330497Nb r8 = this.A00;
        AnonymousClass7L3 r6 = r8.A0A;
        if (r6.A04 == AnonymousClass05K.A01) {
            Object value2 = r8.A0E.getValue();
            0qQ.A07(value2);
            if (((Boolean) value2).booleanValue()) {
                return;
            }
        }
        LinearLayoutManager linearLayoutManager = r8.A04;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a != -1) {
            Integer num = r8.A01;
            Integer num2 = AnonymousClass05K.A00;
            if (num == num2) {
                r0 = new 2HY(A1a, A1b);
            } else {
                r0 = new 2HZ(A1b, A1a, -1);
            }
            int i = r0.A00;
            int i2 = r0.A01;
            int i3 = r0.A02;
            if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
                while (true) {
                    AnonymousClass7ZY r4 = r8.A08;
                    DirectMessageIdentifier BSQ = r4.BSQ(new C377849Nm(r8), i, true);
                    if (!(BSQ == null || (A1D = linearLayoutManager.A1D(i)) == null || (findViewById = A1D.findViewById(R.id.media_container)) == null)) {
                        Rect rect = r8.A03;
                        if (findViewById.getGlobalVisibleRect(rect) && ((float) rect.height()) >= ((float) findViewById.getHeight()) * 0.95f) {
                            DirectMessageIdentifier directMessageIdentifier = r8.A00;
                            if (directMessageIdentifier == null || !directMessageIdentifier.A02(BSQ)) {
                                r8.A00 = null;
                                r6.A02 = null;
                                if (r6.A04 == AnonymousClass05K.A0C) {
                                    r6.A03("scroll");
                                }
                                UserSession userSession = r8.A06;
                                if (AnonymousClass3OE.A00(userSession).A00()) {
                                    if (182.A06(0Tu.A05, userSession, 36317835433547365L)) {
                                        A0W = r4.BJO(i);
                                    } else {
                                        A0W = r8.A05.A0W(i);
                                    }
                                    if ((A0W instanceof C3266277n) && (CEa = ((C3266277n) A0W).CEa(BSQ)) != null && (BPr = CEa.BPr()) != null) {
                                        BPr.CEL();
                                        r8.A00 = BSQ;
                                        P0O BSI = r4.BSI(BSQ, i);
                                        if (r6.A04 == num2) {
                                            r6.A01(BSI, CEa);
                                            return;
                                        } else {
                                            r6.A02 = CEa;
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                }
            }
        }
        r8.A00 = null;
        r6.A02 = null;
        if (r6.A04 == AnonymousClass05K.A0C) {
            r6.A03("scroll");
        }
    }
}
