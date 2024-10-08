package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2mr  reason: invalid class name and case insensitive filesystem */
public final class C229112mr implements C229122ms, C229132mt {
    public AnonymousClass2rI A00;
    public final UserSession A01;
    public final C228472lj A02;
    public final C228472lj A03;

    public C229112mr(UserSession userSession, C228472lj r3, C228472lj r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 2);
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = userSession;
    }

    public final void CgO() {
        C240073Jm.A00 = false;
        A00();
    }

    private final void A00() {
        int i;
        String join;
        AnonymousClass2rI r3 = this.A00;
        if (r3 != null) {
            HashMap hashMap = new HashMap();
            String str = ((C231352rU) r3.A00).A01;
            if (str == null) {
                C228472lj r1 = this.A02;
                if ((!r1.A0i.A04.isEmpty()) && C55282HfB.A00(this.A01).longValue() > 0) {
                    r1.A09(AnonymousClass05K.A15);
                    return;
                }
            }
            AnonymousClass2rI r12 = this.A00;
            if (r12 != null) {
                if (this.A02.A0i.A01) {
                    ArrayList A06 = r12.A06();
                    if (A06.isEmpty()) {
                        join = "";
                    } else {
                        join = TextUtils.join(",", A06);
                        0qQ.A07(join);
                    }
                    hashMap.put("cached_feed_item_ids", join);
                }
                if (str != null) {
                    hashMap.put("pagination_source", str);
                }
                AnonymousClass2rI r4 = this.A00;
                if (r4 != null) {
                    String str2 = ((C231352rU) r4.A00).A01;
                    if (str2 != null && str2.equals("feed_recs")) {
                        List A07 = r4.A07();
                        if (A07.isEmpty()) {
                            0wb.A01.Ew0("FeedRecsPaginationUtil", "invalid params when generating pagination params");
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 >= A07.size() - 1) {
                                break;
                            }
                            1UQ r13 = ((1Xg) A07.get(i2)).A06;
                            i2++;
                            if (r13 == 1UQ.A0O) {
                                if (i2 != -1) {
                                    StringWriter stringWriter = new StringWriter();
                                    try {
                                        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                                        A0A.A0c();
                                        A0A.A0P("total_num_items", A07.size() - i2);
                                        int size = A07.size();
                                        while (true) {
                                            size--;
                                            if (size < i2) {
                                                break;
                                            } else if (((1Xg) A07.get(size)).A05.CBd() != AnonymousClass05K.A01) {
                                                if (size != -1) {
                                                    1Xg r11 = (1Xg) A07.get(size);
                                                    int i3 = size - i2;
                                                    if (r11 != null) {
                                                        A0A.A0q("last_non_organic_item");
                                                        A0A.A0c();
                                                        A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r11.A09);
                                                        switch (r11.A05.CBd().intValue()) {
                                                            case 1:
                                                                i = 1;
                                                                break;
                                                            case 2:
                                                                i = 2;
                                                                break;
                                                            case 3:
                                                                i = 3;
                                                                break;
                                                            case 4:
                                                                i = 4;
                                                                break;
                                                            default:
                                                                i = 0;
                                                                break;
                                                        }
                                                        A0A.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                                                        A0A.A0P("index", i3);
                                                        A0A.A0Z();
                                                    }
                                                }
                                            }
                                        }
                                        int size2 = A07.size();
                                        while (true) {
                                            size2--;
                                            if (size2 >= i2) {
                                                1Xg r14 = (1Xg) A07.get(size2);
                                                if ((r14.A05 instanceof 1Xl) && r14.A05.CBd() == AnonymousClass05K.A01) {
                                                    if (size2 != -1) {
                                                        1Xg r15 = (1Xg) A07.get(size2);
                                                        int i4 = size2 - i2;
                                                        if (r15 != null) {
                                                            A0A.A0q("last_organic_item");
                                                            A0A.A0c();
                                                            1Xl r16 = r15.A05;
                                                            0qQ.A0C(r16, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
                                                            A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r16.BPf().getId());
                                                            A0A.A0P("index", i4);
                                                            A0A.A0Z();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        A0A.A0Z();
                                        A0A.close();
                                        hashMap.put("recs_paging_token", stringWriter.toString());
                                    } catch (IOException e) {
                                        0KC.A0F("FeedRecsPaginationUtil", AnonymousClass000.A00(2258), e);
                                    }
                                }
                            }
                        }
                    }
                    C228472lj r5 = this.A03;
                    1FI r42 = 1FI.A0G;
                    synchronized (((C231352rU) r3.A00).A03) {
                    }
                    r5.A0A(r42, (String) null, hashMap);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A01() {
        C241313Os r2 = C228552lr.A01(this.A03.A0f).A01;
        if (r2 == null || r2 == C241313Os.LOADING) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if ((java.lang.System.currentTimeMillis() - r2.longValue()) > java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r8)) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (X.C242583Vb.A00 == null) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ACw() {
        /*
            r9 = this;
            X.2rI r4 = r9.A00
            if (r4 == 0) goto L_0x0092
            X.2lj r5 = r9.A03
            com.instagram.common.session.UserSession r1 = r9.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36610855281891493(0x821161000018a5, double:3.2161905281250856E-306)
            long r2 = X.182.A01(r0, r1, r2)
            int r6 = (int) r2
            r2 = 36610855281957030(0x821161000118a6, double:3.2161905281665314E-306)
            long r2 = X.182.A01(r0, r1, r2)
            int r8 = (int) r2
            X.2lr r0 = r5.A0f
            X.3Do r5 = X.C228552lr.A01(r0)
            X.3Os r3 = r5.A01
            X.3Os r0 = X.C241313Os.LOADED
            if (r3 == r0) goto L_0x004e
            if (r6 <= 0) goto L_0x006a
            if (r8 <= 0) goto L_0x006a
            java.lang.Long r2 = r5.A02
            X.3Os r0 = X.C241313Os.NEEDS_RETRY
            if (r3 != r0) goto L_0x006a
            int r0 = r5.A00
            if (r0 >= r6) goto L_0x006a
            if (r2 == 0) goto L_0x006a
            long r6 = java.lang.System.currentTimeMillis()
            long r2 = r2.longValue()
            long r6 = r6 - r2
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = (long) r8
            long r2 = r0.toMillis(r2)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
        L_0x004e:
            java.lang.String r0 = r5.A03
            boolean r0 = X.0mp.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x006a
            boolean r0 = r9.A01()
            if (r0 != 0) goto L_0x006a
            X.2rI r0 = r9.A00
            if (r0 == 0) goto L_0x006a
            X.GSY r0 = X.C242583Vb.A00
            if (r0 == 0) goto L_0x008e
        L_0x006a:
            X.2rX r0 = r4.A00
            X.2rU r0 = (X.C231352rU) r0
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x0091
            X.2lj r0 = r9.A02
            X.2lo r0 = r0.A0i
            java.util.List r0 = r0.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0091
            java.lang.Long r0 = X.C55282HfB.A00(r1)
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
        L_0x008e:
            r9.A00()
        L_0x0091:
            return
        L_0x0092:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229112mr.ACw():void");
    }

    public final boolean CJz() {
        AnonymousClass2rI r0 = this.A00;
        if (r0 != null) {
            return !((AnonymousClass2rW) r0.A00).A01.isEmpty();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean CKB() {
        return !0mp.A0B(C228552lr.A01(this.A03.A0f).A03);
    }

    public final boolean CT5() {
        if (C228552lr.A01(this.A03.A0f).A01 == C241313Os.NEEDS_RETRY) {
            return true;
        }
        return false;
    }

    public final boolean CWV() {
        AnonymousClass2rI r0 = this.A00;
        if (r0 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (r0.A0F() || !CJz() || this.A00 == null || C242583Vb.A00 != null) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean isLoading() {
        if (!182.A06(0Tu.A05, this.A01, 36317620688852365L)) {
            return A01();
        }
        C241313Os r1 = C228552lr.A01(this.A03.A0f).A01;
        if (A01()) {
            return true;
        }
        if (!CKB() || r1 == C241313Os.NEEDS_RETRY) {
            return false;
        }
        return true;
    }
}
