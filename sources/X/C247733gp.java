package X;

import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3gp  reason: invalid class name and case insensitive filesystem */
public final class C247733gp {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public AnonymousClass571 A05;
    public C252883pr A06;
    public 1Xj A07;
    public User A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public String A0Q;
    public final int A0R;
    public final int A0S;
    public final CommentGiphyMediaInfoIntf A0T;
    public final CommentRestrictStatus A0U;
    public final AnonymousClass572 A0V;
    public final C269874fp A0W;
    public final C269824fk A0X;
    public final C269854fn A0Y;
    public final Integer A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final Map A0f;
    public final Map A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final C65211bM A0r;

    public C247733gp(C65211bM r10) {
        long j;
        Integer num;
        int i;
        int i2;
        String str;
        int i3;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        int intValue;
        0qQ.A0B(r10, 1);
        this.A0r = r10;
        String pk = r10.getPk();
        this.A0G = pk == null ? String.valueOf(super.hashCode()) : pk;
        Long AsC = r10.AsC();
        if (AsC != null) {
            j = AsC.longValue();
        } else {
            j = 0;
        }
        this.A03 = j;
        String mediaId = r10.getMediaId();
        String str2 = "";
        this.A0E = mediaId == null ? str2 : mediaId;
        String text = r10.getText();
        this.A0d = text == null ? str2 : text;
        Integer CAf = r10.CAf();
        if (CAf == null || (intValue = CAf.intValue()) == 0 || intValue != 1) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A0Z = num;
        this.A08 = r10.CCd();
        this.A0h = 0qQ.A0K(r10.BCJ(), true);
        Integer ApI = r10.ApI();
        if (ApI != null) {
            i = ApI.intValue();
        } else {
            i = 0;
        }
        this.A02 = i;
        this.A0O = 0qQ.A0K(r10.BBU(), true);
        0qQ.A0K(r10.Awx(), true);
        this.A0o = 0qQ.A0K(r10.BDL(), true);
        this.A0p = 0qQ.A0K(r10.BvL(), true);
        Integer AnF = r10.AnF();
        if (AnF != null) {
            i2 = AnF.intValue();
        } else {
            i2 = 0;
        }
        this.A01 = i2;
        this.A0F = r10.BaV();
        Integer ApF = r10.ApF();
        String str3 = null;
        if (ApF != null) {
            str = ApF.toString();
        } else {
            str = null;
        }
        this.A0B = str;
        Integer AnG = r10.AnG();
        this.A0A = AnG != null ? AnG.toString() : str3;
        String backgroundColor = r10.getBackgroundColor();
        this.A0a = backgroundColor == null ? str2 : backgroundColor;
        String Aei = r10.Aei();
        this.A0b = Aei == null ? str2 : Aei;
        String textColor = r10.getTextColor();
        this.A0e = textColor != null ? textColor : str2;
        Integer C5c = r10.C5c();
        if (C5c != null) {
            i3 = C5c.intValue();
        } else {
            i3 = 0;
        }
        this.A0S = i3;
        this.A0g = r10.BRh();
        0sn Azi = r10.Azi();
        this.A0K = Azi == null ? 0sn.A00 : Azi;
        this.A0D = r10.BPo();
        0qQ.A0K(r10.CYC(), true);
        this.A0m = 0qQ.A0K(r10.CaL(), true);
        this.A0j = 0qQ.A0K(r10.CUi(), true);
        r10.BHF();
        this.A0U = r10.Bnw();
        this.A0X = r10.AlN();
        this.A0W = r10.BQL();
        this.A0Y = r10.BKF();
        this.A0l = 0qQ.A0K(r10.CZ8(), true);
        0qQ.A0K(r10.CaE(), true);
        this.A0n = 0qQ.A0K(r10.CQf(), true);
        0qQ.A0K(r10.Akw(), true);
        0qQ.A0K(r10.Al5(), true);
        this.A0k = 0qQ.A0K(r10.CWI(), true);
        0qQ.A0K(r10.CWH(), true);
        this.A0i = 0qQ.A0K(r10.CQg(), true);
        0qQ.A0K(r10.Cef(), true);
        r10.Bfr();
        0qQ.A0K(r10.ApE(), true);
        List B4I = r10.B4I();
        if (B4I != null) {
            ArrayList<C46277DTg> arrayList2 = new ArrayList<>();
            for (Object next : B4I) {
                C46277DTg dTg = (C46277DTg) next;
                int offset = dTg.getOffset();
                int length = this.A0d.length();
                int min = Math.min(dTg.getLength() + offset, length);
                if (offset < min && min <= length) {
                    arrayList2.add(next);
                }
            }
            int A0L2 = 0se.A0L(0Yv.A1E(arrayList2, 10));
            linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
            for (C46277DTg dTg2 : arrayList2) {
                String substring = this.A0d.substring(dTg2.getOffset(), Math.min(dTg2.getOffset() + dTg2.getLength(), this.A0d.length()));
                0qQ.A07(substring);
                linkedHashMap.put(substring, dTg2);
            }
        } else {
            linkedHashMap = 0Yt.A0E();
        }
        this.A0f = linkedHashMap;
        this.A0R = linkedHashMap.size();
        this.A0T = this.A0r.B9K();
        this.A0J = this.A0r.AyN();
        this.A0q = 0qQ.A0K(this.A0r.Bvr(), true);
        this.A0I = this.A0r.Aln();
        this.A06 = C252883pr.Success;
        this.A0c = this.A0r.Bm8();
        this.A05 = C252893ps.A00(this.A0r.AeJ());
        C269834fl BGS = this.A0r.BGS();
        this.A0V = BGS != null ? new AnonymousClass572((String) null, BGS.BGT()) : null;
        List<C65211bM> Bev = this.A0r.Bev();
        if (Bev != null) {
            arrayList = new ArrayList(0Yv.A1E(Bev, 10));
            for (C65211bM r1 : Bev) {
                arrayList.add(new C247733gp(r1));
            }
        } else {
            arrayList = 0sn.A00;
        }
        this.A0L = arrayList;
    }

