package X;

import com.facebook.stash.core.FileStash;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class IOK implements C61110lV, 1Ky, AnonymousClass0lh {
    public final FileStash A00 = 1L7.A01().A05(1815290099);
    public final UserSession A01;
    public final 1L5 A02;
    public final HashMap A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C20695WxR(this, 11));
    public final HashSet A06 = AnonymousClass7TE.A1F();

    public IOK(UserSession userSession, HashMap hashMap) {
        int i;
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = hashMap;
        this.A02 = 1L0.A00(userSession);
        14i.A05(this);
        if (Systrace.A0E(1)) {
            0fS.A01("AsyncSignalDataPersistentStorage::init", 250515328);
        }
        try {
            int A042 = DbS.A04(0Tu.A05, this.A01, 36599151496793535L);
            if (A042 == 0) {
                i = 1;
            } else if (A042 != 1) {
                i = 3;
                if (A042 != 2) {
                    i = 4;
                }
            } else {
                i = 2;
            }
            C61480nO A002 = 0nY.A00();
            0qQ.A07(A002);
            A002.ATE(new H85(this, i));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1559725790);
            }
        }
    }

    public final void EEc(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass9IV r4 = (AnonymousClass9IV) this.A04.remove(str);
        if (r4 != null) {
            this.A03.put(str, (Object) null);
            this.A06.remove(((C253513qu) r4.A00).A04());
            AnonymousClass9J4 r3 = (AnonymousClass9J4) r4.A01;
            C233162v9 r2 = (C233162v9) r3.A04;
            if (AnonymousClass51X.A00(r2) != C233162v9.UNKNOWN) {
                String str2 = r3.A06;
                C233162v9 A002 = AnonymousClass51X.A00(r2);
                C230472pg r7 = (C230472pg) r3.A01;
                AAG(new AnonymousClass9IV(new AnonymousClass9J4((AnonymousClass9JO) r3.A02, r7, (AnonymousClass4EC) r3.A03, A002, (C230432pc) r3.A05, str2), (C253513qu) r4.A00));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r7.A00 != -1.0f) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AAG(X.AnonymousClass9IV r10) {
        /*
            r9 = this;
            java.lang.Object r5 = r10.A01
            X.9J4 r5 = (X.AnonymousClass9J4) r5
            java.lang.String r4 = r5.A06
            X.3sO r3 = X.C254383sO.A00
            boolean r0 = X.C254383sO.A00(r10)
            if (r0 == 0) goto L_0x0030
            X.3KZ r2 = X.AnonymousClass3KY.A00
            com.instagram.common.session.UserSession r1 = r9.A01
            boolean r0 = X.AnonymousClass3KZ.A01(r1)
            if (r0 != 0) goto L_0x001e
            boolean r0 = X.AnonymousClass3KZ.A00(r1)
            if (r0 == 0) goto L_0x0030
        L_0x001e:
            X.0eM r0 = r9.A05
            java.lang.Object r0 = r0.getValue()
            X.3DW r0 = (X.AnonymousClass3DW) r0
            r3.A01(r10, r0)
            boolean r0 = r2.A02(r5, r1)
            if (r0 == 0) goto L_0x0030
        L_0x002f:
            return
        L_0x0030:
            java.util.concurrent.ConcurrentHashMap r0 = r9.A04
            r0.put(r4, r10)
            java.util.HashMap r0 = r9.A03
            r0.put(r4, r10)
            java.lang.Object r0 = r5.A04
            X.2v9 r0 = (X.C233162v9) r0
            boolean r0 = X.C254393sP.A01(r0)
            if (r0 != 0) goto L_0x002f
            java.lang.Object r8 = r10.A00
            X.3qu r8 = (X.C253513qu) r8
            boolean r6 = r8 instanceof X.C253533qw
            r5 = 1
            if (r6 == 0) goto L_0x0061
            r7 = r8
            X.3qw r7 = (X.C253533qw) r7
            long r3 = r7.A0A
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            float r1 = r7.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            java.util.HashSet r1 = r9.A06
            java.lang.String r0 = r8.A04()
            boolean r1 = r1.add(r0)
            if (r2 != 0) goto L_0x0070
            if (r6 != 0) goto L_0x002f
        L_0x0070:
            X.1L5 r0 = r9.A02
            if (r2 == 0) goto L_0x007a
            if (r1 != 0) goto L_0x007a
        L_0x0076:
            r0.EGU(r10, r5)
            return
        L_0x007a:
            r5 = 0
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IOK.AAG(X.9IV):void");
    }

    public final List Ab0() {
        Collection values = this.A04.values();
        0qQ.A07(values);
        return 00k.A0a(values);
    }

    public final void onAppBackgrounded() {
        String str;
        int A032 = AnonymousClass0fD.A03(1242356331);
        UserSession userSession = this.A01;
        HashMap hashMap = this.A03;
        1L5 r11 = this.A02;
        C55157Hd9.A00(userSession, r11, hashMap);
        try {
            int size = hashMap.size();
            int i = 0;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                String A13 = DbT.A13(A1J);
                AnonymousClass9IV r6 = (AnonymousClass9IV) A1J.getValue();
                if (r6 == null) {
                    this.A00.remove(A13);
                } else {
                    try {
                        FileStash fileStash = this.A00;
                        C268554db A022 = C268554db.A02();
                        A022.A0I(C269424f6.FAIL_ON_EMPTY_BEANS);
                        fileStash.write(A13, A022.A0J(C254393sP.A00.A03(r6)));
                        r11.EGa(r6, A13);
                        i++;
                    } catch (IOException e) {
                        e = e;
                        str = "Error writing signal model to File: ";
                    } catch (ExceptionInInitializerError e2) {
                        e = e2;
                        str = "Error init objectMapper: ";
                    } catch (Exception e3) {
                        e = e3;
                        str = "Error when write disk cache: ";
                    } catch (NoClassDefFoundError unused) {
                        0KC.A0C("AsyncSignalDataPersistentStorage", "FbObjectMapper class not found, skipping init");
                    }
                }
            }
            FileStash fileStash2 = this.A00;
            r11.EGd((double) C51966G9m.A07(currentTimeMillis), size, i, fileStash2.getAllKeys().size(), fileStash2.getSizeBytes());
            fileStash2.getItemCount();
        } catch (Exception e4) {
            0KC.A0F("AsyncSignalDataPersistentStorage", "Error when write disk cache: ", e4);
        } catch (NoClassDefFoundError unused2) {
            0KC.A0C("AsyncSignalDataPersistentStorage", "Class not found, skipping init");
        }
        AnonymousClass0fD.A0A(-1618786917, A032);
        return;
        0KC.A0F("AsyncSignalDataPersistentStorage", str, e);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1115185902, AnonymousClass0fD.A03(1291193945));
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
    }
}
