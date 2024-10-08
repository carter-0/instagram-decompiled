package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.815  reason: invalid class name */
public final class AnonymousClass815 {
    public final AnonymousClass80R A00;
    public final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f4, code lost:
        if (r1 == null) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(int r10, android.content.Intent r11) {
        /*
            r9 = this;
            r6 = 0
            r4 = 1
            r3 = 0
            r0 = 9683(0x25d3, float:1.3569E-41)
            if (r10 != r0) goto L_0x00c5
            if (r11 == 0) goto L_0x00ae
            X.80R r4 = r9.A00
            com.instagram.common.session.UserSession r5 = r4.A0R
            X.2cc r1 = X.C71342cb.A00(r5)
            X.8LU r2 = r4.A0g
            int r0 = r4.A08
            int r0 = r0 + 2
            r1.A0D(r2, r6, r0)
            X.2cc r1 = X.C71342cb.A00(r5)
            android.app.Activity r0 = r4.A09
            r1.A08(r0, r2)
            X.2cc r2 = X.C71342cb.A00(r5)
            X.8Fl r1 = r4.A0l
            java.lang.String r0 = "unknown"
            r2.A0E(r0, r1)
            X.82p r0 = r4.A0o
            X.82o r0 = r0.A02
            r0.A06()
            X.8WX r0 = r4.A1N
            X.8XA r2 = r0.A00()
            com.instagram.common.session.UserSession r1 = r2.A0F
            boolean r0 = X.AnonymousClass8IK.A06(r1)
            if (r0 == 0) goto L_0x006a
            r2.A0Q()
            r2.A00 = r6
            X.6tY r2 = X.C353578Ie.A00(r1)
            X.05G r1 = r2.A06
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.Epw(r0)
            X.05G r1 = r2.A05
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.Epw(r0)
            X.05G r1 = r2.A04
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.Epw(r0)
        L_0x006a:
            r0 = 2126(0x84e, float:2.979E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r11.getBooleanExtra(r0, r3)
            r1 = r0 ^ 1
            r0 = 891(0x37b, float:1.249E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r2 = r11.getBooleanExtra(r0, r3)
            if (r1 == 0) goto L_0x0091
            r0 = 1582(0x62e, float:2.217E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.80D r0 = r4.A0v
            X.B2s r0 = r0.A0l
            if (r2 == 0) goto L_0x00c1
            r0.Cpi(r1)
        L_0x0091:
            com.instagram.pendingmedia.store.PendingMediaStore r2 = X.28K.A00(r5)
            X.8QG r0 = r4.A15
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x00a0
            java.util.Set r0 = r2.A07
            r0.remove(r1)
        L_0x00a0:
            X.80U r0 = r4.A1f
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r1 = r0.A01
            X.9y3 r0 = new X.9y3
            r0.<init>()
            r1.A04(r0)
        L_0x00ae:
            X.80R r1 = r9.A00
            X.80D r0 = r1.A0v
            boolean r0 = r0.A38
            if (r0 == 0) goto L_0x00c0
            if (r3 != 0) goto L_0x00c0
            android.app.Activity r0 = r1.A09
            r0.setResult(r10)
            r0.finish()
        L_0x00c0:
            return
        L_0x00c1:
            r0.Cpf(r1)
            goto L_0x0091
        L_0x00c5:
            r0 = 9685(0x25d5, float:1.3572E-41)
            if (r10 != r0) goto L_0x00ae
            X.80R r5 = r9.A00
            X.28D r1 = r5.A01
            X.0qQ.A0B(r1, r3)
            X.28D r0 = X.28D.A5H
            if (r1 == r0) goto L_0x00ae
            X.80D r6 = r5.A0v
            X.9Qn r0 = r6.A13
            if (r0 == 0) goto L_0x00de
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x00ae
        L_0x00de:
            if (r11 == 0) goto L_0x0164
            r0 = 2158(0x86e, float:3.024E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r1 = r11.getSerializableExtra(r0)
            r0 = 2164(0x874, float:3.032E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r2 = r11.getBooleanExtra(r0, r3)
            if (r1 != 0) goto L_0x00f8
        L_0x00f6:
            X.50r r1 = X.C2801950r.CLIPS
        L_0x00f8:
            X.50r r0 = X.C2801950r.CLIPS
            if (r1 != r0) goto L_0x0166
            X.80U r0 = r5.A1f
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r1 = r0.A01
            X.8SD r0 = new X.8SD
            r0.<init>()
            r1.A04(r0)
            X.8Yz r1 = r5.A0W
            X.80N r0 = X.AnonymousClass80N.A00
            r1.A0I(r0)
            X.8Hx r0 = r5.A1j
            r0.DCV(r4)
            r8 = r2 ^ 1
            com.instagram.common.session.UserSession r7 = r5.A0R
            X.0qQ.A0B(r7, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321924242024288(0x810a9900012760, double:3.0334693750811514E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x0135
            r0 = 36321550579934724(0x810a4200022604, double:3.0332330696710946E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0161
        L_0x0135:
            X.8WX r4 = r5.A1N
            if (r4 == 0) goto L_0x0161
            X.8XA r0 = r4.A00()
            X.8hG r0 = r0.A02
            if (r0 == 0) goto L_0x0161
            X.27r r0 = X.27p.A01(r7)
            X.29L r2 = r0.A0J
            X.50r r1 = r6.A0H()
            java.lang.String r0 = "share_sheet_exit_helper"
            r2.A02(r1, r0)
            X.8XA r0 = r4.A00()
            X.8hG r0 = r0.A02
            r0.A0j(r3)
            android.app.Activity r1 = r5.A09
            r0 = 2131961036(0x7f1324cc, float:1.9558758E38)
            X.C59689JTv.A08(r1, r0, r3)
        L_0x0161:
            r3 = r8
            goto L_0x00ae
        L_0x0164:
            r2 = 0
            goto L_0x00f6
        L_0x0166:
            X.50r r0 = X.C2801950r.FEED_POST
            if (r1 != r0) goto L_0x0171
            X.8Hx r0 = r5.A1j
            r0.DCV(r3)
            goto L_0x00ae
        L_0x0171:
            X.B2s r1 = r6.A0l
            java.lang.String r0 = "clips_saved_to_draft"
            r1.Cpi(r0)
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass815.A00(int, android.content.Intent):void");
    }

    public static void A01(Intent intent, AnonymousClass815 r9, int i) {
        AnonymousClass80R r5;
        View view;
        if (i != -1) {
            ((ADu) ADu.A02.getValue()).A00();
            if (intent != null && intent.getBooleanExtra(AnonymousClass000.A00(2653), false)) {
                ((AnonymousClass80T) r9.A00.A1f).A01.A04(new Object());
            }
            r5 = r9.A00;
            C3510387i r1 = r5.A0X;
            if (r1.A0S.A04 != null) {
                r1.A06();
            } else {
                r1.A0P.A01();
            }
            if (intent == null) {
                return;
            }
        } else if (intent != null) {
            Collection parcelableArrayListExtra = intent.getParcelableArrayListExtra(AnonymousClass000.A00(2734));
            Collection parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(AnonymousClass000.A00(2735));
            r5 = r9.A00;
            UserSession userSession = r5.A0R;
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = Collections.emptyList();
            }
            if (parcelableArrayListExtra2 == null) {
                parcelableArrayListExtra2 = Collections.emptyList();
            }
            0qQ.A0B(userSession, 0);
            0qQ.A0B(parcelableArrayListExtra, 1);
            0qQ.A0B(parcelableArrayListExtra2, 2);
            LinkedHashSet linkedHashSet = LMK.A02;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(parcelableArrayListExtra);
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(parcelableArrayListExtra2);
            if (!linkedHashSet2.isEmpty() || linkedHashSet3.size() >= 2) {
                try {
                    LinkedHashSet<DirectShareTarget> A002 = C63230Ktb.A00(linkedHashSet2, linkedHashSet3);
                    StringWriter stringWriter = new StringWriter();
                    17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                    A0A.A0c();
                    16P.A03(A0A, C66579MXk.A00(790));
                    for (DirectShareTarget directShareTarget : A002) {
                        if (directShareTarget != null) {
                            C330897Or.A00(A0A, directShareTarget);
                        }
                    }
                    A0A.A0Y();
                    A0A.A0Z();
                    A0A.close();
                    String obj = stringWriter.toString();
                    1Av A003 = 1Au.A00(userSession);
                    A003.A6s.Epx(A003, obj, 1Av.A8a[237]);
                } catch (IOException e) {
                    0wb.A07("BlastListCandidatesManager_error_serializing_last_send", e);
                }
            }
            if (intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false)) {
                if (r5.A0v.A3h) {
                    AnonymousClass8WK r6 = r5.A16;
                    WeakReference weakReference = ((ADu) ADu.A02.getValue()).A01;
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                    } else {
                        view = null;
                    }
                    AnonymousClass8WJ r62 = (AnonymousClass8WJ) r6;
                    boolean z = false;
                    if (r62.A0A != null) {
                        z = true;
                    }
                    r62.DDT(view, "button", z);
                } else {
                    ((ADu) ADu.A02.getValue()).A00();
                }
            }
        } else {
            return;
        }
        r5.A0e.A1q.A04(intent.getBooleanExtra(AnonymousClass000.A00(25), false));
    }

    public final void A02(Object obj) {
        String str;
        if (obj instanceof C356438Tw) {
            C356438Tw r11 = (C356438Tw) obj;
            int i = r11.A00;
            Intent intent = r11.A01;
            if (i == 0) {
                str = "back";
            } else if (i == 9683) {
                str = "share";
            } else if (i != 9685) {
                str = null;
            } else {
                str = "draft";
            }
            AnonymousClass80R r0 = this.A00;
            Activity activity = r0.A09;
            UserSession userSession = r0.A0R;
            0qQ.A0B(activity, 0);
            0qQ.A0B(userSession, 1);
            if (1Wj.A00 != null) {
                HashMap hashMap = new HashMap();
                if (!(str == null || str.length() == 0)) {
                    hashMap.put("exit_reason", str);
                }
                DcL.A00().A00(activity, userSession, "795323564647144", hashMap);
            }
            if (this.A01 && i == 9683) {
                A00(9685, (Intent) null);
            } else if (i == 9683 || i == 9685) {
                ((ADu) ADu.A02.getValue()).A00();
                A00(i, intent);
            } else {
                A01(intent, this, i);
            }
        }
    }

    public AnonymousClass815(AnonymousClass80R r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
