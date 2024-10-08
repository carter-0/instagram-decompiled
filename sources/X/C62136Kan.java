package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Kan  reason: case insensitive filesystem */
public final class C62136Kan extends C68504NKx {
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final UserSession A00;
    public final C62950Kp2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62136Kan(Context context, AnonymousClass0iw r3, UserSession userSession, C62950Kp2 kp2) {
        super(context, userSession, r3);
        0qQ.A0B(userSession, 2);
        this.A00 = userSession;
        this.A01 = kp2;
    }

    public final void onBindViewHolder(C249703kE r4, int i) {
        C65220LpQ lpQ;
        0qQ.A0B(r4, 0);
        if (r4 instanceof C60593Jo2) {
            Object item = getItem(i);
            boolean z = item instanceof C61834KNy;
            MVS mvs = ((C60593Jo2) r4).A00;
            if (!z) {
                mvs.ADm();
            } else if ((mvs instanceof C65220LpQ) && (lpQ = (C65220LpQ) mvs) != null) {
                lpQ.A00(((C61834KNy) item).A00);
            }
        } else {
            super.onBindViewHolder(r4, i);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        MVS lpY;
        AnonymousClass4DH r2;
        UserSession userSession;
        boolean A002;
        AnonymousClass4DH r1;
        boolean A003;
        0qQ.A0B(viewGroup, 0);
        if (i == A08) {
            C62950Kp2 kp2 = this.A01;
            if (kp2 instanceof C61826KNp) {
                C61826KNp kNp = (C61826KNp) kp2;
                r1 = kNp.A01;
                A003 = LTP.A04(kNp.A06);
            } else {
                C61827KNq kNq = (C61827KNq) kp2;
                r1 = kNq.A00;
                A003 = LTP.A00(kNq.A02);
            }
            lpY = new C65220LpQ(r1, (Integer) null, A003);
        } else if (i == A05) {
            lpY = this.A01.A02();
        } else if (i == A07) {
            lpY = this.A01.A00();
        } else if (i == A02) {
            C62950Kp2 kp22 = this.A01;
            if (kp22 instanceof C61826KNp) {
                C61826KNp kNp2 = (C61826KNp) kp22;
                r2 = kNp2.A01;
                userSession = kNp2.A06;
                A002 = false;
            } else {
                C61827KNq kNq2 = (C61827KNq) kp22;
                r2 = kNq2.A00;
                userSession = kNq2.A02;
                A002 = LTP.A00(userSession);
            }
            lpY = new C65178Loh(r2, userSession, A002);
        } else if (i == A06) {
            lpY = this.A01.A03();
        } else if (i == A04) {
            lpY = this.A01.A01();
        } else {
            if (i == A03) {
                C62950Kp2 kp23 = this.A01;
                if (!(kp23 instanceof C61826KNp)) {
                    C61827KNq kNq3 = (C61827KNq) kp23;
                    AnonymousClass4DH r3 = kNq3.A00;
                    UserSession userSession2 = kNq3.A02;
                    lpY = new C65228LpY(r3, userSession2, kNq3.A0I, LTP.A00(userSession2));
                }
            }
            return super.onCreateViewHolder(viewGroup, i);
        }
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60593Jo2(lpY.ANH(), this, lpY);
    }

    static {
        int length = AnonymousClass05K.A00(45).length;
        A08 = length;
        A05 = length + 1;
        A07 = length + 2;
        A02 = length + 3;
        A06 = length + 4;
        A04 = length + 5;
        A03 = length + 6;
    }

    public final int getItemViewType(int i) {
        int itemViewType;
        int A032 = AnonymousClass0fD.A03(581780421);
        Object item = getItem(i);
        if (item instanceof C61834KNy) {
            itemViewType = A08;
        } else if (item instanceof C61833KNw) {
            Integer num = ((C61833KNw) item).A00;
            switch (num.intValue()) {
                case 1:
                    itemViewType = A02;
                    break;
                case 3:
                    itemViewType = A03;
                    break;
                case 9:
                    itemViewType = A04;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    itemViewType = A06;
                    break;
                case 23:
                    itemViewType = A07;
                    break;
                case 33:
                    itemViewType = A05;
                    break;
                default:
                    IllegalArgumentException A0W = AnonymousClass7TF.A0W("Unsupported RowItemEnum ", C63210KtH.A00(num));
                    AnonymousClass0fD.A0A(-113134480, A032);
                    throw A0W;
            }
        } else {
            itemViewType = super.getItemViewType(i);
        }
        AnonymousClass0fD.A0A(-153940094, A032);
        return itemViewType;
    }

    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 7;
    }
}
