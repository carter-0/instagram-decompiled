package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectMessageEditHistory;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7ZX  reason: invalid class name */
public final class AnonymousClass7ZX implements AnonymousClass7ZY {
    public Context A00;
    public C61370mm A01;
    public 0mo A02;
    public AnonymousClass7LS A03;
    public C331217Qa A04;
    public AnonymousClass7LL A05;
    public C66672Maf A06;
    public C3258174g A07;
    public AnonymousClass7O7 A08;
    public AnonymousClass9HC A09;
    public AnonymousClass7OC A0A;
    public AnonymousClass7Z5 A0B;
    public C331007Pc A0C;
    public AnonymousClass7OB A0D;
    public AnonymousClass7O8 A0E;
    public AnonymousClass7L2 A0F;
    public AnonymousClass79E A0G;
    public AnonymousClass7SD A0H;
    public C330807Oi A0I;
    public AnonymousClass7LT A0J;
    public AnonymousClass7LP A0K;
    public String A0L;
    public String A0M;
    public List A0N;
    public List A0O;
    public AnonymousClass0eM A0P;
    public AnonymousClass0eM A0Q;
    public AnonymousClass0eM A0R;
    public 0sP A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public C274634on A0b;
    public C47770EGh A0c;
    public AnonymousClass3SZ A0d;
    public DirectMessageIdentifier A0e;
    public final AnonymousClass0iw A0f;
    public final UserSession A0g;
    public final C331847Sp A0h;
    public final C330437Mt A0i;
    public final C331757Sg A0j;
    public final AnonymousClass7UL A0k;
    public final AnonymousClass7YU A0l;
    public final C333497Ze A0m;
    public final AnonymousClass7ZU A0n;
    public final MessagingUser A0o;
    public final AnonymousClass7S7 A0p;
    public final User A0q;
    public final 17i A0r;
    public final HashMap A0s = new HashMap();
    public final HashMap A0t = new HashMap();
    public final HashSet A0u = new HashSet();
    public final HashSet A0v = new HashSet();
    public final Map A0w;
    public final AnonymousClass0eK A0x;
    public final AnonymousClass0eM A0y;
    public final AnonymousClass0eM A0z;
    public final AnonymousClass0eM A10;
    public final 0bY A11;
    public final AnonymousClass7ZW A12;
    public final AnonymousClass7ZC A13;
    public final AnonymousClass7ZL A14;
    public final AnonymousClass7ZJ A15;
    public final AnonymousClass7Z5 A16;
    public final AnonymousClass7ZP A17;
    public final AnonymousClass7ZF A18;
    public final AnonymousClass7ZR A19;
    public final AnonymousClass7ZT A1A;
    public final AnonymousClass7ZH A1B;
    public final AnonymousClass7ZN A1C;
    public final HashSet A1D;
    public final Set A1E = new HashSet();

    public static final AnonymousClass7LQ A08(AnonymousClass7ZX r3, int i) {
        if (i < 0 || i >= r3.A0R().A01) {
            return null;
        }
        Object A052 = r3.A0R().A05(i);
        if (A052 instanceof AnonymousClass7LQ) {
            return (AnonymousClass7LQ) A052;
        }
        return null;
    }

    private final void A0E(AnonymousClass7US r8, C328317Ei r9, List list) {
        List list2 = list;
        if (!list.isEmpty()) {
            A0X(r9, (Integer) null, (List) null, (List) null, list2, (List) null);
            r8.A06(list);
        }
    }

    public final void A0W(C331837So r2, int i) {
        0qQ.A0B(r2, 1);
        A0R().A04(r2, i);
    }

    public final 2FW BS5(String str) {
        C254703su r0;
        0qQ.A0B(str, 0);
        AnonymousClass7LQ A012 = this.A0n.A01(str);
        if (A012 == null || (r0 = A012.A0e) == null) {
            return null;
        }
        return r0.A10;
    }

    public final String BsP(MessageIdentifier messageIdentifier) {
        AnonymousClass7LQ A012;
        C254703su r1;
        if (messageIdentifier == null || (A012 = this.A0n.A01(messageIdentifier.A01)) == null || (r1 = A012.A0e) == null) {
            return null;
        }
        return r1.A1u;
    }

