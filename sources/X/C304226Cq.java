package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.api.schemas.TextAppTextFragmentType;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.6Cq  reason: invalid class name and case insensitive filesystem */
public final class C304226Cq {
    public C286025Tq A00;
    public final int A01;
    public final long A02;
    public final C284945Oz A03;
    public final C284945Oz A04;
    public final C286025Tq A05;
    public final UserSession A06;
    public final String A07;
    public final boolean A08;

    public C304226Cq(Context context, C284945Oz r58, C284945Oz r59, C286025Tq r60, C274454oN r61, C299725vk r62, UserSession userSession, String str, String str2, int i, long j, long j2, boolean z, boolean z2) {
        int length;
        int length2;
        int i2;
        TextAppMentionType textAppMentionType;
        long j3;
        String str3;
        String uri;
        C286025Tq r4 = r60;
        Context context2 = context;
        0qQ.A0B(context2, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        String str4 = str;
        0qQ.A0B(str4, 3);
        C284945Oz r3 = r58;
        0qQ.A0B(r3, 4);
        this.A06 = userSession2;
        this.A07 = str4;
        this.A04 = r3;
        this.A01 = i;
        this.A02 = j2;
        this.A03 = r59;
        this.A08 = z;
        if (r60 == null) {
            long j4 = j;
            boolean z3 = z2;
            C299725vk r15 = r62;
            String str5 = str2;
            if (r61 != null) {
                0Tu r10 = 0Tu.A05;
                if (182.A06(r10, userSession2, 36327915721341744L)) {
                    C303866Bc r0 = C303866Bc.A01;
                    C303876Bd r02 = new C303876Bd(16);
                    List<C21037XAq> B80 = r61.B80();
                    if (B80 != null) {
                        for (C21037XAq xAq : B80) {
                            TextAppTextFragmentType B7y = xAq.B7y();
                            if (B7y != null) {
                                switch (B7y.ordinal()) {
                                    case -1:
                                        break;
                                    case 0:
                                    case 1:
                                    case 4:
                                        String Bcv = xAq.Bcv();
                                        if (Bcv != null) {
                                            Matcher matcher = C303866Bc.A02.matcher(Bcv);
                                            int i3 = 0;
                                            long j5 = C303866Bc.A00;
                                            AnonymousClass5ZC r39 = new AnonymousClass5ZC((AnonymousClass5Z3) null, (C291815hv) null, (C291825hw) null, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, 0, AnonymousClass972.MUTABLE_FLAG_MASK, j5);
                                            AnonymousClass5ZB r18 = new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65533, 0, j5, 0);
                                            while (matcher.find()) {
                                                String substring = Bcv.substring(i3, matcher.start());
                                                0qQ.A07(substring);
                                                r02.A09(substring);
                                                C303916Bh r14 = new C303916Bh(r39, "", r02.A00.length(), AnonymousClass972.MUTABLE_FLAG_MASK);
                                                List list = r02.A03;
                                                list.add(r14);
                                                r02.A02.add(r14);
                                                int size = list.size() - 1;
                                                try {
                                                    size = r02.A00(r18);
                                                    r02.A09(" ");
                                                    r02.A04(size);
                                                    i3 = matcher.end();
                                                } catch (Throwable th) {
                                                    throw th;
                                                } finally {
                                                    r02.A04(size);
                                                }
                                            }
                                            String substring2 = Bcv.substring(i3, Bcv.length());
                                            0qQ.A07(substring2);
                                            r02.A09(substring2);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case 2:
                                        XAR BMl = xAq.BMl();
                                        if (!(BMl == null || (uri = BMl.getUri()) == null)) {
                                            i2 = r02.A00(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j4, 0, 0));
                                            try {
                                                int A012 = r02.A01("web_url_span", uri);
                                                try {
                                                    C303916Bh r2 = new C303916Bh(new C56050Hrz(uri), "", r02.A00.length(), AnonymousClass972.MUTABLE_FLAG_MASK);
                                                    List list2 = r02.A03;
                                                    list2.add(r2);
                                                    r02.A01.add(r2);
                                                    i2 = list2.size() - 1;
                                                    r02.A07(BMl.AyC());
                                                    r02.A04(A012);
                                                    r02.A04(i2);
                                                    break;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r02.A04(A012);
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                break;
                                            } finally {
                                                r02.A04(i2);
                                            }
                                        }
                                    case 3:
                                        C51955G8y BRe = xAq.BRe();
                                        if (BRe != null) {
                                            textAppMentionType = BRe.BRg();
                                        } else {
                                            textAppMentionType = null;
                                        }
                                        String Bcv2 = xAq.Bcv();
                                        if (!(BRe == null || textAppMentionType == null || Bcv2 == null)) {
                                            int ordinal = textAppMentionType.ordinal();
                                            if (ordinal == 2) {
                                                i2 = r02.A00(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j4, 0, 0));
                                                i2 = r02.A01("mention_span", Bcv2);
                                                r02.A09(Bcv2);
                                                r02.A04(i2);
                                                break;
                                            } else if (ordinal == 1) {
                                                String A0F = 00l.A0F("@", Bcv2);
                                                String A0g = 00p.A0g(Bcv2, "@", "", false);
                                                int A002 = r02.A00(new AnonymousClass5ZB((C291805hu) null, (C289645dx) null, C303936Bj.A00(context2), (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C286155Ud) null, (C291735hn) null, (C291795ht) null, AnonymousClass5Z8.A00(j4), (C291745ho) null, (String) null, AnonymousClass5Z5.A01, AnonymousClass5Z7.A01(3), AnonymousClass5RW.A08));
                                                try {
                                                    A002 = r02.A01("ig_mention_span", A0g);
                                                    r02.A09("");
                                                    r02.A04(A002);
                                                    A002 = r02.A00(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j4, 0, 0));
                                                    A002 = r02.A01("ig_mention_span", A0g);
                                                    r02.A09(A0F);
                                                    r02.A04(A002);
                                                    break;
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                } finally {
                                                    r02.A04(A002);
                                                }
                                            } else if (ordinal == 0) {
                                                r02.A09(Bcv2);
                                                break;
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        }
                                    case 5:
                                        String Bcv3 = xAq.Bcv();
                                        if (Bcv3 == null) {
                                            continue;
                                        } else {
                                            if (r62 == null || (str3 = r15.A02) == null || str3.length() == 0) {
                                                j3 = j4;
                                            } else {
                                                j3 = AnonymousClass5RW.A07;
                                            }
                                            int A003 = r02.A00(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j3, 0, 0));
                                            try {
                                                A003 = r02.A01("tag_span", Bcv3);
                                                r02.A09(Bcv3);
                                                break;
                                            } catch (Throwable th5) {
                                                throw th5;
                                            } finally {
                                                r02.A04(A003);
                                            }
                                        }
                                    default:
                                        throw new RuntimeException();
                                }
                                throw th;
                            }
                        }
                    }
                    r4 = r02.A02();
                    if (182.A06(r10, userSession2, 36327915721407281L) && (length = C303866Bc.A00(context2, r15, str5, j4, z3).length()) != (length2 = r4.length())) {
                        0f9 AEf = 0wj.A01.AEf("PostTextState", 817899461);
                        AEf.ABQ(DialogModule.KEY_MESSAGE, 002.A0O("Text parse inconsistency, length difference: ", length - length2));
                        AEf.report();
                    }
                }
            }
            r4 = C303866Bc.A00(context2, r15, str5, j4, z3);
        }
        this.A05 = r4;
    }

    public final C286025Tq A00() {
        C286025Tq r2;
        C284945Oz r0 = this.A03;
        if (r0 == null || (r2 = (C286025Tq) r0.getValue()) == null) {
            C286025Tq r22 = this.A00;
            if (this.A04.getValue() == C299585vR.Collapsed && r22 != null) {
                return r22;
            }
        } else if (r2.length() != 0) {
            return r2;
        }
        return this.A05;
    }
}