    public final String A00() {
        String str = this.A0Q;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A0Q = str;
        }
        0qQ.A0A(str);
        return str;
    }

    public final void A01(C247733gp r4) {
        this.A0L = 00k.A0T(r4, this.A0L);
        this.A01++;
        String str = this.A0F;
        if (str == null) {
            str = this.A0G;
        }
        r4.A0F = str;
        r4.A02(this.A07);
        List<C247733gp> list = this.A0L;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C247733gp r0 : list) {
                if (0qQ.A0K(r0.A0G, r4.A0G)) {
                    return;
                }
            }
        }
        r4.A0A = String.valueOf(this.A0L.size());
        r4.A0B = this.A0B;
        this.A0L = 00k.A0T(r4, this.A0L);
    }

    public final void A02(1Xj r3) {
        String str;
        this.A07 = r3;
        if (r3 == null || (str = r3.getId()) == null) {
            str = "";
        }
        this.A0E = str;
        if (!this.A0L.isEmpty()) {
            for (C247733gp A022 : this.A0L) {
                A022.A02(r3);
            }
        }
    }

    public final boolean A03() {
        if (this.A0Z == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C247733gp)) {
            return false;
        }
        String str = ((C247733gp) obj).A0G;
        String str2 = this.A0G;
        if (str2 == null || str == null) {
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        return this.A0G.hashCode();
    }

    public final String toString() {
        String str;
        Locale locale = Locale.getDefault();
        Long valueOf = Long.valueOf(this.A03);
        User user = this.A08;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "null";
        }
        String format = String.format(locale, "Comment{mCreatedAtSeconds=%d, mUser=@%s, mText='%s'}", Arrays.copyOf(new Object[]{valueOf, str, this.A0d}, 3));
        0qQ.A07(format);
        return format;
    }
}