    public final boolean CLm(C66709MbG mbG) {
        N88 n88;
        C331837So A092 = A09(this, 0);
        HashSet hashSet = this.A0u;
        C66709MbG mbG2 = mbG;
        long j = mbG2.A01;
        hashSet.remove(Long.valueOf(j));
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass7LQ r0 : (List) mbG2.A02) {
            arrayList.add(r0.A0e.A0h());
        }
        A0L((C328317Ei) null, (List) null, arrayList, (List) null, false);
        int i = A0R().A01;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            Object A052 = A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r3 = (C331837So) A052;
            if ((r3 instanceof N88) && ((N88) r3).A02 == j) {
                0mo A0R2 = A0R();
                A0R2.A05(i2);
                0mo.A02(A0R2, i2, true);
                A0D(mbG2, this, false);
                break;
            }
            i2++;
        }
        11Z.A02(new AnonymousClass7F9(this));
        if (!(A092 instanceof N88) || (n88 = (N88) A092) == null || n88.A02 != j) {
            return false;
        }
        return true;
    }

    public final int CME(String str) {
        Long l;
        C254873tC r0;
        0qQ.A0B(str, 0);
        int i = A0R().A01;
        for (int i2 = 0; i2 < i; i2++) {
            Object A052 = A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r1 = (C331837So) A052;
            if (r1 instanceof AnonymousClass7LQ) {
                ImmutableList A0H2 = ((AnonymousClass7LQ) r1).A0e.A0H();
                if (A0H2 == null || (r0 = (C254873tC) 00k.A0I(A0H2)) == null) {
                    l = null;
                } else {
                    l = r0.A0m;
                }
                if (0qQ.A0K(String.valueOf(l), str)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final boolean CRR(int i, int i2) {
        AnonymousClass7LQ A082;
        C254703su r0;
        if (i <= i2) {
            while (true) {
                if (i == -1 || (A082 = A08(this, i)) == null || (r0 = A082.A0e) == null || !r0.A1T()) {
                    if (i == i2) {
                        break;
                    }
                    i++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean CVl(int i) {
        C331837So A092;
        int i2 = i - 1;
        while (-1 < i2 && (A092 = A09(this, i2)) != null && !(A092 instanceof AnonymousClass7LQ)) {
            if (A092 instanceof AnonymousClass7OA) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public final boolean CXG(int i) {
        int i2 = i + 1;
        int i3 = A0R().A01;
        if (i2 <= i3) {
            while (true) {
                C331837So A092 = A09(this, i2);
                if (A092 != null) {
                    if (!(A092 instanceof AnonymousClass7LQ)) {
                        if (i2 == i3) {
                            break;
                        }
                        i2++;
                    } else {
                        return ((AnonymousClass7LQ) A092).A0e.A2P != this.A0U;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean CXJ(int i) {
        C331837So A092;
        int i2 = i - 1;
        while (-1 < i2 && (A092 = A09(this, i2)) != null) {
            if (A092 instanceof AnonymousClass7LQ) {
                return ((AnonymousClass7LQ) A092).A0e.A2P != this.A0U;
            }
            i2--;
        }
        return false;
    }

    public final boolean CXL(MessageIdentifier messageIdentifier) {
        IGAIAgentType iGAIAgentType;
        boolean z = false;
        AnonymousClass7LQ A012 = this.A0n.A01(messageIdentifier.A01);
        if (A012 != null) {
            User user = A012.A0K;
            z = true;
            if (user == null || !user.A1T()) {
                return false;
            }
            User user2 = A012.A0K;
            if (user2 != null) {
                iGAIAgentType = user2.A03.AaX();
            } else {
                iGAIAgentType = null;
            }
            if (iGAIAgentType == IGAIAgentType.A04) {
                return z;
            }
            return false;
        }
        return z;
    }

    public final boolean CXN(DirectMessageIdentifier directMessageIdentifier, int i, int i2) {
        AnonymousClass7LQ A082;
        C254703su r0;
        if (i > i2) {
            return false;
        }
        while (true) {
            if (i != -1 && (A082 = A08(this, i)) != null && (r0 = A082.A0e) != null && directMessageIdentifier.A02(r0.A0V())) {
                return true;
            }
            if (i == i2) {
                return false;
            }
            i++;
        }
    }

    public final boolean Cbr(int i, int i2) {
        AnonymousClass7LQ A082;
        C254703su r0;
        if (i <= i2) {
            while (true) {
                if (i == -1 || (A082 = A08(this, i)) == null || (r0 = A082.A0e) == null || !r0.A2P) {
                    if (i == i2) {
                        break;
                    }
                    i++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0256, code lost:
        if (r13.A0T != false) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (X.182.A06(X.0Tu.A05, r13.A0g, 36329440434864255L) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        if (r3.A1X() == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012c, code lost:
        if ((!r4) == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014b, code lost:
        if (r7.A1O() != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0167, code lost:
        if (r13.A0T != false) goto L_0x0169;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ctg(java.util.List r14) {
        /*
            r13 = this;
            r3 = 0
            X.0eM r0 = r13.A10
            java.lang.Object r0 = r0.getValue()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            X.11Z.A01(r0)
            X.7SD r0 = r13.A0H
            boolean r0 = r0.A13
            if (r0 == 0) goto L_0x0022
            com.instagram.common.session.UserSession r4 = r13.A0g
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329440434864255(0x81116f0002407f, double:3.038222645698426E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r7 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r7 = 0
        L_0x0023:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r14.iterator()
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9IM r0 = (X.AnonymousClass9IM) r0
            if (r7 == 0) goto L_0x0045
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L_0x002c
        L_0x0045:
            r4.add(r1)
            goto L_0x002c
        L_0x0049:
            r0 = 10
            int r0 = X.0Yv.A1E(r4, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x0058:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r1.next()
            X.9IM r0 = (X.AnonymousClass9IM) r0
            java.lang.Object r0 = r0.A01
            r6.add(r0)
            goto L_0x0058
        L_0x006a:
            r8 = 0
            if (r7 == 0) goto L_0x0092
            java.util.Iterator r2 = r14.iterator()
        L_0x0071:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x025a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9IM r0 = (X.AnonymousClass9IM) r0
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L_0x0071
        L_0x0088:
            X.9IM r1 = (X.AnonymousClass9IM) r1
            if (r1 == 0) goto L_0x0092
            int r0 = r1.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0092:
            int r0 = A00(r13)
            X.7LQ r0 = A08(r13, r0)
            boolean r1 = r6.isEmpty()
            r4 = 8
            if (r1 != 0) goto L_0x01be
            X.7S7 r1 = r13.A0p
            X.7S6 r1 = (X.AnonymousClass7S6) r1
            X.2Ep r1 = r1.A07
            if (r1 != 0) goto L_0x01b8
            r2 = 0
        L_0x00ab:
            com.instagram.common.session.UserSession r1 = r13.A0g
            boolean r1 = X.C66682Map.A00(r1, r2)
            if (r1 == 0) goto L_0x01be
            java.lang.Object r5 = r6.get(r3)
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            X.7Oi r4 = r13.A0I
            if (r7 != 0) goto L_0x00d6
            if (r4 == 0) goto L_0x00d6
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r4.A03
            java.lang.String r2 = r1.A03
            java.lang.String r1 = r5.getId()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00d6
            int r2 = r4.A00
            int r1 = r6.size()
            if (r2 != r1) goto L_0x00d6
        L_0x00d5:
            return
        L_0x00d6:
            java.lang.String r1 = r5.getId()
            boolean r12 = X.AnonymousClass7F2.A01(r0, r1)
            boolean r4 = A0P(r13)
            X.7SD r1 = r13.A0H
            X.3t3 r1 = r1.A0P
            if (r1 == 0) goto L_0x01b5
            X.3t0 r1 = X.C300965yF.A01(r1)
            java.lang.String r9 = r1.A00
        L_0x00ee:
            int r10 = r6.size()
            com.instagram.direct.model.messaginguser.MessagingUser r7 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r5)
            com.instagram.common.typedurl.ImageUrl r6 = r5.Bh3()
            X.7SD r1 = r13.A0H
            java.util.List r1 = r1.A0b
            int r2 = r1.size()
            r1 = 1
            if (r2 != r1) goto L_0x0129
            X.7SD r1 = r13.A0H
            java.util.List r1 = r1.A0b
            java.lang.Object r3 = r1.get(r3)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.4Cl r1 = r3.A03
            com.instagram.api.schemas.IGAIAgentType r2 = r1.AaX()
            com.instagram.api.schemas.IGAIAgentType r1 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r2 == r1) goto L_0x012e
            X.4Cl r1 = r3.A03
            com.instagram.api.schemas.IGAIAgentType r2 = r1.AaX()
            com.instagram.api.schemas.IGAIAgentType r1 = com.instagram.api.schemas.IGAIAgentType.A06
            if (r2 == r1) goto L_0x012e
            boolean r1 = r3.A1X()
            if (r1 != 0) goto L_0x012e
        L_0x0129:
            r1 = r4 ^ 1
            r11 = 0
            if (r1 != 0) goto L_0x0130
        L_0x012e:
            r11 = 8
        L_0x0130:
            X.7Oi r5 = new X.7Oi
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A0I = r5
            if (r0 == 0) goto L_0x017d
            X.3su r7 = r0.A0e
            X.0qQ.A07(r7)
            com.instagram.direct.model.messaginguser.MessagingUser r6 = r13.A0o
            boolean r1 = r7.A1N()
            if (r1 != 0) goto L_0x014d
            boolean r1 = r7.A1O()
            r10 = 0
            if (r1 == 0) goto L_0x014e
        L_0x014d:
            r10 = 1
        L_0x014e:
            X.1at r2 = X.C327657Br.A00()
            X.2FW r1 = r7.A10
            X.0qQ.A07(r1)
            X.7Bu r8 = r2.A01(r1)
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r5.A03
            java.lang.String r9 = r1.A03
            X.0qQ.A07(r9)
            if (r4 != 0) goto L_0x0169
            boolean r1 = r13.A0T
            r11 = 1
            if (r1 == 0) goto L_0x016a
        L_0x0169:
            r11 = 0
        L_0x016a:
            int r2 = X.C328487Ez.A01(r6, r7, r8, r9, r10, r11)
            com.instagram.user.model.User r1 = r0.A0K
            if (r1 == 0) goto L_0x017d
            r0.A00 = r2
            r0.A0V = r12
            int r0 = A04(r13, r0)
            A0I(r13, r0)
        L_0x017d:
            A0K(r13, r5)
            X.7SD r0 = r13.A0H
            boolean r0 = r0.A0r
            if (r0 != 0) goto L_0x00d5
            java.util.Map r1 = r13.A0w
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00d5
            X.0mo r0 = r13.A0R()
            r0.A06()
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x019d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x025d
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            X.0mo r0 = r13.A0R()
            r0.A08(r1)
            goto L_0x019d
        L_0x01b5:
            r9 = 0
            goto L_0x00ee
        L_0x01b8:
            int r2 = r1.CAt()
            goto L_0x00ab
        L_0x01be:
            X.7Oi r5 = r13.A0I
            if (r5 == 0) goto L_0x00d5
            X.7Sg r1 = r13.A0j
            X.9H7 r1 = r1.A00
            X.NIE r2 = r1.A0L
            if (r2 == 0) goto L_0x0213
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x0213
            boolean r1 = r2.isVisible()
            if (r1 == 0) goto L_0x0213
            X.OsD r1 = r2.A02
            boolean r1 = r1.A0G
            if (r1 != 0) goto L_0x0213
            boolean r1 = r2.mRemoving
            if (r1 != 0) goto L_0x0213
        L_0x01e0:
            X.7SD r1 = r13.A0H
            boolean r1 = r1.A0r
            if (r1 != 0) goto L_0x0225
            java.util.Map r2 = r13.A0w
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0225
            X.0mo r1 = r13.A0R()
            r1.A06()
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r2 = r1.iterator()
        L_0x01fd:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x021e
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            X.7Pc r1 = (X.C331007Pc) r1
            A0K(r13, r1)
            goto L_0x01fd
        L_0x0213:
            X.0mo r1 = r13.A0R()
            r1.A08(r5)
            r1 = 0
            r13.A0I = r1
            goto L_0x01e0
        L_0x021e:
            X.0mo r1 = r13.A0R()
            r1.A07()
        L_0x0225:
            boolean r1 = A0P(r13)
            if (r1 == 0) goto L_0x023d
            if (r0 == 0) goto L_0x00d5
        L_0x022d:
            com.instagram.user.model.User r1 = r0.A0K
            if (r1 == 0) goto L_0x00d5
            r0.A00 = r4
            r0.A0V = r3
            int r0 = A04(r13, r0)
            A0I(r13, r0)
            return
        L_0x023d:
            com.instagram.user.model.User r1 = r13.A0q
            java.lang.String r2 = r1.getId()
            if (r0 == 0) goto L_0x00d5
            com.instagram.user.model.User r1 = r0.A0K
            if (r1 == 0) goto L_0x0258
            java.lang.String r1 = r1.getId()
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 != 0) goto L_0x0258
            boolean r1 = r13.A0T
            r4 = 0
            if (r1 == 0) goto L_0x022d
        L_0x0258:
            r4 = 4
            goto L_0x022d
        L_0x025a:
            r1 = r8
            goto L_0x0088
        L_0x025d:
            X.0mo r0 = r13.A0R()
            r0.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.Ctg(java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DKx(android.app.Activity r18, X.AnonymousClass7L5 r19, X.AnonymousClass2Ep r20, java.lang.String r21, boolean r22) {
        /*
            r17 = this;
            r2 = 3
            r4 = r21
            X.0qQ.A0B(r4, r2)
            r3 = r17
            X.7OC r1 = r3.A0A
            r11 = 0
            r10 = 0
            com.instagram.common.session.UserSession r12 = r3.A0g
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)
            r13 = r20
            r15 = r11
            r16 = r11
            X.7Er r5 = X.C328397Eq.A00(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0078
            X.7Er r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0077
            X.0mo r0 = r3.A0R()
            r0.A08(r1)
            r1 = 1
        L_0x002d:
            java.util.List r0 = r5.A05
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004d
            java.lang.String r8 = r13.C6C()
            com.instagram.user.model.User r7 = r13.BZK()
            X.7L2 r0 = r3.A0F
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "threadTheme"
        L_0x0045:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004d:
            if (r1 == 0) goto L_0x0077
            goto L_0x0068
        L_0x0050:
            X.7L0 r6 = r0.A07
            X.JGw r9 = new X.JGw
            r14 = r19
            r11 = r9
            r16 = r2
            r15 = r4
            r12 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            X.7OC r4 = new X.7OC
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.A0A = r4
            A0K(r3, r4)
        L_0x0068:
            X.0mm r1 = r3.A01
            java.lang.String r0 = "sortedListCallback"
            if (r1 == 0) goto L_0x0045
            boolean r0 = r1 instanceof X.C72256OzR
            if (r0 == 0) goto L_0x0077
            X.OzR r1 = (X.C72256OzR) r1
            r1.A01()
        L_0x0077:
            return
        L_0x0078:
            r1 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.DKx(android.app.Activity, X.7L5, X.2Ep, java.lang.String, boolean):void");
    }

    public final void DiW(C331007Pc r25) {
        C331007Pc r0 = r25;
        int A002 = 0mo.A00(A0R(), r0, 4);
        if (A002 != -1) {
            boolean z = !r0.A0A;
            Set set = r0.A05;
            Set set2 = r0.A06;
            boolean z2 = r0.A0E;
            boolean z3 = r0.A0B;
            boolean z4 = r0.A07;
            String str = r0.A03;
            long j = r0.A02;
            boolean z5 = r0.A0D;
            boolean z6 = r0.A0C;
            int i = r0.A01;
            int i2 = r0.A00;
            boolean z7 = r0.A08;
            0qQ.A0B(set, 0);
            0qQ.A0B(set2, 1);
            0qQ.A0B(str, 6);
            C331007Pc r9 = new C331007Pc(str, set, set2, i, i2, j, z2, z, z3, z4, z5, z6, z7);
            this.A0w.put(Long.valueOf(r9.A02), r9);
            A0W(r9, A002);
        }
    }

    public final void EcA(boolean z) {
        this.A0X = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r6 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EdR(java.lang.Integer r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.7ZU r0 = r3.A0n
            X.7LQ r1 = r0.A01(r5)
            if (r1 == 0) goto L_0x0040
            r1.A0N = r4
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 == r0) goto L_0x0041
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 == r0) goto L_0x0041
            if (r6 == 0) goto L_0x001f
        L_0x001c:
            r3.A0V(r1)
        L_0x001f:
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r1 = r3.BSC(r5)
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r2 = r1.get(r0)
            X.7LQ r2 = (X.AnonymousClass7LQ) r2
            X.3su r0 = r2.A0e
            X.2FW r1 = r0.A10
            X.2FW r0 = X.2FW.A1g
            if (r1 == r0) goto L_0x0040
            r2.A0N = r4
            r3.A0V(r2)
        L_0x0040:
            return
        L_0x0041:
            r0 = 0
            r1.A0L = r0
            r1.A0M = r0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.EdR(java.lang.Integer, java.lang.String, boolean):void");
    }

    public final boolean Et8(DirectMessageIdentifier directMessageIdentifier, boolean z) {
        C254703su A0B2;
        if (this.A0H.A0y || directMessageIdentifier.A02(this.A0e) || (A0B2 = A0B(this)) == null || !A0B2.A0V().A02(directMessageIdentifier) || z) {
            return false;
        }
        return true;
    }

    public final void EtD(String str, boolean z) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        AnonymousClass7LQ A012 = this.A0n.A01(str2);
        if (A012 != null) {
            C254703su r8 = A012.A0e;
            0qQ.A07(r8);
            List A0u2 = r8.A0u();
            if (A0u2 != null && !A0u2.isEmpty()) {
                A012.A0Z = z;
                int A002 = 0mo.A00(A0R(), A012, 4);
                if (A002 != -1) {
                    AnonymousClass7LQ A082 = A08(this, A01(this, A002));
                    ArrayList arrayList = new ArrayList();
                    int i = r8.A01;
                    for (int i2 = 0; i2 < i; i2++) {
                        C254703su r2 = new C254703su();
                        r2.A17(2FW.A1g, ((DirectMessageEditHistory) A0u2.get(i2)).A01);
                        r2.A1D(r8.A1u);
                        r2.A1m(AnonymousClass05K.A0j);
                        r2.A15(r8.A0U());
                        r2.A1C(002.A0O(r8.A0f(), i2));
                        r2.A13 = r8.A0V();
                        r2.A19(r8.A1P);
                        r2.A1A(Long.valueOf(r8.C7c()));
                        r2.A1B(r8.A1L);
                        Long l = r8.A1K;
                        synchronized (r2) {
                            r2.A1K = l;
                        }
                        AnonymousClass7LQ r4 = new AnonymousClass7LQ(this.A0g, A012.A0G, r2, A012.A0K);
                        if (A082 != null) {
                            long j = A082.A07;
                            long j2 = A012.A07;
                            if (j == j2) {
                                r4.A07 = j2;
                                r4.A08 = (A012.A08 - ((long) i)) + ((long) i2);
                                arrayList.add(r4);
                            }
                        }
                        r4.A07 = (A012.A07 - ((long) i)) + ((long) i2);
                        arrayList.add(r4);
                    }
                    Object obj = arrayList.get(0);
                    0qQ.A07(obj);
                    AnonymousClass7LQ r0 = (AnonymousClass7LQ) obj;
                    r0.A0E = A012;
                    r0.A0e.A13(r8.A0P());
                    C66709MbG mbG = new C66709MbG(A012.A0F, (List) arrayList, r8.C7c());
                    if (z) {
                        EvC(mbG, false);
                    } else {
                        CLm(mbG);
                    }
                    A0W(A012, A002);
                }
            }
        }
    }

    public final boolean EvC(C66709MbG mbG, boolean z) {
        N88 n88;
        String str;
        C331837So A092 = A09(this, 0);
        HashSet hashSet = this.A0v;
        C66709MbG mbG2 = mbG;
        long j = mbG2.A01;
        Long valueOf = Long.valueOf(j);
        hashSet.add(valueOf);
        List list = (List) mbG2.A02;
        A0L((C328317Ei) null, list, (List) null, (List) null, false);
        int i = A0R().A01;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            Object A052 = A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r3 = (C331837So) A052;
            if (!(r3 instanceof N88) || ((N88) r3).A02 != j) {
                i2++;
            } else {
                0mo A0R2 = A0R();
                A0R2.A05(i2);
                0mo.A02(A0R2, i2, true);
                if (z && hashSet.contains(valueOf) && this.A0u.contains(valueOf)) {
                    int size = list.size();
                    Context context = this.A00;
                    if (context == null) {
                        str = "context";
                    } else {
                        String string = context.getResources().getString(2131952142, new Object[]{Integer.valueOf(size)});
                        0qQ.A07(string);
                        AnonymousClass7L2 r2 = this.A0F;
                        if (r2 == null) {
                            str = "threadTheme";
                        } else {
                            A0K(this, new N88(mbG2, string, r2.A00, 0, true, false));
                            Object A053 = A0R().A05(i2);
                            0qQ.A07(A053);
                            A0W((C331837So) A053, i2);
                            hashSet.remove(valueOf);
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        11Z.A02(new AnonymousClass7F9(this));
        if (!(A092 instanceof N88) || (n88 = (N88) A092) == null || n88.A02 != j) {
            return false;
        }
        return true;
    }

    public final void FK6(N4D n4d, DirectMessageIdentifier directMessageIdentifier) {
        int i = A0R().A01;
        int i2 = 0;
        while (i2 < i) {
            Object A052 = A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r1 = (C331837So) A052;
            if (!(r1 instanceof AnonymousClass7LQ) || !directMessageIdentifier.A02(((AnonymousClass7LQ) r1).A0e.A0V())) {
                i2++;
            } else if (i2 != -1) {
                Object A053 = A0R().A05(i2);
                0qQ.A07(A053);
                C331837So r12 = (C331837So) A053;
                if (r12 instanceof AnonymousClass7LQ) {
                    C254703su r13 = ((AnonymousClass7LQ) r12).A0e;
                    if (!n4d.equals(r13.A0G)) {
                        r13.A0G = n4d;
                        r13.A2C = true;
                    }
                    A0I(this, i2);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public AnonymousClass7ZX(AnonymousClass0iw r6, UserSession userSession, AnonymousClass7ZW r8, C331847Sp r9, C330437Mt r10, C331757Sg r11, AnonymousClass7UL r12, AnonymousClass7ZC r13, AnonymousClass7YU r14, AnonymousClass9HO r15, AnonymousClass9HC r16, AnonymousClass7ZL r17, AnonymousClass7ZJ r18, AnonymousClass7Z5 r19, AnonymousClass7ZP r20, AnonymousClass7ZF r21, AnonymousClass7ZR r22, AnonymousClass7ZT r23, AnonymousClass7ZH r24, AnonymousClass7ZU r25, AnonymousClass7SD r26, AnonymousClass7ZN r27, MessagingUser messagingUser, AnonymousClass7S7 r29, User user, String str, Map map, AnonymousClass0eK r33, boolean z) {
        this.A0w = map;
        this.A0n = r25;
        this.A09 = r16;
        this.A0H = r26;
        this.A0p = r29;
        this.A0q = user;
        this.A0o = messagingUser;
        this.A0g = userSession;
        this.A0f = r6;
        this.A16 = r19;
        this.A0l = r14;
        this.A0a = z;
        this.A13 = r13;
        this.A18 = r21;
        this.A17 = r20;
        this.A19 = r22;
        this.A1A = r23;
        this.A1B = r24;
        this.A15 = r18;
        this.A14 = r17;
        this.A1C = r27;
        this.A0i = r10;
        this.A0k = r12;
        this.A0j = r11;
        this.A0x = r33;
        this.A12 = r8;
        this.A0h = r9;
        0eO r3 = 0eO.A03;
        this.A0Q = AnonymousClass0eN.A00(r3, new AnonymousClass9LO(this, 31));
        this.A0P = AnonymousClass0eN.A00(r3, new AnonymousClass9LO(this, 30));
        this.A0R = AnonymousClass0eN.A00(r3, new AnonymousClass9LO(this, 32));
        this.A11 = new 1Q7("IgSecureUriParser").A00;
        this.A0z = AnonymousClass0eN.A00(r3, new C377689Mu(this, r15, str, 15));
        this.A0r = 17h.A00(userSession);
        this.A1D = new HashSet();
        this.A0y = AnonymousClass1YB.A00(new AnonymousClass9LO(this, 29));
        this.A0m = new C333497Ze(this);
        this.A10 = AnonymousClass1YB.A00(new AnonymousClass9LO(this, 33));
        if (r10 != null) {
            r10.A0D.add(new AnonymousClass7BM(this));
        }
    }

    public static final int A01(AnonymousClass7ZX r3, int i) {
        int i2 = r3.A0R().A01;
        for (int i3 = i + 1; i3 < i2; i3++) {
            if (r3.A0R().A05(i3) instanceof AnonymousClass7LQ) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r2 
      PHI: (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:0:0x0000, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A02(X.AnonymousClass7ZX r1, int r2) {
        /*
        L_0x0000:
            int r2 = r2 + -1
            r0 = -1
            if (r0 >= r2) goto L_0x002a
            X.0mo r0 = r1.A0R()
            java.lang.Object r0 = r0.A05(r2)
            boolean r0 = r0 instanceof X.C330807Oi
            if (r0 != 0) goto L_0x0029
            X.0mo r0 = r1.A0R()
            java.lang.Object r0 = r0.A05(r2)
            boolean r0 = r0 instanceof X.AnonymousClass7LQ
            if (r0 != 0) goto L_0x0029
            X.0mo r0 = r1.A0R()
            java.lang.Object r0 = r0.A05(r2)
            boolean r0 = r0 instanceof X.C331007Pc
            if (r0 == 0) goto L_0x0000
        L_0x0029:
            return r2
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.A02(X.7ZX, int):int");
    }

    public static final int A03(AnonymousClass7ZX r1, AnonymousClass7LQ r2) {
        if (!r1.A0T) {
            return 8;
        }
        C254703su r12 = r2.A0e;
        if (r12.A1T() || r12.A1S() || r12.A13 != null || r12.A1F != AnonymousClass05K.A0j) {
            return 4;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r8.A0T != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r10.A1O() != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r2.A1X() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r8.A0T != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r10.A1O() != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A05(X.AnonymousClass7ZX r8, X.C331837So r9, X.C254703su r10, X.C254703su r11, X.C327687Bu r12, boolean r13) {
        /*
            boolean r0 = r9 instanceof X.C330807Oi
            r3 = r10
            r4 = r12
            if (r0 == 0) goto L_0x002c
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r8.A0o
            boolean r0 = r10.A1N()
            if (r0 != 0) goto L_0x0015
            boolean r0 = r10.A1O()
            r6 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r6 = 1
        L_0x0016:
            X.7Oi r9 = (X.C330807Oi) r9
            com.instagram.direct.model.messaginguser.MessagingUser r0 = r9.A03
            java.lang.String r5 = r0.A03
            X.0qQ.A07(r5)
            if (r13 == 0) goto L_0x0026
            boolean r0 = r8.A0T
            r7 = 1
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r7 = 0
        L_0x0027:
            int r0 = X.C328487Ez.A01(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x002c:
            com.instagram.direct.model.messaginguser.MessagingUser r5 = r8.A0o
            boolean r0 = r10.A1N()
            if (r0 != 0) goto L_0x003b
            boolean r0 = r10.A1O()
            r9 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r9 = 1
        L_0x003c:
            X.7SD r0 = r8.A0H
            java.util.List r0 = r0.A0b
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x006c
            X.7SD r0 = r8.A0H
            java.util.List r1 = r0.A0b
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.4Cl r0 = r2.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.AaX()
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A06
            if (r1 == r0) goto L_0x0073
            X.4Cl r0 = r2.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.AaX()
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r1 == r0) goto L_0x0073
            boolean r0 = r2.A1X()
            if (r0 != 0) goto L_0x0073
        L_0x006c:
            if (r13 == 0) goto L_0x0073
            boolean r0 = r8.A0T
            r10 = 1
            if (r0 == 0) goto L_0x0074
        L_0x0073:
            r10 = 0
        L_0x0074:
            r7 = r11
            r6 = r3
            r8 = r12
            int r0 = X.C328487Ez.A00(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.A05(X.7ZX, X.7So, X.3su, X.3su, X.7Bu, boolean):int");
    }

    public static final C47770EGh A07(AnonymousClass7ZX r6, AnonymousClass7SD r7, User user, Integer num) {
        Context context = r6.A00;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        C47770EGh eGh = new C47770EGh(context, r6.A0g, r7, user, num);
        r6.A0c = eGh;
        return eGh;
    }

    public static final C331837So A09(AnonymousClass7ZX r1, int i) {
        if (i < 0 || i >= r1.A0R().A01) {
            return null;
        }
        return (C331837So) r1.A0R().A05(i);
    }

    public static final ArrayList A0C(AnonymousClass7ZX r5, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < r5.A0R().A01 && arrayList.size() < i; i2++) {
            Object A052 = r5.A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r2 = (C331837So) A052;
            if (r2 instanceof AnonymousClass7LQ) {
                AnonymousClass7LQ r22 = (AnonymousClass7LQ) r2;
                C254703su r1 = r22.A0e;
                0qQ.A07(r1);
                if (r1.A0g() != null && !r1.A1j(r5.A0q)) {
                    arrayList.add(r22);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(X.C66709MbG r16, X.AnonymousClass7ZX r17, boolean r18) {
        /*
            r5 = r17
            java.util.HashSet r2 = r5.A0v
            r13 = r16
            long r0 = r13.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.contains(r4)
            if (r0 != 0) goto L_0x0134
            java.util.HashSet r3 = r5.A0u
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto L_0x0134
            java.lang.Object r9 = r13.A02
            java.util.List r9 = (java.util.List) r9
            int r8 = r9.size()
            android.content.Context r0 = r5.A00
            if (r0 != 0) goto L_0x0030
            java.lang.String r12 = "context"
        L_0x0028:
            X.0qQ.A0F(r12)
        L_0x002b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0030:
            android.content.res.Resources r7 = r0.getResources()
            r2 = 0
            java.lang.Object r6 = r9.get(r2)
            X.7LQ r6 = (X.AnonymousClass7LQ) r6
            java.lang.String r12 = "threadTheme"
            r1 = 1
            if (r18 == 0) goto L_0x00e5
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x00f7
            int r10 = r9.size()
            java.util.Iterator r8 = r9.iterator()
            r9 = 0
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r8.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r0 = r0.A0e
            X.2FW r7 = r0.A10
            X.2FW r0 = X.2FW.A0G
            if (r7 == r0) goto L_0x004d
            int r9 = r9 + 1
            goto L_0x004d
        L_0x0064:
            java.lang.String r11 = "context"
            android.content.Context r0 = r5.A00
            if (r9 != 0) goto L_0x00c2
            if (r0 == 0) goto L_0x00bb
            android.content.res.Resources r8 = r0.getResources()
            r7 = 2131820966(0x7f1101a6, float:1.9274662E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r10 = r8.getQuantityString(r7, r10, r0)
        L_0x007f:
            X.0qQ.A0A(r10)
            android.content.Context r0 = r5.A00
            if (r0 == 0) goto L_0x00bb
            android.content.res.Resources r8 = r0.getResources()
            r7 = 2131820964(0x7f1101a4, float:1.9274658E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r10}
            java.lang.String r0 = r8.getQuantityString(r7, r9, r0)
            android.text.SpannableString r14 = new android.text.SpannableString
            r14.<init>(r0)
            java.lang.String r0 = r14.toString()
            X.0qQ.A07(r0)
            int r9 = X.00l.A08(r0, r10, r2, r2)
            if (r10 == 0) goto L_0x00c0
            int r8 = r10.length()
        L_0x00ab:
            int r8 = r8 + r9
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r7 = 17
            r14.setSpan(r0, r9, r8, r7)
            X.7L2 r0 = r5.A0F
            if (r0 != 0) goto L_0x00d8
            r11 = r12
        L_0x00bb:
            X.0qQ.A0F(r11)
            goto L_0x002b
        L_0x00c0:
            r8 = 0
            goto L_0x00ab
        L_0x00c2:
            if (r0 == 0) goto L_0x00bb
            android.content.res.Resources r8 = r0.getResources()
            r7 = 2131820965(0x7f1101a5, float:1.927466E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r10 = r8.getQuantityString(r7, r9, r0)
            goto L_0x007f
        L_0x00d8:
            X.7Kx r0 = r0.A04
            int r1 = r0.A04
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r14.setSpan(r0, r9, r8, r7)
            goto L_0x010f
        L_0x00e5:
            r1 = 2131952141(0x7f13020d, float:1.9540716E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r14 = r7.getString(r1, r0)
            r18 = 1
            goto L_0x0137
        L_0x00f7:
            X.3su r0 = r6.A0e
            boolean r0 = r0.A2P
            r1 = 2131820963(0x7f1101a3, float:1.9274656E38)
            if (r0 == 0) goto L_0x0103
            r1 = 2131820962(0x7f1101a2, float:1.9274654E38)
        L_0x0103:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r14 = r7.getQuantityString(r1, r8, r0)
        L_0x010f:
            X.3su r0 = r6.A0e
            boolean r0 = r0.A2P
            if (r0 != 0) goto L_0x0135
            X.7L2 r0 = r5.A0F
            if (r0 == 0) goto L_0x0028
            X.7Kx r0 = r0.A04
            int r1 = r0.A0A
            r18 = 0
        L_0x011f:
            X.7L2 r0 = r5.A0F
            if (r0 == 0) goto L_0x0028
            int r15 = r0.A00
            X.N88 r12 = new X.N88
            r17 = r2
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            A0K(r5, r12)
            r3.add(r4)
        L_0x0134:
            return
        L_0x0135:
            r18 = 0
        L_0x0137:
            r1 = 0
            goto L_0x011f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.A0D(X.MbG, X.7ZX, boolean):void");
    }

    public static final void A0F(AnonymousClass7ZX r16) {
        AnonymousClass7ZX r3 = r16;
        AnonymousClass7LT r10 = r3.A0J;
        ArrayList<Object> arrayList = null;
        if (r10 != null) {
            AnonymousClass7L2 r9 = r3.A0F;
            if (r9 == null) {
                0qQ.A0F("threadTheme");
                throw AnonymousClass00P.createAndThrow();
            }
            List<User> list = r3.A0H.A0b;
            0qQ.A0B(list, 1);
            arrayList = new ArrayList<>();
            for (User user : list) {
                Boolean Cbl = user.A03.Cbl();
                if (Cbl != null && Cbl.booleanValue()) {
                    String username = user.getUsername();
                    int i = r9.A00;
                    Context context = r10.A00;
                    int color = context.getColor(2Yu.A07(context));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Object obj = new Object();
                    int length = spannableStringBuilder.length();
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
                    int length2 = spannableStringBuilder.length();
                    TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, R.style.igds_emphasized_body_2);
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append(context.getString(2131969358, new Object[]{username}));
                    spannableStringBuilder.setSpan(textAppearanceSpan, length3, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.append(" \n");
                    TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(context, R.style.PrivacyTextStyle);
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append(context.getString(2131969357));
                    spannableStringBuilder.setSpan(textAppearanceSpan2, length4, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
                    arrayList.add(new C381929co(username, SpannableString.valueOf(spannableStringBuilder), i));
                }
            }
        }
        List<Object> list2 = r3.A0O;
        if (list2 != null) {
            for (Object A082 : list2) {
                r3.A0R().A08(A082);
            }
        }
        r3.A0O = arrayList;
        if (arrayList != null) {
            for (Object A032 : arrayList) {
                r3.A0R().A03(A032);
            }
        }
    }

    public static final void A0G(AnonymousClass7ZX r3) {
        AnonymousClass7O8 r1 = r3.A0E;
        if (r1 != null) {
            r3.A0R().A08(r1);
        }
        r3.A0E = null;
        AnonymousClass7OB r12 = r3.A0D;
        if (r12 != null) {
            r3.A0R().A08(r12);
        }
        r3.A0D = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.7O8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.7OB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.7O8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.7O8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0H(X.AnonymousClass7ZX r17) {
        /*
            r14 = 0
            X.7Bp r11 = new X.7Bp
            r11.<init>(r14, r14)
            r2 = r17
            X.0mo r0 = r2.A0R()
            int r7 = r0.A01
            r5 = 1
            int r7 = r7 - r5
        L_0x0011:
            r1 = -1
            if (r1 >= r7) goto L_0x0033
            X.0mo r0 = r2.A0R()
            java.lang.Object r3 = r0.A05(r7)
            X.0qQ.A07(r3)
            X.7So r3 = (X.C331837So) r3
            boolean r0 = r3 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x0156
            X.7LQ r3 = (X.AnonymousClass7LQ) r3
            X.3su r0 = r3.A0e
            boolean r0 = r0.A2P
            if (r0 == 0) goto L_0x018c
            long r14 = r3.C7Z()
            X.7Bp r11 = r3.A0F
        L_0x0033:
            X.7O8 r0 = r2.A0E
            if (r0 != 0) goto L_0x00ff
            X.7SD r0 = r2.A0H
            X.3t3 r0 = r0.A0P
            if (r0 == 0) goto L_0x00fc
            X.3t0 r0 = X.C300965yF.A01(r0)
            java.lang.String r9 = r0.A00
        L_0x0043:
            X.7OB r0 = r2.A0D
            r8 = 0
            if (r0 != 0) goto L_0x01ba
            if (r9 == 0) goto L_0x00ff
            java.lang.String r0 = r2.A0M
            if (r0 == 0) goto L_0x00ff
            com.instagram.common.session.UserSession r7 = r2.A0g
            X.0Tu r0 = X.0Tu.A05
            r3 = 36312797436445953(0x81024c00000501, double:3.027697546482716E-306)
            boolean r0 = X.182.A06(r0, r7, r3)
            if (r0 == 0) goto L_0x00ff
            X.4kA r0 = X.AnonymousClass4k9.A00(r7)
            X.0xa r3 = r0.A00
            java.lang.String r10 = "direct_shh_mode_intro_qp_seen_count_"
            java.lang.String r0 = X.002.A0R(r10, r9)
            int r3 = r3.getInt(r0, r8)
            r0 = 5
            if (r3 >= r0) goto L_0x00ff
            X.4kA r0 = X.AnonymousClass4k9.A00(r7)
            java.lang.String r4 = "Required value was null."
            X.0xa r6 = r0.A00
            X.0xY r5 = r6.AR4()
            java.lang.String r3 = X.002.A0R(r10, r9)
            java.lang.String r0 = X.002.A0R(r10, r9)
            int r0 = r6.getInt(r0, r8)
            int r0 = r0 + 1
            r5.E5Z(r3, r0)
            r5.apply()
            java.lang.String r3 = r7.A06
            java.lang.String r0 = r2.A0M
            boolean r0 = X.0qQ.A0K(r3, r0)
            java.lang.String r6 = "context"
            if (r0 == 0) goto L_0x00d7
            android.content.Context r0 = r2.A00
            if (r0 == 0) goto L_0x00cf
            android.content.res.Resources r3 = r0.getResources()
            r0 = 2131973715(0x7f135653, float:1.9584474E38)
            java.lang.String r7 = r3.getString(r0)
        L_0x00ab:
            X.0qQ.A0A(r7)
            android.content.Context r0 = r2.A00
            if (r0 == 0) goto L_0x00cf
            android.content.res.Resources r4 = r0.getResources()
            X.7SD r0 = r2.A0H
            boolean r3 = r0.A18
            r0 = 2131973716(0x7f135654, float:1.9584476E38)
            if (r3 == 0) goto L_0x00c2
            r0 = 2131973719(0x7f135657, float:1.9584482E38)
        L_0x00c2:
            java.lang.String r8 = r4.getString(r0)
            X.0qQ.A07(r8)
            X.7L2 r0 = r2.A0F
            if (r0 != 0) goto L_0x0190
            java.lang.String r6 = "threadTheme"
        L_0x00cf:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d7:
            X.17i r3 = r2.A0r
            java.lang.String r0 = r2.A0M
            com.instagram.user.model.User r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x01b1
            java.lang.String r5 = X.AnonymousClass50n.A07(r0)
            X.0qQ.A07(r5)
            android.content.Context r0 = r2.A00
            if (r0 == 0) goto L_0x00cf
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131973714(0x7f135652, float:1.9584472E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r7 = r4.getString(r3, r0)
            goto L_0x00ab
        L_0x00fc:
            r9 = 0
            goto L_0x0043
        L_0x00ff:
            com.instagram.common.session.UserSession r0 = r2.A0g
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r4 = r0.A01
            r0 = 666(0x29a, float:9.33E-43)
            java.lang.String r3 = X.C273654mx.A00(r0)
            r0 = 0
            int r0 = r4.getInt(r3, r0)
            r16 = 0
            if (r0 >= r5) goto L_0x0118
            r16 = 1
        L_0x0118:
            X.7O8 r5 = r2.A0E
            if (r5 == 0) goto L_0x0132
            long r3 = r5.A02
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01ba
            X.0mo r3 = r2.A0R()
            r0 = 4
            int r4 = X.0mo.A00(r3, r5, r0)
        L_0x012b:
            android.content.Context r10 = r2.A00
            if (r10 != 0) goto L_0x0134
            java.lang.String r6 = "context"
            goto L_0x00cf
        L_0x0132:
            r4 = -1
            goto L_0x012b
        L_0x0134:
            X.7SD r0 = r2.A0H
            boolean r3 = r0.A18
            X.7L2 r0 = r2.A0F
            java.lang.String r6 = "threadTheme"
            if (r0 == 0) goto L_0x00cf
            X.7Kx r0 = r0.A04
            int r12 = r0.A0L
            int r13 = r0.A04
            r17 = r3
            X.7O8 r5 = X.C395219zP.A00(r10, r11, r12, r13, r14, r16, r17)
            r2.A0E = r5
            if (r4 == r1) goto L_0x01b7
            X.0mo r0 = r2.A0R()
            r0.A04(r5, r4)
            return
        L_0x0156:
            boolean r0 = r3 instanceof X.N88
            if (r0 == 0) goto L_0x018c
            X.N88 r3 = (X.N88) r3
            X.MbG r0 = r3.A03
            java.lang.Object r6 = r0.A02
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            r3 = 0
        L_0x0167:
            if (r3 >= r4) goto L_0x018c
            java.lang.Object r0 = r6.get(r3)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r0 = r0.A0e
            boolean r0 = r0.A2P
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r6.get(r3)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            long r14 = r0.C7Z()
            java.lang.Object r0 = r6.get(r3)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.7Bp r11 = r0.A0F
            goto L_0x0033
        L_0x0189:
            int r3 = r3 + 1
            goto L_0x0167
        L_0x018c:
            int r7 = r7 + -1
            goto L_0x0011
        L_0x0190:
            X.7Kx r0 = r0.A04
            int r0 = r0.A0L
            X.7OB r5 = new X.7OB
            r6 = r11
            r9 = r0
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r2.A0D = r5
            X.0mo r3 = r2.A0R()
            r0 = 4
            int r3 = X.0mo.A00(r3, r5, r0)
            if (r3 == r1) goto L_0x01b7
            X.0mo r0 = r2.A0R()
            r0.A04(r5, r3)
            return
        L_0x01b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x01b7:
            A0K(r2, r5)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.A0H(X.7ZX):void");
    }

    public static final void A0I(AnonymousClass7ZX r1, int i) {
        if (i >= 0 && i < r1.A0R().A01) {
            Object A052 = r1.A0R().A05(i);
            0qQ.A07(A052);
            r1.A0W((C331837So) A052, i);
        }
    }

    private final void A0L(C328317Ei r8, List list, List list2, List list3, boolean z) {
        11Z.A02(new C328417Es(this, r8, list, list3, list2, z));
    }

    public static final boolean A0N(AnonymousClass7ZX r1) {
        UserSession userSession = r1.A0g;
        if (C328447Ev.A01(userSession) || C328447Ev.A00(userSession) || AnonymousClass9B8.A09(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A0O(AnonymousClass7ZX r4) {
        if (r4.A0H.A08 == 29) {
            int i = r4.A0R().A01;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < i) {
                    Object A052 = r4.A0R().A05(i2);
                    0qQ.A07(A052);
                    if ((A052 instanceof AnonymousClass7LQ) && (i3 = i3 + 1) > 1) {
                        break;
                    }
                    i2++;
                } else {
                    if (!182.A06(0Tu.A05, r4.A0g, 36322727400909173L)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0P(AnonymousClass7ZX r4) {
        User user;
        Boolean A002;
        if (r4.A0H.A08 != 1012 || !AnonymousClass9B8.A06(r4.A0g)) {
            return false;
        }
        List list = r4.A0H.A0b;
        if (list.size() != 1 || (user = (User) list.get(0)) == null || !user.A1l() || (A002 = r4.A12.A00(user.getId())) == null || !A002.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A0Q(AnonymousClass7ZX r4, C254703su r5) {
        C254873tC r1;
        Uri A002;
        String path;
        String str = null;
        if (r5.A10 == 2FW.A1s) {
            C255723uc r12 = (C255723uc) 00k.A0J(C253053q8.A07(r5.A1q));
            if (r12 != null) {
                str = r12.A02;
            }
        } else {
            ImmutableList A0H2 = r5.A0H();
            if (!(A0H2 == null || (r1 = (C254873tC) 00k.A0J(A0H2)) == null)) {
                str = r1.A0u;
            }
        }
        if (str == null || (A002 = 0cp.A00(r4.A11, str)) == null || (path = A002.getPath()) == null || !00l.A0d(path, "reel", false)) {
            return false;
        }
        return true;
    }

    public final 0mo A0R() {
        0mo r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_threadRowDataList");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0261, code lost:
        if (r0.isEmpty() != false) goto L_0x0263;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C331837So A0S(int r37) {
        /*
            r36 = this;
            r6 = r36
            X.0mo r0 = r6.A0R()
            r10 = r37
            java.lang.Object r5 = r0.A05(r10)
            X.0qQ.A07(r5)
            X.7So r5 = (X.C331837So) r5
            boolean r0 = r5 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x0330
            r0 = r5
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            r35 = r0
            X.3su r4 = r0.A0e
            X.0qQ.A07(r4)
            boolean r0 = r0.A0W
            if (r0 != 0) goto L_0x003c
            X.7Bo r1 = r35.A03()
            X.0qQ.A07(r1)
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_CHANNEL_MESSAGE_XPOSTED_HINT
            if (r1 == r0) goto L_0x0036
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_AI_AGENT_REGENERATE
            if (r1 == r0) goto L_0x0036
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_LONG_PRESS_REPLY_TO_AI
            if (r1 != r0) goto L_0x003c
        L_0x0036:
            X.7Bo r1 = X.C327627Bo.NUX_TYPE_NONE
            r0 = r35
            r0.A0C = r1
        L_0x003c:
            X.3SZ r0 = r6.A0d
            java.lang.String r2 = r4.A0g()
            r3 = 0
            if (r2 == 0) goto L_0x062f
            if (r0 == 0) goto L_0x0051
            java.util.Comparator r1 = X.AnonymousClass48V.A01
            java.lang.String r0 = r0.A02
            int r0 = r1.compare(r0, r2)
            if (r0 >= 0) goto L_0x062f
        L_0x0051:
            com.instagram.user.model.User r0 = r6.A0q
            boolean r0 = r4.A1j(r0)
            if (r0 != 0) goto L_0x062f
            java.util.Set r0 = r6.A1E
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x062f
            com.instagram.common.session.UserSession r2 = r6.A0g
            X.0iw r0 = r6.A0f
            r34 = r0
            X.7SD r0 = r6.A0H
            X.3t3 r0 = r0.A0P
            if (r0 == 0) goto L_0x0209
            X.3t0 r0 = X.C300965yF.A01(r0)
            java.lang.String r7 = r0.A00
        L_0x0073:
            java.lang.String r31 = ""
            java.util.regex.Pattern r0 = X.0mp.A00
            if (r7 != 0) goto L_0x007b
            r7 = r31
        L_0x007b:
            java.lang.Long r0 = r4.A1K
            r33 = r0
            java.lang.Long r0 = r4.A1M
            if (r0 != 0) goto L_0x01f9
            r30 = 0
        L_0x0085:
            boolean r0 = r4.A1T()
            if (r0 == 0) goto L_0x01f5
            java.util.Calendar r0 = X.AnonymousClass7F5.A05
            long r9 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r4.C7c()
            long r0 = r8.toMillis(r0)
            long r9 = r9 - r0
            java.lang.Long r29 = java.lang.Long.valueOf(r9)
        L_0x00a0:
            com.google.common.collect.ImmutableList r1 = r4.A0H()
            if (r1 == 0) goto L_0x01f2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f2
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r12 = r0.A1C
        L_0x00b5:
            r13 = 0
            r9 = 1
            java.lang.Object r1 = r4.A1T
            boolean r0 = r1 instanceof X.AnonymousClass7FJ
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectStoryShareMedia"
            X.0qQ.A0C(r1, r0)
            X.7FJ r1 = (X.AnonymousClass7FJ) r1
            java.lang.Boolean r0 = r1.A03
            r28 = r0
            r1 = 0
        L_0x00c9:
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r13)
            boolean r0 = r4.A2P
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r0)
            java.lang.String r25 = r4.A0g()
            X.2FW r0 = r4.A10
            java.lang.String r0 = r0.A00
            r32 = r0
            boolean r0 = r4.A1T()
            if (r0 != 0) goto L_0x0163
            r24 = 0
        L_0x00e5:
            if (r7 == 0) goto L_0x0395
            X.2FW r10 = r4.A10
            X.2FW r8 = X.2FW.A17
            if (r10 == r8) goto L_0x00f5
            X.2FW r0 = X.2FW.A1s
            if (r10 == r0) goto L_0x00f5
            X.2FW r0 = X.2FW.A0y
            if (r10 != r0) goto L_0x0395
        L_0x00f5:
            java.lang.String r0 = X.C66713MbK.A00
            if (r10 != r8) goto L_0x0154
            X.9Iu r0 = r4.A0E()
            if (r0 == 0) goto L_0x0154
            X.9Iu r0 = r4.A0E()
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x014d
            X.9Iu r0 = r4.A0E()
            java.lang.Object r0 = r0.A00
            X.4wk r0 = (X.C278354wk) r0
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x014d
            X.9Iu r0 = r4.A0E()
            java.lang.Object r0 = r0.A00
            X.4wk r0 = (X.C278354wk) r0
            java.lang.String r0 = r0.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x014d
            X.9Iu r0 = r4.A0E()
            java.lang.Object r0 = r0.A00
            X.4wk r0 = (X.C278354wk) r0
            java.lang.String r0 = r0.A05
            boolean r0 = X.C393979xL.A00(r0)
            if (r0 != 0) goto L_0x014d
            X.9Iu r0 = r4.A0E()
            java.lang.Object r0 = r0.A00
            X.4wk r0 = (X.C278354wk) r0
            java.lang.String r8 = r0.A05
        L_0x013d:
            java.lang.String r23 = r4.A0g()
            java.lang.String r22 = "mibextid"
            if (r8 == 0) goto L_0x0395
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0395
            goto L_0x020c
        L_0x014d:
            X.9Iu r0 = r4.A0E()
            java.lang.String r8 = r0.A01
            goto L_0x013d
        L_0x0154:
            X.2FW r8 = r4.A10
            X.2FW r0 = X.2FW.A1s
            if (r8 == r0) goto L_0x0160
            X.2FW r0 = X.2FW.A0y
            if (r8 == r0) goto L_0x0160
            r8 = 0
            goto L_0x013d
        L_0x0160:
            java.lang.String r8 = r4.A1q
            goto L_0x013d
        L_0x0163:
            boolean r0 = r4.A1S()
            if (r0 == 0) goto L_0x016d
            X.Nlw r24 = X.C69452Nlw.IG_ADVANCED_CRYPTO_TRANSPORT
            goto L_0x00e5
        L_0x016d:
            X.Nlw r24 = X.C69452Nlw.IG_DJANGO
            goto L_0x00e5
        L_0x0171:
            r0 = 2
            boolean r0 = X.AnonymousClass9JI.A00(r0, r1)
            java.lang.String r8 = "tag"
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectMediaShare"
            X.0qQ.A0C(r1, r0)
            X.9JI r1 = (X.AnonymousClass9JI) r1
            java.lang.String r1 = r1.A03
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x018b
            java.lang.String r1 = "tagged_feed_post"
        L_0x018b:
            r28 = 0
            goto L_0x00c9
        L_0x018f:
            boolean r0 = r1 instanceof X.AnonymousClass77X
            if (r0 == 0) goto L_0x01a5
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectClipsShare"
            X.0qQ.A0C(r1, r0)
            X.77X r1 = (X.AnonymousClass77X) r1
            java.lang.String r1 = r1.A04
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x018b
            java.lang.String r1 = "tagged_reel"
            goto L_0x018b
        L_0x01a5:
            com.google.common.collect.ImmutableList r1 = r4.A0H()
            if (r1 == 0) goto L_0x01f0
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r0 = r1.get(r13)
            X.3tC r0 = (X.C254873tC) r0
            com.google.common.collect.ImmutableList r1 = r0.A01()
            if (r1 == 0) goto L_0x01f0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f0
            java.lang.Object r0 = r1.get(r13)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r0 = r1.get(r13)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0328
            X.0bY r0 = X.C3265677h.A00
            android.net.Uri r0 = X.0cp.A01(r0, r1)
            if (r0 == 0) goto L_0x01f0
            java.lang.String r1 = r0.getHost()
            java.lang.String r0 = "comments"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01f0
            java.lang.String r1 = "tagged_comment"
            goto L_0x018b
        L_0x01f0:
            r1 = 0
            goto L_0x018b
        L_0x01f2:
            r12 = 0
            goto L_0x00b5
        L_0x01f5:
            r29 = r3
            goto L_0x00a0
        L_0x01f9:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.longValue()
            long r0 = r8.toMillis(r0)
            java.lang.Long r30 = java.lang.Long.valueOf(r0)
            goto L_0x0085
        L_0x0209:
            r7 = 0
            goto L_0x0073
        L_0x020c:
            android.net.Uri r11 = X.0cp.A03(r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            X.0qQ.A07(r11)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r10 = r11.getHost()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r10 == 0) goto L_0x0395
            X.11S r0 = X.C3265677h.A02     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            boolean r0 = r0.A08(r10)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 != 0) goto L_0x0229
            X.11S r0 = X.C3265677h.A03     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            boolean r0 = r0.A08(r10)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 == 0) goto L_0x0395
        L_0x0229:
            r0 = r34
            X.0wc r14 = X.AnonymousClass0kN.A01(r0, r2)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r8 = "ig_direct_fb_reshared_content_impression"
            X.0kJ r0 = r14.A00     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            X.0Aj r14 = r14.A00(r0, r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            boolean r0 = r14.isSampled()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 == 0) goto L_0x0395
            java.lang.String r0 = "deeplink_ref_surface"
            java.lang.String r15 = r11.getQueryParameter(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r0 = "fb_entity_type"
            java.lang.String r8 = r11.getQueryParameter(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r0 = r22
            java.lang.String r17 = r11.getQueryParameter(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r0 = "instagram_direct"
            boolean r21 = r0.equals(r15)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            com.google.common.collect.ImmutableList r0 = r4.A0H()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 == 0) goto L_0x0263
            boolean r0 = r0.isEmpty()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r20 = 1
            if (r0 == 0) goto L_0x0265
        L_0x0263:
            r20 = 0
        L_0x0265:
            if (r8 != 0) goto L_0x027a
            java.lang.String r16 = r11.getPath()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r16 == 0) goto L_0x029b
            java.lang.String r0 = "/reel/"
            r15 = r0
            r0 = r16
            boolean r0 = X.00l.A0d(r0, r15, r13)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 != r9) goto L_0x029b
            java.lang.String r8 = "reels"
        L_0x027a:
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            com.instagram.user.model.User r0 = r0.A01(r2)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            boolean r15 = r4.A1j(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r10 = "content_type"
            X.0eP r19 = new X.0eP     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r0 = r19
            r0.<init>(r10, r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            X.0eP r18 = new X.0eP     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r10 = r22
            r8 = r17
            r0 = r18
            r0.<init>(r10, r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r11 = "viewer_is_sender"
            goto L_0x02c8
        L_0x029b:
            java.lang.String r16 = r11.getPath()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r16 == 0) goto L_0x02af
            java.lang.String r0 = "/posts/"
            r15 = r0
            r0 = r16
            boolean r0 = X.00l.A0d(r0, r15, r13)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 != r9) goto L_0x02af
            java.lang.String r8 = "newsfeed"
            goto L_0x027a
        L_0x02af:
            X.11S r0 = X.C3265677h.A03     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            boolean r0 = r0.A08(r10)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 != 0) goto L_0x02c5
            java.lang.String r10 = r11.getPath()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r10 == 0) goto L_0x027a
            java.lang.String r0 = "/watch"
            boolean r0 = X.00l.A0d(r10, r0, r13)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            if (r0 != r9) goto L_0x027a
        L_0x02c5:
            java.lang.String r8 = "watch"
            goto L_0x027a
        L_0x02c8:
            java.lang.String r8 = "1"
            java.lang.String r17 = "0"
            r10 = r17
            if (r15 == 0) goto L_0x02d1
            r10 = r8
        L_0x02d1:
            X.0eP r16 = new X.0eP     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r0 = r16
            r0.<init>(r11, r10)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r11 = "from_fb_share_sheet"
            r10 = r17
            if (r21 == 0) goto L_0x02df
            r10 = r8
        L_0x02df:
            X.0eP r15 = new X.0eP     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r15.<init>(r11, r10)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r0 = "has_xma"
            if (r20 != 0) goto L_0x02ea
            r8 = r17
        L_0x02ea:
            X.0eP r11 = new X.0eP     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r11.<init>(r0, r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r10 = "xma_type"
            X.2FW r0 = r4.A10     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r8 = r0.A00     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            X.0eP r0 = new X.0eP     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r0.<init>(r10, r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r17 = r19
            r19 = r16
            r20 = r15
            r21 = r11
            r22 = r0
            X.0eP[] r0 = new X.0eP[]{r17, r18, r19, r20, r21, r22}     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.util.LinkedHashMap r10 = X.0Yt.A06(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r0 = "thread_id"
            r14.AAJ(r0, r7)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r8 = "message_id"
            r0 = r23
            r14.AAJ(r8, r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r8 = r4.A1u     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r0 = "sender_id"
            r14.AAJ(r0, r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            java.lang.String r0 = "extra_client_data"
            r14.A9H(r0, r10)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            r14.Cgf()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0395 }
            goto L_0x0395
        L_0x0328:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0330:
            boolean r0 = r5 instanceof X.C331007Pc
            if (r0 == 0) goto L_0x067e
            r14 = 0
            if (r37 != 0) goto L_0x0338
            r14 = 1
        L_0x0338:
            r13 = r5
            X.7Pc r13 = (X.C331007Pc) r13
            boolean r0 = r13.A0C
            if (r0 == r14) goto L_0x067e
            java.util.Set r12 = r13.A05
            java.util.Set r11 = r13.A06
            boolean r0 = r13.A0E
            r24 = r0
            boolean r15 = r13.A0A
            boolean r9 = r13.A0B
            boolean r8 = r13.A07
            java.lang.String r7 = r13.A03
            long r3 = r13.A02
            boolean r2 = r13.A0D
            int r1 = r13.A01
            int r0 = r13.A00
            boolean r13 = r13.A08
            r5 = 0
            X.0qQ.A0B(r12, r5)
            r5 = 1
            X.0qQ.A0B(r11, r5)
            r5 = 6
            X.0qQ.A0B(r7, r5)
            X.7Pc r5 = new X.7Pc
            r16 = r5
            r17 = r7
            r18 = r12
            r19 = r11
            r20 = r1
            r21 = r0
            r22 = r3
            r25 = r15
            r26 = r9
            r27 = r8
            r28 = r2
            r29 = r14
            r30 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30)
            java.util.Map r2 = r6.A0w
            long r0 = r5.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r0, r5)
            r6.A0C = r5
            r6.A0W(r5, r10)
            return r5
        L_0x0395:
            com.google.common.collect.ImmutableList r0 = r4.A0H()
            if (r0 == 0) goto L_0x06e1
            java.lang.Object r0 = X.00k.A0O(r0, r13)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x06e1
            java.lang.String r8 = r0.A0u
            if (r8 == 0) goto L_0x06e1
            int r0 = r8.length()
            if (r0 == 0) goto L_0x06e1
            X.0bY r0 = X.C3265677h.A00
            android.net.Uri r8 = X.0cp.A01(r0, r8)
        L_0x03b3:
            java.lang.String r0 = "xma_pending_share_to_friends_story_request"
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 != 0) goto L_0x03cd
            java.lang.String r0 = "xma_approved_share_to_friends_story_request"
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 != 0) goto L_0x03cd
            if (r8 == 0) goto L_0x03cf
            java.lang.String r0 = "is_add_from_share_to_friends_story"
            boolean r0 = r8.getBooleanQueryParameter(r0, r13)
            if (r0 != r9) goto L_0x03cf
        L_0x03cd:
            r25 = 0
        L_0x03cf:
            r0 = r34
            X.0wc r10 = X.AnonymousClass0kN.A01(r0, r2)
            java.lang.String r8 = "direct_thread_unseen_message_impression"
            X.0kJ r0 = r10.A00
            X.0Aj r8 = r10.A00(r0, r8)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x0499
            java.lang.String r10 = "e_counter_channel"
            r0 = r31
            r8.A9O(r10, r0)
            java.lang.String r10 = "message_type"
            r0 = r32
            r8.AAJ(r10, r0)
            java.lang.String r0 = "open_thread_id"
            r8.AAJ(r0, r7)
            java.lang.String r0 = "armadillo_thread_id"
            r8.A9F(r0, r3)
            java.lang.String r0 = "occamadillo_thread_id"
            r8.A9F(r0, r3)
            java.lang.String r10 = "is_shh_mode"
            r0 = r26
            r8.A7p(r10, r0)
            java.lang.String r10 = "is_e2ee"
            r0 = r27
            r8.A7p(r10, r0)
            java.lang.String r0 = "thread_id"
            r8.AAJ(r0, r7)
            java.lang.String r10 = "message_id"
            r0 = r25
            r8.AAJ(r10, r0)
            X.0lZ r0 = X.0la.A02
            X.0la r0 = r0.A00()
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "release_channel"
            r8.AAJ(r0, r10)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r10 = r0.A00
            java.lang.String r0 = "nav_chain"
            r8.AAJ(r0, r10)
            java.lang.String r0 = "e_counter_id"
            r8.A9F(r0, r3)
            java.lang.String r0 = "e_counter_sid"
            r8.A9F(r0, r3)
            java.lang.String r0 = "sessions_chain"
            r8.AAJ(r0, r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "production_build"
            r8.A7p(r0, r10)
            java.lang.String r10 = "is_internal_build"
            r0 = r27
            r8.A7p(r10, r0)
            java.lang.String r0 = "entry_point"
            r8.AAJ(r0, r3)
            java.lang.String r0 = "total_duration"
            r8.A9F(r0, r3)
            if (r12 != 0) goto L_0x0460
            r12 = r1
        L_0x0460:
            java.lang.String r0 = "type"
            r8.AAJ(r0, r12)
            java.lang.String r0 = "view"
            r8.AAJ(r0, r3)
            java.lang.String r1 = "is_moments_with_friends"
            r0 = r28
            r8.A7p(r1, r0)
            java.lang.String r1 = r4.A0f()
            java.lang.String r0 = "client_context"
            r8.AAJ(r0, r1)
            java.lang.String r1 = "ephemeral_lifetime_ms"
            r0 = r33
            r8.A9F(r1, r0)
            java.lang.String r1 = "after_view_lifetime_ms"
            r0 = r30
            r8.A9F(r1, r0)
            java.lang.String r1 = "ephemeral_expired_ms"
            r0 = r29
            r8.A9F(r1, r0)
            java.lang.String r1 = "transport_type"
            r0 = r24
            r8.A8M(r0, r1)
            r8.Cgf()
        L_0x0499:
            if (r7 != 0) goto L_0x04a3
            X.3t0 r0 = r4.A0U()
            if (r0 == 0) goto L_0x06de
            java.lang.String r7 = r0.A00
        L_0x04a3:
            java.lang.String r10 = r4.A1u
            com.google.common.collect.ImmutableList r1 = r4.A0H()
            if (r1 == 0) goto L_0x06db
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0690
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0690
            r11 = 0
        L_0x04b6:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
        L_0x04ba:
            com.google.common.collect.ImmutableList r1 = r4.A0H()
            if (r1 == 0) goto L_0x068d
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x06b2
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x06b2
            r12 = 0
        L_0x04cb:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
        L_0x04cf:
            r12 = 8
            X.0Tu r11 = X.0Tu.A06
            r0 = 36887781888885515(0x830d3e000a030b, double:3.3913200294820476E-306)
            java.lang.String r0 = X.182.A04(r11, r2, r0)
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x0545
            X.0wc r10 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r1 = "ai_image_interaction"
            X.0kJ r0 = r10.A00
            X.0Aj r10 = r10.A00(r0, r1)
            boolean r0 = r10.isSampled()
            if (r0 == 0) goto L_0x0545
            X.N0V r13 = new X.N0V
            r13.<init>()
            boolean r0 = X.C71082Ob1.A01(r13, r8, r14)
            if (r0 == 0) goto L_0x0545
            r8 = 999(0x3e7, float:1.4E-42)
            r0 = 365(0x16d, float:5.11E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r10.A8k(r1, r0)
            java.lang.String r1 = "view_name"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r10.A8k(r1, r0)
            java.lang.String r0 = "selected_item"
            r10.AAJ(r0, r3)
            java.lang.String r1 = "action_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r10.A8k(r1, r0)
            java.lang.String r0 = "entry_point"
            r10.A8M(r3, r0)
            java.lang.String r0 = "ai_image"
            r10.AAK(r13, r0)
            X.XSV r1 = X.XSV.A07
            java.lang.String r0 = "thread_type"
            r10.A8M(r1, r0)
            java.lang.String r1 = "is_e2ee"
            r0 = r27
            r10.A7p(r1, r0)
            java.lang.String r0 = "thread_id"
            r10.AAJ(r0, r7)
            r10.Cgf()
        L_0x0545:
            r1 = 0
            X.7AG r0 = r4.A0Q
            if (r0 == 0) goto L_0x0594
            java.lang.Integer r10 = r0.A01
            if (r10 == 0) goto L_0x0594
            r0 = r34
            X.0wc r0 = X.AnonymousClass0kN.A01(r0, r2)
            X.1Ln r8 = X.1Ln.A0J(r0)
            X.0Aj r0 = r8.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0594
            r8.A0X(r9)
            r8.A0Z(r12)
            java.lang.String r7 = "proactive_messaging"
            java.lang.String r0 = "selected_item"
            r8.A0R(r0, r7)
            java.lang.String r7 = r4.A1u
            java.lang.String r0 = "agent_id"
            r8.A0R(r0, r7)
            X.XSV r7 = X.XSV.A02
            java.lang.String r0 = "thread_type"
            r8.A0M(r7, r0)
            X.3t0 r0 = r4.A0U()
            if (r0 == 0) goto L_0x0583
            java.lang.String r1 = r0.A00
        L_0x0583:
            java.lang.String r0 = "thread_id"
            r8.A0R(r0, r1)
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "genai_proactive_message_content_type"
            r8.A0R(r0, r1)
            r8.Cgf()
        L_0x0594:
            r0 = 36323698063519122(0x810c3600012d92, double:3.03459114693709E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x062f
            java.lang.String r1 = r4.A1p
            java.lang.String r0 = "click_to_direct_ad_interaction"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x062f
            X.XSH r1 = X.XSH.UNKNOWN
            X.Gal r7 = new X.Gal
            r0 = r34
            r7.<init>(r1, r0, r2)
            com.instagram.direct.model.messaginguser.MessagingUser r0 = r6.A0o
            java.lang.Long r10 = r0.A02
            java.lang.String r11 = r4.A1u
            X.0qQ.A07(r11)
            X.17i r0 = X.17h.A00(r2)
            com.instagram.user.model.User r0 = r0.A02(r11)
            if (r0 == 0) goto L_0x068a
            com.instagram.direct.model.messaginguser.MessagingUser r0 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r0)
            java.lang.Long r9 = r0.A02
        L_0x05cb:
            X.2FW r1 = X.2FW.A0G
            X.2FW r0 = r4.A10
            if (r1 != r0) goto L_0x0682
            java.lang.String r8 = "admin_text"
        L_0x05d3:
            X.0wc r2 = r7.A01
            java.lang.String r1 = "ctd_thread_landing_message_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x062f
            long r0 = java.lang.Long.parseLong(r11)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "page_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "ad_id"
            r2.A9F(r0, r3)
            r0 = 70
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.AAJ(r0, r3)
            java.lang.String r1 = r7.A02
            java.lang.String r0 = X.C66643MaC.A00()
            r2.AAJ(r0, r1)
            java.lang.String r0 = "consumer_eimu_id"
            r2.A9F(r0, r10)
            java.lang.String r0 = "business_eimu_id"
            r2.A9F(r0, r9)
            java.lang.String r0 = "logging_source"
            r2.AAJ(r0, r8)
            X.XSH r1 = r7.A00
            r0 = 357(0x165, float:5.0E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A8M(r1, r0)
            java.lang.String r1 = "INSTAGRAM"
            r0 = 341(0x155, float:4.78E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x062f:
            r0 = r35
            com.instagram.user.model.User r0 = r0.A0K
            if (r0 == 0) goto L_0x067e
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.AaU()
            if (r0 == 0) goto L_0x067e
            com.instagram.common.session.UserSession r0 = r6.A0g
            X.7I6 r8 = X.AnonymousClass7I4.A00(r0)
            X.7TN r7 = X.AnonymousClass7TM.A00(r0)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r4.A1q
            boolean r6 = X.0qQ.A0K(r1, r0)
            java.lang.String r3 = r4.A0g()
            if (r3 == 0) goto L_0x067e
            boolean r0 = r8.A04
            if (r0 != 0) goto L_0x066b
            int r2 = X.AnonymousClass7I6.A00(r8)
            if (r6 == 0) goto L_0x067f
            java.lang.String r1 = "welcome_message_rendered"
        L_0x0661:
            X.02m r0 = r8.A06
            r0.markerPoint(r2, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r8.A01(r0)
        L_0x066b:
            r1 = 1
            r8.A04 = r1
            java.util.Set r0 = r7.A03
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x067e
            X.9Mr r0 = new X.9Mr
            r0.<init>(r7, r3, r1, r6)
            X.AnonymousClass7TN.A00(r7, r0)
        L_0x067e:
            return r5
        L_0x067f:
            java.lang.String r1 = "message_rendered"
            goto L_0x0661
        L_0x0682:
            r0 = 4219(0x107b, float:5.912E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            goto L_0x05d3
        L_0x068a:
            r9 = r3
            goto L_0x05cb
        L_0x068d:
            r14 = r3
            goto L_0x04cf
        L_0x0690:
            java.util.Iterator r8 = r1.iterator()
            r11 = 0
        L_0x0695:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04b6
            java.lang.Object r0 = r8.next()
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r1 = r0.A0u
            if (r1 == 0) goto L_0x0695
            java.lang.String r0 = "instagram://media_viewer?is_video=0"
            boolean r0 = X.00l.A0d(r1, r0, r9)
            if (r0 == 0) goto L_0x0695
            int r11 = r11 + 1
            if (r11 >= 0) goto L_0x0695
            goto L_0x06d3
        L_0x06b2:
            java.util.Iterator r11 = r1.iterator()
            r12 = 0
        L_0x06b7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r0 = r11.next()
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r1 = r0.A0u
            if (r1 == 0) goto L_0x06b7
            java.lang.String r0 = "instagram://media_viewer?is_video=1"
            boolean r0 = X.00l.A0d(r1, r0, r9)
            if (r0 == 0) goto L_0x06b7
            int r12 = r12 + 1
            if (r12 >= 0) goto L_0x06b7
        L_0x06d3:
            X.0sr.A1S()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x06db:
            r8 = r3
            goto L_0x04ba
        L_0x06de:
            r7 = r3
            goto L_0x04a3
        L_0x06e1:
            r8 = 0
            goto L_0x03b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.A0S(int):X.7So");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0126: MOVE  (r6v1 java.lang.Integer) = (r20v0 java.lang.Integer)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ed  */
    public final void A0X(X.C328317Ei r19, java.lang.Integer r20, java.util.List r21, java.util.List r22, java.util.List r23, java.util.List r24) {
        /*
            r18 = this;
            r4 = r18
            r9 = r24
            r8 = r23
            r5 = r21
            X.7UL r6 = r4.A0k
            r6.A02()
            X.7ZR r11 = r4.A19
            com.instagram.common.session.UserSession r3 = r4.A0g
            X.0Tu r2 = X.0Tu.A06
            r0 = 36316800346165901(0x8105f00003128d, double:3.030229002708035E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0031
            java.util.List r5 = r11.A00(r5)
            java.util.List r9 = r11.A00(r9)
            if (r23 != 0) goto L_0x020a
            java.util.Set r0 = r11.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0202
            r8 = 0
        L_0x0031:
            X.7ZT r2 = r4.A1A
            X.0Tu r7 = X.0Tu.A05
            r0 = 36316448161993094(0x81059e00331186, double:3.03000628001902E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x0053
            java.util.List r5 = r2.A00(r5)
            java.util.List r9 = r2.A00(r9)
            if (r8 != 0) goto L_0x01d9
            java.util.Set r0 = r2.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01d1
            r8 = 0
        L_0x0053:
            X.7ZP r0 = r4.A17
            java.util.List r5 = r0.A00(r5)
            java.util.List r2 = r0.A00(r9)
            r1 = 1
            r10 = r19
            r12 = r8
            r13 = r2
            r14 = r1
            r11 = r5
            r9 = r4
            r9.A0L(r10, r11, r12, r13, r14)
            X.7Oi r10 = r4.A0I
            if (r10 == 0) goto L_0x0098
            int r0 = A00(r4)
            X.7LQ r9 = A08(r4, r0)
            com.instagram.direct.model.messaginguser.MessagingUser r12 = r10.A03
            java.lang.String r0 = r12.A03
            boolean r9 = X.AnonymousClass7F2.A01(r9, r0)
            boolean r0 = r10.A06
            if (r9 == r0) goto L_0x0098
            java.lang.String r14 = r10.A05
            int r15 = r10.A00
            com.instagram.common.typedurl.ImageUrl r11 = r10.A02
            int r0 = r10.A01
            java.lang.Integer r13 = r10.A04
            X.7Oi r10 = new X.7Oi
            r17 = r9
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r4.A0I = r10
            A0K(r4, r10)
        L_0x0098:
            boolean r0 = r4.A0U
            if (r0 == 0) goto L_0x01cc
            A0H(r4)
        L_0x009f:
            r13 = 1
            r10 = 0
            r11 = r22
            if (r22 == 0) goto L_0x01c9
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x01c9
            int r0 = r11.size()
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x01c9
        L_0x00b3:
            int r12 = r0 + -1
            java.lang.Object r0 = r11.get(r0)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r9 = r0.A0e
            X.0qQ.A07(r9)
            java.lang.String r0 = r9.A0g()
            boolean r0 = r6.A06(r0)
            if (r0 != 0) goto L_0x00da
            boolean r0 = r9.A1S()
            if (r0 == 0) goto L_0x01c4
            java.lang.String r0 = r9.A0f()
            boolean r0 = r6.A06(r0)
            if (r0 == 0) goto L_0x01c4
        L_0x00da:
            r6.A03(r1)
        L_0x00dd:
            if (r5 != 0) goto L_0x00e3
            if (r8 != 0) goto L_0x00e3
            if (r2 == 0) goto L_0x011e
        L_0x00e3:
            X.7F9 r0 = new X.7F9
            r0.<init>(r4)
            X.11Z.A02(r0)
            if (r5 == 0) goto L_0x011e
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01bd
            if (r2 == 0) goto L_0x00fb
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x011e
        L_0x00fb:
            X.9HS r0 = r6.A07
            X.9HU r0 = r0.A08
            r0.A01(r10)
            X.9H3 r9 = r6.A08
            X.18g r8 = r9.A08
            X.1Jv r6 = r8.A05
            if (r6 == 0) goto L_0x0110
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r6.A07 = r0
        L_0x0110:
            java.lang.String r6 = "DIRECT_THREAD_MESSAGES_RENDER_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = X.AnonymousClass9H3.A00(r9)
            r8.A0M(r0, r9, r6)
            X.18q r0 = X.18q.A03
            r9.A01(r0)
        L_0x011e:
            X.7SD r0 = r4.A0H
            boolean r0 = r0.A13
            if (r0 == 0) goto L_0x019e
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r6 = r20
            if (r6 == r0) goto L_0x012e
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r6 != r0) goto L_0x019e
        L_0x012e:
            X.7Oi r0 = r4.A0I
            if (r0 != 0) goto L_0x019e
            if (r2 == 0) goto L_0x019e
            java.lang.Object r0 = X.00k.A0J(r2)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            if (r0 == 0) goto L_0x019e
            X.3su r6 = r0.A0e
            if (r6 == 0) goto L_0x019e
            com.instagram.user.model.User r0 = r4.A0q
            boolean r0 = r6.A1j(r0)
            if (r0 != r1) goto L_0x019e
            java.lang.Object r0 = X.00k.A0J(r2)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            if (r0 == 0) goto L_0x015e
            X.3su r0 = r0.A0e
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = r0.A1j
            if (r0 == 0) goto L_0x015e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x019e
        L_0x015e:
            r0 = 36329440434929792(0x81116f00034080, double:3.0382226457398717E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x019e
            r0 = 36329440434864255(0x81116f0002407f, double:3.038222645698426E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x019e
            X.7SD r0 = r4.A0H
            java.util.List r0 = r0.A0b
            java.lang.Object r3 = X.00k.A0J(r0)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 == 0) goto L_0x019e
            r1 = -100
            X.9IM r0 = new X.9IM
            r0.<init>((com.instagram.user.model.User) r3, (int) r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r4.Ctg(r0)
            X.0eM r0 = r4.A10
            java.lang.Object r3 = r0.getValue()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r0 = 3000(0xbb8, double:1.482E-320)
            X.11Z.A04(r3, r0)
        L_0x019e:
            X.7ZC r0 = r4.A13
            r4.A0M(r0, r5, r2)
            X.7ZF r0 = r4.A18
            r4.A0M(r0, r5, r2)
            X.7ZH r0 = r4.A1B
            r4.A0M(r0, r5, r2)
            X.7ZJ r0 = r4.A15
            r4.A0M(r0, r5, r2)
            X.7ZL r0 = r4.A14
            r4.A0M(r0, r5, r2)
            X.7ZN r0 = r4.A1C
            r4.A0M(r0, r5, r2)
            return
        L_0x01bd:
            if (r13 != 0) goto L_0x011e
            r6.A03(r10)
            goto L_0x011e
        L_0x01c4:
            if (r12 < 0) goto L_0x01c9
            r0 = r12
            goto L_0x00b3
        L_0x01c9:
            r13 = 0
            goto L_0x00dd
        L_0x01cc:
            A0G(r4)
            goto L_0x009f
        L_0x01d1:
            X.0sl r11 = X.0sl.A00
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            goto L_0x01e2
        L_0x01d9:
            java.util.Set r11 = X.00k.A0k(r8)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
        L_0x01e2:
            java.util.Set r0 = r2.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x01e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01fc
            java.lang.Object r1 = r2.next()
            boolean r0 = r11.contains(r1)
            if (r0 != 0) goto L_0x01e8
            r10.add(r1)
            goto L_0x01e8
        L_0x01fc:
            java.util.List r8 = X.00k.A0a(r10)
            goto L_0x0053
        L_0x0202:
            X.0sl r10 = X.0sl.A00
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x0213
        L_0x020a:
            java.util.Set r10 = X.00k.A0k(r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
        L_0x0213:
            java.util.Set r0 = r11.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0219:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r1 = r2.next()
            boolean r0 = r10.contains(r1)
            if (r0 != 0) goto L_0x0219
            r7.add(r1)
            goto L_0x0219
        L_0x022d:
            java.util.List r8 = X.00k.A0a(r7)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.A0X(X.7Ei, java.lang.Integer, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }

    public final void A0Y(List list) {
        String str;
        C274634on r4 = this.A0b;
        if (r4 != null && list != null) {
            UserSession userSession = r4.A0A;
            0Tu r6 = 0Tu.A05;
            if (182.A06(r6, userSession, 36317835433088606L)) {
                097 r3 = new 097(list);
                ArrayList arrayList = new ArrayList(0Yv.A1E(r3, 10));
                Iterator it = r3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C331837So) it.next()).getType()));
                }
                C232312tT r42 = r4.A01;
                str = "viewHolderPreloader";
                if (r42 != null) {
                    if (r42 instanceof C71949Ota) {
                        ((C71949Ota) r42).A01(arrayList);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("IgRecyclerViewMessageThreadViewHolderPreloader but was ");
                        sb.append(r42);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C274634on r32 = this.A0b;
            0qQ.A0A(r32);
            if (!182.A06(r6, r32.A0A, 36317835433088606L)) {
                097 r1 = new 097(list);
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(r1, 10));
                Iterator it2 = r1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C331837So) it2.next()).getType()));
                }
                C232312tT r0 = r32.A01;
                str = "viewHolderPreloader";
                if (r0 != null) {
                    if (r0 instanceof AnonymousClass7LO) {
                        ((AnonymousClass7LO) r0).A02(arrayList2);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C273654mx.A00(1292));
                    sb2.append(r0);
                    throw new IllegalStateException(sb2.toString());
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void AGk(String str, int i) {
        AnonymousClass7LQ A012 = this.A0n.A01(str);
        if (A012 != null) {
            A012.A05 = i;
            A0V(A012);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void AHm(AnonymousClass7LQ r3) {
        if (r3 != null) {
            r3.A0C = C327627Bo.NUX_TYPE_NONE;
            int A042 = A04(this, r3);
            if (A042 != -1) {
                A0W(r3, A042);
            }
        }
    }

    public final String AaJ(MessageIdentifier messageIdentifier) {
        C254703su r0;
        AnonymousClass7AG r02;
        String str;
        AnonymousClass7LQ A012 = this.A0n.A01(messageIdentifier.A01);
        if (A012 == null || (r0 = A012.A0e) == null || (r02 = r0.A0Q) == null || (str = r02.A04) == null) {
            return null;
        }
        return ArO(new MessageIdentifier(str, (String) null));
    }

    public final int AiV() {
        return this.A1D.size();
    }

    public final HashSet AiW() {
        return this.A1D;
    }

    public final boolean AiX() {
        return this.A0T;
    }

    public final String ArO(MessageIdentifier messageIdentifier) {
        C254703su r2;
        AnonymousClass7LQ A012 = this.A0n.A01(messageIdentifier.A01);
        if (A012 == null || (r2 = A012.A0e) == null) {
            return null;
        }
        1at A002 = C327657Br.A00();
        2FW r0 = r2.A10;
        0qQ.A07(r0);
        return A002.A01(r0).C1n(this.A0g, r2);
    }

    public final C232232tF BJO(int i) {
        C274634on r1 = this.A0b;
        if (r1 == null) {
            return null;
        }
        AnonymousClass2t9 AZJ = r1.AZJ();
        if (!(AZJ instanceof AnonymousClass2t9)) {
            return null;
        }
        AnonymousClass2t9 r2 = AZJ;
        return r2.A03.A01(r2.getItemViewType(i));
    }

    public final Map BOG(MessageIdentifier messageIdentifier) {
        int A062;
        AnonymousClass7LQ r2;
        User A022;
        String str = messageIdentifier.A01;
        boolean z = false;
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        if (!182.A06(0Tu.A05, this.A0g, 36323736718749115L) || (A062 = A06(str)) == -1) {
            return null;
        }
        Object A052 = A0R().A05(A062);
        if (!(A052 instanceof AnonymousClass7LQ) || (r2 = (AnonymousClass7LQ) A052) == null) {
            return null;
        }
        C254703su r1 = r2.A0e;
        0qQ.A07(r1);
        AnonymousClass7AG r4 = r1.A0Q;
        if (r4 == null || (A022 = this.A0r.A02(r1.A1u)) == null || A022.A03.AaX() != IGAIAgentType.A04) {
            return null;
        }
        return ImmutableMap.of(C273654mx.A00(241), r4.A05, "bot_id", A022.getId(), C66579MXk.A00(963), C66579MXk.A00(573));
    }

    public final String BOv() {
        return this.A0L;
    }

    public final C70621ODs BS7(String str) {
        C254703su r0;
        AnonymousClass7LQ A012 = this.A0n.A01(str);
        if (A012 == null || (r0 = A012.A0e) == null) {
            return null;
        }
        return r0.A0M();
    }

    public final ArrayList BSC(String str) {
        ArrayList arrayList = new ArrayList();
        int A062 = A06(str);
        if (A062 != -1) {
            int i = A0R().A01;
            for (int i2 = A062; i2 < i; i2++) {
                Object A052 = A0R().A05(i2);
                0qQ.A07(A052);
                C331837So r1 = (C331837So) A052;
                if (r1 instanceof AnonymousClass7LQ) {
                    AnonymousClass7LQ r12 = (AnonymousClass7LQ) r1;
                    arrayList.add(r12);
                    if (!r12.A0U) {
                        break;
                    }
                }
            }
            while (true) {
                A062--;
                if (-1 >= A062) {
                    break;
                }
                Object A053 = A0R().A05(A062);
                0qQ.A07(A053);
                C331837So r13 = (C331837So) A053;
                if (r13 instanceof AnonymousClass7LQ) {
                    AnonymousClass7LQ r14 = (AnonymousClass7LQ) r13;
                    if (!r14.A0U) {
                        break;
                    }
                    arrayList.add(r14);
                }
            }
        }
        return arrayList;
    }

    public final AnonymousClass7LQ BSO(String str) {
        return this.A0n.A01(str);
    }

    public final AnonymousClass3SZ BrH() {
        return this.A0d;
    }

    public final int CMC(String str) {
        AnonymousClass7LQ A012 = this.A0n.A01(str);
        if (A012 == null) {
            return -1;
        }
        return A04(this, A012);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.7LL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: X.7LL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: X.7LL} */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r1v359, types: [java.lang.Object, X.7LR] */
    /* JADX WARNING: type inference failed for: r20v3, types: [X.OzR] */
    /* JADX WARNING: type inference failed for: r22v4, types: [X.Ota] */
    /* JADX WARNING: type inference failed for: r22v5, types: [X.7LO] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CNE(android.content.Context r70, X.C274644oo r71, X.AnonymousClass7L2 r72) {
        /*
            r69 = this;
            r13 = r69
            r7 = r70
            r13.A00 = r7
            X.4on r0 = r13.A0b
            if (r0 != 0) goto L_0x0afb
            r1 = r71
            boolean r0 = r1 instanceof X.C274634on
            if (r0 == 0) goto L_0x0af3
            r12 = r1
            X.4on r12 = (X.C274634on) r12
            r13.A0b = r12
            r8 = r72
            r13.A0F = r8
            X.7LL r19 = new X.7LL
            r19.<init>()
            X.0eK r0 = r13.A0x
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0ae2
            com.instagram.common.session.UserSession r6 = r13.A0g
            X.At9 r5 = new X.At9
            r5.<init>(r1)
            X.AtA r4 = new X.AtA
            r4.<init>(r8)
            X.AtB r3 = new X.AtB
            r3.<init>(r13)
            X.0eM r0 = r13.A0z
            java.lang.Object r2 = r0.getValue()
            X.ODp r2 = (X.C70618ODp) r2
            X.O7a r1 = new X.O7a
            r1.<init>(r8)
            X.A46 r0 = new X.A46
            r0.<init>(r13)
            X.OzR r20 = new X.OzR
            r21 = r7
            r22 = r6
            r23 = r0
            r24 = r2
            r25 = r1
            r26 = r5
            r27 = r4
            r28 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0064:
            r0 = r20
            X.0mm r0 = (X.C61370mm) r0
            r20 = r0
            com.instagram.common.session.UserSession r0 = r13.A0g
            r68 = r0
            r22 = 0
            X.0Tu r21 = X.0Tu.A05
            r0 = 36325854137038114(0x810e2c00003522, double:3.035954656512312E-306)
            r3 = r21
            r2 = r68
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0ad5
            X.9oT r18 = new X.9oT
            r3 = r18
            r1 = r20
            r0 = r19
            r3.<init>(r2, r1, r0)
        L_0x008c:
            r12.A02 = r13
            X.7LE r0 = r12.A0B
            r67 = r0
            r0.A00 = r13
            X.7P7 r0 = r0.A01
            if (r0 != 0) goto L_0x00a2
            r0 = r67
            com.instagram.common.session.UserSession r0 = r0.A07
            boolean r0 = X.C331817Sm.A00(r0)
            if (r0 != 0) goto L_0x00aa
        L_0x00a2:
            X.7P7 r1 = X.AnonymousClass7LE.A01(r67)
            r0 = r67
            r0.A01 = r1
        L_0x00aa:
            com.instagram.common.session.UserSession r0 = r12.A0A
            r66 = r0
            r16 = 36317835433088606(0x8106e10000165e, double:3.030883595845914E-306)
            r3 = r21
            r2 = r0
            r0 = r16
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x01c4
            boolean r0 = X.C331817Sm.A00(r66)
            if (r0 == 0) goto L_0x01c4
            android.content.Context r4 = r12.A07
            X.9HS r2 = r12.A0E
            r0 = 31
            X.9Km r1 = new X.9Km
            r1.<init>(r12, r0)
            X.7L2 r0 = r12.A05
            java.lang.String r0 = r0.A09
            X.7LO r3 = new X.7LO
            r5 = r66
            r6 = r2
            r7 = r0
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r12.A01 = r3
        L_0x00df:
            X.7Z5 r4 = r13.A16
            r2 = 1
            r0 = r18
            r13.A02 = r0
            r13.A0B = r4
            r0 = r19
            r13.A05 = r0
            r0 = r20
            r13.A01 = r0
            com.instagram.user.model.User r5 = r13.A0q
            java.lang.String r3 = r5.getId()
            X.7SD r0 = r13.A0H
            boolean r0 = r0.A18
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.1Ue r0 = new X.1Ue
            r0.<init>(r1)
            X.48T r6 = new X.48T
            r6.<init>(r3, r0)
            X.7LP r3 = new X.7LP
            r1 = r68
            r0 = r18
            r3.<init>(r1, r0, r6)
            r13.A0K = r3
            X.7Mt r0 = r13.A0i
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0120
        L_0x011d:
            A0K(r13, r4)
        L_0x0120:
            X.7SD r1 = r13.A0H
            r0 = r68
            boolean r0 = X.C308556Us.A07(r0, r1)
            java.lang.String r9 = "context"
            if (r0 == 0) goto L_0x0160
            android.content.Context r3 = r13.A00
            if (r3 == 0) goto L_0x0191
            X.7QY r1 = X.AnonymousClass7QX.A00(r68)
            X.7Qa r8 = new X.7Qa
            r0 = r68
            r8.<init>(r3, r0, r1, r5)
            r13.A04 = r8
            X.0mo r0 = r13.A0R()
            r0.A06()
            X.7SD r7 = r13.A0H
            boolean r6 = r7.A0r
            boolean r4 = r7.A0y
            boolean r3 = r7.A0o
            java.util.List r1 = r7.A0b
            boolean r0 = r7.A1G
            boolean r1 = X.C308556Us.A0W(r1, r6, r4, r3, r0)
            r0 = r18
            r8.A0C(r0, r7, r1)
            X.0mo r0 = r13.A0R()
            r0.A07()
        L_0x0160:
            X.43Q r0 = X.AnonymousClass43P.A00(r68)
            com.instagram.common.session.UserSession r1 = r0.A00
            r3 = 2342165418788726936(0x20810b0a001b2898, double:4.067628995466838E-152)
            r0 = r21
            boolean r0 = X.182.A06(r0, r1, r3)
            if (r0 == 0) goto L_0x019c
            android.content.Context r3 = r13.A00
            if (r3 == 0) goto L_0x0191
            X.7LR r1 = new X.7LR
            r1.<init>()
            X.7LS r4 = new X.7LS
            r0 = r68
            r4.<init>(r3, r0, r1, r5)
            r13.A03 = r4
            X.7SD r3 = r13.A0H
            X.0mo r1 = r13.A0R()
            X.7L2 r0 = r13.A0F
            if (r0 != 0) goto L_0x0199
            java.lang.String r9 = "threadTheme"
        L_0x0191:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0199:
            r4.A00(r1, r0, r3, r2)
        L_0x019c:
            X.7SD r0 = r13.A0H
            int r0 = r0.A08
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 != 0) goto L_0x0afb
            r2 = 36324526992273542(0x810cf700023086, double:3.0351153648192137E-306)
            r1 = r21
            r0 = r68
            boolean r0 = X.182.A06(r1, r0, r2)
            if (r0 == 0) goto L_0x0afb
            android.content.Context r1 = r13.A00
            if (r1 == 0) goto L_0x0191
            X.7LT r0 = new X.7LT
            r0.<init>(r1)
            r13.A0J = r0
            A0F(r13)
            return
        L_0x01c4:
            X.7P7 r0 = X.AnonymousClass7LE.A02(r67)
            r1 = 160(0xa0, float:2.24E-43)
            X.2tF[] r1 = new X.C232232tF[r1]
            r65 = r1
            X.0eM r1 = r0.A2S
            java.lang.Object r36 = r1.getValue()
            r1 = r36
            X.2tF r1 = (X.C232232tF) r1
            r36 = r1
            X.0eM r1 = r0.A2U
            java.lang.Object r35 = r1.getValue()
            r1 = r35
            X.2tF r1 = (X.C232232tF) r1
            r35 = r1
            X.0eM r1 = r0.A1E
            java.lang.Object r34 = r1.getValue()
            r1 = r34
            X.2tF r1 = (X.C232232tF) r1
            r34 = r1
            X.0eM r1 = r0.A02
            java.lang.Object r33 = r1.getValue()
            r1 = r33
            X.2tF r1 = (X.C232232tF) r1
            r33 = r1
            X.0eM r1 = r0.A1S
            java.lang.Object r32 = r1.getValue()
            r1 = r32
            X.2tF r1 = (X.C232232tF) r1
            r32 = r1
            X.0eM r1 = r0.A24
            java.lang.Object r31 = r1.getValue()
            r1 = r31
            X.2tF r1 = (X.C232232tF) r1
            r31 = r1
            X.0eM r1 = r0.A0X
            java.lang.Object r30 = r1.getValue()
            r1 = r30
            X.2tF r1 = (X.C232232tF) r1
            r30 = r1
            X.0eM r1 = r0.A0B
            java.lang.Object r29 = r1.getValue()
            r1 = r29
            X.2tF r1 = (X.C232232tF) r1
            r29 = r1
            X.0eM r1 = r0.A2V
            java.lang.Object r28 = r1.getValue()
            r1 = r28
            X.2tF r1 = (X.C232232tF) r1
            r28 = r1
            X.0eM r1 = r0.A1W
            java.lang.Object r27 = r1.getValue()
            r1 = r27
            X.2tF r1 = (X.C232232tF) r1
            r27 = r1
            X.0eM r1 = r0.A1X
            java.lang.Object r26 = r1.getValue()
            r1 = r26
            X.2tF r1 = (X.C232232tF) r1
            r26 = r1
            X.0eM r1 = r0.A0Y
            java.lang.Object r25 = r1.getValue()
            r1 = r25
            X.2tF r1 = (X.C232232tF) r1
            r25 = r1
            X.0eM r1 = r0.A0f
            java.lang.Object r24 = r1.getValue()
            r1 = r24
            X.2tF r1 = (X.C232232tF) r1
            r24 = r1
            X.0eM r1 = r0.A0b
            java.lang.Object r23 = r1.getValue()
            r1 = r23
            X.2tF r1 = (X.C232232tF) r1
            r23 = r1
            X.0eM r1 = r0.A0Z
            java.lang.Object r15 = r1.getValue()
            X.2tF r15 = (X.C232232tF) r15
            X.0eM r1 = r0.A0e
            java.lang.Object r14 = r1.getValue()
            X.2tF r14 = (X.C232232tF) r14
            X.0eM r1 = r0.A0d
            java.lang.Object r11 = r1.getValue()
            X.2tF r11 = (X.C232232tF) r11
            X.0eM r1 = r0.A0g
            java.lang.Object r10 = r1.getValue()
            X.2tF r10 = (X.C232232tF) r10
            X.0eM r1 = r0.A0c
            java.lang.Object r9 = r1.getValue()
            X.2tF r9 = (X.C232232tF) r9
            X.0eM r1 = r0.A0a
            java.lang.Object r8 = r1.getValue()
            X.2tF r8 = (X.C232232tF) r8
            X.0eM r1 = r0.A13
            java.lang.Object r7 = r1.getValue()
            X.2tF r7 = (X.C232232tF) r7
            X.0eM r1 = r0.A1h
            java.lang.Object r6 = r1.getValue()
            X.2tF r6 = (X.C232232tF) r6
            X.0eM r1 = r0.A2n
            java.lang.Object r5 = r1.getValue()
            X.2tF r5 = (X.C232232tF) r5
            X.0eM r1 = r0.A19
            java.lang.Object r4 = r1.getValue()
            X.2tF r4 = (X.C232232tF) r4
            X.0eM r1 = r0.A0v
            java.lang.Object r3 = r1.getValue()
            X.2tF r3 = (X.C232232tF) r3
            X.0eM r1 = r0.A2O
            java.lang.Object r2 = r1.getValue()
            X.2tF r2 = (X.C232232tF) r2
            X.0eM r1 = r0.A1G
            java.lang.Object r1 = r1.getValue()
            X.2tF r1 = (X.C232232tF) r1
            r38 = r34
            r39 = r33
            r40 = r32
            r41 = r31
            r42 = r30
            r43 = r29
            r44 = r28
            r45 = r27
            r46 = r26
            r47 = r25
            r48 = r24
            r49 = r23
            r50 = r15
            r51 = r14
            r52 = r11
            r53 = r10
            r54 = r9
            r55 = r8
            r56 = r7
            r57 = r6
            r58 = r5
            r59 = r4
            r60 = r3
            r61 = r2
            r62 = r1
            r37 = r35
            X.2tF[] r5 = new X.C232232tF[]{r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62}
            r37 = 27
            r4 = r22
            r3 = r65
            r1 = r37
            java.lang.System.arraycopy(r5, r4, r3, r4, r1)
            X.0eM r1 = r0.A1O
            java.lang.Object r36 = r1.getValue()
            r1 = r36
            X.2tF r1 = (X.C232232tF) r1
            r36 = r1
            X.0eM r1 = r0.A0C
            java.lang.Object r35 = r1.getValue()
            r1 = r35
            X.2tF r1 = (X.C232232tF) r1
            r35 = r1
            X.0eM r1 = r0.A22
            java.lang.Object r34 = r1.getValue()
            r1 = r34
            X.2tF r1 = (X.C232232tF) r1
            r34 = r1
            X.0eM r1 = r0.A1c
            java.lang.Object r33 = r1.getValue()
            r1 = r33
            X.2tF r1 = (X.C232232tF) r1
            r33 = r1
            X.0eM r1 = r0.A1n
            java.lang.Object r32 = r1.getValue()
            r1 = r32
            X.2tF r1 = (X.C232232tF) r1
            r32 = r1
            X.0eM r1 = r0.A0l
            java.lang.Object r31 = r1.getValue()
            r1 = r31
            X.2tF r1 = (X.C232232tF) r1
            r31 = r1
            X.0eM r1 = r0.A2w
            java.lang.Object r30 = r1.getValue()
            r1 = r30
            X.2tF r1 = (X.C232232tF) r1
            r30 = r1
            X.0eM r1 = r0.A1z
            java.lang.Object r29 = r1.getValue()
            r1 = r29
            X.2tF r1 = (X.C232232tF) r1
            r29 = r1
            X.0eM r1 = r0.A1x
            java.lang.Object r28 = r1.getValue()
            r1 = r28
            X.2tF r1 = (X.C232232tF) r1
            r28 = r1
            X.0eM r1 = r0.A1w
            java.lang.Object r27 = r1.getValue()
            r1 = r27
            X.2tF r1 = (X.C232232tF) r1
            r27 = r1
            X.0eM r1 = r0.A1y
            java.lang.Object r26 = r1.getValue()
            r1 = r26
            X.2tF r1 = (X.C232232tF) r1
            r26 = r1
            X.0eM r1 = r0.A0W
            java.lang.Object r25 = r1.getValue()
            r1 = r25
            X.2tF r1 = (X.C232232tF) r1
            r25 = r1
            X.0eM r1 = r0.A1j
            java.lang.Object r24 = r1.getValue()
            r1 = r24
            X.2tF r1 = (X.C232232tF) r1
            r24 = r1
            X.0eM r1 = r0.A21
            java.lang.Object r23 = r1.getValue()
            r1 = r23
            X.2tF r1 = (X.C232232tF) r1
            r23 = r1
            X.0eM r1 = r0.A0L
            java.lang.Object r15 = r1.getValue()
            X.2tF r15 = (X.C232232tF) r15
            X.0eM r1 = r0.A1Z
            java.lang.Object r14 = r1.getValue()
            X.2tF r14 = (X.C232232tF) r14
            X.0eM r1 = r0.A1m
            java.lang.Object r11 = r1.getValue()
            X.2tF r11 = (X.C232232tF) r11
            X.0eM r1 = r0.A1g
            java.lang.Object r10 = r1.getValue()
            X.2tF r10 = (X.C232232tF) r10
            X.0eM r1 = r0.A1u
            java.lang.Object r9 = r1.getValue()
            X.2tF r9 = (X.C232232tF) r9
            X.0eM r1 = r0.A1s
            java.lang.Object r8 = r1.getValue()
            X.2tF r8 = (X.C232232tF) r8
            X.0eM r1 = r0.A1t
            java.lang.Object r7 = r1.getValue()
            X.2tF r7 = (X.C232232tF) r7
            X.0eM r1 = r0.A1P
            java.lang.Object r6 = r1.getValue()
            X.2tF r6 = (X.C232232tF) r6
            X.0eM r1 = r0.A0R
            java.lang.Object r5 = r1.getValue()
            X.2tF r5 = (X.C232232tF) r5
            X.0eM r1 = r0.A2I
            java.lang.Object r4 = r1.getValue()
            X.2tF r4 = (X.C232232tF) r4
            X.0eM r1 = r0.A2C
            java.lang.Object r3 = r1.getValue()
            X.2tF r3 = (X.C232232tF) r3
            X.0eM r1 = r0.A29
            java.lang.Object r2 = r1.getValue()
            X.2tF r2 = (X.C232232tF) r2
            X.0eM r1 = r0.A25
            java.lang.Object r1 = r1.getValue()
            X.2tF r1 = (X.C232232tF) r1
            r40 = r34
            r41 = r33
            r42 = r32
            r43 = r31
            r44 = r30
            r45 = r29
            r46 = r28
            r47 = r27
            r48 = r26
            r49 = r25
            r50 = r24
            r51 = r23
            r52 = r15
            r53 = r14
            r54 = r11
            r55 = r10
            r56 = r9
            r57 = r8
            r58 = r7
            r59 = r6
            r60 = r5
            r61 = r4
            r62 = r3
            r63 = r2
            r64 = r1
            r38 = r36
            r39 = r35
            X.2tF[] r5 = new X.C232232tF[]{r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64}
            r4 = r22
            r3 = r65
            r2 = r37
            java.lang.System.arraycopy(r5, r4, r3, r2, r2)
            X.0eM r1 = r0.A2E
            java.lang.Object r36 = r1.getValue()
            r1 = r36
            X.2tF r1 = (X.C232232tF) r1
            r36 = r1
            X.0eM r1 = r0.A2R
            java.lang.Object r35 = r1.getValue()
            r1 = r35
            X.2tF r1 = (X.C232232tF) r1
            r35 = r1
            X.0eM r1 = r0.A2A
            java.lang.Object r34 = r1.getValue()
            r1 = r34
            X.2tF r1 = (X.C232232tF) r1
            r34 = r1
            X.0eM r1 = r0.A17
            java.lang.Object r33 = r1.getValue()
            r1 = r33
            X.2tF r1 = (X.C232232tF) r1
            r33 = r1
            X.0eM r1 = r0.A0p
            java.lang.Object r32 = r1.getValue()
            r1 = r32
            X.2tF r1 = (X.C232232tF) r1
            r32 = r1
            X.0eM r1 = r0.A0o
            java.lang.Object r31 = r1.getValue()
            r1 = r31
            X.2tF r1 = (X.C232232tF) r1
            r31 = r1
            X.0eM r1 = r0.A0m
            java.lang.Object r30 = r1.getValue()
            r1 = r30
            X.2tF r1 = (X.C232232tF) r1
            r30 = r1
            X.0eM r1 = r0.A0s
            java.lang.Object r29 = r1.getValue()
            r1 = r29
            X.2tF r1 = (X.C232232tF) r1
            r29 = r1
            X.0eM r1 = r0.A0r
            java.lang.Object r28 = r1.getValue()
            r1 = r28
            X.2tF r1 = (X.C232232tF) r1
            r28 = r1
            X.0eM r1 = r0.A0t
            java.lang.Object r27 = r1.getValue()
            r1 = r27
            X.2tF r1 = (X.C232232tF) r1
            r27 = r1
            X.0eM r1 = r0.A28
            java.lang.Object r26 = r1.getValue()
            r1 = r26
            X.2tF r1 = (X.C232232tF) r1
            r26 = r1
            X.0eM r1 = r0.A2G
            java.lang.Object r25 = r1.getValue()
            r1 = r25
            X.2tF r1 = (X.C232232tF) r1
            r25 = r1
            X.0eM r1 = r0.A27
            java.lang.Object r24 = r1.getValue()
            r1 = r24
            X.2tF r1 = (X.C232232tF) r1
            r24 = r1
            X.0eM r1 = r0.A26
            java.lang.Object r23 = r1.getValue()
            r1 = r23
            X.2tF r1 = (X.C232232tF) r1
            r23 = r1
            X.0eM r1 = r0.A2L
            java.lang.Object r15 = r1.getValue()
            X.2tF r15 = (X.C232232tF) r15
            X.0eM r1 = r0.A2J
            java.lang.Object r14 = r1.getValue()
            X.2tF r14 = (X.C232232tF) r14
            X.0eM r1 = r0.A2P
            java.lang.Object r11 = r1.getValue()
            X.2tF r11 = (X.C232232tF) r11
            X.0eM r1 = r0.A2Q
            java.lang.Object r10 = r1.getValue()
            X.2tF r10 = (X.C232232tF) r10
            X.0eM r1 = r0.A2K
            java.lang.Object r9 = r1.getValue()
            X.2tF r9 = (X.C232232tF) r9
            X.0eM r1 = r0.A1o
            java.lang.Object r8 = r1.getValue()
            X.2tF r8 = (X.C232232tF) r8
            X.0eM r1 = r0.A1r
            java.lang.Object r7 = r1.getValue()
            X.2tF r7 = (X.C232232tF) r7
            X.0eM r1 = r0.A1q
            java.lang.Object r6 = r1.getValue()
            X.2tF r6 = (X.C232232tF) r6
            X.0eM r1 = r0.A23
            java.lang.Object r5 = r1.getValue()
            X.2tF r5 = (X.C232232tF) r5
            X.0eM r1 = r0.A0H
            java.lang.Object r4 = r1.getValue()
            X.2tF r4 = (X.C232232tF) r4
            X.0eM r1 = r0.A0F
            java.lang.Object r3 = r1.getValue()
            X.2tF r3 = (X.C232232tF) r3
            X.0eM r1 = r0.A0K
            java.lang.Object r2 = r1.getValue()
            X.2tF r2 = (X.C232232tF) r2
            X.0eM r1 = r0.A0I
            java.lang.Object r1 = r1.getValue()
            X.2tF r1 = (X.C232232tF) r1
            r40 = r34
            r41 = r33
            r42 = r32
            r43 = r31
            r44 = r30
            r45 = r29
            r46 = r28
            r47 = r27
            r48 = r26
            r49 = r25
            r50 = r24
            r51 = r23
            r52 = r15
            r53 = r14
            r54 = r11
            r55 = r10
            r56 = r9
            r57 = r8
            r58 = r7
            r59 = r6
            r60 = r5
            r61 = r4
            r62 = r3
            r63 = r2
            r64 = r1
            r38 = r36
            r39 = r35
            X.2tF[] r5 = new X.C232232tF[]{r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64}
            r4 = 54
            r3 = r22
            r2 = r65
            r1 = r37
            java.lang.System.arraycopy(r5, r3, r2, r4, r1)
            X.0eM r1 = r0.A0J
            java.lang.Object r36 = r1.getValue()
            r1 = r36
            X.2tF r1 = (X.C232232tF) r1
            r36 = r1
            X.0eM r1 = r0.A0E
            java.lang.Object r35 = r1.getValue()
            r1 = r35
            X.2tF r1 = (X.C232232tF) r1
            r35 = r1
            X.0eM r1 = r0.A0D
            java.lang.Object r34 = r1.getValue()
            r1 = r34
            X.2tF r1 = (X.C232232tF) r1
            r34 = r1
            X.0eM r1 = r0.A0z
            java.lang.Object r33 = r1.getValue()
            r1 = r33
            X.2tF r1 = (X.C232232tF) r1
            r33 = r1
            X.0eM r1 = r0.A12
            java.lang.Object r32 = r1.getValue()
            r1 = r32
            X.2tF r1 = (X.C232232tF) r1
            r32 = r1
            X.0eM r1 = r0.A0y
            java.lang.Object r31 = r1.getValue()
            r1 = r31
            X.2tF r1 = (X.C232232tF) r1
            r31 = r1
            X.0eM r1 = r0.A10
            java.lang.Object r30 = r1.getValue()
            r1 = r30
            X.2tF r1 = (X.C232232tF) r1
            r30 = r1
            X.0eM r1 = r0.A11
            java.lang.Object r29 = r1.getValue()
            r1 = r29
            X.2tF r1 = (X.C232232tF) r1
            r29 = r1
            X.0eM r1 = r0.A0x
            java.lang.Object r28 = r1.getValue()
            r1 = r28
            X.2tF r1 = (X.C232232tF) r1
            r28 = r1
            X.0eM r1 = r0.A0w
            java.lang.Object r27 = r1.getValue()
            r1 = r27
            X.2tF r1 = (X.C232232tF) r1
            r27 = r1
            X.0eM r1 = r0.A1C
            java.lang.Object r26 = r1.getValue()
            r1 = r26
            X.2tF r1 = (X.C232232tF) r1
            r26 = r1
            X.0eM r1 = r0.A1f
            java.lang.Object r25 = r1.getValue()
            r1 = r25
            X.2tF r1 = (X.C232232tF) r1
            r25 = r1
            X.0eM r1 = r0.A0M
            java.lang.Object r24 = r1.getValue()
            r1 = r24
            X.2tF r1 = (X.C232232tF) r1
            r24 = r1
            X.0eM r1 = r0.A1D
            java.lang.Object r23 = r1.getValue()
            r1 = r23
            X.2tF r1 = (X.C232232tF) r1
            r23 = r1
            X.0eM r1 = r0.A1A
            java.lang.Object r15 = r1.getValue()
            X.2tF r15 = (X.C232232tF) r15
            X.0eM r1 = r0.A2W
            java.lang.Object r14 = r1.getValue()
            X.2tF r14 = (X.C232232tF) r14
            X.0eM r1 = r0.A2f
            java.lang.Object r11 = r1.getValue()
            X.2tF r11 = (X.C232232tF) r11
            X.0eM r1 = r0.A0k
            java.lang.Object r10 = r1.getValue()
            X.2tF r10 = (X.C232232tF) r10
            X.0eM r1 = r0.A0n
            java.lang.Object r9 = r1.getValue()
            X.2tF r9 = (X.C232232tF) r9
            X.0eM r1 = r0.A01
            java.lang.Object r8 = r1.getValue()
            X.2tF r8 = (X.C232232tF) r8
            X.0eM r1 = r0.A0P
            java.lang.Object r7 = r1.getValue()
            X.2tF r7 = (X.C232232tF) r7
            X.0eM r1 = r0.A16
            java.lang.Object r6 = r1.getValue()
            X.2tF r6 = (X.C232232tF) r6
            X.0eM r1 = r0.A1Y
            java.lang.Object r5 = r1.getValue()
            X.2tF r5 = (X.C232232tF) r5
            X.0eM r1 = r0.A1i
            java.lang.Object r4 = r1.getValue()
            X.2tF r4 = (X.C232232tF) r4
            X.0eM r1 = r0.A1Q
            java.lang.Object r3 = r1.getValue()
            X.2tF r3 = (X.C232232tF) r3
            X.0eM r1 = r0.A0U
            java.lang.Object r2 = r1.getValue()
            X.2tF r2 = (X.C232232tF) r2
            X.0eM r1 = r0.A0T
            java.lang.Object r1 = r1.getValue()
            X.2tF r1 = (X.C232232tF) r1
            r40 = r34
            r41 = r33
            r42 = r32
            r43 = r31
            r44 = r30
            r45 = r29
            r46 = r28
            r47 = r27
            r48 = r26
            r49 = r25
            r50 = r24
            r51 = r23
            r52 = r15
            r53 = r14
            r54 = r11
            r55 = r10
            r56 = r9
            r57 = r8
            r58 = r7
            r59 = r6
            r60 = r5
            r61 = r4
            r62 = r3
            r63 = r2
            r64 = r1
            r38 = r36
            r39 = r35
            X.2tF[] r5 = new X.C232232tF[]{r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64}
            r4 = 81
            r3 = r22
            r2 = r65
            r1 = r37
            java.lang.System.arraycopy(r5, r3, r2, r4, r1)
            X.0eM r1 = r0.A1v
            java.lang.Object r36 = r1.getValue()
            r1 = r36
            X.2tF r1 = (X.C232232tF) r1
            r36 = r1
            X.0eM r1 = r0.A20
            java.lang.Object r35 = r1.getValue()
            r1 = r35
            X.2tF r1 = (X.C232232tF) r1
            r35 = r1
            X.0eM r1 = r0.A2z
            java.lang.Object r34 = r1.getValue()
            r1 = r34
            X.2tF r1 = (X.C232232tF) r1
            r34 = r1
            X.0eM r1 = r0.A2x
            java.lang.Object r33 = r1.getValue()
            r1 = r33
            X.2tF r1 = (X.C232232tF) r1
            r33 = r1
            X.0eM r1 = r0.A2s
            java.lang.Object r32 = r1.getValue()
            r1 = r32
            X.2tF r1 = (X.C232232tF) r1
            r32 = r1
            X.0eM r1 = r0.A2q
            java.lang.Object r31 = r1.getValue()
            r1 = r31
            X.2tF r1 = (X.C232232tF) r1
            r31 = r1
            X.0eM r1 = r0.A2p
            java.lang.Object r30 = r1.getValue()
            r1 = r30
            X.2tF r1 = (X.C232232tF) r1
            r30 = r1
            X.0eM r1 = r0.A2o
            java.lang.Object r29 = r1.getValue()
            r1 = r29
            X.2tF r1 = (X.C232232tF) r1
            r29 = r1
            X.0eM r1 = r0.A2v
            java.lang.Object r28 = r1.getValue()
            r1 = r28
            X.2tF r1 = (X.C232232tF) r1
            r28 = r1
            X.0eM r1 = r0.A2t
            java.lang.Object r27 = r1.getValue()
            r1 = r27
            X.2tF r1 = (X.C232232tF) r1
            r27 = r1
            X.0eM r1 = r0.A2u
            java.lang.Object r26 = r1.getValue()
            r1 = r26
            X.2tF r1 = (X.C232232tF) r1
            r26 = r1
            X.0eM r1 = r0.A1K
            java.lang.Object r25 = r1.getValue()
            r1 = r25
            X.2tF r1 = (X.C232232tF) r1
            r25 = r1
            X.0eM r1 = r0.A1J
            java.lang.Object r24 = r1.getValue()
            r1 = r24
            X.2tF r1 = (X.C232232tF) r1
            r24 = r1
            X.0eM r1 = r0.A1N
            java.lang.Object r23 = r1.getValue()
            r1 = r23
            X.2tF r1 = (X.C232232tF) r1
            r23 = r1
            X.0eM r1 = r0.A1L
            java.lang.Object r15 = r1.getValue()
            X.2tF r15 = (X.C232232tF) r15
            X.0eM r1 = r0.A1M
            java.lang.Object r14 = r1.getValue()
            X.2tF r14 = (X.C232232tF) r14
            X.0eM r1 = r0.A1I
            java.lang.Object r11 = r1.getValue()
            X.2tF r11 = (X.C232232tF) r11
            X.0eM r1 = r0.A1H
            java.lang.Object r10 = r1.getValue()
            X.2tF r10 = (X.C232232tF) r10
            X.0eM r1 = r0.A2b
            java.lang.Object r9 = r1.getValue()
            X.2tF r9 = (X.C232232tF) r9
            X.0eM r1 = r0.A2Z
            java.lang.Object r8 = r1.getValue()
            X.2tF r8 = (X.C232232tF) r8
            X.0eM r1 = r0.A2e
            java.lang.Object r7 = r1.getValue()
            X.2tF r7 = (X.C232232tF) r7
            X.0eM r1 = r0.A2Y
            java.lang.Object r6 = r1.getValue()
            X.2tF r6 = (X.C232232tF) r6
            X.0eM r1 = r0.A2X
            java.lang.Object r5 = r1.getValue()
            X.2tF r5 = (X.C232232tF) r5
            X.0eM r1 = r0.A2j
            java.lang.Object r4 = r1.getValue()
            X.2tF r4 = (X.C232232tF) r4
            X.0eM r1 = r0.A2i
            java.lang.Object r3 = r1.getValue()
            X.2tF r3 = (X.C232232tF) r3
            X.0eM r1 = r0.A2m
            java.lang.Object r2 = r1.getValue()
            X.2tF r2 = (X.C232232tF) r2
            X.0eM r1 = r0.A2h
            java.lang.Object r1 = r1.getValue()
            X.2tF r1 = (X.C232232tF) r1
            r40 = r34
            r41 = r33
            r42 = r32
            r43 = r31
            r44 = r30
            r45 = r29
            r46 = r28
            r47 = r27
            r48 = r26
            r49 = r25
            r50 = r24
            r51 = r23
            r52 = r15
            r53 = r14
            r54 = r11
            r55 = r10
            r56 = r9
            r57 = r8
            r58 = r7
            r59 = r6
            r60 = r5
            r61 = r4
            r62 = r3
            r63 = r2
            r64 = r1
            r38 = r36
            r39 = r35
            X.2tF[] r5 = new X.C232232tF[]{r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64}
            r4 = 108(0x6c, float:1.51E-43)
            r3 = r22
            r2 = r65
            r1 = r37
            java.lang.System.arraycopy(r5, r3, r2, r4, r1)
            X.0eM r1 = r0.A2g
            java.lang.Object r33 = r1.getValue()
            r1 = r33
            X.2tF r1 = (X.C232232tF) r1
            r33 = r1
            X.0eM r1 = r0.A0O
            java.lang.Object r32 = r1.getValue()
            r1 = r32
            X.2tF r1 = (X.C232232tF) r1
            r32 = r1
            X.0eM r1 = r0.A0A
            java.lang.Object r31 = r1.getValue()
            r1 = r31
            X.2tF r1 = (X.C232232tF) r1
            r31 = r1
            X.0eM r1 = r0.A0u
            java.lang.Object r30 = r1.getValue()
            r1 = r30
            X.2tF r1 = (X.C232232tF) r1
            r30 = r1
            X.0eM r1 = r0.A1U
            java.lang.Object r29 = r1.getValue()
            r1 = r29
            X.2tF r1 = (X.C232232tF) r1
            r29 = r1
            X.0eM r1 = r0.A2k
            java.lang.Object r28 = r1.getValue()
            r1 = r28
            X.2tF r1 = (X.C232232tF) r1
            r28 = r1
            X.0eM r1 = r0.A2l
            java.lang.Object r27 = r1.getValue()
            r1 = r27
            X.2tF r1 = (X.C232232tF) r1
            r27 = r1
            X.0eM r1 = r0.A2d
            java.lang.Object r26 = r1.getValue()
            r1 = r26
            X.2tF r1 = (X.C232232tF) r1
            r26 = r1
            X.0eM r1 = r0.A2c
            java.lang.Object r25 = r1.getValue()
            r1 = r25
            X.2tF r1 = (X.C232232tF) r1
            r25 = r1
            X.0eM r1 = r0.A0N
            java.lang.Object r24 = r1.getValue()
            r1 = r24
            X.2tF r1 = (X.C232232tF) r1
            r24 = r1
            X.0eM r1 = r0.A15
            java.lang.Object r23 = r1.getValue()
            r1 = r23
            X.2tF r1 = (X.C232232tF) r1
            r23 = r1
            X.0eM r1 = r0.A0j
            java.lang.Object r15 = r1.getValue()
            X.2tF r15 = (X.C232232tF) r15
            X.0eM r1 = r0.A1T
            java.lang.Object r14 = r1.getValue()
            X.2tF r14 = (X.C232232tF) r14
            X.0eM r1 = r0.A0i
            java.lang.Object r11 = r1.getValue()
            X.2tF r11 = (X.C232232tF) r11
            X.0eM r1 = r0.A2F
            java.lang.Object r10 = r1.getValue()
            X.2tF r10 = (X.C232232tF) r10
            X.0eM r1 = r0.A2H
            java.lang.Object r9 = r1.getValue()
            X.2tF r9 = (X.C232232tF) r9
            X.0eM r1 = r0.A0G
            java.lang.Object r8 = r1.getValue()
            X.2tF r8 = (X.C232232tF) r8
            X.0eM r1 = r0.A2a
            java.lang.Object r7 = r1.getValue()
            X.2tF r7 = (X.C232232tF) r7
            X.0eM r1 = r0.A2y
            java.lang.Object r6 = r1.getValue()
            X.2tF r6 = (X.C232232tF) r6
            X.0eM r1 = r0.A2r
            java.lang.Object r5 = r1.getValue()
            X.2tF r5 = (X.C232232tF) r5
            X.0eM r1 = r0.A0Q
            java.lang.Object r4 = r1.getValue()
            X.2tF r4 = (X.C232232tF) r4
            X.0eM r1 = r0.A1F
            java.lang.Object r3 = r1.getValue()
            X.2tF r3 = (X.C232232tF) r3
            X.0eM r1 = r0.A1V
            java.lang.Object r2 = r1.getValue()
            X.2tF r2 = (X.C232232tF) r2
            X.0eM r1 = r0.A2B
            java.lang.Object r1 = r1.getValue()
            X.2tF r1 = (X.C232232tF) r1
            X.0eM r0 = r0.A1R
            java.lang.Object r0 = r0.getValue()
            X.2tF r0 = (X.C232232tF) r0
            r35 = r31
            r36 = r30
            r37 = r29
            r38 = r28
            r39 = r27
            r40 = r26
            r41 = r25
            r42 = r24
            r43 = r23
            r44 = r15
            r45 = r14
            r46 = r11
            r47 = r10
            r48 = r9
            r49 = r8
            r50 = r7
            r51 = r6
            r52 = r5
            r53 = r4
            r54 = r3
            r55 = r2
            r56 = r1
            r57 = r0
            r34 = r32
            X.2tF[] r4 = new X.C232232tF[]{r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57}
            r3 = 135(0x87, float:1.89E-43)
            r2 = 25
            r1 = r22
            r0 = r65
            java.lang.System.arraycopy(r4, r1, r0, r3, r2)
            r1 = r0
            r0 = r22
            X.0qQ.A0B(r1, r0)
            java.util.List r5 = X.03t.A0I(r65)
            r0 = r67
            X.0eM r0 = r0.A0G
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            int r0 = r1.size()
            int r0 = X.0se.A0L(r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x09cf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x09f1
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L_0x09cf
        L_0x09f1:
            r4 = r21
            r2 = r66
            r0 = r16
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 != 0) goto L_0x0a3e
            android.content.Context r4 = r12.A07
            X.9HS r2 = r12.A0E
            r0 = 32
            X.9Km r1 = new X.9Km
            r1.<init>(r12, r0)
            X.7L2 r0 = r12.A05
            java.lang.String r0 = r0.A09
            X.7LO r7 = new X.7LO
            r24 = r66
            r25 = r2
            r26 = r0
            r27 = r1
            r22 = r7
            r23 = r4
            r22.<init>(r23, r24, r25, r26, r27)
        L_0x0a1d:
            X.2tT r7 = (X.C232312tT) r7
            r12.A01 = r7
            r4 = r21
            r2 = r66
            r0 = r16
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x00df
            X.7LD r0 = r12.A03
            android.view.LayoutInflater r0 = r0.A00
            X.2tC r4 = new X.2tC
            r4.<init>(r0)
            X.2tT r0 = r12.A01
            if (r0 != 0) goto L_0x0a72
            java.lang.String r9 = "viewHolderPreloader"
            goto L_0x0191
        L_0x0a3e:
            r0 = 36317835433743974(0x8106e1000a1666, double:3.0308835962603714E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            X.2tJ r6 = new X.2tJ
            if (r0 == 0) goto L_0x0a6e
            r6.<init>((java.util.Map) r3)
        L_0x0a4e:
            android.content.Context r4 = r12.A07
            X.7LD r0 = r12.A03
            android.view.LayoutInflater r2 = r0.A00
            X.9HS r1 = r12.A0E
            X.7L2 r0 = r12.A05
            java.lang.String r0 = r0.A09
            X.Ota r7 = new X.Ota
            r24 = r2
            r25 = r6
            r26 = r66
            r27 = r1
            r28 = r0
            r22 = r7
            r23 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28)
            goto L_0x0a1d
        L_0x0a6e:
            r6.<init>((java.util.List) r5)
            goto L_0x0a4e
        L_0x0a72:
            r4.A04 = r0
            android.view.View$OnLongClickListener r0 = r12.A08
            r4.A00 = r0
            X.AYN r0 = new X.AYN
            r0.<init>(r12)
            r4.A03 = r0
            r1 = 36317835433743974(0x8106e1000a1666, double:3.0308835962603714E-306)
            r6 = r21
            r0 = r66
            boolean r0 = X.182.A06(r6, r0, r1)
            if (r0 == 0) goto L_0x0ac5
            r4.A07 = r3
        L_0x0a90:
            r2 = 36317835433154143(0x8106e10001165f, double:3.03088359588736E-306)
            r0 = r66
            boolean r0 = X.182.A06(r6, r0, r2)
            if (r0 == 0) goto L_0x0aa0
            r0 = 1
            r4.A09 = r0
        L_0x0aa0:
            r2 = 36317835433285217(0x8106e100031661, double:3.0308835959702516E-306)
            r0 = r66
            boolean r0 = X.182.A06(r6, r0, r2)
            if (r0 == 0) goto L_0x0ab0
            r0 = 1
            r4.A0A = r0
        L_0x0ab0:
            X.2t9 r2 = r4.A00()
            X.2t9 r0 = r12.A00
            if (r0 == 0) goto L_0x0ac1
            X.2tH r0 = r0.A04
            java.util.List r0 = r0.Au8()
            r2.A08(r0)
        L_0x0ac1:
            java.lang.Object r1 = r12.A0F
            monitor-enter(r1)
            goto L_0x0acb
        L_0x0ac5:
            java.util.List r0 = r4.A0C
            r0.addAll(r5)
            goto L_0x0a90
        L_0x0acb:
            r12.A00 = r2     // Catch:{ all -> 0x0af0 }
            monitor-exit(r1)
            X.0sP r0 = r12.A0G
            r0.invoke(r2)
            goto L_0x00df
        L_0x0ad5:
            X.7LN r18 = new X.7LN
            r2 = r18
            r1 = r20
            r0 = r19
            r2.<init>(r1, r0)
            goto L_0x008c
        L_0x0ae2:
            X.4on r1 = r13.A0b
            X.0qQ.A0A(r1)
            X.7LM r20 = new X.7LM
            r0 = r20
            r0.<init>(r1)
            goto L_0x0064
        L_0x0af0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0af3:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0afb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.CNE(android.content.Context, X.4oo, X.7L2):void");
    }

    public final boolean Cat(String str) {
        C254703su r0;
        C270214gN r02;
        AnonymousClass7LQ A012 = this.A0n.A01(str);
        if (A012 == null || (r0 = A012.A0e) == null || (r02 = r0.A0r) == null || !r02.A0C) {
            return false;
        }
        return true;
    }

    public final boolean Cbq(String str) {
        C254703su r0;
        AnonymousClass7LQ A012 = this.A0n.A01(str);
        if (A012 == null || (r0 = A012.A0e) == null) {
            return false;
        }
        return r0.A2P;
    }

    public final boolean CdD() {
        return this.A0U;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00f7 A[LOOP:0: B:3:0x0016->B:10:0x00f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0154 A[EDGE_INSN: B:30:0x0154->B:28:0x0154 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CxS() {
        /*
            r55 = this;
            r12 = r55
            boolean r51 = A0P(r12)
            X.0mo r0 = r12.A0R()
            r0.A06()
            X.0mo r0 = r12.A0R()
            int r11 = r0.A01
            if (r11 < 0) goto L_0x0154
            r10 = 0
        L_0x0016:
            X.7So r0 = A09(r12, r10)
            boolean r1 = r0 instanceof X.AnonymousClass79E
            if (r1 == 0) goto L_0x00fb
            X.79E r0 = (X.AnonymousClass79E) r0
            java.lang.String r13 = r0.A0J
            boolean r1 = r0.A0Z
            r38 = r1
            boolean r1 = r0.A0S
            r39 = r1
            boolean r1 = r0.A0T
            r40 = r1
            X.0eP r9 = r0.A0M
            java.util.List r1 = r0.A0K
            r34 = r1
            boolean r1 = r0.A0Y
            r41 = r1
            java.lang.CharSequence r1 = r0.A08
            r54 = r1
            java.lang.String r1 = r0.A0C
            r53 = r1
            com.instagram.direct.model.messaginguser.MessagingUser r1 = r0.A03
            r52 = r1
            boolean r1 = r0.A0V
            r42 = r1
            java.lang.String r1 = r0.A0E
            r28 = r1
            java.lang.String r1 = r0.A0F
            r29 = r1
            java.lang.String r1 = r0.A0G
            r27 = r1
            java.lang.String r1 = r0.A0H
            r26 = r1
            java.lang.String r1 = r0.A0I
            r25 = r1
            boolean r1 = r0.A0P
            r24 = r1
            boolean r1 = r0.A0R
            r23 = r1
            X.3t3 r1 = r0.A05
            r22 = r1
            X.3tH r8 = r0.A04
            boolean r1 = r0.A0U
            r21 = r1
            java.util.List r7 = r0.A0L
            java.lang.String r1 = r0.A0D
            r20 = r1
            boolean r1 = r0.A00
            r19 = r1
            int r1 = r0.A01
            r18 = r1
            boolean r1 = r0.A0W
            r17 = r1
            X.9Ih r1 = r0.A02
            r16 = r1
            java.lang.Integer r6 = r0.A0A
            boolean r15 = r0.A0Q
            boolean r5 = r0.A0O
            boolean r4 = r0.A0X
            java.lang.Boolean r3 = r0.A06
            java.lang.Integer r2 = r0.A09
            java.lang.Long r1 = r0.A0B
            java.lang.Boolean r14 = r0.A07
            r0 = 0
            X.0qQ.A0B(r13, r0)
            r0 = 4
            X.0qQ.A0B(r9, r0)
            r0 = 19
            X.0qQ.A0B(r8, r0)
            r0 = 21
            X.0qQ.A0B(r7, r0)
            r0 = 27
            X.0qQ.A0B(r6, r0)
            X.79E r0 = new X.79E
            r30 = r27
            r31 = r26
            r32 = r25
            r33 = r20
            r35 = r7
            r36 = r9
            r37 = r18
            r43 = r24
            r44 = r23
            r45 = r21
            r46 = r19
            r47 = r17
            r48 = r15
            r49 = r5
            r50 = r4
            r15 = r0
            r17 = r52
            r18 = r8
            r19 = r22
            r20 = r3
            r21 = r14
            r22 = r54
            r23 = r6
            r24 = r2
            r25 = r1
            r26 = r13
            r27 = r53
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            X.79E r1 = r12.A0G
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00f2
            A0K(r12, r0)
            r12.A0G = r0
        L_0x00f2:
            A0I(r12, r10)
        L_0x00f5:
            if (r10 == r11) goto L_0x0154
            int r10 = r10 + 1
            goto L_0x0016
        L_0x00fb:
            boolean r1 = r0 instanceof X.AnonymousClass7LQ
            if (r1 == 0) goto L_0x00f5
            X.1at r2 = X.C327657Br.A00()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r1 = r0.A0e
            X.2FW r1 = r1.A10
            X.0qQ.A07(r1)
            X.7Bu r8 = r2.A01(r1)
            r3 = r10
        L_0x0111:
            int r3 = r3 + -1
            r4 = -1
            if (r4 >= r3) goto L_0x0152
            X.0mo r1 = r12.A0R()
            java.lang.Object r2 = r1.A05(r3)
            X.0qQ.A07(r2)
            X.7So r2 = (X.C331837So) r2
            boolean r1 = r2 instanceof X.AnonymousClass7LQ
            if (r1 == 0) goto L_0x0111
            X.7LQ r2 = (X.AnonymousClass7LQ) r2
        L_0x0129:
            r1 = 0
            if (r2 == 0) goto L_0x0150
            X.3su r3 = r2.A0e
        L_0x012e:
            int r2 = A02(r12, r10)
            if (r2 == r4) goto L_0x013e
            X.0mo r1 = r12.A0R()
            java.lang.Object r1 = r1.A05(r2)
            X.7So r1 = (X.C331837So) r1
        L_0x013e:
            X.3su r2 = r0.A0e
            X.0qQ.A07(r2)
            r9 = r51 ^ 1
            r4 = r12
            r5 = r1
            r6 = r2
            r7 = r3
            int r1 = A05(r4, r5, r6, r7, r8, r9)
            r0.A00 = r1
            goto L_0x00f2
        L_0x0150:
            r3 = r1
            goto L_0x012e
        L_0x0152:
            r2 = 0
            goto L_0x0129
        L_0x0154:
            X.0mo r0 = r12.A0R()
            r0.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.CxS():void");
    }

    public final void DCQ(AnonymousClass7US r2, C328317Ei r3) {
        AnonymousClass7LP r0 = this.A0K;
        if (r0 == null) {
            0qQ.A0F("shhModeMessageListController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0E(r2, r3, r0.A00());
        }
    }

    public final void DNJ(AnonymousClass7US r6, C328317Ei r7, AnonymousClass3SZ r8, AnonymousClass3SZ r9, C254793t3 r10) {
        String A0g2;
        AnonymousClass7LP r1 = this.A0K;
        if (r1 == null) {
            0qQ.A0F("shhModeMessageListController");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass48T r0 = r1.A02;
        r0.A00 = r8;
        r0.A01 = r9;
        ArrayList arrayList = new ArrayList();
        0mo r3 = r1.A01;
        int i = r3.A01;
        while (true) {
            i--;
            if (-1 >= i) {
                A0E(r6, r7, arrayList);
                return;
            } else if (r3.A05(i) instanceof AnonymousClass7LQ) {
                Object A052 = r3.A05(i);
                0qQ.A0C(A052, C273654mx.A00(26));
                C254703su r12 = ((AnonymousClass7LQ) A052).A0e;
                0qQ.A07(r12);
                if (r12.A2P && (A0g2 = r12.A0g()) != null) {
                    arrayList.add(A0g2);
                }
            }
        }
    }

    public final void Dj0(String str) {
        AnonymousClass7LQ A012 = this.A0n.A01(str);
        if (A012 != null) {
            A012.A0a = false;
            int A002 = 0mo.A00(A0R(), A012, 4);
            if (A002 != -1) {
                A0W(A012, A002);
            }
        }
    }

    public final void Drm(String str) {
        C254703su r0;
        ArrayList arrayList = new ArrayList();
        String str2 = this.A0L;
        boolean z = false;
        boolean z2 = true;
        if (str2 != null) {
            AnonymousClass7LQ A012 = this.A0n.A01(str2);
            String str3 = this.A0L;
            if (str3 != null) {
                A0A(this, str3);
                if (!(A012 == null || (r0 = A012.A0e) == null)) {
                    r0.A2R = false;
                    arrayList.add(A012);
                    z = true;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (str != null) {
            AnonymousClass7LQ A013 = this.A0n.A01(str);
            AnonymousClass7O6 A0A2 = A0A(this, str);
            if (A013 != null && A0A2 == null) {
                A013.A0e.A2R = true;
                arrayList.add(A013);
                A0L(new C328317Ei((C328307Eh) null, str, z2), (List) null, (List) null, arrayList, false);
            }
        }
        z2 = z;
        str = null;
        A0L(new C328317Ei((C328307Eh) null, str, z2), (List) null, (List) null, arrayList, false);
    }

    public final void Drx(MessageIdentifier messageIdentifier) {
        AnonymousClass7LQ A012 = this.A0n.A01(messageIdentifier.A01);
        if (A012 != null) {
            A012.A0X = !A012.A0X;
            A0V(A012);
        }
    }

    public final void EEb() {
        AnonymousClass7O7 r1 = this.A08;
        if (r1 != null) {
            A0R().A08(r1);
        }
    }

    public final void EQ9(0sP r1, boolean z) {
        this.A0T = z;
        this.A0S = r1;
    }

    public final void EQA(MessageIdentifier messageIdentifier, boolean z) {
        AnonymousClass7LQ A012 = this.A0n.A01(messageIdentifier.A01);
        if (A012 != null) {
            A012.A0O = z;
            int A002 = 0mo.A00(A0R(), A012, 4);
            if (A002 != -1) {
                A0W(A012, A002);
            }
        }
        HashSet hashSet = this.A1D;
        if (z) {
            hashSet.add(messageIdentifier);
        } else {
            hashSet.remove(messageIdentifier);
        }
    }

    public final void EjZ(AnonymousClass3SZ r2) {
        if (this.A0d == null) {
            this.A0d = r2;
        }
    }

    public final void Eja(AnonymousClass3SZ r2, AnonymousClass3SZ r3, C254793t3 r4) {
        AnonymousClass7LP r0 = this.A0K;
        if (r0 == null) {
            0qQ.A0F("shhModeMessageListController");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass48T r02 = r0.A02;
        r02.A00 = r2;
        r02.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = A0R();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLJ() {
        /*
            r4 = this;
            X.EGh r1 = r4.A0c
            if (r1 == 0) goto L_0x002f
            X.0mo r3 = r4.A0R()
            r2 = 1
            r0 = 2
            int r1 = X.0mo.A00(r3, r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x002f
            X.0mo.A02(r3, r1, r2)
            com.instagram.common.session.UserSession r1 = r4.A0g
            X.3FW r0 = new X.3FW
            r0.<init>(r1)
            com.instagram.user.model.User r0 = r0.A01
            boolean r0 = r0.A1Z()
            if (r0 == 0) goto L_0x0030
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x0025:
            r1 = 0
            X.7SD r0 = r4.A0H
            X.EGh r0 = A07(r4, r0, r1, r2)
            A0K(r4, r0)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.FLJ():void");
    }

    public final void FLj(AnonymousClass7US r8, C328317Ei r9, AnonymousClass3SZ r10, boolean z) {
        String A0g2;
        AnonymousClass7LP r5 = this.A0K;
        if (r5 == null) {
            0qQ.A0F("shhModeMessageListController");
            throw AnonymousClass00P.createAndThrow();
        }
        r5.A02.A00 = r10;
        ArrayList arrayList = new ArrayList();
        0mo r4 = r5.A01;
        int i = r4.A01;
        while (true) {
            i--;
            if (-1 >= i) {
                A0E(r8, r9, arrayList);
                return;
            } else if (r4.A05(i) instanceof AnonymousClass7LQ) {
                Object A052 = r4.A05(i);
                0qQ.A0C(A052, C273654mx.A00(26));
                C254703su r2 = ((AnonymousClass7LQ) A052).A0e;
                0qQ.A07(r2);
                if (!AnonymousClass48T.A00(r2, r5.A02, true) && (A0g2 = r2.A0g()) != null) {
                    arrayList.add(A0g2);
                }
            }
        }
    }

    public static final int A00(AnonymousClass7ZX r3) {
        int i = r3.A0R().A01;
        for (int i2 = 0; i2 < i; i2++) {
            Object A052 = r3.A0R().A05(i2);
            0qQ.A07(A052);
            if (A052 instanceof AnonymousClass7LQ) {
                return i2;
            }
        }
        return -1;
    }

    public static final int A04(AnonymousClass7ZX r4, C331837So r5) {
        int A002 = 0mo.A00(r4.A0R(), r5, 4);
        if (A002 == -1) {
            A002 = 0;
            int i = r4.A0R().A01;
            while (A002 < i) {
                if (r4.A0R().A05(A002) != r5) {
                    A002++;
                }
            }
            return -1;
        }
        return A002;
    }

    private final int A06(String str) {
        int i = A0R().A01;
        for (int i2 = 0; i2 < i; i2++) {
            Object A052 = A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r1 = (C331837So) A052;
            if ((r1 instanceof AnonymousClass7LQ) && 0qQ.A0K(str, ((AnonymousClass7LQ) r1).A0e.A0g())) {
                return i2;
            }
        }
        return -1;
    }

    public static final AnonymousClass7O6 A0A(AnonymousClass7ZX r5, String str) {
        int CMC = r5.CMC(str) + 1;
        int i = r5.A0R().A01;
        while (true) {
            if (CMC >= i) {
                break;
            }
            C331837So A092 = A09(r5, CMC);
            if (!(A092 instanceof AnonymousClass7O6)) {
                if (A092 instanceof AnonymousClass7LQ) {
                    break;
                }
                CMC++;
            } else {
                AnonymousClass7O6 r1 = (AnonymousClass7O6) A092;
                if (0qQ.A0K(str, r1.A06)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public static final C254703su A0B(AnonymousClass7ZX r4) {
        int i = r4.A0R().A01;
        for (int i2 = 0; i2 < i; i2++) {
            Object A052 = r4.A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r1 = (C331837So) A052;
            if (r1 instanceof AnonymousClass7LQ) {
                AnonymousClass7LQ r12 = (AnonymousClass7LQ) r1;
                if (r12 != null) {
                    return r12.A0e;
                }
                return null;
            }
        }
        return null;
    }

    public static final void A0J(AnonymousClass7ZX r6, int i, int i2, long j) {
        int max = Math.max(i, 0);
        for (int min = Math.min(i2, r6.A0R().A01) - 1; min >= max; min--) {
            Object A052 = r6.A0R().A05(min);
            0qQ.A07(A052);
            C331837So r2 = (C331837So) A052;
            if ((((r2 instanceof AnonymousClass7O6) && ((AnonymousClass7O6) r2).A02 != AnonymousClass05K.A01) || (r2 instanceof AnonymousClass7F4)) && r2.C7Z() != j) {
                0mo A0R2 = r6.A0R();
                A0R2.A05(min);
                0mo.A02(A0R2, min, true);
            }
        }
    }

    public static final void A0K(AnonymousClass7ZX r0, C331837So r1) {
        r0.A0R().A03(r1);
    }

    private final void A0M(AnonymousClass7ZD r5, List list, List list2) {
        AnonymousClass7LQ r2;
        int A042;
        List A012 = r5.A01(list, list2);
        if (!A012.isEmpty()) {
            for (Object next : A012) {
                AnonymousClass7ZU r0 = this.A0n;
                if (!(next == null || (r2 = (AnonymousClass7LQ) r0.A01.get(next)) == null || (A042 = A04(this, r2)) == -1)) {
                    A0W(r2, A042);
                }
            }
        }
    }

    public final C254703su A0T(int i) {
        int i2 = A0R().A01;
        while (i < i2) {
            Object A052 = A0R().A05(i);
            0qQ.A07(A052);
            C331837So r1 = (C331837So) A052;
            if (r1 instanceof AnonymousClass7LQ) {
                C254703su r12 = ((AnonymousClass7LQ) r1).A0e;
                0qQ.A07(r12);
                if (!r12.A1j(this.A0q)) {
                    return r12;
                }
            }
            i++;
        }
        return null;
    }

    public final void A0V(C331837So r3) {
        int A042 = A04(this, r3);
        if (A042 == -1) {
            0wb.A03(C273654mx.A00(474), 002.A0O(C273654mx.A00(3420), r3.getType()));
            return;
        }
        A0W(r3, A042);
        if (r3 instanceof AnonymousClass7LQ) {
            this.A0n.A02((AnonymousClass7LQ) r3);
        }
    }

    public final void ABw(C62320sa r2) {
        A0R().A06();
        r2.invoke();
        A0R().A07();
    }

    public final C254703su BLR() {
        int i = A0R().A01;
        for (int i2 = 0; i2 < i; i2++) {
            Object A052 = A0R().A05(i2);
            0qQ.A07(A052);
            C331837So r1 = (C331837So) A052;
            if (r1 instanceof AnonymousClass7LQ) {
                C254703su r2 = ((AnonymousClass7LQ) r1).A0e;
                0qQ.A07(r2);
                if (!r2.A1j(this.A0q) && !r2.A2P && r2.A10 == 2FW.A1g) {
                    return r2;
                }
            }
        }
        return null;
    }

    public final P0O BSI(DirectMessageIdentifier directMessageIdentifier, int i) {
        C254703su r1;
        String str;
        AnonymousClass7LQ A082 = A08(this, i);
        if (A082 == null || (r1 = A082.A0e) == null) {
            return null;
        }
        1Xj r3 = r1.A0s;
        C254923tH r2 = C254923tH.DJANGO;
        Boolean valueOf = Boolean.valueOf(r1.A1S());
        Long l = r1.A1K;
        boolean z = r1.A2P;
        Integer num = AnonymousClass05K.A00;
        1iA A0W2 = r1.A0W();
        Integer num2 = AnonymousClass05K.A0j;
        C254793t3 r0 = this.A0H.A0P;
        if (r0 != null) {
            str = C300965yF.A01(r0).A00;
        } else {
            str = null;
        }
        return new P0O(r2, r3, r1.A10, A0W2, valueOf, num, num2, l, str, r1.A1o, z);
    }

    public final DirectMessageIdentifier BSQ(02X r8, int i, boolean z) {
        C254703su r3;
        C300925yB r0;
        String str;
        AnonymousClass7LQ A082 = A08(this, i);
        if (A082 == null || (r3 = A082.A0e) == null) {
            return null;
        }
        UserSession userSession = this.A0g;
        1Xj A0T2 = r3.A0T();
        if (r3.A10 == 2FW.A1D) {
            A0T2 = r3.A0R();
        }
        if (r3.A10 == 2FW.A0W) {
            Object obj = r3.A1T;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectClipsShare");
            A0T2 = ((AnonymousClass77X) obj).A01;
        }
        if (r3.A10 == 2FW.A1p && 182.A06(0Tu.A05, userSession, 2342159139545092087L)) {
            A0T2 = C328437Eu.A00(userSession, r3);
        }
        if (r3.A10 == 2FW.A0y && r3.A1S() && (str = r3.A1o) != null) {
            try {
                if (new JSONObject(str).optString("__typename").hashCode() == 1959039784 && 182.A06(0Tu.A05, userSession, 2342159139545092087L)) {
                    A0T2 = C328437Eu.A00(userSession, r3);
                }
            } catch (JSONException e) {
                0KC.A0G(C273654mx.A00(474), AnonymousClass000.A00(230), e);
            }
        }
        if ((A0T2 == null || !A0T2.CeS() || A0T2.A5f()) && ((r0 = r3.A0v) == null || !r0.A05())) {
            return null;
        }
        if (r3.A1S() || r8.test(r3.A10)) {
            return r3.A0V();
        }
        return null;
    }

    public final ArrayList Bk1(int i) {
        return A0C(this, i);
    }

    public final boolean CUS(int i) {
        C254703su r0;
        AnonymousClass7LQ r1;
        C254703su r02;
        C331837So A092 = A09(this, i);
        C331837So A093 = A09(this, i + 1);
        if (A092 == null) {
            return false;
        }
        if (A092 instanceof AnonymousClass7LQ) {
            AnonymousClass7LQ r3 = (AnonymousClass7LQ) A092;
            if (r3.A0U || ((r0 = r3.A0e) != null && r0.A13 != null)) {
                return true;
            }
            if (!(A093 instanceof AnonymousClass7LQ) || (r1 = (AnonymousClass7LQ) A093) == null || (r02 = r1.A0e) == null || r02.A13 == null) {
                return false;
            }
            return true;
        } else if (A092 instanceof C330807Oi) {
            return ((C330807Oi) A092).A06;
        } else {
            return A093 instanceof AnonymousClass7F4;
        }
    }

    public final boolean CUT(int i) {
        AnonymousClass7LQ A082 = A08(this, i);
        if (A082 != null && (A082.A0V || A082.A0e.A13 != null)) {
            return true;
        }
        if (i < 0 || i >= A0R().A01) {
            return false;
        }
        Object A052 = A0R().A05(i);
        0qQ.A07(A052);
        if (A052 instanceof AnonymousClass7F4) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CVk(int r4) {
        /*
            r3 = this;
            X.7So r1 = A09(r3, r4)
            r2 = 0
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x0017
            X.7LQ r1 = (X.AnonymousClass7LQ) r1
            X.3su r0 = r1.A0e
            boolean r1 = r0.A2P
            boolean r0 = r3.A0U
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            return r2
        L_0x0017:
            boolean r0 = r1 instanceof X.AnonymousClass7O9
            if (r0 != 0) goto L_0x0015
            boolean r0 = r1 instanceof X.AnonymousClass7OA
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3.CXG(r4)
            if (r0 == 0) goto L_0x0016
            boolean r0 = r3.CXJ(r4)
            if (r0 == 0) goto L_0x0016
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.CVk(int):boolean");
    }

    public final boolean CVm(int i) {
        C331837So A092 = A09(this, i);
        if (A092 == null || !(A092 instanceof AnonymousClass7OA)) {
            return false;
        }
        return true;
    }

    public final boolean CVn(int i) {
        C331837So A092 = A09(this, i);
        if (A092 == null || !(A092 instanceof AnonymousClass7O9)) {
            return false;
        }
        return true;
    }

    public final void CzI(MessageIdentifier messageIdentifier) {
        A0R().A06();
        int i = A0R().A01;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C331837So A092 = A09(this, i2);
                if (A092 != null && (A092 instanceof AnonymousClass7LQ)) {
                    AnonymousClass7LQ r1 = (AnonymousClass7LQ) A092;
                    r1.A01 = A03(this, r1);
                    if (!this.A0T) {
                        r1.A0O = false;
                        this.A1D.clear();
                    } else if (messageIdentifier != null) {
                        String A0h2 = r1.A0e.A0h();
                        String str = messageIdentifier.A01;
                        if (0qQ.A0K(A0h2, str)) {
                            r1.A0O = true;
                            this.A1D.add(new MessageIdentifier(str, messageIdentifier.A00()));
                        }
                    }
                    A0I(this, i2);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        A0R().A07();
    }

    public final void DNe() {
        AnonymousClass7LQ r1;
        A0R().A06();
        int i = A0R().A01;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C331837So A092 = A09(this, i2);
                if ((A092 instanceof AnonymousClass7LQ) && (r1 = (AnonymousClass7LQ) A092) != null) {
                    r1.A03 = 0;
                    A0I(this, i2);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        A0R().A07();
    }

    public final void DQa(String str) {
        A0I(this, CMC(str));
    }

    public final void DRh() {
        AnonymousClass7LQ r1;
        A0R().A06();
        int i = A0R().A01;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C331837So A092 = A09(this, i2);
                if ((A092 instanceof AnonymousClass7LQ) && (r1 = (AnonymousClass7LQ) A092) != null) {
                    r1.A04 = 0;
                    A0I(this, i2);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        A0R().A07();
    }

    public final void DbV() {
        AnonymousClass7LQ r1;
        A0R().A06();
        int i = A0R().A01;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C331837So A092 = A09(this, i2);
                if ((A092 instanceof AnonymousClass7LQ) && (r1 = (AnonymousClass7LQ) A092) != null) {
                    r1.A06 = 0;
                    A0I(this, i2);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        A0R().A07();
    }

    public final void Dr3(String str) {
        A0I(this, CMC(str));
    }

    public final int getItemCount() {
        return A0R().A01;
    }

    public final void DI4(DirectMessageIdentifier directMessageIdentifier) {
        this.A0e = directMessageIdentifier;
    }

    public final void EdY(boolean z) {
        this.A0Y = z;
    }

    public final void Ehm(boolean z) {
        this.A0Z = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v260, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r22v8 */
    /* JADX WARNING: type inference failed for: r1v240, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x048e, code lost:
        if (r4.A0H.A18 == false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x112c, code lost:
        if (r0.A00 == 0) goto L_0x112e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1067:0x0854 A[EDGE_INSN: B:1067:0x0854->B:354:0x0854 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1110:0x14a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1115:0x1737 A[EDGE_INSN: B:1115:0x1737->B:980:0x1737 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03a7 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03ad A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x046d A[ADDED_TO_REGION, Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0736 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0779 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x077a A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x07c5 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x080e A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08cc A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0a41 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0a43 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0b6d A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0c72 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0cce A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0dd0 A[SYNTHETIC, Splitter:B:548:0x0dd0] */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0dd5 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:576:0x0e6d A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x0e77 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:647:0x1065 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:656:0x10ab A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:657:0x10ac A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:661:0x10b7 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:664:0x10c7 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:665:0x10c8 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:669:0x10d7 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:672:0x10f0 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:673:0x10f1 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:679:0x111a A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:680:0x111c A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:688:0x1162 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x117b A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:704:0x11a8 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x11a9 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:717:0x11cb A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:721:0x11d8 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:736:0x1259 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:741:0x1290 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:750:0x12ad A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:771:0x131d A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:789:0x1365 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0196 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:791:0x136d A[ADDED_TO_REGION, Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019c A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:812:0x13e5 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:814:0x13ec A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:824:0x140d A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:837:0x1456 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:854:0x148b A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:860:0x14a5 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:882:0x151c A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:952:0x16d5 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:963:0x1705 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:975:0x1724 A[Catch:{ IllegalStateException -> 0x12b9, all -> 0x17c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:990:0x1765  */
    /* JADX WARNING: Removed duplicated region for block: B:997:0x1792  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(X.AnonymousClass7US r81, X.C333447Yz r82, X.C3257874d r83, X.C328317Ei r84, X.AnonymousClass7SD r85, java.lang.Integer r86, java.lang.String r87, java.util.List r88, java.util.List r89, java.util.List r90, boolean r91, boolean r92, boolean r93, boolean r94) {
        /*
            r80 = this;
            r22 = r89
            r27 = 0
            r28 = 0
            r15 = 0
            r78 = r85
            r0 = r78
            X.0qQ.A0B(r0, r15)
            r0 = 4
            r8 = r81
            X.0qQ.A0B(r8, r0)
            r1 = 12
            r79 = r82
            r0 = r79
            X.0qQ.A0B(r0, r1)
            r16 = r88
            if (r94 == 0) goto L_0x0082
            if (r88 == 0) goto L_0x0082
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r0 = 0
            X.7Bp r2 = new X.7Bp
            r2.<init>(r0, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r12 = r16.iterator()
            r10 = -1
        L_0x003a:
            r0 = -1
        L_0x003c:
            boolean r3 = r12.hasNext()
            r7 = 1
            if (r3 == 0) goto L_0x0085
            java.lang.Object r6 = r12.next()
            X.7LQ r6 = (X.AnonymousClass7LQ) r6
            X.3su r5 = r6.A0e
            X.0qQ.A07(r5)
            X.2FW r4 = r5.A10
            X.2FW r3 = X.2FW.A0G
            if (r4 != r3) goto L_0x0066
            boolean r3 = r5.A2D
            if (r3 != 0) goto L_0x0066
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0062
            long r0 = r5.C7c()
            X.7Bp r2 = r6.A0F
        L_0x0062:
            r9.add(r6)
            goto L_0x003c
        L_0x0066:
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x003c
            int r3 = r9.size()
            if (r3 <= r7) goto L_0x007e
            java.util.List r4 = X.00k.A0a(r9)
            X.MbG r3 = new X.MbG
            r3.<init>((X.C327637Bp) r2, (java.util.List) r4, (long) r0)
            r0 = r20
            r0.add(r3)
        L_0x007e:
            r9.clear()
            goto L_0x003a
        L_0x0082:
            r20 = 0
            goto L_0x0099
        L_0x0085:
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0099
            int r3 = r9.size()
            if (r3 <= r7) goto L_0x0099
            X.MbG r3 = new X.MbG
            r3.<init>((X.C327637Bp) r2, (java.util.List) r9, (long) r0)
            r0 = r20
            r0.add(r3)
        L_0x0099:
            r1 = -1328929746(0xffffffffb0ca242e, float:-1.4707717E-9)
            java.lang.String r0 = "DirectMessageStoreImpl.onThreadUpdated"
            X.0fh.A01(r0, r1)
            r4 = r80
            r19 = r90
            r0 = r78
            X.3t3 r0 = r0.A0P     // Catch:{ all -> 0x17c4 }
            r21 = r0
            if (r0 == 0) goto L_0x00b6
            X.3t0 r0 = X.C300965yF.A01(r21)     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x17c4 }
            r18 = r0
            goto L_0x00b8
        L_0x00b6:
            r18 = 0
        L_0x00b8:
            if (r18 == 0) goto L_0x0134
            java.util.regex.Pattern r0 = X.0mp.A00     // Catch:{ all -> 0x17c4 }
            r0 = r87
            r1 = r18
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0134
            java.lang.String r5 = "setting_messages_for_other_thread"
            java.lang.String r3 = "Attempted to set messages for a different thread. threadMetadata.threadId="
            java.lang.String r2 = ",currentThreadId="
            r1 = r18
            java.lang.String r0 = X.002.A0u(r3, r1, r2, r0)     // Catch:{ all -> 0x17c4 }
            X.0wb.A03(r5, r0)     // Catch:{ all -> 0x17c4 }
            if (r88 == 0) goto L_0x0102
            java.util.Iterator r6 = r16.iterator()
        L_0x00db:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = r6.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r5 = r0.A0e
            X.7AG r0 = r5.A0Q
            if (r0 == 0) goto L_0x00db
            X.0eM r0 = r4.A0y
            java.lang.Object r3 = r0.getValue()
            X.5D7 r3 = (X.AnonymousClass5D7) r3
            java.lang.String r2 = r5.A1j
            X.7AG r1 = r5.A0Q
            X.2FW r0 = r5.A10
            X.0qQ.A07(r0)
            r3.A01(r1, r0, r2)
            goto L_0x00db
        L_0x0102:
            if (r90 == 0) goto L_0x012f
            java.util.Iterator r6 = r19.iterator()
        L_0x0108:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r6.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r5 = r0.A0e
            X.7AG r0 = r5.A0Q
            if (r0 == 0) goto L_0x0108
            X.0eM r0 = r4.A0y
            java.lang.Object r3 = r0.getValue()
            X.5D7 r3 = (X.AnonymousClass5D7) r3
            java.lang.String r2 = r5.A1j
            X.7AG r1 = r5.A0Q
            X.2FW r0 = r5.A10
            X.0qQ.A07(r0)
            r3.A01(r1, r0, r2)
            goto L_0x0108
        L_0x012f:
            r0 = 382213633(0x16c81e01, float:3.2330678E-25)
            goto L_0x17c0
        L_0x0134:
            if (r88 == 0) goto L_0x018a
            boolean r0 = r16.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x018a
            int r1 = r16.size()     // Catch:{ all -> 0x17c4 }
            r0 = 20
            if (r1 == r0) goto L_0x018a
            int r0 = r16.size()     // Catch:{ all -> 0x17c4 }
            r10 = 1
            int r0 = r0 - r10
            r1 = r16
            java.lang.Object r5 = r1.get(r0)     // Catch:{ all -> 0x17c4 }
            X.7LQ r5 = (X.AnonymousClass7LQ) r5     // Catch:{ all -> 0x17c4 }
            int r0 = A00(r4)     // Catch:{ all -> 0x17c4 }
            X.7LQ r0 = A08(r4, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0161
            long r0 = r0.A07     // Catch:{ all -> 0x17c4 }
        L_0x015e:
            long r2 = r5.A07     // Catch:{ all -> 0x17c4 }
            goto L_0x0164
        L_0x0161:
            r0 = 0
            goto L_0x015e
        L_0x0164:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r9 = 0
            if (r6 <= 0) goto L_0x016a
            r9 = 1
        L_0x016a:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0177
            long r6 = r5.C7Z()     // Catch:{ all -> 0x17c4 }
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r10 = 0
        L_0x0178:
            if (r9 != 0) goto L_0x017c
            if (r10 == 0) goto L_0x018a
        L_0x017c:
            X.3su r0 = r5.A0e     // Catch:{ all -> 0x17c4 }
            r25 = r0
            X.0qQ.A07(r25)     // Catch:{ all -> 0x17c4 }
            r27 = r9
            r28 = r10
            r17 = 1
            goto L_0x018e
        L_0x018a:
            r25 = 0
            r17 = 0
        L_0x018e:
            r0 = r78
            boolean r0 = r0.A0k     // Catch:{ all -> 0x17c4 }
            r26 = 1
            if (r0 == 0) goto L_0x019a
            r0 = r26
            r4.A0a = r0     // Catch:{ all -> 0x17c4 }
        L_0x019a:
            if (r88 == 0) goto L_0x03a7
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r1 = r23
            r0 = r16
            r1.<init>(r0)     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r0.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r2 = r16.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x01ae:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x17c4 }
            X.7LQ r1 = (X.AnonymousClass7LQ) r1     // Catch:{ all -> 0x17c4 }
            X.3su r1 = r1.A0e     // Catch:{ all -> 0x17c4 }
            r0.add(r1)     // Catch:{ all -> 0x17c4 }
            goto L_0x01ae
        L_0x01c0:
            int r2 = r0.size()     // Catch:{ all -> 0x17c4 }
            r1 = r26
            if (r2 != r1) goto L_0x0207
            java.lang.Object r1 = r0.get(r15)     // Catch:{ all -> 0x17c4 }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r1.A0f()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0207
            java.lang.Object r1 = r0.get(r15)     // Catch:{ all -> 0x17c4 }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x17c4 }
            java.lang.String r14 = r1.A0f()     // Catch:{ all -> 0x17c4 }
            if (r14 == 0) goto L_0x01f5
            X.7UL r1 = r4.A0k     // Catch:{ all -> 0x17c4 }
            int r2 = r14.hashCode()     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r1 = r1.A05     // Catch:{ all -> 0x17c4 }
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r1 = X.C328727Fx.A00(r1, r2)     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x01f5
            r1.onLogReceiverFetchStart()     // Catch:{ all -> 0x17c4 }
        L_0x01f5:
            com.instagram.common.session.UserSession r3 = r4.A0g     // Catch:{ all -> 0x17c4 }
            r1 = r18
            X.AnonymousClass7OQ.A03(r3, r1, r0)     // Catch:{ all -> 0x17c4 }
            r1 = r78
            X.2Ep r1 = r1.A0K     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0209
            java.lang.Long r6 = r1.C6I()     // Catch:{ all -> 0x17c4 }
            goto L_0x020a
        L_0x0207:
            r14 = 0
            goto L_0x01f5
        L_0x0209:
            r6 = 0
        L_0x020a:
            if (r18 == 0) goto L_0x038f
            if (r6 == 0) goto L_0x038f
            com.instagram.model.direct.DirectThreadKey r5 = new com.instagram.model.direct.DirectThreadKey     // Catch:{ all -> 0x17c4 }
            r2 = r18
            r5.<init>((java.lang.String) r2)     // Catch:{ all -> 0x17c4 }
            long r36 = r6.longValue()     // Catch:{ all -> 0x17c4 }
            X.7Qc r12 = new X.7Qc     // Catch:{ all -> 0x17c4 }
            r12.<init>(r1)     // Catch:{ all -> 0x17c4 }
            r2 = 3
            X.9Mn r11 = new X.9Mn     // Catch:{ all -> 0x17c4 }
            r1 = r18
            r11.<init>(r1, r4, r2)     // Catch:{ all -> 0x17c4 }
            r0.size()     // Catch:{ all -> 0x17c4 }
            X.7Em r10 = X.C328357Em.A00     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r5.A00     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x038f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r2.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x0238:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0252
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r10.invoke(r1)     // Catch:{ all -> 0x17c4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0238
            r2.add(r1)     // Catch:{ all -> 0x17c4 }
            goto L_0x0238
        L_0x0252:
            r2.size()     // Catch:{ all -> 0x17c4 }
            X.0rm r1 = new X.0rm     // Catch:{ all -> 0x17c4 }
            r1.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r0.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x0263:
            boolean r6 = r7.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r6 == 0) goto L_0x0279
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x17c4 }
            X.3su r6 = (X.C254703su) r6     // Catch:{ all -> 0x17c4 }
            X.3tI r6 = r6.A0P()     // Catch:{ all -> 0x17c4 }
            if (r6 == 0) goto L_0x0263
            r0.add(r6)     // Catch:{ all -> 0x17c4 }
            goto L_0x0263
        L_0x0279:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r9.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x0282:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x029d
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x17c4 }
            X.3tI r0 = (X.C254933tI) r0     // Catch:{ all -> 0x17c4 }
            java.lang.String r7 = r0.A0T     // Catch:{ all -> 0x17c4 }
            if (r7 == 0) goto L_0x0282
            java.lang.String r6 = r0.A0R     // Catch:{ all -> 0x17c4 }
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x17c4 }
            r0.<init>(r7, r6)     // Catch:{ all -> 0x17c4 }
            r9.add(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x0282
        L_0x029d:
            r1.A00 = r9     // Catch:{ all -> 0x17c4 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x038f
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x17c4 }
            r0.<init>()     // Catch:{ all -> 0x17c4 }
            r30 = 21
            X.IoM r29 = new X.IoM     // Catch:{ all -> 0x17c4 }
            r31 = r10
            r32 = r2
            r33 = r3
            r34 = r0
            r35 = r11
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x17c4 }
            java.lang.Object r2 = r1.A00     // Catch:{ all -> 0x17c4 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x17c4 }
            r2.size()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r2 = r1.A00     // Catch:{ all -> 0x17c4 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x02ca:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x02e9
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x17c4 }
            X.0eP r2 = (X.0eP) r2     // Catch:{ all -> 0x17c4 }
            X.2Dm r7 = X.2L2.A00(r3)     // Catch:{ all -> 0x17c4 }
            java.lang.Object r6 = r2.A00     // Catch:{ all -> 0x17c4 }
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x17c4 }
            X.3su r2 = r7.BRz(r5, r2)     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x02ca
            r0.put(r6, r2)     // Catch:{ all -> 0x17c4 }
            goto L_0x02ca
        L_0x02e9:
            r0.size()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r2 = r1.A00     // Catch:{ all -> 0x17c4 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r6.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x02f9:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0314
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x17c4 }
            r2 = r5
            X.0eP r2 = (X.0eP) r2     // Catch:{ all -> 0x17c4 }
            java.lang.Object r2 = r2.A00     // Catch:{ all -> 0x17c4 }
            boolean r2 = r0.containsKey(r2)     // Catch:{ all -> 0x17c4 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x02f9
            r6.add(r5)     // Catch:{ all -> 0x17c4 }
            goto L_0x02f9
        L_0x0314:
            r1.A00 = r6     // Catch:{ all -> 0x17c4 }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x17c4 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0321
            r29.invoke()     // Catch:{ all -> 0x17c4 }
        L_0x0321:
            java.lang.Object r2 = r1.A00     // Catch:{ all -> 0x17c4 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x17c4 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r2 != 0) goto L_0x038f
            X.Phn r30 = new X.Phn     // Catch:{ all -> 0x17c4 }
            r31 = r3
            r32 = r12
            r33 = r0
            r34 = r29
            r35 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x17c4 }
            java.lang.Object r2 = r1.A00     // Catch:{ all -> 0x17c4 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x17c4 }
            r2.size()     // Catch:{ all -> 0x17c4 }
            r2 = 43
            X.Pha r5 = new X.Pha     // Catch:{ all -> 0x17c4 }
            r5.<init>(r3, r2)     // Catch:{ all -> 0x17c4 }
            java.lang.Class<X.OKF> r2 = X.OKF.class
            java.lang.Object r3 = r3.A01(r2, r5)     // Catch:{ all -> 0x17c4 }
            X.OKF r3 = (X.OKF) r3     // Catch:{ all -> 0x17c4 }
            java.lang.Object r6 = r1.A00     // Catch:{ all -> 0x17c4 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x17c4 }
            r2 = 10
            int r5 = X.0Yv.A1E(r6, r2)     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r2.<init>(r5)     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x0363:
            boolean r5 = r6.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r5 == 0) goto L_0x0375
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x17c4 }
            X.0eP r5 = (X.0eP) r5     // Catch:{ all -> 0x17c4 }
            java.lang.Object r5 = r5.A00     // Catch:{ all -> 0x17c4 }
            r2.add(r5)     // Catch:{ all -> 0x17c4 }
            goto L_0x0363
        L_0x0375:
            r39 = 44
            X.IxG r38 = new X.IxG     // Catch:{ all -> 0x17c4 }
            r41 = r29
            r43 = r30
            r40 = r1
            r42 = r0
            r38.<init>(r39, r40, r41, r42, r43)     // Catch:{ all -> 0x17c4 }
            r32 = r3
            r33 = r12
            r34 = r2
            r35 = r38
            r32.A00(r33, r34, r35, r36)     // Catch:{ all -> 0x17c4 }
        L_0x038f:
            if (r14 == 0) goto L_0x03a9
            X.7UL r0 = r4.A0k     // Catch:{ all -> 0x17c4 }
            int r1 = r14.hashCode()     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r0 = r0.A05     // Catch:{ all -> 0x17c4 }
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r0 = X.C328727Fx.A00(r0, r1)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x03a9
            r0.onLogReceiverFetchEnd()     // Catch:{ all -> 0x17c4 }
            goto L_0x03a9
        L_0x03a7:
            r23 = 0
        L_0x03a9:
            r6 = r83
            if (r83 == 0) goto L_0x072a
            boolean r0 = r6.A03     // Catch:{ all -> 0x17c4 }
            r4.A0U = r0     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x17c4 }
            r4.A0M = r0     // Catch:{ all -> 0x17c4 }
            X.3SZ r9 = r6.A01     // Catch:{ all -> 0x17c4 }
            java.lang.String r33 = "shhModeMessageListController"
            if (r88 == 0) goto L_0x051b
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r14.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r7 = r16.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x03c4:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x03eb
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x17c4 }
            X.7LQ r5 = (X.AnonymousClass7LQ) r5     // Catch:{ all -> 0x17c4 }
            X.3su r3 = r5.A0e     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x17c4 }
            X.7LP r0 = r4.A0K     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0854
            boolean r2 = r4.A0U     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r1 = r0.A00     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r1.A06     // Catch:{ all -> 0x17c4 }
            X.48T r0 = r0.A02     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.C3257974e.A00(r3, r0, r1, r2)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x03c4
            r14.add(r5)     // Catch:{ all -> 0x17c4 }
            goto L_0x03c4
        L_0x03eb:
            boolean r7 = r4.A0U     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r32 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r32.<init>()     // Catch:{ all -> 0x17c4 }
            r0 = 0
            X.7Bp r13 = new X.7Bp     // Catch:{ all -> 0x17c4 }
            r13.<init>(r0, r0)     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r11.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r31 = r16.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x0402:
            r0 = -1
        L_0x0404:
            boolean r2 = r31.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x04db
            java.lang.Object r10 = r31.next()     // Catch:{ all -> 0x17c4 }
            X.7LQ r10 = (X.AnonymousClass7LQ) r10     // Catch:{ all -> 0x17c4 }
            X.3su r5 = r10.A0e     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x17c4 }
            java.lang.String r3 = r5.A0g()     // Catch:{ all -> 0x17c4 }
            if (r7 != 0) goto L_0x043f
            if (r3 == 0) goto L_0x043f
            com.instagram.common.session.UserSession r2 = r4.A0g     // Catch:{ all -> 0x17c4 }
            java.lang.String r12 = r2.A06     // Catch:{ all -> 0x17c4 }
            java.lang.String r2 = r5.A1u     // Catch:{ all -> 0x17c4 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x043f
            boolean r2 = r5.A2P     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x043f
            if (r9 == 0) goto L_0x0466
            X.3Sc r2 = r9.A02     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0466
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0466
            java.util.Comparator r12 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x17c4 }
            int r2 = r12.compare(r3, r2)     // Catch:{ all -> 0x17c4 }
            if (r2 > 0) goto L_0x0466
        L_0x043f:
            r24 = 0
            if (r7 == 0) goto L_0x0468
            if (r3 == 0) goto L_0x0468
            com.instagram.common.session.UserSession r2 = r4.A0g     // Catch:{ all -> 0x17c4 }
            java.lang.String r12 = r2.A06     // Catch:{ all -> 0x17c4 }
            java.lang.String r2 = r5.A1u     // Catch:{ all -> 0x17c4 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0468
            boolean r2 = r5.A2P     // Catch:{ all -> 0x17c4 }
            if (r2 != 0) goto L_0x0468
            if (r9 == 0) goto L_0x0464
            java.lang.String r2 = r9.A02     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0464
            java.util.Comparator r12 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x17c4 }
            int r2 = r12.compare(r3, r2)     // Catch:{ all -> 0x17c4 }
            if (r2 > 0) goto L_0x0464
            goto L_0x0468
        L_0x0464:
            r12 = 1
            goto L_0x0469
        L_0x0466:
            r24 = 1
        L_0x0468:
            r12 = 0
        L_0x0469:
            X.7LP r3 = r4.A0K     // Catch:{ all -> 0x17c4 }
            if (r3 == 0) goto L_0x0854
            if (r7 == 0) goto L_0x0490
            java.lang.String r2 = r5.A0g()     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0490
            boolean r2 = r5.A2P     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0490
            X.48T r3 = r3.A02     // Catch:{ all -> 0x17c4 }
            r2 = r26
            boolean r2 = X.AnonymousClass48T.A00(r5, r3, r2)     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0490
            boolean r2 = X.AnonymousClass48T.A00(r5, r3, r15)     // Catch:{ all -> 0x17c4 }
            if (r2 != 0) goto L_0x0490
            X.7SD r2 = r4.A0H     // Catch:{ all -> 0x17c4 }
            boolean r2 = r2.A18     // Catch:{ all -> 0x17c4 }
            r3 = 1
            if (r2 != 0) goto L_0x0491
        L_0x0490:
            r3 = 0
        L_0x0491:
            if (r24 != 0) goto L_0x04ae
            if (r12 != 0) goto L_0x04ae
            if (r3 != 0) goto L_0x04ae
            X.7LP r2 = r4.A0K     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0854
            com.instagram.common.session.UserSession r3 = r2.A00     // Catch:{ all -> 0x17c4 }
            java.lang.String r3 = r3.A06     // Catch:{ all -> 0x17c4 }
            X.48T r2 = r2.A02     // Catch:{ all -> 0x17c4 }
            boolean r2 = X.C3257974e.A00(r5, r2, r3, r7)     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0404
            r29 = -1
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 == 0) goto L_0x0404
            goto L_0x04c5
        L_0x04ae:
            r29 = -1
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 != 0) goto L_0x04ba
            long r0 = r5.C7c()     // Catch:{ all -> 0x17c4 }
            X.7Bp r13 = r10.A0F     // Catch:{ all -> 0x17c4 }
        L_0x04ba:
            r11.add(r10)     // Catch:{ all -> 0x17c4 }
            if (r3 == 0) goto L_0x0404
            r2 = r26
            r10.A0Y = r2     // Catch:{ all -> 0x17c4 }
            goto L_0x0404
        L_0x04c5:
            X.7Bp r5 = r10.A0F     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r3.<init>(r11)     // Catch:{ all -> 0x17c4 }
            X.MbG r2 = new X.MbG     // Catch:{ all -> 0x17c4 }
            r2.<init>((X.C327637Bp) r5, (java.util.List) r3, (long) r0)     // Catch:{ all -> 0x17c4 }
            r0 = r32
            r0.add(r2)     // Catch:{ all -> 0x17c4 }
            r11.clear()     // Catch:{ all -> 0x17c4 }
            goto L_0x0402
        L_0x04db:
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x04eb
            X.MbG r2 = new X.MbG     // Catch:{ all -> 0x17c4 }
            r2.<init>((X.C327637Bp) r13, (java.util.List) r11, (long) r0)     // Catch:{ all -> 0x17c4 }
            r0 = r32
            r0.add(r2)     // Catch:{ all -> 0x17c4 }
        L_0x04eb:
            java.util.Iterator r5 = r32.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x04ef:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0516
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x17c4 }
            X.MbG r3 = (X.C66709MbG) r3     // Catch:{ all -> 0x17c4 }
            java.util.HashSet r2 = r4.A0v     // Catch:{ all -> 0x17c4 }
            long r0 = r3.A01     // Catch:{ all -> 0x17c4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x04ef
            r0 = r26
            A0D(r3, r4, r0)     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r3.A02     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x17c4 }
            r14.addAll(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x04ef
        L_0x0516:
            r0 = r16
            r0.removeAll(r14)     // Catch:{ all -> 0x17c4 }
        L_0x051b:
            if (r90 == 0) goto L_0x059f
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r10.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r12 = r19.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x0526:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0598
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x17c4 }
            X.7LQ r9 = (X.AnonymousClass7LQ) r9     // Catch:{ all -> 0x17c4 }
            X.7LP r7 = r4.A0K     // Catch:{ all -> 0x17c4 }
            if (r7 == 0) goto L_0x0854
            boolean r5 = r4.A0U     // Catch:{ all -> 0x17c4 }
            r0 = r26
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x17c4 }
            if (r5 != 0) goto L_0x0546
            X.3su r0 = r9.A0e     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.A2P     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0546
            goto L_0x0526
        L_0x0546:
            X.0mo r3 = r7.A01     // Catch:{ all -> 0x17c4 }
            int r2 = r3.A01     // Catch:{ all -> 0x17c4 }
            r1 = 0
        L_0x054b:
            if (r1 >= r2) goto L_0x0583
            java.lang.Object r0 = r3.A05(r1)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0 instanceof X.AnonymousClass7LQ     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0580
            java.lang.Object r11 = r3.A05(r1)     // Catch:{ all -> 0x17c4 }
            r0 = 26
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x17c4 }
            X.0qQ.A0C(r11, r0)     // Catch:{ all -> 0x17c4 }
            X.7LQ r11 = (X.AnonymousClass7LQ) r11     // Catch:{ all -> 0x17c4 }
            X.3su r0 = r11.A0e     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x17c4 }
            java.lang.String r11 = r0.A0g()     // Catch:{ all -> 0x17c4 }
            if (r11 == 0) goto L_0x0580
            java.lang.String r11 = r0.A0g()     // Catch:{ all -> 0x17c4 }
            X.3su r0 = r9.A0e     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r0.A0g()     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.0qQ.A0K(r11, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0580
            goto L_0x0526
        L_0x0580:
            int r1 = r1 + 1
            goto L_0x054b
        L_0x0583:
            X.3su r1 = r9.A0e     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r0 = r7.A00     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x17c4 }
            X.48T r2 = r7.A02     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.C3257974e.A00(r1, r2, r0, r5)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0526
            r10.add(r9)     // Catch:{ all -> 0x17c4 }
            goto L_0x0526
        L_0x0598:
            java.util.Collection r0 = X.0u4.A00(r19)     // Catch:{ all -> 0x17c4 }
            r0.removeAll(r10)     // Catch:{ all -> 0x17c4 }
        L_0x059f:
            X.9u2 r1 = r6.A00     // Catch:{ all -> 0x17c4 }
            java.lang.String r10 = ""
            if (r1 == 0) goto L_0x070f
            X.9oj r0 = X.C388999oj.A00     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0601
            A0H(r4)     // Catch:{ all -> 0x17c4 }
            X.7LP r0 = r4.A0K     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0854
            java.util.ArrayList r0 = r0.A00()     // Catch:{ all -> 0x17c4 }
            if (r89 != 0) goto L_0x05fb
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r1 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x17c4 }
        L_0x05c1:
            boolean r0 = r8.A09()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x05ed
            X.0eM r0 = r4.A0R     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            X.7So r0 = (X.C331837So) r0     // Catch:{ all -> 0x17c4 }
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            r8.A00()     // Catch:{ all -> 0x17c4 }
        L_0x05d5:
            java.util.HashSet r0 = r4.A0v     // Catch:{ all -> 0x17c4 }
            r0.clear()     // Catch:{ all -> 0x17c4 }
            java.util.HashSet r0 = r4.A0u     // Catch:{ all -> 0x17c4 }
            r0.clear()     // Catch:{ all -> 0x17c4 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r5.<init>()     // Catch:{ all -> 0x17c4 }
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            int r3 = r0.A01     // Catch:{ all -> 0x17c4 }
            r2 = 0
            goto L_0x06b5
        L_0x05ed:
            X.0mo r1 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            X.0eM r0 = r4.A0R     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            r1.A08(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x05d5
        L_0x05fb:
            r1 = r22
            r1.addAll(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x05c1
        L_0x0601:
            X.9ok r0 = X.C389009ok.A00     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0638
            A0G(r4)     // Catch:{ all -> 0x17c4 }
            X.7S7 r0 = r4.A0p     // Catch:{ all -> 0x17c4 }
            boolean r0 = r8.A0A(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x062a
            X.0eM r0 = r4.A0Q     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            X.7So r0 = (X.C331837So) r0     // Catch:{ all -> 0x17c4 }
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            r0 = r18
            java.util.regex.Pattern r1 = X.0mp.A00     // Catch:{ all -> 0x17c4 }
            if (r18 != 0) goto L_0x0626
            r0 = r10
        L_0x0626:
            r8.A05(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x05d5
        L_0x062a:
            X.0mo r1 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            X.0eM r0 = r4.A0Q     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            r1.A08(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x05d5
        L_0x0638:
            X.9ol r0 = X.C389019ol.A00     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x05d5
            A0G(r4)     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r0 = r4.A0g     // Catch:{ all -> 0x17c4 }
            X.2Ix r0 = X.2Ix.A00(r0)     // Catch:{ all -> 0x17c4 }
            r9 = 0
            java.lang.String r7 = "vanish_mode_thread"
            java.lang.String r5 = "vanish_mode_thread_seen"
            java.lang.String r3 = "upsell"
            X.0wc r2 = r0.A00     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "instagram_interop_upsell_and_upgrade_events"
            X.0kJ r0 = r2.A00     // Catch:{ all -> 0x17c4 }
            X.0Aj r2 = r2.A00(r0, r1)     // Catch:{ all -> 0x17c4 }
            r1 = 294(0x126, float:4.12E-43)
            X.1Ln r0 = new X.1Ln     // Catch:{ all -> 0x17c4 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "qp_source_upsell"
            r0.A0R(r1, r9)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "static_source_upsell"
            r0.A0R(r1, r7)     // Catch:{ all -> 0x17c4 }
            r1 = 1264(0x4f0, float:1.771E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x17c4 }
            r0.A0R(r1, r9)     // Catch:{ all -> 0x17c4 }
            r1 = 1266(0x4f2, float:1.774E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x17c4 }
            r0.A0R(r1, r9)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "event_type"
            r0.A0R(r1, r3)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "impression_duration_ms"
            r0.A0Q(r1, r9)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "event_name"
            r0.A0R(r1, r5)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "total_videos_seen"
            r0.A0Q(r1, r9)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "interstitial_type"
            r0.A0R(r1, r9)     // Catch:{ all -> 0x17c4 }
            r0.Cgf()     // Catch:{ all -> 0x17c4 }
            android.content.Context r3 = r4.A00     // Catch:{ all -> 0x17c4 }
            java.lang.String r33 = "context"
            if (r3 == 0) goto L_0x0854
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x17c4 }
            int r0 = X.2Yu.A0D(r3)     // Catch:{ all -> 0x17c4 }
            int r1 = r3.getColor(r0)     // Catch:{ all -> 0x17c4 }
            X.7O7 r0 = new X.7O7     // Catch:{ all -> 0x17c4 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x17c4 }
            r4.A08 = r0     // Catch:{ all -> 0x17c4 }
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x05d5
        L_0x06b5:
            if (r2 >= r3) goto L_0x06cc
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r1 = r0.A05(r2)     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1 instanceof X.N88     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x06c9
            r5.add(r1)     // Catch:{ all -> 0x17c4 }
        L_0x06c9:
            int r2 = r2 + 1
            goto L_0x06b5
        L_0x06cc:
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x06d0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x06e2
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x17c4 }
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            r0.A08(r1)     // Catch:{ all -> 0x17c4 }
            goto L_0x06d0
        L_0x06e2:
            X.0sa r1 = r8.A07     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r1.invoke()     // Catch:{ all -> 0x17c4 }
            X.7Zg r0 = (X.C333517Zg) r0     // Catch:{ all -> 0x17c4 }
            X.7S9 r0 = r0.AvL()     // Catch:{ all -> 0x17c4 }
            r0.EIQ(r15)     // Catch:{ all -> 0x17c4 }
            X.0sa r0 = r8.A0D     // Catch:{ all -> 0x17c4 }
            r0.invoke()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r1.invoke()     // Catch:{ all -> 0x17c4 }
            X.7Zg r0 = (X.C333517Zg) r0     // Catch:{ all -> 0x17c4 }
            X.7S9 r1 = r0.AvL()     // Catch:{ all -> 0x17c4 }
            X.0sa r0 = r8.A0M     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x17c4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x17c4 }
            r1.FKh(r0)     // Catch:{ all -> 0x17c4 }
        L_0x070f:
            boolean r0 = r6.A04     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0790
            boolean r1 = r8.A09()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0790
            X.0eM r0 = r4.A0R     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            X.7So r0 = (X.C331837So) r0     // Catch:{ all -> 0x17c4 }
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            r8.A00()     // Catch:{ all -> 0x17c4 }
        L_0x0727:
            r4.EEb()     // Catch:{ all -> 0x17c4 }
        L_0x072a:
            X.7S7 r0 = r4.A0p     // Catch:{ all -> 0x17c4 }
            r77 = r0
            com.instagram.common.session.UserSession r11 = r8.A02     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.C308556Us.A0S(r11, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x077a
            X.0eM r0 = r4.A0P     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            X.7So r0 = (X.C331837So) r0     // Catch:{ all -> 0x17c4 }
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            X.1Av r0 = X.1Au.A00(r11)     // Catch:{ all -> 0x17c4 }
            X.0xa r3 = r0.A01     // Catch:{ all -> 0x17c4 }
            X.0xY r2 = r3.AR4()     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "direct_dm_mode_display_count"
            int r0 = r3.getInt(r1, r15)     // Catch:{ all -> 0x17c4 }
            int r0 = r0 + 1
            r2.E5Z(r1, r0)     // Catch:{ all -> 0x17c4 }
            r2.apply()     // Catch:{ all -> 0x17c4 }
            X.0xY r3 = r3.AR4()     // Catch:{ all -> 0x17c4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            java.lang.String r2 = "direct_dm_mode_seen_timestamp_ms"
            r3.E5c(r2, r0)     // Catch:{ all -> 0x17c4 }
            r3.apply()     // Catch:{ all -> 0x17c4 }
        L_0x0769:
            X.0sa r0 = r8.A0A     // Catch:{ all -> 0x17c4 }
            r0.invoke()     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            boolean r2 = r0.A1C     // Catch:{ all -> 0x17c4 }
            r0 = r78
            boolean r1 = r0.A1C     // Catch:{ all -> 0x17c4 }
            r0 = 0
            if (r2 == r1) goto L_0x07b2
            goto L_0x07b1
        L_0x077a:
            r0 = r78
            X.4li r0 = r0.A0N     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.A08     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0769
            X.0mo r1 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            X.0eM r0 = r4.A0P     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            r1.A08(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x0769
        L_0x0790:
            if (r0 != 0) goto L_0x0727
            X.7S7 r0 = r4.A0p     // Catch:{ all -> 0x17c4 }
            boolean r0 = r8.A0A(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x072a
            X.0eM r0 = r4.A0Q     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x17c4 }
            X.7So r0 = (X.C331837So) r0     // Catch:{ all -> 0x17c4 }
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            r0 = r18
            java.util.regex.Pattern r1 = X.0mp.A00     // Catch:{ all -> 0x17c4 }
            if (r18 != 0) goto L_0x07ac
            r0 = r10
        L_0x07ac:
            r8.A05(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x072a
        L_0x07b1:
            r0 = 1
        L_0x07b2:
            r1 = r78
            r2 = r16
            r8.A03(r1, r2, r0)     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            X.4li r0 = r0.A0N     // Catch:{ all -> 0x17c4 }
            boolean r2 = r0.A08     // Catch:{ all -> 0x17c4 }
            X.4li r1 = r1.A0N     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1.A08     // Catch:{ all -> 0x17c4 }
            if (r2 == r0) goto L_0x07d0
            com.instagram.common.session.UserSession r2 = r4.A0g     // Catch:{ all -> 0x17c4 }
            r0 = r78
            boolean r0 = X.C308556Us.A08(r2, r0)     // Catch:{ all -> 0x17c4 }
            r8.A08(r0)     // Catch:{ all -> 0x17c4 }
        L_0x07d0:
            X.7SD r2 = r4.A0H     // Catch:{ all -> 0x17c4 }
            int r0 = r2.A07     // Catch:{ all -> 0x17c4 }
            r3 = 7
            if (r0 != r3) goto L_0x0dc3
            r0 = r78
            int r0 = r0.A07     // Catch:{ all -> 0x17c4 }
            if (r0 != r3) goto L_0x0dc3
            boolean r3 = r2.A0n     // Catch:{ all -> 0x17c4 }
            r0 = r78
            boolean r0 = r0.A0n     // Catch:{ all -> 0x17c4 }
            if (r3 != r0) goto L_0x0dc3
            boolean r3 = r2.A10     // Catch:{ all -> 0x17c4 }
            r0 = r78
            boolean r0 = r0.A10     // Catch:{ all -> 0x17c4 }
            if (r3 != r0) goto L_0x0dc3
            boolean r3 = r2.A0z     // Catch:{ all -> 0x17c4 }
            r0 = r78
            boolean r0 = r0.A0z     // Catch:{ all -> 0x17c4 }
            if (r3 != r0) goto L_0x0dc3
            X.914 r2 = r2.A0M     // Catch:{ all -> 0x17c4 }
            r0 = r78
            X.914 r0 = r0.A0M     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.0qQ.A0K(r2, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0dc3
        L_0x0801:
            r0 = r78
            r8.A02(r0)     // Catch:{ all -> 0x17c4 }
            X.7SD r2 = r4.A0H     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.0qQ.A0K(r2, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x08a7
            X.7OW r2 = X.AnonymousClass7OW.THREAD_METADATA_UPDATE     // Catch:{ all -> 0x17c4 }
            X.0sP r0 = r2.A00     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r5 = r4.A0g     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.invoke(r5)     // Catch:{ all -> 0x17c4 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x083e
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            X.4li r0 = r0.A0N     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x083e
            r0 = 34
            X.Ay7 r1 = new X.Ay7     // Catch:{ all -> 0x17c4 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x17c4 }
            java.lang.Class<X.7BU> r0 = X.AnonymousClass7BU.class
            java.lang.Object r1 = r5.A01(r0, r1)     // Catch:{ all -> 0x17c4 }
            X.7BU r1 = (X.AnonymousClass7BU) r1     // Catch:{ all -> 0x17c4 }
            r0 = r78
            r1.A00(r2, r0)     // Catch:{ all -> 0x17c4 }
        L_0x083e:
            r0 = r78
            r4.A0H = r0     // Catch:{ all -> 0x17c4 }
            X.7Qa r0 = r4.A04     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0866
            r0 = r78
            boolean r0 = X.C308556Us.A07(r5, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0866
            android.content.Context r3 = r4.A00     // Catch:{ all -> 0x17c4 }
            if (r3 != 0) goto L_0x0859
            java.lang.String r33 = "context"
        L_0x0854:
            X.0qQ.A0F(r33)     // Catch:{ all -> 0x17c4 }
            goto L_0x0dca
        L_0x0859:
            com.instagram.user.model.User r2 = r4.A0q     // Catch:{ all -> 0x17c4 }
            X.7QY r1 = X.AnonymousClass7QX.A00(r5)     // Catch:{ all -> 0x17c4 }
            X.7Qa r0 = new X.7Qa     // Catch:{ all -> 0x17c4 }
            r0.<init>(r3, r5, r1, r2)     // Catch:{ all -> 0x17c4 }
            r4.A04 = r0     // Catch:{ all -> 0x17c4 }
        L_0x0866:
            X.7LL r1 = r4.A05     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x086d
            java.lang.String r33 = "sortedListComparator"
            goto L_0x0854
        L_0x086d:
            r0 = r78
            int r0 = r0.A08     // Catch:{ all -> 0x17c4 }
            r1.A00 = r0     // Catch:{ all -> 0x17c4 }
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            r0.A06()     // Catch:{ all -> 0x17c4 }
            r3 = 0
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            int r2 = r0.A01     // Catch:{ all -> 0x17c4 }
        L_0x0881:
            if (r3 >= r2) goto L_0x08a0
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r1 = r0.A05(r3)     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x17c4 }
            X.7So r1 = (X.C331837So) r1     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1 instanceof X.AnonymousClass7LQ     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x089d
            X.7LQ r1 = (X.AnonymousClass7LQ) r1     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            r1.A0G = r0     // Catch:{ all -> 0x17c4 }
            r4.A0W(r1, r3)     // Catch:{ all -> 0x17c4 }
        L_0x089d:
            int r3 = r3 + 1
            goto L_0x0881
        L_0x08a0:
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            r0.A07()     // Catch:{ all -> 0x17c4 }
        L_0x08a7:
            if (r17 == 0) goto L_0x08bb
            r0 = r25
            java.lang.String r1 = r0.A1u     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r0 = r4.A0g     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x08bb
            r0 = r26
            r4.A0V = r0     // Catch:{ all -> 0x17c4 }
        L_0x08bb:
            com.instagram.common.session.UserSession r12 = r4.A0g     // Catch:{ all -> 0x17c4 }
            X.0Tu r24 = X.0Tu.A05     // Catch:{ all -> 0x17c4 }
            r0 = 2342168300710540112(0x20810da900083350, double:4.070072620697844E-152)
            r2 = r24
            boolean r0 = X.182.A06(r2, r12, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0a43
            X.7SD r1 = r4.A0H     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1.A0r     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0b5b
            java.util.List r0 = r1.A0b     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0b5b
            r0 = 36328688815455767(0x8110c000003e17, double:3.0377473185579696E-306)
            boolean r0 = X.182.A06(r2, r12, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0982
            X.4A0 r6 = X.C2615449z.A00(r12)     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r0.A0b     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0     // Catch:{ all -> 0x17c4 }
            java.lang.String r5 = r0.getId()     // Catch:{ all -> 0x17c4 }
            monitor-enter(r6)     // Catch:{ all -> 0x17c4 }
            X.1OC r0 = r6.A03     // Catch:{ all -> 0x16c1 }
            if (r0 != 0) goto L_0x0981
            com.instagram.common.session.UserSession r3 = r6.A07     // Catch:{ all -> 0x16c1 }
            X.1Av r0 = X.1Au.A00(r3)     // Catch:{ all -> 0x16c1 }
            boolean r0 = r0.A21()     // Catch:{ all -> 0x16c1 }
            if (r0 == 0) goto L_0x0981
            java.lang.Class<X.9V9> r1 = X.AnonymousClass9V9.class
            X.9V8 r0 = new X.9V8     // Catch:{ all -> 0x16c1 }
            r0.<init>(r3)     // Catch:{ all -> 0x16c1 }
            java.lang.Object r0 = r3.A01(r1, r0)     // Catch:{ all -> 0x16c1 }
            X.9V9 r0 = (X.AnonymousClass9V9) r0     // Catch:{ all -> 0x16c1 }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x16c1 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x16c1 }
            if (r0 != 0) goto L_0x0981
            X.2HN r0 = X.2HM.A00(r3)     // Catch:{ all -> 0x16c1 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x16c1 }
            if (r0 == 0) goto L_0x0934
            X.0nO r1 = X.0nY.A00()     // Catch:{ all -> 0x16c1 }
            X.NS8 r0 = new X.NS8     // Catch:{ all -> 0x16c1 }
            r0.<init>(r6, r5)     // Catch:{ all -> 0x16c1 }
            r1.ATE(r0)     // Catch:{ all -> 0x16c1 }
            goto L_0x0981
        L_0x0934:
            r0 = 36609631216736135(0x82104400081787, double:3.2154164243919224E-306)
            long r31 = X.182.A01(r2, r3, r0)     // Catch:{ all -> 0x16c1 }
            r29 = 0
            int r0 = (r31 > r29 ? 1 : (r31 == r29 ? 0 : -1))
            if (r0 <= 0) goto L_0x095c
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x16c1 }
            java.util.Map r1 = r6.A09     // Catch:{ all -> 0x16c1 }
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x16c1 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x16c1 }
            if (r0 == 0) goto L_0x0955
            long r29 = r0.longValue()     // Catch:{ all -> 0x16c1 }
        L_0x0955:
            long r9 = r13 - r29
            int r0 = (r9 > r31 ? 1 : (r9 == r31 ? 0 : -1))
            if (r0 < 0) goto L_0x0981
            goto L_0x0966
        L_0x095c:
            java.lang.String[] r0 = new java.lang.String[]{r5}     // Catch:{ all -> 0x16c1 }
            X.1OC r2 = X.AnonymousClass4A0.A00(r3, r0)     // Catch:{ all -> 0x16c1 }
            r1 = 0
            goto L_0x097c
        L_0x0966:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x16c1 }
            r1.put(r5, r0)     // Catch:{ all -> 0x16c1 }
            java.lang.String[] r0 = new java.lang.String[]{r5}     // Catch:{ all -> 0x16c1 }
            X.1OC r2 = X.AnonymousClass4A0.A00(r3, r0)     // Catch:{ all -> 0x16c1 }
            r0 = 8
            X.Iw3 r1 = new X.Iw3     // Catch:{ all -> 0x16c1 }
            r1.<init>(r5, r6, r0)     // Catch:{ all -> 0x16c1 }
        L_0x097c:
            r0 = r26
            X.AnonymousClass4A0.A01(r2, r6, r1, r15, r0)     // Catch:{ all -> 0x16c1 }
        L_0x0981:
            monitor-exit(r6)     // Catch:{ all -> 0x17c4 }
        L_0x0982:
            X.C250993mO.A01(r12)     // Catch:{ all -> 0x17c4 }
            X.3mS r1 = X.C251033mS.A00(r12)     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r0.A0b     // Catch:{ all -> 0x17c4 }
            boolean r3 = X.C250993mO.A05(r1, r0)     // Catch:{ all -> 0x17c4 }
            X.3FW r2 = new X.3FW     // Catch:{ all -> 0x17c4 }
            r2.<init>(r12)     // Catch:{ all -> 0x17c4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            boolean r0 = r2.A07(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x09ab
            if (r3 != 0) goto L_0x09bc
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x17c4 }
            r3 = 0
            java.lang.String r5 = "sender_in_qm_only"
            goto L_0x09ca
        L_0x09ab:
            if (r3 == 0) goto L_0x0b5b
            java.lang.Integer r6 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r0.A0b     // Catch:{ all -> 0x17c4 }
            java.lang.Object r3 = r0.get(r15)     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3     // Catch:{ all -> 0x17c4 }
            java.lang.String r5 = "reciver_in_qm_only"
            goto L_0x09ca
        L_0x09bc:
            java.lang.Integer r6 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r0.A0b     // Catch:{ all -> 0x17c4 }
            java.lang.Object r3 = r0.get(r15)     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3     // Catch:{ all -> 0x17c4 }
            java.lang.String r5 = "sender_and_reciver_in_qm"
        L_0x09ca:
            boolean r0 = r4.A0V     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0b42
            X.7SD r9 = r4.A0H     // Catch:{ all -> 0x17c4 }
            int r7 = r6.intValue()     // Catch:{ all -> 0x17c4 }
            r2 = 4
            X.0Tu r10 = X.0Tu.A06     // Catch:{ all -> 0x17c4 }
            r0 = 36606766473680363(0x820da9000a15eb, double:3.213604749348058E-306)
            long r0 = X.182.A01(r10, r12, r0)     // Catch:{ all -> 0x17c4 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x17c4 }
            long r29 = r10.toMillis(r0)     // Catch:{ all -> 0x17c4 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            if (r7 == r2) goto L_0x0a25
            X.3t3 r0 = r9.A0P     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0a3a
            X.4kA r1 = X.AnonymousClass4k9.A00(r12)     // Catch:{ all -> 0x17c4 }
            java.lang.String r9 = X.C395179zL.A00(r6)     // Catch:{ all -> 0x17c4 }
            X.3t0 r0 = X.C300965yF.A01(r0)     // Catch:{ all -> 0x17c4 }
            java.lang.String r7 = r0.A00     // Catch:{ all -> 0x17c4 }
            r0 = r26
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x17c4 }
            X.0xa r2 = r1.A00     // Catch:{ all -> 0x17c4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x17c4 }
            r1.<init>()     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = "preference_quiet_mode_nudge_last_seen_timestamp_"
            r1.append(r0)     // Catch:{ all -> 0x17c4 }
            r1.append(r9)     // Catch:{ all -> 0x17c4 }
            r0 = 95
            r1.append(r0)     // Catch:{ all -> 0x17c4 }
        L_0x0a17:
            r1.append(r7)     // Catch:{ all -> 0x17c4 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x17c4 }
            r0 = 0
            long r0 = r2.getLong(r7, r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x0a3c
        L_0x0a25:
            X.4kA r0 = X.AnonymousClass4k9.A00(r12)     // Catch:{ all -> 0x17c4 }
            java.lang.String r7 = X.C395179zL.A00(r6)     // Catch:{ all -> 0x17c4 }
            X.0xa r2 = r0.A00     // Catch:{ all -> 0x17c4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x17c4 }
            r1.<init>()     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = "preference_quiet_mode_nudge_last_seen_timestamp_"
            r1.append(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x0a17
        L_0x0a3a:
            r0 = 0
        L_0x0a3c:
            long r13 = r13 - r0
            int r0 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b42
            goto L_0x0b5b
        L_0x0a43:
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r0.A0b     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0b5b
            X.C250993mO.A01(r12)     // Catch:{ all -> 0x17c4 }
            X.3mS r1 = X.C251033mS.A00(r12)     // Catch:{ all -> 0x17c4 }
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r0.A0b     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.C250993mO.A05(r1, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x0b5b
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            long r1 = X.AnonymousClass2SF.A00     // Catch:{ all -> 0x17c4 }
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a73
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0a73
            long r5 = r5 - r1
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r5 / r0
        L_0x0a73:
            X.0Tu r2 = X.0Tu.A06     // Catch:{ all -> 0x17c4 }
            r0 = 36604095003563014(0x820b3b00031406, double:3.2119153008886996E-306)
            long r5 = X.182.A01(r2, r12, r0)     // Catch:{ all -> 0x17c4 }
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0b5b
            r0 = 36604095003497477(0x820b3b00021405, double:3.211915300847254E-306)
            long r29 = X.182.A01(r2, r12, r0)     // Catch:{ all -> 0x17c4 }
            r0 = 36604095003431940(0x820b3b00011404, double:3.211915300805808E-306)
            long r5 = X.182.A01(r2, r12, r0)     // Catch:{ all -> 0x17c4 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r0
            long r9 = X.C280074zx.A00()     // Catch:{ all -> 0x17c4 }
            long r9 = r9 / r0
            long r29 = r29 + r9
            long r9 = r9 + r5
            r5 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r0 >= 0) goto L_0x0aac
            long r29 = r29 - r5
        L_0x0aac:
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0ab3
            long r29 = r29 + r5
            long r9 = r9 + r5
        L_0x0ab3:
            int r0 = (r29 > r13 ? 1 : (r29 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0b5b
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0b5b
            r0 = 36322620026661161(0x810b3b00002929, double:3.03390939208721E-306)
            r3 = r24
            boolean r0 = X.182.A06(r3, r12, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0b5b
            X.3FW r0 = new X.3FW     // Catch:{ all -> 0x17c4 }
            r0.<init>(r12)     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r0 = r0.A01     // Catch:{ all -> 0x17c4 }
            boolean r0 = r0.A1Z()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0b34
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x17c4 }
        L_0x0ad7:
            r0 = 36604095003628551(0x820b3b00041407, double:3.2119153009301455E-306)
            long r0 = X.182.A01(r2, r12, r0)     // Catch:{ all -> 0x17c4 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x17c4 }
            long r9 = r2.toMillis(r0)     // Catch:{ all -> 0x17c4 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            X.4kA r0 = X.AnonymousClass4k9.A00(r12)     // Catch:{ all -> 0x17c4 }
            X.0xa r5 = r0.A00     // Catch:{ all -> 0x17c4 }
            r0 = 3137(0xc41, float:4.396E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x17c4 }
            r0 = 0
            long r0 = r5.getLong(r2, r0)     // Catch:{ all -> 0x17c4 }
            long r6 = r6 - r0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0b5b
            r1 = 0
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            X.EGh r0 = A07(r4, r0, r1, r3)     // Catch:{ all -> 0x17c4 }
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            X.3FW r3 = new X.3FW     // Catch:{ all -> 0x17c4 }
            r3.<init>(r12)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "quiet_mode"
            X.0xG r0 = new X.0xG     // Catch:{ all -> 0x17c4 }
            r0.<init>(r1)     // Catch:{ all -> 0x17c4 }
            X.DcM r2 = X.F8V.A00(r0, r12)     // Catch:{ all -> 0x17c4 }
            X.2Aq r0 = X.2Aq.A03(r12)     // Catch:{ all -> 0x17c4 }
            long r0 = r0.A0O()     // Catch:{ all -> 0x17c4 }
            X.F10 r1 = r3.A03(r0)     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r0 = r3.A01     // Catch:{ all -> 0x17c4 }
            boolean r3 = r0.A1Z()     // Catch:{ all -> 0x17c4 }
            r0 = 1276(0x4fc, float:1.788E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x0b37
        L_0x0b34:
            java.lang.Integer r3 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x17c4 }
            goto L_0x0ad7
        L_0x0b37:
            if (r3 == 0) goto L_0x0b3c
            java.lang.String r3 = "ig_direct_awareness_nudge_shown"
            goto L_0x0b3e
        L_0x0b3c:
            java.lang.String r3 = "ig_direct_awareness_nudge_shown_with_upsell"
        L_0x0b3e:
            X.DcM.A03(r2, r1, r3, r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x0b5b
        L_0x0b42:
            X.7SD r0 = r4.A0H     // Catch:{ all -> 0x17c4 }
            X.EGh r1 = A07(r4, r0, r3, r6)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r4.A0V     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x0c89
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x17c4 }
            if (r6 == r0) goto L_0x0b54
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x17c4 }
            if (r6 != r0) goto L_0x0c89
        L_0x0b54:
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            r0.A08(r1)     // Catch:{ all -> 0x17c4 }
        L_0x0b5b:
            X.0sa r0 = r8.A07     // Catch:{ all -> 0x17c4 }
            r76 = r0
            java.lang.Object r1 = r76.invoke()     // Catch:{ all -> 0x17c4 }
            X.7Zg r1 = (X.C333517Zg) r1     // Catch:{ all -> 0x17c4 }
            X.9Gx r0 = X.C376179Gx.PSEUDO_INSTANT_REPLIES_IN_COMPOSER     // Catch:{ all -> 0x17c4 }
            boolean r2 = r1.AH1(r0)     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0dd0
            X.0sa r0 = r8.A0F     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x17c4 }
            X.7SM r0 = (X.AnonymousClass7SM) r0     // Catch:{ all -> 0x17c4 }
            X.7S7 r1 = r1.C6l()     // Catch:{ all -> 0x17c4 }
            X.2Ep r10 = r1.Cms()     // Catch:{ all -> 0x17c4 }
            if (r10 == 0) goto L_0x16c4
            X.9H7 r0 = r0.A00     // Catch:{ all -> 0x17c4 }
            X.0eM r1 = r0.A1Z     // Catch:{ all -> 0x17c4 }
            java.lang.Object r9 = r1.getValue()     // Catch:{ all -> 0x17c4 }
            X.7Gh r9 = (X.C328807Gh) r9     // Catch:{ all -> 0x17c4 }
            boolean r1 = r9.A09     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0bf1
            com.instagram.common.session.UserSession r7 = r9.A08     // Catch:{ all -> 0x17c4 }
            X.34S r6 = X.AnonymousClass48N.A00(r7, r10)     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r1 = r10.BZK()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0c86
            java.lang.String r1 = r1.getShortName()     // Catch:{ all -> 0x17c4 }
        L_0x0b9d:
            r9.A03 = r1     // Catch:{ all -> 0x17c4 }
            com.instagram.common.ui.base.IgTextView r5 = r9.A01     // Catch:{ all -> 0x17c4 }
            if (r5 == 0) goto L_0x0bbf
            android.content.Context r1 = r9.A06     // Catch:{ all -> 0x17c4 }
            android.content.res.Resources r3 = r1.getResources()     // Catch:{ all -> 0x17c4 }
            r2 = 2131964425(0x7f133209, float:1.9565631E38)
            java.lang.String r1 = r9.A03     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0bb2
            java.lang.String r1 = ""
        L_0x0bb2:
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ all -> 0x17c4 }
            android.text.Spanned r2 = X.0bC.A01(r3, r1, r2)     // Catch:{ all -> 0x17c4 }
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE     // Catch:{ all -> 0x17c4 }
            r5.setText(r2, r1)     // Catch:{ all -> 0x17c4 }
        L_0x0bbf:
            com.instagram.common.ui.base.IgTextView r3 = r9.A01     // Catch:{ all -> 0x17c4 }
            if (r3 == 0) goto L_0x0bd3
            X.4DH r1 = r9.A07     // Catch:{ all -> 0x17c4 }
            android.content.Context r2 = r1.requireContext()     // Catch:{ all -> 0x17c4 }
            r1 = 2131100377(0x7f0602d9, float:1.7813134E38)
            int r1 = r2.getColor(r1)     // Catch:{ all -> 0x17c4 }
            r3.setTextColor(r1)     // Catch:{ all -> 0x17c4 }
        L_0x0bd3:
            java.lang.Object r3 = r6.A00     // Catch:{ all -> 0x17c4 }
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3     // Catch:{ all -> 0x17c4 }
            r9.A00 = r3     // Catch:{ all -> 0x17c4 }
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r5 = r9.A02     // Catch:{ all -> 0x17c4 }
            if (r5 == 0) goto L_0x0bf1
            X.0eE r1 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r1 = r1.A01(r7)     // Catch:{ all -> 0x17c4 }
            com.instagram.common.typedurl.ImageUrl r6 = r1.Bh3()     // Catch:{ all -> 0x17c4 }
            java.lang.String r2 = "direct_thread_toggle"
            X.0xG r1 = new X.0xG     // Catch:{ all -> 0x17c4 }
            r1.<init>(r2)     // Catch:{ all -> 0x17c4 }
            r5.setUrls(r3, r6, r1)     // Catch:{ all -> 0x17c4 }
        L_0x0bf1:
            X.7Hl r6 = X.AnonymousClass9H7.A06(r0)     // Catch:{ all -> 0x17c4 }
            java.lang.String r2 = r6.A21     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0d12
            java.lang.String r1 = "birthday_users_list"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0c09
            java.lang.String r1 = "celebrate_birthday_bottomsheet"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0d12
        L_0x0c09:
            boolean r1 = r6.A27     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0d12
            boolean r1 = r6.A1C     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0d12
            android.content.Context r1 = r6.A1R     // Catch:{ all -> 0x17c4 }
            android.content.res.Resources r2 = r1.getResources()     // Catch:{ all -> 0x17c4 }
            r1 = 2131958649(0x7f131b79, float:1.9553916E38)
            java.lang.String r5 = r2.getString(r1)     // Catch:{ all -> 0x17c4 }
            X.A7C r1 = r6.A0T     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0c38
            android.widget.FrameLayout r7 = r6.A07     // Catch:{ all -> 0x17c4 }
            android.content.Context r1 = r7.getContext()     // Catch:{ all -> 0x17c4 }
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r1)     // Catch:{ all -> 0x17c4 }
            X.A5Q r2 = new X.A5Q     // Catch:{ all -> 0x17c4 }
            r2.<init>(r6, r5)     // Catch:{ all -> 0x17c4 }
            X.A7C r1 = new X.A7C     // Catch:{ all -> 0x17c4 }
            r1.<init>(r3, r7, r2)     // Catch:{ all -> 0x17c4 }
            r6.A0T = r1     // Catch:{ all -> 0x17c4 }
        L_0x0c38:
            com.instagram.common.session.UserSession r7 = r6.A1Z     // Catch:{ all -> 0x17c4 }
            r1 = 36319510470401480(0x81086700011dc8, double:3.0319428961874094E-306)
            r3 = r24
            boolean r1 = X.182.A06(r3, r7, r1)     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0d0e
            X.A7C r9 = r6.A0T     // Catch:{ all -> 0x17c4 }
            X.0qQ.A0B(r5, r15)     // Catch:{ all -> 0x17c4 }
            android.view.View r2 = r9.A03     // Catch:{ all -> 0x17c4 }
            r1 = 2131441697(0x7f0b3821, float:1.8505413E38)
            android.view.View r3 = r2.findViewById(r1)     // Catch:{ all -> 0x17c4 }
            boolean r1 = r3 instanceof android.view.ViewStub     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0c80
            android.view.ViewStub r3 = (android.view.ViewStub) r3     // Catch:{ all -> 0x17c4 }
            r1 = 2131625116(0x7f0e049c, float:1.887743E38)
            r3.setLayoutResource(r1)     // Catch:{ all -> 0x17c4 }
            android.view.View r3 = r3.inflate()     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r3, r1)     // Catch:{ all -> 0x17c4 }
        L_0x0c6a:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ all -> 0x17c4 }
        L_0x0c6c:
            r9.A00 = r3     // Catch:{ all -> 0x17c4 }
            android.widget.LinearLayout r1 = r9.A01     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0cc3
            android.view.LayoutInflater r2 = r9.A02     // Catch:{ all -> 0x17c4 }
            r1 = 2131625115(0x7f0e049b, float:1.8877429E38)
            android.view.View r1 = r2.inflate(r1, r3)     // Catch:{ all -> 0x17c4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ all -> 0x17c4 }
            r9.A01 = r1     // Catch:{ all -> 0x17c4 }
            goto L_0x0cc0
        L_0x0c80:
            boolean r1 = r3 instanceof android.view.ViewGroup     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0c6a
            r3 = 0
            goto L_0x0c6c
        L_0x0c86:
            r1 = 0
            goto L_0x0b9d
        L_0x0c89:
            A0K(r4, r1)     // Catch:{ all -> 0x17c4 }
            r0 = 0
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r12)     // Catch:{ all -> 0x17c4 }
            java.lang.String r6 = "quiet_mode_dm_nudges"
            java.lang.String r3 = "impression"
            java.lang.String r1 = "igwb_problematic_use_events"
            X.0kJ r0 = r2.A00     // Catch:{ all -> 0x17c4 }
            X.0Aj r2 = r2.A00(r0, r1)     // Catch:{ all -> 0x17c4 }
            r1 = 279(0x117, float:3.91E-43)
            X.1Ln r0 = new X.1Ln     // Catch:{ all -> 0x17c4 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x17c4 }
            X.0Aj r1 = r0.A00     // Catch:{ all -> 0x17c4 }
            boolean r1 = r1.isSampled()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0b5b
            java.lang.String r1 = "event_type"
            r0.A0R(r1, r3)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "screen"
            r0.A0R(r1, r6)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "step"
            r0.A0R(r1, r5)     // Catch:{ all -> 0x17c4 }
            r0.Cgf()     // Catch:{ all -> 0x17c4 }
            goto L_0x0b5b
        L_0x0cc0:
            if (r1 != 0) goto L_0x0cc3
            goto L_0x0d04
        L_0x0cc3:
            r2 = 2131441698(0x7f0b3822, float:1.8505415E38)
            android.view.View r7 = r1.findViewById(r2)     // Catch:{ all -> 0x17c4 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x17c4 }
            if (r7 == 0) goto L_0x0d0e
            r7.setText(r5)     // Catch:{ all -> 0x17c4 }
            android.content.Context r1 = r7.getContext()     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x17c4 }
            X.U0p r3 = new X.U0p     // Catch:{ all -> 0x17c4 }
            r3.<init>(r1)     // Catch:{ all -> 0x17c4 }
            android.content.res.Resources r2 = r1.getResources()     // Catch:{ all -> 0x17c4 }
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r1 = r2.getDimensionPixelOffset(r1)     // Catch:{ all -> 0x17c4 }
            float r2 = (float) r1     // Catch:{ all -> 0x17c4 }
            float r1 = r3.A00     // Catch:{ all -> 0x17c4 }
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0cf8
            r3.A00 = r2     // Catch:{ all -> 0x17c4 }
            r1 = r26
            r3.A05 = r1     // Catch:{ all -> 0x17c4 }
            r3.invalidateSelf()     // Catch:{ all -> 0x17c4 }
        L_0x0cf8:
            r7.setBackground(r3)     // Catch:{ all -> 0x17c4 }
            X.ANY r1 = new X.ANY     // Catch:{ all -> 0x17c4 }
            r1.<init>(r9, r5)     // Catch:{ all -> 0x17c4 }
            X.AnonymousClass0fU.A00(r1, r7)     // Catch:{ all -> 0x17c4 }
            goto L_0x0d0e
        L_0x0d04:
            r1 = 0
            r9.A01 = r1     // Catch:{ all -> 0x17c4 }
            android.view.ViewGroup r1 = r9.A00     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0d0e
            r1.removeAllViews()     // Catch:{ all -> 0x17c4 }
        L_0x0d0e:
            r1 = r26
            r6.A1C = r1     // Catch:{ all -> 0x17c4 }
        L_0x0d12:
            com.instagram.common.session.UserSession r5 = r0.A10     // Catch:{ all -> 0x17c4 }
            r1 = 36318058774075208(0x81071500291748, double:3.031024837585163E-306)
            r3 = r24
            boolean r1 = X.182.A06(r3, r5, r1)     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x0db3
            X.4DH r9 = r0.A0u     // Catch:{ all -> 0x17c4 }
            android.os.Bundle r2 = r9.requireArguments()     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_SOURCE_MEDIA_ID"
            r3 = 0
            java.lang.String r35 = r2.getString(r1, r3)     // Catch:{ all -> 0x17c4 }
            android.os.Bundle r2 = r9.requireArguments()     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET"
            boolean r34 = r2.getBoolean(r1, r15)     // Catch:{ all -> 0x17c4 }
            android.os.Bundle r6 = r0.A0r     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "bundle_extra_is_navigating_from_ctd_ad"
            boolean r13 = r6.getBoolean(r1)     // Catch:{ all -> 0x17c4 }
            X.9HC r1 = r0.A1H     // Catch:{ all -> 0x17c4 }
            X.7S4 r7 = new X.7S4     // Catch:{ all -> 0x17c4 }
            r7.<init>(r5, r1)     // Catch:{ all -> 0x17c4 }
            java.lang.String r2 = r10.C6C()     // Catch:{ all -> 0x17c4 }
            X.3U9 r1 = X.AnonymousClass9H7.A05(r0)     // Catch:{ all -> 0x17c4 }
            X.7SD r1 = r7.A00(r1, r2, r15)     // Catch:{ all -> 0x17c4 }
            boolean r1 = r1.A0o     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0d74
            r1 = 36319398805380350(0x81084d00401cfe, double:3.031872278778408E-306)
            r7 = r24
            boolean r1 = X.182.A06(r7, r5, r1)     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0d74
            X.7TI r1 = X.AnonymousClass9H7.A01(r0)     // Catch:{ all -> 0x17c4 }
            androidx.fragment.app.FragmentActivity r30 = r9.requireActivity()     // Catch:{ all -> 0x17c4 }
            X.7Zg r2 = r1.A08     // Catch:{ all -> 0x17c4 }
            if (r2 != 0) goto L_0x0d9e
            java.lang.String r33 = "clientInfra"
            goto L_0x0854
        L_0x0d74:
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CTD_AD_WELCOME_MESSAGE"
            java.lang.String r36 = r6.getString(r1)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CTD_AD_ICEBREAKERS"
            java.util.ArrayList r1 = r6.getStringArrayList(r1)     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0d86
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x17c4 }
        L_0x0d86:
            X.7Hl r29 = X.AnonymousClass9H7.A06(r0)     // Catch:{ all -> 0x17c4 }
            androidx.fragment.app.FragmentActivity r30 = r9.requireActivity()     // Catch:{ all -> 0x17c4 }
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r34)     // Catch:{ all -> 0x17c4 }
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x17c4 }
            r31 = r3
            r32 = r10
            r29.A1I(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x17c4 }
            goto L_0x0db3
        L_0x0d9e:
            X.7ZY r29 = r2.BSN()     // Catch:{ all -> 0x17c4 }
            java.lang.String r2 = r1.A12     // Catch:{ all -> 0x17c4 }
            X.7Tw r1 = r1.A0j     // Catch:{ all -> 0x17c4 }
            X.7L5 r1 = r1.A00     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0dbf
            r31 = r1
            r32 = r10
            r33 = r2
            r29.DKx(r30, r31, r32, r33, r34)     // Catch:{ all -> 0x17c4 }
        L_0x0db3:
            X.4DH r1 = r0.A0u     // Catch:{ all -> 0x17c4 }
            boolean r1 = r1.isResumed()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x0dd3
            X.AnonymousClass9H7.A0A(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x0dd3
        L_0x0dbf:
            java.lang.String r33 = "sendAttributionTracker"
            goto L_0x0854
        L_0x0dc3:
            X.0sa r0 = r8.A0C     // Catch:{ all -> 0x17c4 }
            r0.invoke()     // Catch:{ all -> 0x17c4 }
            goto L_0x0801
        L_0x0dca:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x16cb
        L_0x0dd0:
            X.C69865NtT.A00(r0)     // Catch:{ all -> 0x17c4 }
        L_0x0dd3:
            if (r91 == 0) goto L_0x131d
            if (r93 != 0) goto L_0x132b
            java.lang.Object r1 = r76.invoke()     // Catch:{ all -> 0x17c4 }
            X.7Zg r1 = (X.C333517Zg) r1     // Catch:{ all -> 0x17c4 }
            X.9Gx r0 = X.C376179Gx.PSEUDO_THREAD_CONTEXT_MODEL_CREATION_ON_THREAD_UPDATED     // Catch:{ all -> 0x17c4 }
            boolean r2 = r1.AH1(r0)     // Catch:{ all -> 0x17c4 }
            r39 = 0
            if (r2 == 0) goto L_0x12b5
            X.7S7 r0 = r1.C6l()     // Catch:{ all -> 0x17c4 }
            X.2Ep r7 = r0.Cms()     // Catch:{ all -> 0x17c4 }
            if (r7 == 0) goto L_0x12c1
            X.4DH r1 = r8.A00     // Catch:{ all -> 0x17c4 }
            android.os.Bundle r2 = r1.mArguments     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x0e01
            java.lang.String r0 = "bundle_extra_is_navigating_from_ctd_ad"
            boolean r0 = r2.getBoolean(r0)     // Catch:{ all -> 0x17c4 }
            java.lang.Boolean r39 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x17c4 }
        L_0x0e01:
            androidx.fragment.app.FragmentActivity r42 = r1.requireActivity()     // Catch:{ all -> 0x17c4 }
            android.content.Context r2 = r1.requireContext()     // Catch:{ all -> 0x17c4 }
            X.0sa r0 = r8.A0J     // Catch:{ all -> 0x17c4 }
            r0.invoke()     // Catch:{ all -> 0x17c4 }
            X.4DU r0 = r8.A05     // Catch:{ all -> 0x17c4 }
            r31 = r0
            r30 = 3
            r29 = 5
            r38 = 0
            boolean r0 = r7.CUG()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x0f53
            java.lang.String r1 = r7.C6f()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.List r0 = r7.BRZ()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r47 = X.AnonymousClass48N.A08(r2, r11, r1, r0, r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0qQ.A07(r47)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.ArrayList r3 = X.C3258074f.A00(r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            int r1 = r7.C6a()     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 28
            if (r1 == r0) goto L_0x0e59
            r0 = 29
            if (r1 == r0) goto L_0x0e55
            r0 = 61
            if (r1 == r0) goto L_0x0e59
            r0 = 36317216957797228(0x8106510000136c, double:3.0304924695812465E-306)
            r5 = r24
            boolean r1 = X.182.A06(r5, r11, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 2131976642(0x7f1361c2, float:1.959041E38)
            if (r1 == 0) goto L_0x0e5c
            r0 = 2131976618(0x7f1361aa, float:1.9590362E38)
            goto L_0x0e5c
        L_0x0e55:
            r0 = 2131954257(0x7f130a51, float:1.9545008E38)
            goto L_0x0e5c
        L_0x0e59:
            r0 = 2131972997(0x7f135385, float:1.9583017E38)
        L_0x0e5c:
            java.lang.String r48 = r2.getString(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0qQ.A0A(r48)     // Catch:{ IllegalStateException -> 0x12b9 }
            int r1 = r7.BHS()     // Catch:{ IllegalStateException -> 0x12b9 }
            r59 = 1
            r0 = 8
            if (r1 != r0) goto L_0x0e6f
            r59 = 0
        L_0x0e6f:
            X.34S r0 = X.AnonymousClass48N.A00(r11, r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Object r2 = r0.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r2 == 0) goto L_0x12ad
            java.lang.Object r1 = r0.A01     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0eP r32 = new X.0eP     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r32
            r0.<init>(r2, r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ IllegalStateException -> 0x12b9 }
            com.instagram.user.model.User r1 = r0.A01(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.List r0 = r7.BRZ()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.ArrayList r55 = X.AnonymousClass3UE.A05(r1, r0, r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Object r31 = r3.get(r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r31
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x12b9 }
            r31 = r0
            r0 = r26
            java.lang.Object r14 = r3.get(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 2
            java.lang.Object r10 = r3.get(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r30
            java.lang.Object r9 = r3.get(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 4
            java.lang.Object r6 = r3.get(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r65 = r7.CVr()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r0 = r7.C6C()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x0f50
            X.3t0 r5 = new X.3t0     // Catch:{ IllegalStateException -> 0x12b9 }
            r5.<init>(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x0ec5:
            X.3tH r39 = X.C254923tH.DJANGO     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r66 = X.C66640Ma9.A01(r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r0 = r7.isPending()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x0f4d
            boolean r0 = X.C66700Mb7.A02(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x0f4d
            java.util.List r0 = r7.AxI()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.ArrayList r56 = X.C66700Mb7.A00(r11, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x0edf:
            boolean r67 = X.AnonymousClass48N.A0C(r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            int r58 = r7.C6a()     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r68 = X.C66651MaK.A04(r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r2 = r7.COS()     // Catch:{ IllegalStateException -> 0x12b9 }
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r1 = r7.Asg()     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r7
            X.3U9 r0 = (X.AnonymousClass3U9) r0     // Catch:{ IllegalStateException -> 0x12b9 }
            X.3S9 r0 = r0.A01     // Catch:{ IllegalStateException -> 0x12b9 }
            X.3Te r0 = r0.A0s     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.List r13 = r7.BIr()     // Catch:{ IllegalStateException -> 0x12b9 }
            X.9Ih r3 = new X.9Ih     // Catch:{ IllegalStateException -> 0x12b9 }
            r3.<init>((X.C242243Te) r0, (com.instagram.direct.model.thread.CreatorSubscriberThreadInfo) r1, (java.util.List) r13, (boolean) r2)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0Tu r2 = X.0Tu.A06     // Catch:{ IllegalStateException -> 0x12b9 }
            r29 = 36318917765110519(0x8107dd00041af7, double:3.031568066974773E-306)
            r0 = r29
            boolean r0 = X.182.A06(r2, r11, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Boolean r42 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Integer r44 = X.AnonymousClass05K.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Boolean r41 = java.lang.Boolean.valueOf(r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.79E r0 = new X.79E     // Catch:{ IllegalStateException -> 0x12b9 }
            r36 = r0
            r37 = r3
            r40 = r5
            r43 = r38
            r45 = r38
            r46 = r38
            r49 = r31
            r50 = r14
            r51 = r10
            r52 = r9
            r53 = r6
            r54 = r38
            r57 = r32
            r60 = r15
            r61 = r15
            r62 = r15
            r63 = r15
            r64 = r26
            r69 = r15
            r70 = r15
            r71 = r15
            r72 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1293
        L_0x0f4d:
            X.0sn r56 = X.0sn.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x0edf
        L_0x0f50:
            r5 = 0
            goto L_0x0ec5
        L_0x0f53:
            boolean r0 = r7.CUG()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != 0) goto L_0x12c1
            java.util.List r0 = r7.BRZ()     // Catch:{ IllegalStateException -> 0x12b9 }
            int r1 = r0.size()     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r26
            if (r1 != r0) goto L_0x12c1
            java.util.List r0 = r7.BRZ()     // Catch:{ IllegalStateException -> 0x12b9 }
            r5 = 0
            java.lang.Object r6 = r0.get(r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6     // Catch:{ IllegalStateException -> 0x12b9 }
            int r0 = r6.BIW()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r1 = "Required value was null."
            r33 = 0
            if (r0 != 0) goto L_0x101d
            java.lang.String r37 = X.AnonymousClass50n.A07(r6)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0qQ.A07(r37)     // Catch:{ IllegalStateException -> 0x12b9 }
            int r3 = r7.C6a()     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r3 != r0) goto L_0x0f97
            boolean r0 = r7.CY7()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x0f97
            java.lang.String r0 = r7.C6f()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x0f97
            r37 = r0
        L_0x0f97:
            boolean r0 = r7.COb()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x1015
            com.instagram.user.model.User r3 = r7.BZK()     // Catch:{ IllegalStateException -> 0x12b9 }
            int r5 = r7.C6a()     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r0) goto L_0x0fea
            if (r3 == 0) goto L_0x0fea
            X.4Cl r0 = r3.A03     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r0 = r0.AaS()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x0fea
            X.1ps r0 = X.AnonymousClass9B9.A00()     // Catch:{ IllegalStateException -> 0x12b9 }
            X.1pt r0 = r0.A02     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r44 = r31.getModuleName()     // Catch:{ IllegalStateException -> 0x12b9 }
            X.4Cl r5 = r3.A03     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r45 = r5.AaR()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r45 == 0) goto L_0x0fe3
            X.4Cl r3 = r3.A03     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r46 = r3.AaS()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r46 == 0) goto L_0x0fdc
            int r47 = r7.AaV()     // Catch:{ IllegalStateException -> 0x12b9 }
            r40 = r0
            r41 = r2
            r43 = r11
            android.text.SpannableStringBuilder r3 = r40.A00(r41, r42, r43, r44, r45, r46, r47)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1038
        L_0x0fdc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x12b9 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x12b4
        L_0x0fe3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x12b9 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x12b4
        L_0x0fea:
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ NotFoundException -> 0x0ff6 }
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x0ff6 }
            goto L_0x0ffd
        L_0x0ff6:
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = X.0nA.A03(r2, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            int r0 = (int) r0     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x0ffd:
            X.AnonymousClass9B9.A00()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 2131975293(0x7f135c7d, float:1.9587674E38)
            java.lang.CharSequence r1 = r2.getText(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0qQ.A07(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r38
            android.text.SpannableStringBuilder r3 = X.C69835Nsx.A00(r2, r1, r3, r0, r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1038
        L_0x1015:
            java.lang.Long r0 = r7.CBk()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x102b
            r5 = 1
            goto L_0x102b
        L_0x101d:
            java.lang.String r37 = r6.getFullName()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r37 == 0) goto L_0x12a7
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            java.lang.String r3 = r2.getString(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1038
        L_0x102b:
            java.lang.String r3 = X.AnonymousClass50n.A06(r6)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r5 == 0) goto L_0x104b
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            java.lang.String r3 = r2.getString(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x1038:
            java.util.ArrayList r1 = X.C3258074f.A00(r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r0 = X.C377819Nj.A03(r11, r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != 0) goto L_0x1057
            boolean r0 = X.C377819Nj.A02(r11, r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            r66 = 0
            if (r0 == 0) goto L_0x1059
            goto L_0x1057
        L_0x104b:
            if (r3 == 0) goto L_0x1055
            r0 = r37
            boolean r0 = r0.equals(r3)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x1038
        L_0x1055:
            r3 = 0
            goto L_0x1038
        L_0x1057:
            r66 = 1
        L_0x1059:
            X.3su r0 = r7.BKv()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != 0) goto L_0x10ac
            boolean r0 = X.AnonymousClass431.A02(r11, r6)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x10ac
            X.3mO r9 = X.C250993mO.A01(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0qQ.A07(r9)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.3mS r5 = X.C251033mS.A00(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r0 = r6.getId()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.List r0 = X.C250993mO.A03(r5, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r65 = r9.A0D(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x1080:
            boolean r0 = r7.COb()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x10af
            boolean r0 = r6.A1l()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x10af
            boolean r0 = X.AnonymousClass9B8.A06(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x10af
            X.7ZW r5 = new X.7ZW     // Catch:{ IllegalStateException -> 0x12b9 }
            r5.<init>(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r0 = r6.getId()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Boolean r5 = r5.A00(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r0 = X.0qQ.A0K(r5, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            r75 = 1
            if (r0 == 0) goto L_0x10b1
            goto L_0x10af
        L_0x10ac:
            r65 = 0
            goto L_0x1080
        L_0x10af:
            r75 = 0
        L_0x10b1:
            boolean r0 = r7.COb()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x10c8
            java.lang.Boolean r44 = java.lang.Boolean.valueOf(r26)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Integer r48 = X.AnonymousClass05K.A00     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x10bd:
            int r5 = r7.BHS()     // Catch:{ IllegalStateException -> 0x12b9 }
            r62 = 1
            r0 = 8
            if (r5 != r0) goto L_0x10cf
            goto L_0x10cd
        L_0x10c8:
            r44 = r38
            r48 = r38
            goto L_0x10bd
        L_0x10cd:
            r62 = 0
        L_0x10cf:
            X.4Cl r0 = r6.A03     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Boolean r0 = r0.CS8()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x10f1
            boolean r63 = r0.booleanValue()     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x10db:
            boolean r64 = r6.isVerified()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.List r0 = r7.BRZ()     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0eP r60 = X.C3258074f.A01(r11, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Long r5 = r7.CBk()     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = 2131976660(0x7f1361d4, float:1.9590447E38)
            if (r5 == 0) goto L_0x10f7
            goto L_0x10f4
        L_0x10f1:
            r63 = 0
            goto L_0x10db
        L_0x10f4:
            r0 = 2131976627(0x7f1361b3, float:1.959038E38)
        L_0x10f7:
            java.lang.String r51 = r2.getString(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0qQ.A07(r51)     // Catch:{ IllegalStateException -> 0x12b9 }
            com.instagram.direct.model.messaginguser.MessagingUser r41 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r6)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Object r36 = r1.get(r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r36
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x12b9 }
            r36 = r0
            java.util.List r0 = r7.C64()     // Catch:{ IllegalStateException -> 0x12b9 }
            r74 = 1
            if (r0 == 0) goto L_0x111c
            int r0 = r0.size()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != 0) goto L_0x111c
            goto L_0x11ac
        L_0x111c:
            java.util.List r0 = r7.C64()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x11ac
            java.lang.Object r0 = X.00k.A0O(r0, r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.3Tk r0 = (X.C242283Tk) r0     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x11ac
            int r0 = r0.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != 0) goto L_0x11ac
        L_0x112e:
            r0 = r26
            java.lang.Object r35 = r1.get(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r35
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x12b9 }
            r35 = r0
            r9 = 2
            java.lang.Object r34 = r1.get(r9)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r34
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x12b9 }
            r34 = r0
            r0 = r30
            java.lang.Object r14 = r1.get(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IllegalStateException -> 0x12b9 }
            r5 = 4
            java.lang.Object r13 = r1.get(r5)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Long r49 = r7.CBk()     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r68 = r7.CVr()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r1 = r7.C6C()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r1 == 0) goto L_0x1169
            X.3t0 r33 = new X.3t0     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r33
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x1169:
            X.3tH r42 = X.C254923tH.DJANGO     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r69 = X.C66640Ma9.A01(r7)     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r0 = r7.isPending()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x11a9
            boolean r0 = X.C66700Mb7.A02(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x11a9
            java.util.List r0 = r7.AxI()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.util.ArrayList r59 = X.C66700Mb7.A00(r11, r0)     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x1183:
            boolean r0 = r7.CUG()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != 0) goto L_0x11cf
            X.16V r1 = r6.A0J()     // Catch:{ IllegalStateException -> 0x12b9 }
            X.16V r0 = X.16V.A05     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r1 != r0) goto L_0x11cf
            r0 = r7
            X.3U9 r0 = (X.AnonymousClass3U9) r0     // Catch:{ IllegalStateException -> 0x12b9 }
            X.3S9 r0 = r0.A01     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r0 = r0.A1n     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x11cf
            X.XSD r10 = X.XSD.valueOf(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r10 == 0) goto L_0x11cf
            int r1 = r10.ordinal()     // Catch:{ IllegalStateException -> 0x12b9 }
            r0 = r26
            if (r1 == r0) goto L_0x11cb
            goto L_0x11af
        L_0x11a9:
            X.0sn r59 = X.0sn.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1183
        L_0x11ac:
            r74 = 0
            goto L_0x112e
        L_0x11af:
            if (r1 == r9) goto L_0x11c7
            r0 = r30
            if (r1 == r0) goto L_0x11c3
            if (r1 == r5) goto L_0x11bf
            r0 = r29
            if (r1 != r0) goto L_0x11cf
            r0 = 2131976897(0x7f1362c1, float:1.9590927E38)
            goto L_0x11d2
        L_0x11bf:
            r0 = 2131976898(0x7f1362c2, float:1.959093E38)
            goto L_0x11d2
        L_0x11c3:
            r0 = 2131976899(0x7f1362c3, float:1.9590932E38)
            goto L_0x11d2
        L_0x11c7:
            r0 = 2131976900(0x7f1362c4, float:1.9590934E38)
            goto L_0x11d2
        L_0x11cb:
            r0 = 2131964406(0x7f1331f6, float:1.9565593E38)
            goto L_0x11d2
        L_0x11cf:
            r57 = r38
            goto L_0x121d
        L_0x11d2:
            java.lang.String r57 = r2.getString(r0)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r57 == 0) goto L_0x11cf
            r0 = r31
            X.0wc r0 = X.AnonymousClass0kN.A01(r0, r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r1 = r11.A06     // Catch:{ IllegalStateException -> 0x12b9 }
            long r31 = java.lang.Long.parseLong(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r1 = r6.getId()     // Catch:{ IllegalStateException -> 0x12b9 }
            long r29 = java.lang.Long.parseLong(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r2 = "igd_null_state_thread_responsiveness_text_impression"
            X.0kJ r1 = r0.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0Aj r2 = r0.A00(r1, r2)     // Catch:{ IllegalStateException -> 0x12b9 }
            r1 = 277(0x115, float:3.88E-43)
            X.1Ln r0 = new X.1Ln     // Catch:{ IllegalStateException -> 0x12b9 }
            r0.<init>(r2, r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0Aj r1 = r0.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r1 = r1.isSampled()     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r1 == 0) goto L_0x121d
            java.lang.Long r2 = java.lang.Long.valueOf(r31)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r1 = "ig_userid"
            r0.A0Q(r1, r2)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r29)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r1 = "target_id"
            r0.A0Q(r1, r2)     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.String r1 = "responsiveness"
            r0.A0M(r10, r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            r0.Cgf()     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x121d:
            int r61 = r7.C6a()     // Catch:{ IllegalStateException -> 0x12b9 }
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ IllegalStateException -> 0x12b9 }
            com.instagram.user.model.User r0 = r0.A01(r11)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.16V r0 = r0.A0J()     // Catch:{ IllegalStateException -> 0x12b9 }
            X.16V r5 = r6.A0J()     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r2 = r7.CKb()     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r26)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r2 != 0) goto L_0x1290
            X.4Cl r2 = r6.A03     // Catch:{ IllegalStateException -> 0x12b9 }
            java.lang.Boolean r2 = r2.CSk()     // Catch:{ IllegalStateException -> 0x12b9 }
            boolean r2 = X.0qQ.A0K(r2, r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r2 != 0) goto L_0x1290
            X.16V r2 = X.16V.A07     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == r2) goto L_0x124d
            X.16V r2 = X.16V.A06     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != r2) goto L_0x1290
        L_0x124d:
            X.16V r0 = X.16V.A05     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r5 == r0) goto L_0x1259
            r0 = r39
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 == 0) goto L_0x1290
        L_0x1259:
            r0 = r39
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            if (r0 != 0) goto L_0x128d
            java.lang.Integer r47 = X.AnonymousClass05K.A01     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x1263:
            boolean r73 = X.C3261275m.A00(r11, r7, r15)     // Catch:{ IllegalStateException -> 0x12b9 }
            X.79E r0 = new X.79E     // Catch:{ IllegalStateException -> 0x12b9 }
            r39 = r0
            r40 = r38
            r43 = r33
            r45 = r38
            r46 = r3
            r50 = r37
            r52 = r36
            r53 = r35
            r54 = r34
            r55 = r14
            r56 = r13
            r58 = r38
            r67 = r15
            r70 = r15
            r71 = r15
            r72 = r15
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1293
        L_0x128d:
            java.lang.Integer r47 = X.AnonymousClass05K.A0C     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1263
        L_0x1290:
            java.lang.Integer r47 = X.AnonymousClass05K.A00     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x1263
        L_0x1293:
            boolean r1 = A0O(r4)     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x12c1
            X.79E r1 = r4.A0G     // Catch:{ all -> 0x17c4 }
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x12c1
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            r4.A0G = r0     // Catch:{ all -> 0x17c4 }
            goto L_0x12c1
        L_0x12a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x12b9 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
            goto L_0x12b4
        L_0x12ad:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x12b9 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x12b4:
            throw r0     // Catch:{ IllegalStateException -> 0x12b9 }
        L_0x12b5:
            X.C69865NtT.A00(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x12c1
        L_0x12b9:
            r1 = move-exception
            X.FBK r0 = X.C395229zQ.A00(r11)     // Catch:{ all -> 0x17c4 }
            r0.A01(r7, r1)     // Catch:{ all -> 0x17c4 }
        L_0x12c1:
            java.lang.Object r0 = r76.invoke()     // Catch:{ all -> 0x17c4 }
            X.7Zg r0 = (X.C333517Zg) r0     // Catch:{ all -> 0x17c4 }
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x17c4 }
            X.2Ep r6 = r0.Cms()     // Catch:{ all -> 0x17c4 }
            if (r6 != 0) goto L_0x12d2
            goto L_0x1304
        L_0x12d2:
            X.4DH r0 = r8.A00     // Catch:{ all -> 0x17c4 }
            android.content.Context r2 = r0.requireContext()     // Catch:{ all -> 0x17c4 }
            X.0sa r0 = r8.A0J     // Catch:{ all -> 0x17c4 }
            r0.invoke()     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r6.C6f()     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r6.BRZ()     // Catch:{ all -> 0x17c4 }
            java.lang.String r5 = X.AnonymousClass48N.A08(r2, r11, r1, r0, r15)     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x17c4 }
            int r1 = r6.BHS()     // Catch:{ all -> 0x17c4 }
            r3 = 1
            r0 = 8
            if (r1 != r0) goto L_0x12f6
            r3 = 0
        L_0x12f6:
            java.lang.String r2 = r6.C6C()     // Catch:{ all -> 0x17c4 }
            int r1 = r6.C6a()     // Catch:{ all -> 0x17c4 }
            X.74g r0 = new X.74g     // Catch:{ all -> 0x17c4 }
            r0.<init>(r5, r3, r2, r1)     // Catch:{ all -> 0x17c4 }
            goto L_0x1305
        L_0x1304:
            r0 = 0
        L_0x1305:
            if (r92 == 0) goto L_0x132b
            if (r0 == 0) goto L_0x132b
            boolean r1 = A0O(r4)     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x132b
            X.74g r1 = r4.A07     // Catch:{ all -> 0x17c4 }
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x17c4 }
            if (r1 != 0) goto L_0x132b
            A0K(r4, r0)     // Catch:{ all -> 0x17c4 }
            r4.A07 = r0     // Catch:{ all -> 0x17c4 }
            goto L_0x132b
        L_0x131d:
            X.79E r1 = r4.A0G     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x1328
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            r0.A08(r1)     // Catch:{ all -> 0x17c4 }
        L_0x1328:
            r0 = 0
            r4.A0G = r0     // Catch:{ all -> 0x17c4 }
        L_0x132b:
            X.74g r1 = r4.A07     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x133f
            boolean r0 = A0O(r4)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x133f
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            r0.A08(r1)     // Catch:{ all -> 0x17c4 }
            r0 = 0
            r4.A07 = r0     // Catch:{ all -> 0x17c4 }
        L_0x133f:
            if (r17 == 0) goto L_0x136b
            r1 = r27
            r0 = r26
            if (r1 != r0) goto L_0x136b
            X.0sa r0 = r8.A0F     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x17c4 }
            X.7SM r0 = (X.AnonymousClass7SM) r0     // Catch:{ all -> 0x17c4 }
            X.9H7 r2 = r0.A00     // Catch:{ all -> 0x17c4 }
            X.7Hl r0 = r2.A0R     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x136b
            boolean r1 = r0.A1U()     // Catch:{ all -> 0x17c4 }
            r0 = r26
            if (r1 != r0) goto L_0x136b
            X.7Hl r1 = X.AnonymousClass9H7.A06(r2)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1.A1A     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x136b
            r1.A1E()     // Catch:{ all -> 0x17c4 }
            X.C329067Hl.A0X(r1)     // Catch:{ all -> 0x17c4 }
        L_0x136b:
            if (r94 == 0) goto L_0x13d2
            if (r88 == 0) goto L_0x13aa
            if (r20 == 0) goto L_0x13aa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r5.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r7 = r20.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x137a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x13a5
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x17c4 }
            X.MbG r6 = (X.C66709MbG) r6     // Catch:{ all -> 0x17c4 }
            java.lang.Object r3 = r6.A02     // Catch:{ all -> 0x17c4 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x17c4 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x137a
            java.util.HashSet r2 = r4.A0v     // Catch:{ all -> 0x17c4 }
            long r0 = r6.A01     // Catch:{ all -> 0x17c4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x137a
            A0D(r6, r4, r15)     // Catch:{ all -> 0x17c4 }
            r5.addAll(r3)     // Catch:{ all -> 0x17c4 }
            goto L_0x137a
        L_0x13a5:
            r0 = r16
            r0.removeAll(r5)     // Catch:{ all -> 0x17c4 }
        L_0x13aa:
            if (r90 == 0) goto L_0x13d2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x17c4 }
            r3.<init>()     // Catch:{ all -> 0x17c4 }
            java.util.Iterator r5 = r19.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x13b5:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x13cd
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x17c4 }
            X.7LQ r2 = (X.AnonymousClass7LQ) r2     // Catch:{ all -> 0x17c4 }
            X.3su r0 = r2.A0e     // Catch:{ all -> 0x17c4 }
            X.2FW r1 = r0.A10     // Catch:{ all -> 0x17c4 }
            X.2FW r0 = X.2FW.A0G     // Catch:{ all -> 0x17c4 }
            if (r1 != r0) goto L_0x13b5
            r3.add(r2)     // Catch:{ all -> 0x17c4 }
            goto L_0x13b5
        L_0x13cd:
            r0 = r19
            r0.removeAll(r3)     // Catch:{ all -> 0x17c4 }
        L_0x13d2:
            r30 = r84
            r31 = r86
            r29 = r4
            r32 = r16
            r33 = r23
            r34 = r22
            r35 = r19
            r29.A0X(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x17c4 }
            if (r22 == 0) goto L_0x13ea
            r0 = r22
            r8.A06(r0)     // Catch:{ all -> 0x17c4 }
        L_0x13ea:
            if (r17 == 0) goto L_0x1401
            X.3tI r3 = r25.A0P()     // Catch:{ all -> 0x17c4 }
            r0 = r25
            java.lang.String r2 = r0.A1u     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r12.A06     // Catch:{ all -> 0x17c4 }
            r0 = 0
            if (r2 != r1) goto L_0x13fa
            r0 = 1
        L_0x13fa:
            boolean r0 = X.AnonymousClass73Z.A00(r12, r3, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1401
            goto L_0x146f
        L_0x1401:
            X.7Mt r2 = r4.A0i     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x1456
            boolean r0 = r2.A03()     // Catch:{ all -> 0x17c4 }
            r1 = r26
            if (r0 != r1) goto L_0x1456
            r0 = 36329698132902148(0x8111ab00024104, double:3.038385614975256E-306)
            r3 = r24
            boolean r0 = X.182.A06(r3, r12, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x141f
            if (r17 != 0) goto L_0x146f
            if (r88 != 0) goto L_0x141f
            goto L_0x146f
        L_0x141f:
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            int r5 = r0.A01     // Catch:{ all -> 0x17c4 }
            r3 = 0
        L_0x1426:
            if (r3 >= r5) goto L_0x146f
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.A05(r3)     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x17c4 }
            X.7So r0 = (X.C331837So) r0     // Catch:{ all -> 0x17c4 }
            boolean r1 = r0 instanceof X.AnonymousClass7LQ     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x1453
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x17c4 }
            X.7LQ r0 = (X.AnonymousClass7LQ) r0     // Catch:{ all -> 0x17c4 }
            X.3su r0 = r0.A0e     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r0.A0g()     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.0mp.A0G(r1, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1453
            r1 = 19
            X.Ply r0 = new X.Ply     // Catch:{ all -> 0x17c4 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x17c4 }
            r8.A07(r0, r3)     // Catch:{ all -> 0x17c4 }
        L_0x1453:
            int r3 = r3 + 1
            goto L_0x1426
        L_0x1456:
            r2 = 0
            if (r17 == 0) goto L_0x1466
            boolean r0 = r25.CRd()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1466
            java.lang.String r0 = r25.A0g()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x1466
            r2 = 1
        L_0x1466:
            X.7UC r1 = r8.A03     // Catch:{ all -> 0x17c4 }
            if (r2 == 0) goto L_0x147b
            r0 = r26
            r1.A00(r0)     // Catch:{ all -> 0x17c4 }
        L_0x146f:
            X.3su r3 = A0B(r4)     // Catch:{ all -> 0x17c4 }
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            int r5 = r0.A01     // Catch:{ all -> 0x17c4 }
            r1 = 0
            goto L_0x1489
        L_0x147b:
            X.Maf r0 = r4.A06     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1487
            int r0 = A04(r4, r0)     // Catch:{ all -> 0x17c4 }
        L_0x1483:
            r1.A02(r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x146f
        L_0x1487:
            r0 = -1
            goto L_0x1483
        L_0x1489:
            if (r1 >= r5) goto L_0x14a2
            X.0mo r0 = r4.A0R()     // Catch:{ all -> 0x17c4 }
            java.lang.Object r2 = r0.A05(r1)     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x17c4 }
            X.7So r2 = (X.C331837So) r2     // Catch:{ all -> 0x17c4 }
            boolean r0 = r2 instanceof X.AnonymousClass7LQ     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x149f
            X.7LQ r2 = (X.AnonymousClass7LQ) r2     // Catch:{ all -> 0x17c4 }
            goto L_0x14a3
        L_0x149f:
            int r1 = r1 + 1
            goto L_0x1489
        L_0x14a2:
            r2 = 0
        L_0x14a3:
            if (r3 == 0) goto L_0x151a
            r0 = r79
            X.7S6 r0 = r0.A00     // Catch:{ all -> 0x17c4 }
            boolean r1 = r0.CdE()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x14ee
            com.instagram.common.session.UserSession r5 = r0.A0G     // Catch:{ all -> 0x17c4 }
            X.2Ep r1 = r0.A07     // Catch:{ all -> 0x17c4 }
            r1.getClass()     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r7 = X.AnonymousClass48N.A04(r5, r3, r1)     // Catch:{ all -> 0x17c4 }
        L_0x14ba:
            com.instagram.user.model.User r1 = r4.A0q     // Catch:{ all -> 0x17c4 }
            java.lang.String r6 = r1.getId()     // Catch:{ all -> 0x17c4 }
            java.lang.String r5 = r3.A0g()     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r3.A1u     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x17c4 }
            X.2Ep r0 = r0.A07     // Catch:{ all -> 0x17c4 }
            r0.getClass()     // Catch:{ all -> 0x17c4 }
            boolean r31 = r0.CbQ(r6, r5, r1)     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r0 = r3.A1F     // Catch:{ all -> 0x17c4 }
            boolean r32 = X.AnonymousClass48R.A01(r0)     // Catch:{ all -> 0x17c4 }
            if (r7 == 0) goto L_0x14eb
            com.instagram.common.typedurl.ImageUrl r30 = r7.Bh3()     // Catch:{ all -> 0x17c4 }
        L_0x14de:
            X.7AG r0 = r3.A0Q     // Catch:{ all -> 0x17c4 }
            r33 = 0
            if (r0 == 0) goto L_0x14f5
            java.lang.Integer r1 = r0.A02     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x17c4 }
            if (r1 != r0) goto L_0x14f2
            goto L_0x14f0
        L_0x14eb:
            r30 = 0
            goto L_0x14de
        L_0x14ee:
            r7 = 0
            goto L_0x14ba
        L_0x14f0:
            r33 = 1
        L_0x14f2:
            r34 = 1
            goto L_0x14f7
        L_0x14f5:
            r34 = 0
        L_0x14f7:
            r29 = r8
            r29.A01(r30, r31, r32, r33, r34)     // Catch:{ all -> 0x17c4 }
            java.lang.String r5 = r3.A0g()     // Catch:{ all -> 0x17c4 }
            X.7AG r0 = r3.A0Q     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x151a
            if (r21 == 0) goto L_0x151a
            if (r5 == 0) goto L_0x151a
            X.7Sp r1 = r4.A0h     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadId"
            r6 = r21
            X.0qQ.A0C(r6, r0)     // Catch:{ all -> 0x17c4 }
            r0 = r21
            X.3t0 r0 = (X.C254763t0) r0     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x17c4 }
            r1.A00(r0, r5)     // Catch:{ all -> 0x17c4 }
        L_0x151a:
            if (r2 == 0) goto L_0x16cd
            X.3t2 r0 = r77.C6c()     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.AnonymousClass6W3.A07(r0)     // Catch:{ all -> 0x17c4 }
            r0 = r0 ^ 1
            X.LAh r5 = X.C331317Qk.A00(r12, r0)     // Catch:{ all -> 0x17c4 }
            if (r5 == 0) goto L_0x16cd
            r13 = 3
            X.PqO r9 = new X.PqO     // Catch:{ all -> 0x17c4 }
            r9.<init>(r4, r13)     // Catch:{ all -> 0x17c4 }
            r1 = 40
            X.J6s r25 = new X.J6s     // Catch:{ all -> 0x17c4 }
            r0 = r25
            r0.<init>(r4, r1)     // Catch:{ all -> 0x17c4 }
            X.3su r6 = r2.A0e     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r6.A0g()     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x157a
            java.lang.String r0 = r5.A00     // Catch:{ all -> 0x17c4 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x157a
        L_0x1551:
            X.7Bo r7 = X.C327627Bo.NUX_TYPE_META_AI_INTENT_DETECTION     // Catch:{ all -> 0x17c4 }
            r9.invoke(r7)     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r10 = r5.A04     // Catch:{ all -> 0x17c4 }
            r0 = r78
            boolean r0 = r0.A0o     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x16cd
            r0 = r78
            int r0 = r0.A08     // Catch:{ all -> 0x17c4 }
            boolean r0 = X.AnonymousClass48O.A04(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x16cd
            X.7AG r0 = r6.A0Q     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x16cd
            X.0eE r0 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x17c4 }
            com.instagram.user.model.User r0 = r0.A01(r10)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r6.A1j(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x16cd
            monitor-enter(r6)     // Catch:{ all -> 0x17c4 }
            goto L_0x15aa
        L_0x157a:
            X.L6V r0 = r5.A06     // Catch:{ all -> 0x17c4 }
            X.1Av r10 = r0.A02     // Catch:{ all -> 0x17c4 }
            r0 = 706(0x2c2, float:9.9E-43)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x17c4 }
            r0 = 0
            X.0xa r10 = r10.A01     // Catch:{ all -> 0x17c4 }
            long r22 = r10.getLong(r7, r0)     // Catch:{ all -> 0x17c4 }
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 / r0
            X.L19 r0 = r5.A07     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r10 = r0.A00     // Catch:{ all -> 0x17c4 }
            r0 = 36607762905962106(0x820e910008167a, double:3.214234897135343E-306)
            r7 = r24
            long r0 = X.182.A01(r7, r10, r0)     // Catch:{ all -> 0x17c4 }
            long r22 = r22 + r0
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x16cd
            goto L_0x1551
        L_0x15aa:
            java.util.List r0 = r6.A21     // Catch:{ all -> 0x16c1 }
            if (r0 == 0) goto L_0x15c8
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x16c1 }
        L_0x15b2:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x16c1 }
            if (r0 == 0) goto L_0x15c8
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x16c1 }
            X.9IY r0 = (X.AnonymousClass9IY) r0     // Catch:{ all -> 0x16c1 }
            int r1 = r0.A03     // Catch:{ all -> 0x16c1 }
            r0 = 5
            if (r1 == r0) goto L_0x16cc
            r0 = 6
            if (r1 != r0) goto L_0x15b2
            goto L_0x16cc
        L_0x15c8:
            monitor-exit(r6)     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r1 = r6.A1F     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x17c4 }
            if (r1 != r0) goto L_0x16cd
            X.AnonymousClass9B9.A00()     // Catch:{ all -> 0x17c4 }
            X.9BB r0 = X.AnonymousClass9BA.A00(r10)     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r1 = r0.A00()     // Catch:{ all -> 0x17c4 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x17c4 }
            if (r1 != r0) goto L_0x16cd
            r0 = 36326287928735404(0x810e91000036ac, double:3.036228988128417E-306)
            r9 = r24
            boolean r0 = X.182.A06(r9, r10, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x16cd
            X.7Bo r1 = r2.A03()     // Catch:{ all -> 0x17c4 }
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_NONE     // Catch:{ all -> 0x17c4 }
            if (r1 != r0) goto L_0x16cd
            java.lang.String r10 = r6.A1q     // Catch:{ all -> 0x17c4 }
            if (r10 == 0) goto L_0x16cd
            java.lang.String r9 = r6.A0g()     // Catch:{ all -> 0x17c4 }
            if (r9 == 0) goto L_0x16cd
            java.lang.String r0 = r5.A00     // Catch:{ all -> 0x17c4 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x160c
            r0 = r25
            r0.invoke(r2, r7)     // Catch:{ all -> 0x17c4 }
            goto L_0x16cd
        L_0x160c:
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x17c4 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r29 = r29 / r0
            X.L6V r0 = r5.A06     // Catch:{ all -> 0x17c4 }
            X.1Av r6 = r0.A02     // Catch:{ all -> 0x17c4 }
            r0 = 3598(0xe0e, float:5.042E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x17c4 }
            r0 = 0
            X.0xa r6 = r6.A01     // Catch:{ all -> 0x17c4 }
            long r22 = r6.getLong(r7, r0)     // Catch:{ all -> 0x17c4 }
            X.L19 r0 = r5.A07     // Catch:{ all -> 0x17c4 }
            com.instagram.common.session.UserSession r7 = r0.A00     // Catch:{ all -> 0x17c4 }
            r0 = 36607762905699959(0x820e9100041677, double:3.21423489696956E-306)
            r14 = r24
            long r20 = X.182.A01(r14, r7, r0)     // Catch:{ all -> 0x17c4 }
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x1657
            r0 = 706(0x2c2, float:9.9E-43)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x17c4 }
            r0 = 0
            long r20 = r6.getLong(r14, r0)     // Catch:{ all -> 0x17c4 }
            r0 = 36607762905765496(0x820e9100051678, double:3.214234897011006E-306)
            r14 = r24
            long r0 = X.182.A01(r14, r7, r0)     // Catch:{ all -> 0x17c4 }
            long r20 = r20 + r0
            int r0 = (r20 > r29 ? 1 : (r20 == r29 ? 0 : -1))
            if (r0 <= 0) goto L_0x1657
            goto L_0x16cd
        L_0x1657:
            r0 = 3597(0xe0d, float:5.04E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x17c4 }
            r0 = 0
            long r22 = r6.getLong(r14, r0)     // Catch:{ all -> 0x17c4 }
            r0 = 36607762905831033(0x820e9100061679, double:3.214234897052452E-306)
            r14 = r24
            long r20 = X.182.A01(r14, r7, r0)     // Catch:{ all -> 0x17c4 }
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x1682
            r0 = 969(0x3c9, float:1.358E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x17c4 }
            X.0qQ.A0B(r0, r15)     // Catch:{ all -> 0x17c4 }
            boolean r0 = r6.getBoolean(r0, r15)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x1682
            goto L_0x16cd
        L_0x1682:
            java.lang.String r1 = "\\s+"
            X.11S r0 = new X.11S     // Catch:{ all -> 0x17c4 }
            r0.<init>(r1)     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r0.A03(r10)     // Catch:{ all -> 0x17c4 }
            int r1 = r0.size()     // Catch:{ all -> 0x17c4 }
            int r0 = r5.A03     // Catch:{ all -> 0x17c4 }
            if (r1 < r0) goto L_0x16cd
            int r0 = r5.A02     // Catch:{ all -> 0x17c4 }
            if (r1 > r0) goto L_0x16cd
            X.12T r1 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x17c4 }
            r35 = 0
            r0 = 224778572(0xd65d94c, float:7.0827635E-31)
            X.0nV r0 = r1.AOJ(r0, r13)     // Catch:{ all -> 0x17c4 }
            X.19S r1 = X.19E.A02(r0)     // Catch:{ all -> 0x17c4 }
            r36 = 4
            X.JVS r0 = new X.JVS     // Catch:{ all -> 0x17c4 }
            r29 = r0
            r30 = r2
            r31 = r25
            r32 = r5
            r33 = r10
            r34 = r9
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x17c4 }
            X.19B r2 = X.19B.A00     // Catch:{ all -> 0x17c4 }
            X.1Eo.A05(r2, r0, r1)     // Catch:{ all -> 0x17c4 }
            goto L_0x16cd
        L_0x16c1:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x17c4 }
            goto L_0x16cb
        L_0x16c4:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x17c4 }
            r1.<init>(r0)     // Catch:{ all -> 0x17c4 }
        L_0x16cb:
            throw r1     // Catch:{ all -> 0x17c4 }
        L_0x16cc:
            monitor-exit(r6)     // Catch:{ all -> 0x17c4 }
        L_0x16cd:
            X.0sa r0 = r8.A0G     // Catch:{ all -> 0x17c4 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x16da
            X.0sa r0 = r8.A0I     // Catch:{ all -> 0x17c4 }
            r0.invoke()     // Catch:{ all -> 0x17c4 }
        L_0x16da:
            r0 = r18
            r8.A04(r0)     // Catch:{ all -> 0x17c4 }
            java.util.List r0 = r4.A0N     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x16f4
            if (r88 == 0) goto L_0x16f4
            boolean r0 = r16.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x16f4
            r1 = 5
            r0 = r16
            java.util.List r0 = X.00k.A0h(r0, r1)     // Catch:{ all -> 0x17c4 }
            r4.A0N = r0     // Catch:{ all -> 0x17c4 }
        L_0x16f4:
            r0 = 36330350967800395(0x8112430000424b, double:3.0387984703936626E-306)
            r2 = r24
            boolean r0 = X.182.A06(r2, r12, r0)     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1763
            if (r3 == 0) goto L_0x1763
            if (r17 == 0) goto L_0x1710
            r1 = r27
            r0 = r26
            if (r1 == r0) goto L_0x1737
            r1 = r28
            if (r1 != r0) goto L_0x1710
            goto L_0x1737
        L_0x1710:
            java.util.List r1 = r4.A0N     // Catch:{ all -> 0x17c4 }
            if (r1 == 0) goto L_0x1763
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x1763
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x17c4 }
        L_0x171e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1737
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x17c4 }
            X.7LQ r0 = (X.AnonymousClass7LQ) r0     // Catch:{ all -> 0x17c4 }
            X.3su r0 = r0.A0e     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = r0.A1q     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x171e
            boolean r0 = X.C70028Nw6.A00(r0)     // Catch:{ all -> 0x17c4 }
            if (r0 != 0) goto L_0x171e
            goto L_0x1763
        L_0x1737:
            java.lang.String r0 = r3.A1q     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1763
            int r0 = r0.length()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1763
            X.4DH r0 = r8.A00     // Catch:{ all -> 0x17c4 }
            X.P9y r6 = new X.P9y     // Catch:{ all -> 0x17c4 }
            r6.<init>(r0, r11)     // Catch:{ all -> 0x17c4 }
            java.lang.String r5 = r3.A1q     // Catch:{ all -> 0x17c4 }
            X.3t0 r0 = r3.A0U()     // Catch:{ all -> 0x17c4 }
            if (r0 == 0) goto L_0x1761
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x17c4 }
        L_0x1752:
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x17c4 }
            java.lang.String r1 = r3.A1u     // Catch:{ all -> 0x17c4 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x17c4 }
            java.lang.String r0 = "impression"
            r6.Cnf(r5, r2, r1, r0)     // Catch:{ all -> 0x17c4 }
            goto L_0x1763
        L_0x1761:
            r0 = 0
            goto L_0x1752
        L_0x1763:
            if (r88 == 0) goto L_0x1790
            java.util.Iterator r6 = r16.iterator()
        L_0x1769:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x1790
            java.lang.Object r0 = r6.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r5 = r0.A0e
            X.7AG r0 = r5.A0Q
            if (r0 == 0) goto L_0x1769
            X.0eM r0 = r4.A0y
            java.lang.Object r3 = r0.getValue()
            X.5D7 r3 = (X.AnonymousClass5D7) r3
            java.lang.String r2 = r5.A1j
            X.7AG r1 = r5.A0Q
            X.2FW r0 = r5.A10
            X.0qQ.A07(r0)
            r3.A01(r1, r0, r2)
            goto L_0x1769
        L_0x1790:
            if (r90 == 0) goto L_0x17bd
            java.util.Iterator r6 = r19.iterator()
        L_0x1796:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x17bd
            java.lang.Object r0 = r6.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r5 = r0.A0e
            X.7AG r0 = r5.A0Q
            if (r0 == 0) goto L_0x1796
            X.0eM r0 = r4.A0y
            java.lang.Object r3 = r0.getValue()
            X.5D7 r3 = (X.AnonymousClass5D7) r3
            java.lang.String r2 = r5.A1j
            X.7AG r1 = r5.A0Q
            X.2FW r0 = r5.A10
            X.0qQ.A07(r0)
            r3.A01(r1, r0, r2)
            goto L_0x1796
        L_0x17bd:
            r0 = -579641225(0xffffffffdd736077, float:-1.09607174E18)
        L_0x17c0:
            X.0fh.A00(r0)
            return
        L_0x17c4:
            r7 = move-exception
            if (r88 == 0) goto L_0x17f2
            java.util.Iterator r6 = r16.iterator()
        L_0x17cb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x17f2
            java.lang.Object r0 = r6.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r5 = r0.A0e
            X.7AG r0 = r5.A0Q
            if (r0 == 0) goto L_0x17cb
            X.0eM r0 = r4.A0y
            java.lang.Object r3 = r0.getValue()
            X.5D7 r3 = (X.AnonymousClass5D7) r3
            java.lang.String r2 = r5.A1j
            X.7AG r1 = r5.A0Q
            X.2FW r0 = r5.A10
            X.0qQ.A07(r0)
            r3.A01(r1, r0, r2)
            goto L_0x17cb
        L_0x17f2:
            if (r90 == 0) goto L_0x181f
            java.util.Iterator r6 = r19.iterator()
        L_0x17f8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x181f
            java.lang.Object r0 = r6.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r5 = r0.A0e
            X.7AG r0 = r5.A0Q
            if (r0 == 0) goto L_0x17f8
            X.0eM r0 = r4.A0y
            java.lang.Object r3 = r0.getValue()
            X.5D7 r3 = (X.AnonymousClass5D7) r3
            java.lang.String r2 = r5.A1j
            X.7AG r1 = r5.A0Q
            X.2FW r0 = r5.A10
            X.0qQ.A07(r0)
            r3.A01(r1, r0, r2)
            goto L_0x17f8
        L_0x181f:
            r0 = -1435362994(0xffffffffaa72194e, float:-2.1502697E-13)
            X.0fh.A00(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ZX.A0U(X.7US, X.7Yz, X.74d, X.7Ei, X.7SD, java.lang.Integer, java.lang.String, java.util.List, java.util.List, java.util.List, boolean, boolean, boolean, boolean):void");
    }
}
