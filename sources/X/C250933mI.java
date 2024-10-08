package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3mI  reason: invalid class name and case insensitive filesystem */
public abstract class C250933mI {
    public ImmutableList A00;
    public AdFormatType A01;
    public C257583xd A02;
    public C250183l2 A03;
    public C257663xl A04;
    public C258043yN A05;
    public C255013tR A06;
    public C257673xm A07;
    public C257643xj A08;
    public DynamicProductAdDisplayOption A09;
    public C257703xp A0A;
    public IGCTMessagingAdsInfoDictIntf A0B;
    public C250213l5 A0C;
    public C257813y0 A0D;
    public IntentAwareAdsInfoIntf A0E;
    public C257873y6 A0F;
    public C270134gF A0G;
    public C257893y8 A0H;
    public C67241sS A0I;
    public C257803xz A0J;
    public C257853y4 A0K;
    public 1Xj A0L;
    public 1iA A0M;
    public IgShowreelNativeAnimationIntf A0N;
    public AnonymousClass3I2 A0O;
    public C257913yA A0P;
    public C257933yC A0Q;
    public Boolean A0R;
    public Boolean A0S;
    public Boolean A0T = false;
    public Boolean A0U;
    public Boolean A0V;
    public Integer A0W;
    public Integer A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public List A0m;
    public List A0n;
    public List A0o;
    public List A0p;
    public List A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;

