package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2m5  reason: invalid class name and case insensitive filesystem */
public final class C228672m5 extends AnonymousClass2m1 {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final boolean A03;
    public final boolean A04;

    public final void Dey(AnonymousClass1GU r27, 1XM r28) {
        UserSession userSession;
        AndroidLink A022;
        C61076JwE A012;
        Iterator it = r28.A00().iterator();
        1Nv r15 = null;
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                1Xg r3 = (1Xg) it.next();
                AnonymousClass1GU r8 = r27;
                if (r3.A06 == 1UQ.A0Y) {
                    1Nv A023 = 1Xi.A02(r3.A05);
                    if (A023 == null) {
                        continue;
                    } else if (A023.CcK()) {
                        boolean z2 = this.A03;
                        if (z2) {
                            UserSession userSession2 = this.A01;
                            AnonymousClass4DU r11 = this.A02;
                            C271794jb r10 = new C271794jb(userSession2, A023);
                            int i = -1;
                            if (A023.A5D()) {
                                i = 0;
                            }
                            r10.A00 = i;
                            C233822wX.A0N(userSession2, r10, A023, r11, (Integer) null, "delivery");
                        }
                        Context context = this.A00;
                        if (!(context == null || (A022 = AnonymousClass47K.A02(context, userSession, A023, 0, false)) == null)) {
                            if (C271714jT.A01(A022) == AnonymousClass47L.AD_DESTINATION_CANVAS) {
                                if (A023.A0C.BMi() != null) {
                                    String BMi = A023.A0C.BMi();
                                    if (BMi != null) {
                                        Uri A032 = 0cp.A03(BMi);
                                        if (A032 != null && SL1.A02(A032, "NonOrganicMediaRequestObserver")) {
                                            SL1.A01(context, A032, userSession, "NonOrganicMediaRequestObserver");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                String AlB = A022.AlB();
                                if (AlB != null) {
                                    String A07 = C231122qu.A07(userSession, A023);
                                    0qQ.A0B(userSession, 3);
                                    new C17918Vi9((C15295Ua1) null, userSession, C231122qu.A0F(userSession, A023), A07, AlB, 0nA.A08(context), 0nA.A09(context), false).A00();
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else if (C271714jT.A01(A022) == AnonymousClass47L.AD_DESTINATION_LEAD_AD) {
                                String BM9 = A022.BM9();
                                if (BM9 != null) {
                                    0qQ.A0B(userSession, 2);
                                    C18709Vye.A01(new C17587Vaf(userSession, BM9, A023.C9L(), C231122qu.A07(userSession, A023), new ArrayList(), false));
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else if (C271714jT.A01(A022) == AnonymousClass47L.IG_DESTINATION_BLOKS) {
                                String Avj = A022.Avj();
                                if (Avj != null) {
                                    if (00l.A0d(Avj, "com.bloks.www.minishops.ad.collection", false)) {
                                        A012 = SAZ.A00(userSession, A023);
                                    } else {
                                        String Avj2 = A022.Avj();
                                        if (Avj2 == null) {
                                            throw new IllegalStateException("Required value was null.");
                                        } else if (00l.A0d(Avj2, "com.bloks.www.minishops.ad.dynamic.shop.collection", false)) {
                                            A012 = SAZ.A01((userSession = this.A01), A023, A022, this.A02.getModuleName());
                                        }
                                    }
                                    if (A012 != null) {
                                        C359638dF.A04(context, new C359618dD(userSession), A012.A01, (HashMap) A012.A00, A2X.A00);
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        }
                        if (z2) {
                            1sx.A0C(this.A01, A023, this.A02, this.A04);
                        }
                        if (r15 == null && r8.A00.A02()) {
                            r15 = A023;
                        }
                    }
                }
                if ((r3.A05 instanceof AnonymousClass3O9) && this.A03) {
                    AnonymousClass5ET.A00(this.A01, r3, this.A02, r8.A00.A0A);
                }
            } else if (r15 != null) {
                1Av A002 = 1Au.A00(this.A01);
                String id = r15.getId();
                String id2 = r15.getId();
                0xa r1 = A002.A01;
                if (0qQ.A0K(id2, r1.getString("current_ad_id", (String) null)) && r1.getBoolean("has_seen_current_ad", true)) {
                    z = true;
                }
                0xY AR4 = r1.AR4();
                AR4.E5g("current_ad_id", id);
                AR4.E5T("has_seen_current_ad", z);
                AR4.apply();
                return;
            } else {
                return;
            }
        }
    }

    public C228672m5(Context context, UserSession userSession, AnonymousClass4DU r6) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r6;
        0Tu r2 = 0Tu.A05;
        this.A03 = !182.A06(r2, userSession, 36311852543640352L);
        this.A04 = 182.A06(r2, userSession, 36312879040824667L);
    }
}
