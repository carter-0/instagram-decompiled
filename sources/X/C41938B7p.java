package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.util.Collection;
import java.util.List;

/* renamed from: X.B7p  reason: case insensitive filesystem */
public final class C41938B7p {
    public AdFormatType A00;
    public C257573xc A01;
    public C250173l1 A02;
    public C257653xk A03;
    public AnonymousClass493 A04;
    public C257633xi A05;
    public DynamicProductAdDisplayOption A06;
    public C257703xp A07;
    public C279784zJ A08;
    public C257863y5 A09;
    public C270134gF A0A;
    public C257793xy A0B;
    public C257843y3 A0C;
    public C45270CtZ A0D;
    public C45427Cw7 A0E;
    public C257903y9 A0F;
    public C257923yB A0G;
    public C233492vo A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Integer A0O;
    public Integer A0P;
    public Long A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public List A0d = 0sn.A00;
    public List A0e;
    public List A0f;
    public List A0g;
    public List A0h;
    public List A0i;

    public final C376489Ie A00() {
        return new C376489Ie(C295375o3.A03(A01()), new C233462vl((C67241sS) null, this.A0H, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false));
    }

    public final GV8 A01() {
        1Xj r3;
        String str;
        IntentAwareAdsInfo intentAwareAdsInfo;
        1Xj r0 = (1Xj) A02().get(0);
        Long l = this.A0Q;
        if (l != null) {
            r0.A0C.EQ7(l);
        }
        1iA A002 = 1i9.A00(this.A0O);
        if (1iA.A09 != A002 || (r3 = 1Xj.A0h.A0D(this.A0Z, A02())) == null) {
            r3 = (1Xj) A02().get(0);
        }
        r3.A0F = this.A0F;
        GV9 gv9 = new GV9();
        gv9.A0L = r3;
        gv9.A0M = A002;
        gv9.A01 = this.A00;
        gv9.A0n = A02();
        gv9.A05 = this.A04;
        gv9.A0J = this.A0B;
        gv9.A08 = this.A05;
        gv9.A0e = this.A0V;
        gv9.A0a = this.A0S;
        gv9.A0K = this.A0C;
        String str2 = this.A0X;
        if (str2 != null) {
            gv9.A0g = str2;
            List list = this.A0h;
            if (list != null) {
                gv9.A0q = ImmutableList.copyOf((Collection) list);
                String str3 = this.A0c;
                if (str3 != null) {
                    gv9.A0l = str3;
                    String str4 = this.A0T;
                    if (str4 != null) {
                        gv9.A0b = str4;
                        List list2 = this.A0e;
                        if (list2 != null) {
                            gv9.A00 = ImmutableList.copyOf((Collection) list2);
                            gv9.A0Z = this.A0R;
                            gv9.A0m = ImmutableList.copyOf((Collection) this.A0d);
                            gv9.A0h = this.A0Y;
                            gv9.A00 = new C233462vl((C67241sS) null, this.A0H, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
                            gv9.A0P = this.A0F;
                            gv9.A0Q = this.A0G;
                            gv9.A0U = this.A0M;
                            gv9.A0p = this.A0g;
                            gv9.A09 = this.A06;
                            gv9.A04 = this.A03;
                            gv9.A02 = this.A01;
                            gv9.A0S = this.A0J;
                            gv9.A0o = this.A0f;
                            gv9.A0X = this.A0P;
                            gv9.A03 = this.A02;
                            gv9.A0F = this.A09;
                            gv9.A0A = this.A07;
                            C45270CtZ ctZ = this.A0D;
                            if (ctZ != null) {
                                intentAwareAdsInfo = ctZ.A00;
                            } else {
                                intentAwareAdsInfo = null;
                            }
                            gv9.A0E = intentAwareAdsInfo;
                            gv9.A0i = this.A0a;
                            gv9.A0V = this.A0N;
                            gv9.A0R = this.A0I;
                            gv9.A0T = this.A0K;
                            gv9.A0D = this.A08;
                            GV8 A012 = gv9.A01();
                            0qQ.A0C(A012, AnonymousClass000.A00(1636));
                            return A012;
                        }
                        str = "cookies";
                    } else {
                        str = "adTitle";
                    }
                } else {
                    str = "trackingToken";
                }
            } else {
                str = "hideReasons";
            }
        } else {
            str = "label";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final List A02() {
        List list = this.A0i;
        if (list != null) {
            return list;
        }
        0qQ.A0F(DialogModule.KEY_ITEMS);
        throw AnonymousClass00P.createAndThrow();
    }
}
