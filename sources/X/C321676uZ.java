package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6uZ  reason: invalid class name and case insensitive filesystem */
public class C321676uZ extends C46329Dbx implements C321686ua {
    public Integer A00;
    public String A01;
    public boolean A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C2366634p A07 = A02("fetch_first_thumbnail");

    public final void A0T(C268654dm r4) {
        String str;
        Integer num;
        Integer num2 = null;
        if (r4 != null) {
            AnonymousClass1XT r1 = (AnonymousClass1XT) r4.A00();
            if (r1 != null) {
                num2 = Integer.valueOf(r1.getStatusCode());
                str = r1.getErrorMessage();
            } else {
                Throwable A012 = r4.A01();
                if (A012 != null) {
                    if (A012 instanceof C69248NiA) {
                        C69248NiA niA = (C69248NiA) A012;
                        if (niA != null) {
                            num = Integer.valueOf(niA.A00);
                        } else {
                            num = null;
                        }
                        str = null;
                        num2 = num;
                    } else {
                        str = A012.getMessage();
                    }
                }
            }
            this.A03 = num2;
            C2366634p r2 = this.A00;
            if (str == null || str.length() == 0) {
                str = AnonymousClass000.A00(363);
            }
            r2.A07(str);
        }
        str = null;
        this.A03 = num2;
        C2366634p r22 = this.A00;
        str = AnonymousClass000.A00(363);
        r22.A07(str);
    }

    public void A05() {
        String str = this.A04;
        if (str != null) {
            A0J("asset_id", str);
        }
        String str2 = this.A01;
        if (str2 != null) {
            A0J("tab_id", str2);
        }
        Integer num = this.A00;
        if (num != null) {
            A0G("num_videos", num.intValue());
        }
        Integer num2 = this.A03;
        if (num2 != null) {
            A0G("http_status_code", num2.intValue());
        }
        A0K("cached_response", this.A02);
    }

    public final void A0U(String str) {
        if (str != null && str.length() != 0) {
            this.A04 = str;
        }
    }

    public final void D3T() {
        if (!this.A06) {
            this.A07.A08((String) null);
            this.A06 = true;
        }
    }

    public final void D3U() {
        if (!this.A05) {
            this.A07.A07(AnonymousClass000.A00(363));
            this.A05 = true;
        }
    }

    public final void D3V() {
        if (!this.A05) {
            this.A07.A05();
            this.A05 = true;
        }
    }

    public C321676uZ(UserSession userSession, String str, int i) {
        super(userSession, str, i);
    }
}