    public final void A00() {
        boolean A60;
        C250513lZ injected;
        C250513lZ injected2;
        ImmutableList of;
        List cookies;
        1Xj r2 = this.A0L;
        if (r2 != null) {
            String str = this.A0g;
            if (str == null) {
                C250513lZ injected3 = r2.A0C.getInjected();
                if (injected3 != null) {
                    str = injected3.BKL();
                } else {
                    str = null;
                }
            }
            this.A0g = str;
            List list = this.A0q;
            if (list == null) {
                list = r2.A3k();
            }
            this.A0q = list;
            String str2 = this.A0l;
            if (str2 == null) {
                str2 = r2.A2v();
            }
            this.A0l = str2;
            String str3 = this.A0b;
            if (str3 == null) {
                str3 = r2.A2S();
            }
            this.A0b = str3;
            if (this.A00 == null) {
                C250513lZ injected4 = r2.A0C.getInjected();
                if (injected4 == null || (cookies = injected4.getCookies()) == null) {
                    of = ImmutableList.of();
                } else {
                    of = ImmutableList.copyOf((Collection) cookies);
                }
                this.A00 = of;
            }
            String str4 = this.A0Z;
            if (str4 == null) {
                str4 = r2.A2R();
            }
            this.A0Z = str4;
            String str5 = this.A0h;
            if (str5 == null) {
                str5 = r2.A0C.BMq();
            }
            this.A0h = str5;
            List list2 = this.A0m;
            if (list2 == null) {
                list2 = r2.A3P();
            }
            this.A0m = list2;
            C255013tR r0 = this.A06;
            if (r0 == null) {
                C250513lZ injected5 = r2.A0C.getInjected();
                if (injected5 != null) {
                    r0 = injected5.AtX();
                } else {
                    r0 = null;
                }
            }
            this.A06 = r0;
            String str6 = this.A0e;
            if (str6 == null) {
                str6 = r2.A0C.getDominantColor();
            }
            this.A0e = str6;
            String str7 = this.A0a;
            if (str7 == null) {
                str7 = r2.A0C.BZp();
            }
            this.A0a = str7;
            IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A0B;
            if (iGCTMessagingAdsInfoDictIntf == null) {
                iGCTMessagingAdsInfoDictIntf = r2.A1H();
            }
            this.A0B = iGCTMessagingAdsInfoDictIntf;
            C250213l5 r02 = this.A0C;
            if (r02 == null) {
                C250513lZ injected6 = r2.A0C.getInjected();
                if (injected6 != null) {
                    r02 = injected6.AnU();
                } else {
                    r02 = null;
                }
            }
            this.A0C = r02;
            C257673xm r03 = this.A07;
            if (r03 == null) {
                C250513lZ injected7 = r2.A0C.getInjected();
                if (injected7 != null) {
                    r03 = injected7.Atd();
                } else {
                    r03 = null;
                }
            }
            this.A07 = r03;
            C257893y8 r04 = this.A0H;
            if (r04 == null) {
                C250513lZ injected8 = r2.A0C.getInjected();
                if (injected8 != null) {
                    r04 = injected8.BhM();
                } else {
                    r04 = null;
                }
            }
            this.A0H = r04;
            C257643xj r05 = this.A08;
            if (r05 == null && (r05 = r2.A0C.AsQ()) == null) {
                C250513lZ injected9 = r2.A0C.getInjected();
                if (injected9 != null) {
                    r05 = injected9.AsR();
                } else {
                    r05 = null;
                }
            }
            this.A08 = r05;
            String str8 = this.A0d;
            if (str8 == null) {
                str8 = r2.A2V();
            }
            this.A0d = str8;
            String str9 = this.A0c;
            if (str9 == null && ((injected2 = r2.A0C.getInjected()) == null || (str9 = injected2.Ac5()) == null)) {
                str9 = null;
            }
            this.A0c = str9;
            String str10 = this.A0k;
            if (str10 == null) {
                str10 = r2.A2r();
            }
            this.A0k = str10;
            String str11 = this.A0Y;
            if (str11 == null && ((injected = r2.A0C.getInjected()) == null || (str11 = injected.AYn()) == null)) {
                str11 = null;
            }
            this.A0Y = str11;
            AnonymousClass3I2 r06 = this.A0O;
            if (r06 == null) {
                r06 = r2.A22();
            }
            this.A0O = r06;
            Integer num = this.A0W;
            if (num == null) {
                num = r2.B9V();
            }
            this.A0W = num;
            C67241sS r07 = this.A0I;
            if (r07 == null) {
                r07 = r2.BJP();
            }
            this.A0I = r07;
            Integer num2 = this.A0X;
            if (num2 == null) {
                num2 = r2.CEl();
            }
            this.A0X = num2;
            IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf = this.A0N;
            if (igShowreelNativeAnimationIntf == null) {
                igShowreelNativeAnimationIntf = r2.A0C.BwB();
            }
            this.A0N = igShowreelNativeAnimationIntf;
            Boolean bool = this.A0U;
            if (bool != null) {
                A60 = bool.booleanValue();
            } else {
                A60 = r2.A60();
            }
            this.A0U = Boolean.valueOf(A60);
            List list3 = this.A0n;
            if (list3 == null) {
                list3 = r2.A0C.Alu();
            }
            this.A0n = list3;
            1iA r1 = this.A0M;
            if (r1 == null) {
                r1 = r2.BR7();
            }
            this.A0M = r1;
            if (r1 == 1iA.A09 && this.A05 == null) {
                this.A05 = AnonymousClass492.A00;
            }
            C257913yA r08 = this.A0P;
            if (r08 == null) {
                C250513lZ injected10 = r2.A0C.getInjected();
                if (injected10 != null) {
                    r08 = injected10.Bl6();
                } else {
                    r08 = null;
                }
            }
            this.A0P = r08;
            C257933yC r09 = this.A0Q;
            if (r09 == null) {
                C250513lZ injected11 = r2.A0C.getInjected();
                if (injected11 != null) {
                    r09 = injected11.Bl7();
                } else {
                    r09 = null;
                }
            }
            this.A0Q = r09;
            C257813y0 r010 = this.A0D;
            if (r010 == null) {
                C250513lZ injected12 = r2.A0C.getInjected();
                if (injected12 != null) {
                    r010 = injected12.BMD();
                } else {
                    r010 = null;
                }
            }
            this.A0D = r010;
            AdFormatType adFormatType = this.A01;
            if (adFormatType == null) {
                C250513lZ injected13 = r2.A0C.getInjected();
                if (injected13 != null) {
                    adFormatType = injected13.B7V();
                } else {
                    adFormatType = null;
                }
            }
            this.A01 = adFormatType;
            return;
        }
        throw new IllegalStateException("Media must be non-null");
    }
}
