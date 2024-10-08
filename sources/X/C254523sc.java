package X;

import android.app.Activity;
import android.os.Parcelable;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3sc  reason: invalid class name and case insensitive filesystem */
public final class C254523sc implements C254533sd {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public long A0b;
    public long A0c;
    public C297375re A0d;
    public RIl A0e;
    public V1T A0f;
    public AnonymousClass9I9 A0g;
    public C257603xf A0h;
    public ProductReviewStatus A0i;
    public 0jB A0j;
    public 0jB A0k;
    public 0jB A0l;
    public 0jB A0m;
    public 0jB A0n;
    public 0jB A0o;
    public 0jB A0p;
    public 0jB A0q;
    public 0jB A0r;
    public 0jB A0s;
    public 0jB A0t;
    public 0jB A0u;
    public C254223s8 A0v;
    public C292915jj A0w;
    public ProductCollectionLinkIntf A0x;
    public ProfileShopLinkIntf A0y;
    public ReelMultiProductLinkIntf A0z;
    public ReelProductLink A10;
    public SearchContext A11;
    public C297795sM A12;
    public Boolean A13;
    public Boolean A14;
    public Boolean A15;
    public Boolean A16;
    public Boolean A17;
    public Boolean A18;
    public Boolean A19;
    public Boolean A1A;
    public Boolean A1B;
    public Boolean A1C;
    public Boolean A1D;
    public Boolean A1E;
    public Boolean A1F;
    public Boolean A1G;
    public Boolean A1H;
    public Boolean A1I;
    public Boolean A1J;
    public Boolean A1K;
    public Boolean A1L;
    public Boolean A1M;
    public Boolean A1N;
    public Boolean A1O;
    public Boolean A1P;
    public Boolean A1Q;
    public Boolean A1R;
    public Boolean A1S;
    public Boolean A1T;
    public Boolean A1U;
    public Boolean A1V;
    public Boolean A1W;
    public Boolean A1X;
    public Boolean A1Y;
    public Boolean A1Z;
    public Boolean A1a;
    public Boolean A1b;
    public Boolean A1c;
    public Boolean A1d;
    public Boolean A1e;
    public Boolean A1f;
    public Boolean A1g;
    public Boolean A1h;
    public Boolean A1i;
    public Boolean A1j;
    public Boolean A1k;
    public Boolean A1l;
    public Boolean A1m;
    public Boolean A1n;
    public Boolean A1o;
    public Boolean A1p;
    public Boolean A1q;
    public Boolean A1r;
    public Boolean A1s;
    public Boolean A1t;
    public Boolean A1u;
    public Boolean A1v;
    public Boolean A1w;
    public Boolean A1x;
    public Boolean A1y;
    public Boolean A1z;
    public Boolean A20;
    public Boolean A21;
    public Boolean A22;
    public Boolean A23;
    public Boolean A24;
    public Boolean A25;
    public Boolean A26;
    public Boolean A27;
    public Boolean A28;
    public Boolean A29;
    public Boolean A2A;
    public Boolean A2B;
    public Boolean A2C;
    public Boolean A2D;
    public Boolean A2E;
    public Boolean A2F;
    public Boolean A2G;
    public Double A2H;
    public Double A2I;
    public Double A2J;
    public Double A2K;
    public Double A2L;
    public Double A2M;
    public Double A2N;
    public Double A2O;
    public Double A2P;
    public Double A2Q;
    public Double A2R;
    public Double A2S;
    public Double A2T;
    public Double A2U;
    public Double A2V;
    public Double A2W;
    public Double A2X;
    public Double A2Y;
    public Double A2Z;
    public Double A2a;
    public Double A2b;
    public Double A2c;
    public Double A2d;
    public Float A2e;
    public Float A2f;
    public Float A2g;
    public Float A2h;
    public Float A2i;
    public Float A2j;
    public Integer A2k;
    public Integer A2l;
    public Integer A2m;
    public Integer A2n;
    public Integer A2o;
    public Integer A2p;
    public Integer A2q;
    public Integer A2r;
    public Integer A2s;
    public Integer A2t;
    public Integer A2u;
    public Integer A2v;
    public Integer A2w;
    public Integer A2x;
    public Integer A2y;
    public Integer A2z;
    public Integer A30;
    public Integer A31;
    public Integer A32;
    public Integer A33;
    public Integer A34;
    public Integer A35;
    public Integer A36;
    public Integer A37;
    public Integer A38;
    public Integer A39;
    public Integer A3A;
    public Integer A3B;
    public Integer A3C;
    public Integer A3D;
    public Integer A3E;
    public Integer A3F;
    public Long A3G;
    public Long A3H;
    public Long A3I;
    public Long A3J;
    public Long A3K;
    public Long A3L;
    public Long A3M;
    public Long A3N;
    public Long A3O;
    public Long A3P;
    public Long A3Q;
    public Long A3R;
    public Long A3S;
    public Long A3T;
    public Long A3U;
    public Long A3V;
    public Long A3W;
    public Long A3X;
    public Long A3Y;
    public Long A3Z;
    public Long A3a;
    public Long A3b;
    public Long A3c;
    public Long A3d;
    public Long A3e;
    public Long A3f;
    public Long A3g;
    public Long A3h;
    public Long A3i;
    public Long A3j;
    public Long A3k;
    public Long A3l;
    public Long A3m;
    public Long A3n;
    public Long A3o;
    public Long A3p;
    public Long A3q;
    public Long A3r;
    public Long A3s;
    public Long A3t;
    public Long A3u;
    public Long A3v;
    public Long A3w;
    public Long A3x;
    public Long A3y;
    public Long A3z;
    public Long A40;
    public Long A41;
    public Long A42;
    public Long A43;
    public Long A44;
    public Long A45;
    public Long A46;
    public Long A47;
    public Long A48;
    public Long A49;
    public Long A4A;
    public Long A4B;
    public Long A4C;
    public Long A4D;
    public Long A4E;
    public Long A4F;
    public Long A4G;
    public String A4H;
    public String A4I;
    public String A4J;
    public String A4K;
    public String A4L;
    public String A4M;
    public String A4N;
    public String A4O;
    public String A4P;
    public String A4Q;
    public String A4R;
    public String A4S;
    public String A4T;
    public String A4U;
    public String A4V;
    public String A4W;
    public String A4X;
    public String A4Y;
    public String A4Z;
    public String A4a;
    public String A4b;
    public String A4c;
    public String A4d;
    public String A4e;
    public String A4f;
    public String A4g;
    public String A4h;
    public String A4i;
    public String A4j;
    public String A4k;
    public String A4l;
    public String A4m;
    public String A4n;
    public String A4o;
    public String A4p;
    public String A4q;
    public String A4r;
    public String A4s;
    public String A4t;
    public String A4u;
    public String A4v;
    public String A4w;
    public String A4x;
    public String A4y;
    public String A4z;
    public String A50;
    public String A51;
    public String A52;
    public String A53;
    public String A54;
    public String A55;
    public String A56;
    public String A57;
    public String A58;
    public String A59;
    public String A5A;
    public String A5B;
    public String A5C;
    public String A5D;
    public String A5E;
    public String A5F;
    public String A5G;
    public String A5H;
    public String A5I;
    public String A5J;
    public String A5K;
    public String A5L;
    public String A5M;
    public String A5N;
    public String A5O;
    public String A5P;
    public String A5Q;
    public String A5R;
    public String A5S;
    public String A5T;
    public String A5U;
    public String A5V;
    public String A5W;
    public String A5X;
    public String A5Y;
    public String A5Z;
    public String A5a;
    public String A5b;
    public String A5c;
    public String A5d;
    public String A5e;
    public String A5f;
    public String A5g;
    public String A5h;
    public String A5i;
    public String A5j;
    public String A5k;
    public String A5l;
    public String A5m;
    public String A5n;
    public String A5o;
    public String A5p;
    public String A5q;
    public String A5r;
    public String A5s;
    public String A5t;
    public String A5u;
    public String A5v;
    public String A5w;
    public String A5x;
    public String A5y;
    public String A5z;
    public String A60;
    public String A61;
    public String A62;
    public String A63;
    public String A64;
    public String A65;
    public String A66;
    public String A67;
    public String A68;
    public String A69;
    public String A6A;
    public String A6B;
    public String A6C;
    public String A6D;
    public String A6E;
    public String A6F;
    public String A6G;
    public String A6H;
    public String A6I;
    public String A6J;
    public String A6K;
    public String A6L;
    public String A6M;
    public String A6N;
    public String A6O;
    public String A6P;
    public String A6Q;
    public String A6R;
    public String A6S;
    public String A6T;
    public String A6U;
    public String A6V;
    public String A6W;
    public String A6X;
    public String A6Y;
    public String A6Z;
    public String A6a;
    public String A6b;
    public String A6c;
    public String A6d;
    public String A6e;
    public String A6f;
    public String A6g;
    public String A6h;
    public String A6i;
    public String A6j;
    public String A6k;
    public String A6l;
    public String A6m;
    public String A6n;
    public String A6o;
    public String A6p;
    public String A6q;
    public String A6r;
    public String A6s;
    public String A6t;
    public String A6u;
    public String A6v;
    public String A6w;
    public String A6x;
    public String A6y;
    public String A6z;
    public String A70;
    public String A71;
    public String A72;
    public String A73;
    public String A74;
    public String A75;
    public String A76;
    public String A77;
    public String A78;
    public String A79;
    public String A7A;
    public String A7B;
    public String A7C;
    public String A7D;
    public String A7E;
    public String A7F;
    public String A7G;
    public String A7H;
    public String A7I;
    public String A7J;
    public String A7K;
    public String A7L;
    public String A7M;
    public String A7N;
    public String A7O;
    public String A7P;
    public String A7Q;
    public String A7R;
    public String A7S;
    public ArrayList A7T;
    public ArrayList A7U;
    public ArrayList A7V;
    public ArrayList A7W;
    public ArrayList A7X;
    public ArrayList A7Y;
    public ArrayList A7Z;
    public ArrayList A7a;
    public ArrayList A7b;
    public ArrayList A7c;
    public ArrayList A7d;
    public ArrayList A7e;
    public ArrayList A7f;
    public HashMap A7g;
    public List A7h;
    public List A7i;
    public List A7j;
    public List A7k;
    public List A7l;
    public List A7m;
    public List A7n;
    public List A7o;
    public List A7p;
    public List A7q;
    public List A7r;
    public List A7s;
    public List A7t;
    public List A7u;
    public List A7v;
    public List A7w;
    public List A7x;
    public List A7y;
    public List A7z;
    public List A80;
    public List A81;
    public List A82;
    public List A83;
    public List A84;
    public Map A85;
    public Map A86;
    public Map A87;
    public Map A88;
    public Map A89;
    public boolean A8A;
    public boolean A8B;
    public int A8C;
    public int A8D;
    public long A8E;
    public 0jB A8F;
    public Hashtag A8G;
    public C2814557v A8H;
    public Product A8I;
    public Boolean A8J;
    public Boolean A8K;
    public Boolean A8L;
    public Boolean A8M;
    public Boolean A8N;
    public Boolean A8O;
    public Boolean A8P;
    public Double A8Q;
    public Double A8R;
    public Double A8S;
    public Integer A8T;
    public Long A8U;
    public Long A8V;
    public Long A8W;
    public Long A8X;
    public Long A8Y;
    public Long A8Z;
    public Long A8a;
    public Long A8b;
    public Long A8c;
    public Long A8d;
    public Long A8e;
    public Long A8f;
    public Long A8g;
    public Long A8h;
    public Long A8i;
    public String A8j;
    public String A8k;
    public String A8l;
    public String A8m;
    public ArrayList A8n;
    public List A8o;
    public List A8p;
    public List A8q;
    public final AnonymousClass4DU A8r;
    public final String A8s;
    public final C270594gz A8t;

    public C254523sc(C270594gz r7, AnonymousClass4DU r8, String str) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r8, 2);
        this.A8s = str;
        this.A8r = r8;
        this.A8t = r7;
        this.A0V = -1;
        this.A8C = -1;
        this.A07 = -1;
        this.A0F = -1;
        this.A0Z = -1;
        this.A01 = -1.0d;
        this.A8D = -1;
        this.A00 = -1.0d;
        this.A0N = -1;
        this.A0Q = -1;
        this.A0L = -1;
        this.A8E = -1;
        this.A0U = -1;
        this.A0A = -1;
        this.A0B = -1;
        this.A0b = -1;
        this.A0c = -1;
        this.A0a = -1;
        this.A05 = -1.0f;
        this.A06 = -1.0f;
        this.A04 = -1.0f;
        this.A0M = -1;
        this.A02 = -1.0d;
        this.A08 = -1;
        this.A0G = -1;
        this.A0I = -1;
        this.A0H = -1;
        this.A0J = -1;
        this.A0W = -1;
        this.A03 = -1.0d;
        this.A0Y = -1;
        this.A0K = -1;
        this.A0X = -1;
        this.A0O = -1;
        this.A0P = -1;
        this.A0D = -1;
        this.A0C = -1;
        this.A0E = -1;
        this.A0S = -1;
        this.A0R = -1;
        this.A0T = -1;
        this.A09 = -1;
        this.A26 = false;
        this.A25 = false;
        this.A2t = AnonymousClass05K.A0C;
    }

    public final void A02() {
        this.A8P = true;
    }

    public final void A05(float f, float f2, float f3, float f4, float f5) {
        this.A2U = Double.valueOf((double) f);
        this.A2T = Double.valueOf((double) f2);
        this.A8S = Double.valueOf((double) f5);
        this.A8R = Double.valueOf((double) f3);
        this.A8Q = Double.valueOf((double) f4);
    }

    public final void A06(int i) {
        this.A8U = Long.valueOf((long) i);
    }

    public final void A07(int i) {
        this.A8V = Long.valueOf((long) i);
    }

    public final void A08(int i) {
        this.A8W = Long.valueOf((long) i);
    }

    public final void A09(int i) {
        this.A8c = Long.valueOf((long) i);
    }

    public final void A0A(int i) {
        this.A3n = Long.valueOf((long) i);
    }

    public final void A0D(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf) {
        Integer num;
        boolean z;
        String str;
        Boolean bool;
        String str2;
        Long l;
        String str3;
        String str4;
        String str5;
        Integer BUY;
        String str6 = null;
        if (intentAwareAdsInfoIntf != null) {
            num = intentAwareAdsInfoIntf.BUY();
        } else {
            num = null;
        }
        Integer A002 = AnonymousClass4I5.A00(num);
        if (A002 != null) {
            switch (A002.intValue()) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    z = true;
                    break;
            }
        }
        z = false;
        this.A1g = Boolean.valueOf(z);
        if (intentAwareAdsInfoIntf != null) {
            str = intentAwareAdsInfoIntf.BHg();
        } else {
            str = null;
        }
        this.A63 = str;
        if (intentAwareAdsInfoIntf != null) {
            bool = intentAwareAdsInfoIntf.CbN();
        } else {
            bool = null;
        }
        this.A1v = bool;
        if (intentAwareAdsInfoIntf != null) {
            str2 = intentAwareAdsInfoIntf.BUR();
        } else {
            str2 = null;
        }
        this.A61 = str2;
        if (intentAwareAdsInfoIntf == null || (BUY = intentAwareAdsInfoIntf.BUY()) == null) {
            l = null;
        } else {
            l = Long.valueOf((long) BUY.intValue());
        }
        this.A3m = l;
        if (intentAwareAdsInfoIntf != null) {
            str3 = intentAwareAdsInfoIntf.BUa();
        } else {
            str3 = null;
        }
        this.A64 = str3;
        if (intentAwareAdsInfoIntf != null) {
            str4 = intentAwareAdsInfoIntf.BUa();
        } else {
            str4 = null;
        }
        this.A62 = str4;
        if (intentAwareAdsInfoIntf != null) {
            str5 = intentAwareAdsInfoIntf.Br2();
        } else {
            str5 = null;
        }
        this.A5Z = str5;
        if (intentAwareAdsInfoIntf != null) {
            str6 = intentAwareAdsInfoIntf.C9y();
        }
        this.A5j = str6;
    }

    public final void A0F(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (this.A8k == null && 182.A06(0Tu.A05, userSession, 36314592732842708L)) {
            this.A8k = 0kd.A00(0xR.A00().A03());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02fb, code lost:
        if (X.AnonymousClass3WS.A07(r12) != false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0464, code lost:
        if (r0 != null) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e2, code lost:
        if (r7.isEmpty() != false) goto L_0x01e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0328  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(com.instagram.common.session.UserSession r12, X.1Xj r13) {
        /*
            r11 = this;
            r4 = 0
            X.0qQ.A0B(r12, r4)
            r3 = 1
            X.0qQ.A0B(r13, r3)
            r11.A0F(r12)
            com.instagram.user.model.User r6 = r13.A2A(r12)
            java.lang.String r0 = r13.getId()
            r11.A5u = r0
            java.lang.String r0 = X.C231122qu.A07(r12, r13)
            r11.A4N = r0
            java.lang.String r0 = r11.A5u
            java.lang.String r0 = X.C231122qu.A0H(r12, r0)
            r11.A5X = r0
            r5 = 0
            if (r6 == 0) goto L_0x0175
            java.lang.String r0 = r6.getId()
        L_0x002a:
            r11.A4W = r0
            long r0 = r13.A1A()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A8h = r0
            X.1iA r0 = r13.BR7()
            int r0 = r0.A00
            r11.A8C = r0
            X.1iA r0 = r13.BR7()
            java.lang.String r0 = r0.name()
            r11.A8l = r0
            X.4DU r2 = r11.A8r
            java.lang.String r0 = r2.getModuleName()
            r11.A6x = r0
            com.instagram.user.model.UpcomingEvent r0 = r13.A27(r12)
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = r0.getId()
        L_0x005a:
            r11.A8m = r0
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            if (r6 == 0) goto L_0x016e
            com.instagram.user.model.FollowStatus r0 = r6.B6o()
        L_0x0064:
            java.lang.String r0 = X.1aC.A06(r0)
            r11.A5I = r0
            java.lang.String r0 = r11.A4J
            if (r0 != 0) goto L_0x0082
            boolean r0 = r13.A5D()
            if (r0 == 0) goto L_0x0166
            X.1Xj r0 = r13.A1c(r4)
            if (r0 == 0) goto L_0x04d2
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.AYt()
        L_0x0080:
            r11.A4J = r0
        L_0x0082:
            X.1Xy r0 = r13.A0C
            java.lang.String r1 = r0.AYt()
            java.lang.String r0 = "webclick"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r13.A5J()
            if (r0 == 0) goto L_0x00a9
            X.1Xy r0 = r13.A0C
            java.util.List r0 = r0.C0M()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            if (r0 == 0) goto L_0x00a9
            r0.AtU()
        L_0x00a9:
            boolean r0 = X.AnonymousClass3WX.A02(r13, r2)
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = X.C231122qu.A0F(r12, r13)
        L_0x00b3:
            r11.A7J = r0
            java.util.ArrayList r0 = r13.A3E()
            r11.A7s = r0
            java.util.ArrayList r0 = r13.A3K(r3)
            r11.A7c = r0
            java.util.ArrayList r0 = r13.A3B()
            r11.A84 = r0
            boolean r0 = r0.isEmpty()
            if (r0 != r3) goto L_0x015a
            java.util.ArrayList r0 = r11.A7c
        L_0x00cf:
            java.util.HashMap r0 = X.C254543se.A01(r0)
            r11.A87 = r0
            java.util.ArrayList r0 = r11.A7c
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017b
        L_0x00df:
            boolean r0 = r13.A6X(r12)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.A1a = r0
            java.util.ArrayList r0 = r11.A7c
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            if (r0 == 0) goto L_0x0158
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
        L_0x00fd:
            r11.A5y = r0
            if (r6 == 0) goto L_0x0156
            java.lang.String r0 = r6.getId()
        L_0x0105:
            r11.A5w = r0
            boolean r0 = r13.A5v()
            if (r0 == 0) goto L_0x017b
            X.3WT r8 = X.AnonymousClass3WT.PRODUCT
            java.util.List r1 = r13.A3o(r8)
            if (r1 == 0) goto L_0x0178
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0178
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x0124:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0179
            java.lang.Object r9 = r10.next()
            X.3ui r9 = (X.C255783ui) r9
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "sticker_type"
            r6.put(r0, r1)
            java.lang.String r1 = r9.A0K()
            if (r1 == 0) goto L_0x0147
            java.lang.String r0 = "sticker_id"
            r6.put(r0, r1)
        L_0x0147:
            java.lang.String r1 = "product_id"
            com.instagram.user.model.Product r0 = r9.A0I()
            java.lang.String r0 = r0.A0H
            r6.put(r1, r0)
            r7.add(r6)
            goto L_0x0124
        L_0x0156:
            r0 = r5
            goto L_0x0105
        L_0x0158:
            r0 = r5
            goto L_0x00fd
        L_0x015a:
            java.util.List r0 = r11.A84
            goto L_0x00cf
        L_0x015e:
            X.1Xy r0 = r13.A0C
            java.lang.String r0 = r0.getOrganicTrackingToken()
            goto L_0x00b3
        L_0x0166:
            X.1Xy r0 = r13.A0C
            java.lang.String r0 = r0.AYt()
            goto L_0x0080
        L_0x016e:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A08
            goto L_0x0064
        L_0x0172:
            r0 = r5
            goto L_0x005a
        L_0x0175:
            r0 = r5
            goto L_0x002a
        L_0x0178:
            r7 = 0
        L_0x0179:
            r11.A8p = r7
        L_0x017b:
            com.instagram.user.model.Product r0 = r13.A26()
            r11.A8I = r0
            if (r0 == 0) goto L_0x018b
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x018b
            java.lang.String r5 = X.AnonymousClass3ZA.A00(r0)
        L_0x018b:
            r11.A5y = r5
            com.instagram.model.shopping.reels.ProfileShopLinkIntf r0 = r13.A1z()
            r11.A0y = r0
            com.instagram.model.shopping.reels.ProductCollectionLinkIntf r0 = r13.A1y()
            r11.A0x = r0
            com.instagram.model.shopping.reels.ReelProductLink r0 = r13.A21()
            r11.A10 = r0
            if (r0 == 0) goto L_0x01b1
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A00
            if (r0 == 0) goto L_0x01b1
            com.instagram.user.model.User r0 = r0.A0G
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x01b1
            r11.A5y = r0
        L_0x01b1:
            com.instagram.model.shopping.reels.ReelMultiProductLinkIntf r0 = r13.A20()
            r11.A0z = r0
            if (r0 == 0) goto L_0x01d5
            java.util.List r0 = r0.Bga()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = (com.instagram.user.model.ProductDetailsProductItemDictIntf) r0
            if (r0 == 0) goto L_0x01d5
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x01d5
            r11.A5y = r0
        L_0x01d5:
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT
            java.util.List r7 = r13.A3o(r0)
            if (r7 == 0) goto L_0x01e4
            boolean r1 = r7.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x01e5
        L_0x01e4:
            r0 = 1
        L_0x01e5:
            r6 = 0
            if (r0 != 0) goto L_0x03ea
            java.lang.Object r0 = r7.get(r4)
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.user.model.Product r5 = r0.A0I()
            java.lang.Object r0 = r7.get(r4)
            X.3ui r0 = (X.C255783ui) r0
            java.lang.String r1 = r0.A0K()
            com.instagram.user.model.User r0 = r5.A0B
            if (r0 == 0) goto L_0x0204
            java.lang.String r6 = X.AnonymousClass3ZA.A00(r0)
        L_0x0204:
            X.57v r7 = new X.57v
            r7.<init>(r1, r6)
            java.lang.String r0 = r5.A0H
            java.util.List r5 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r5)
        L_0x0212:
            r7.A02 = r5
        L_0x0214:
            r11.A8H = r7
            boolean r0 = r13.A4z()
            if (r0 == 0) goto L_0x023c
            java.lang.String[] r0 = r13.A6i()
            X.0qQ.A0B(r0, r4)
            java.util.List r1 = java.util.Arrays.asList(r0)
            X.0qQ.A07(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r11.A8n = r0
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A8f = r0
        L_0x023c:
            X.3QO r1 = r13.A1t()
            X.3QO r0 = X.AnonymousClass3QO.DEFAULT
            if (r1 == r0) goto L_0x024c
            X.3QO r0 = r13.A1t()
            java.lang.String r0 = r0.A00
            r11.A4U = r0
        L_0x024c:
            boolean r0 = r13.CcK()
            if (r0 == 0) goto L_0x0328
            X.3Yy r0 = X.C243483Yy.A00
            java.util.List r0 = r0.A06(r12, r13)
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A8i = r0
            X.0jB r6 = r11.A0m
            if (r6 != 0) goto L_0x026e
            X.0jB r6 = new X.0jB
            r6.<init>()
            r11.A0m = r6
        L_0x026e:
            X.0j9 r5 = X.C271774jZ.A0u
            int r0 = r13.A0n()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A04(r5, r0)
            r11.A0L(r13)
        L_0x027f:
            boolean r0 = r2 instanceof X.C232682uF
            if (r0 == 0) goto L_0x028c
            X.2uF r2 = (X.C232682uF) r2
            X.0jB r0 = r2.E4l(r13)
            r11.A0E(r0)
        L_0x028c:
            X.1Xy r0 = r13.A0C
            com.instagram.model.hashtag.Hashtag r0 = r0.B6n()
            if (r0 == 0) goto L_0x0296
            r11.A8G = r0
        L_0x0296:
            X.1Xy r0 = r13.A0C
            java.lang.String r0 = r0.getMezqlToken()
            if (r0 == 0) goto L_0x02a0
            r11.A60 = r0
        L_0x02a0:
            X.1Xy r0 = r13.A0C
            java.lang.String r0 = r0.getLoggingInfoToken()
            if (r0 == 0) goto L_0x02aa
            r11.A6Z = r0
        L_0x02aa:
            X.1Xy r0 = r13.A0C
            java.lang.String r0 = r0.getConnectionId()
            if (r0 == 0) goto L_0x02b4
            r11.A8j = r0
        L_0x02b4:
            boolean r0 = r13.A5I()
            if (r0 == 0) goto L_0x02c0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r11.A22 = r0
        L_0x02c0:
            boolean r0 = r13.A5Y()
            if (r0 == 0) goto L_0x02cc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r11.A8M = r0
        L_0x02cc:
            X.1Xy r0 = r13.A0C
            java.lang.String r0 = r0.BIl()
            r11.A5m = r0
            java.lang.String r0 = r13.A0R
            r11.A6v = r0
            java.util.List r0 = r13.A0e
            java.lang.String r0 = X.C243413Yr.A00(r0)
            r11.A50 = r0
            X.1Xy r0 = r13.A0C
            java.lang.Boolean r0 = r0.CSj()
            r11.A8L = r0
            X.1Xy r0 = r13.A0C
            java.util.List r0 = r0.C9Z()
            if (r0 == 0) goto L_0x02fd
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02fd
            boolean r0 = X.AnonymousClass3WS.A07(r12)
            r2 = 1
            if (r0 != 0) goto L_0x02fe
        L_0x02fd:
            r2 = 0
        L_0x02fe:
            r1 = 0
            if (r2 == 0) goto L_0x0326
            X.1Xy r0 = r13.A0C
            java.util.List r0 = r0.C9Z()
            if (r0 == 0) goto L_0x0326
            java.lang.Object r0 = r0.get(r4)
            X.4sR r0 = (X.C276074sR) r0
            if (r0 == 0) goto L_0x0326
            java.lang.String r0 = r0.BKV()
        L_0x0315:
            r11.A7L = r0
            if (r2 == 0) goto L_0x0323
            java.lang.String r0 = "closed_caption"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r1 = X.0sr.A1L(r0)
        L_0x0323:
            r11.A7d = r1
            return
        L_0x0326:
            r0 = r1
            goto L_0x0315
        L_0x0328:
            X.1Xy r0 = r13.A0C
            java.util.List r1 = r0.BxO()
            if (r1 == 0) goto L_0x034a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x034a
            java.lang.Object r0 = r1.get(r4)
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r1 = r0.BxW()
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            if (r1 != r0) goto L_0x0383
            java.lang.String r0 = r0.toString()
        L_0x0348:
            r11.A6F = r0
        L_0x034a:
            X.17i r7 = X.17h.A00(r12)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.3Yy r5 = X.C243483Yy.A00
            java.util.List r0 = r5.A06(r12, r13)
            java.util.Iterator r8 = r0.iterator()
        L_0x035d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0385
            java.lang.Object r1 = r8.next()
            java.util.concurrent.ConcurrentMap r0 = r7.A02
            java.lang.Object r0 = r0.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x035d
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            if (r1 == 0) goto L_0x035d
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x035d
            r6.add(r0)
            goto L_0x035d
        L_0x0383:
            r0 = 0
            goto L_0x0348
        L_0x0385:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x038f
            r11.A7b = r6
        L_0x038f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r5.A05(r12, r13)
            if (r0 == 0) goto L_0x03ba
            java.util.Iterator r5 = r0.iterator()
        L_0x039e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x03ba
            java.lang.Object r0 = r5.next()
            X.50R r0 = (X.AnonymousClass50R) r0
            java.lang.String r1 = r0.getId()
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x039e
            r6.add(r0)
            goto L_0x039e
        L_0x03ba:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03c4
            r11.A7Y = r6
        L_0x03c4:
            java.lang.String r0 = r2.getModuleName()
            java.util.ArrayList r5 = X.C254553sf.A01(r12, r13, r0)
            java.lang.String r0 = r2.getModuleName()
            java.util.ArrayList r1 = X.C254553sf.A00(r12, r13, r0)
            if (r5 == 0) goto L_0x03de
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x03de
            r11.A7a = r5
        L_0x03de:
            if (r1 == 0) goto L_0x027f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x027f
            r11.A7Z = r1
            goto L_0x027f
        L_0x03ea:
            X.3WT r0 = X.AnonymousClass3WT.MULTI_PRODUCT
            java.util.List r1 = r13.A3o(r0)
            if (r1 == 0) goto L_0x0446
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0446
            java.lang.Object r0 = r1.get(r4)
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.model.shopping.reels.MultiProductSticker r1 = r0.A0n
            java.lang.String r5 = "Required value was null."
            if (r1 == 0) goto L_0x04cc
            java.util.List r8 = r1.A09
            if (r8 == 0) goto L_0x04c6
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0446
            java.lang.String r1 = X.CnO.A00(r1)
            java.lang.Object r0 = r8.get(r4)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            com.instagram.user.model.User r0 = r0.A0G
            if (r0 == 0) goto L_0x04c0
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x04c0
            X.57v r7 = new X.57v
            r7.<init>(r1, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r8.iterator()
        L_0x0432:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0212
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            java.lang.String r0 = r0.A0h
            if (r0 == 0) goto L_0x0432
            r5.add(r0)
            goto L_0x0432
        L_0x0446:
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT_COLLECTION
            java.util.List r1 = r13.A3o(r0)
            if (r1 == 0) goto L_0x0490
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0490
            java.lang.Object r0 = r1.get(r4)
            X.3ui r0 = (X.C255783ui) r0
            X.BIk r5 = r0.A0o
            if (r5 == 0) goto L_0x048d
            java.lang.String r1 = X.C44933CnT.A00(r5)
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x048e
        L_0x0466:
            X.57v r7 = new X.57v
            r7.<init>(r1, r0)
            if (r5 == 0) goto L_0x048b
            com.instagram.user.model.ProductCollection r0 = r5.A02
            if (r0 == 0) goto L_0x048b
            java.lang.String r0 = r0.Aoi()
        L_0x0475:
            r7.A00 = r0
            if (r5 == 0) goto L_0x0487
            com.instagram.user.model.ProductCollection r0 = r5.A02
            if (r0 == 0) goto L_0x0487
            com.instagram.api.schemas.ProductCollectionV2Type r0 = r0.Aou()
            if (r0 == 0) goto L_0x0487
            java.lang.String r6 = r0.toString()
        L_0x0487:
            r7.A01 = r6
            goto L_0x0214
        L_0x048b:
            r0 = r6
            goto L_0x0475
        L_0x048d:
            r1 = r6
        L_0x048e:
            r0 = r6
            goto L_0x0466
        L_0x0490:
            X.3WT r0 = X.AnonymousClass3WT.STOREFRONT
            java.util.List r1 = r13.A3o(r0)
            if (r1 == 0) goto L_0x04bd
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04bd
            java.lang.Object r0 = r1.get(r4)
            X.3ui r0 = (X.C255783ui) r0
            X.BIn r0 = r0.A0r
            if (r0 == 0) goto L_0x04bb
            java.lang.String r1 = X.C44945Cnf.A00(r0)
            com.instagram.user.model.User r0 = r0.A00
            if (r0 == 0) goto L_0x04b4
            java.lang.String r6 = r0.getId()
        L_0x04b4:
            X.57v r7 = new X.57v
            r7.<init>(r1, r6)
            goto L_0x0214
        L_0x04bb:
            r1 = r6
            goto L_0x04b4
        L_0x04bd:
            r7 = r6
            goto L_0x0214
        L_0x04c0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x04c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x04cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x04d2:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254523sc.A0G(com.instagram.common.session.UserSession, X.1Xj):void");
    }

    public final void A0K(UserSession userSession, AnonymousClass3OA r3) {
        0qQ.A0B(r3, 1);
        A0I(userSession, (1Xj) null, r3);
    }

    public final void A0N(1iA r2) {
        0qQ.A0B(r2, 0);
        this.A8C = r2.A00;
        this.A8l = r2.name();
    }

    public final 0xI A00() {
        C270594gz r2 = this.A8t;
        if (r2 != null) {
            r2.A8S(this, this.A8r, this.A8s);
        }
        0xI A002 = 0xI.A00(this.A8r, this.A8s);
        A002.A04(A01().A00());
        if (0qQ.A0K(this.A8P, true)) {
            A002.A07.add(0j2.A07);
        }
        return A002;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.3sc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.0jB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x08b7  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0905  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x096f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x098f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x09a6  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x09d7  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x09e6  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0a0a  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0a24  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0a5a  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0aec  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0b07  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0b16  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0b1d  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0b52  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0b7b  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0b95  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0bb6  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0be4  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0bf5  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0c04  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0c18  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0c46  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0c56  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0c66  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0c70  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0c82  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0c8b  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0ca0  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0caf  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0cba  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0cc3  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0cce  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0cd7  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0cf5  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0d03  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0d27  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0d36  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0d63  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0dd5  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0e86  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0e8f  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0e98  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0eb6  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0ed7  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0ee7  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0ef0  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0f00  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0f28  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0f3a  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0f6e  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0f7d  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0fb3  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0fd9  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x1006  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x100b  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x101b  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x1094  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x10a2  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x10cb  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x10e0  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x1179  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x11ab  */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x11c9  */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x11df  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x1222  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x122d  */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x1270  */
    /* JADX WARNING: Removed duplicated region for block: B:543:0x12aa  */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x1315  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x131e  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x1327  */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x1330  */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x133b  */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x1344  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x134d  */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x13cf  */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x13f1  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x13ff  */
    /* JADX WARNING: Removed duplicated region for block: B:577:0x1440  */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x144b  */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x1475  */
    /* JADX WARNING: Removed duplicated region for block: B:599:0x15e9  */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x15f9  */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x1609  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0jB A01() {
        /*
            r19 = this;
            r10 = r19
            X.4gz r2 = r10.A8t
            if (r2 == 0) goto L_0x000d
            java.lang.String r1 = r10.A8s
            X.4DU r0 = r10.A8r
            r2.A8S(r10, r0, r1)
        L_0x000d:
            X.0jB r9 = new X.0jB
            r9.<init>()
            X.0j9 r1 = X.C271774jZ.A5I
            java.lang.String r0 = r10.A5u
            r9.A05(r1, r0)
            java.lang.String r3 = r10.A4W
            if (r3 == 0) goto L_0x002e
            X.0j9 r0 = X.C271774jZ.A0Y
            r9.A05(r0, r3)
            X.0j9 r2 = X.C271774jZ.A0Z
            r0 = 0
            r1 = 10
            java.lang.Long r0 = X.00y.A0n(r1, r3)     // Catch:{ NumberFormatException -> 0x002b }
        L_0x002b:
            r9.A05(r2, r0)
        L_0x002e:
            java.lang.Long r1 = r10.A8h
            if (r1 == 0) goto L_0x0037
            X.0j9 r0 = X.C271774jZ.A8x
            r9.A05(r0, r1)
        L_0x0037:
            X.0j9 r1 = X.C271774jZ.A0B
            java.lang.String r0 = r10.A4N
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0C
            java.lang.String r0 = r10.A4N
            java.lang.Long r0 = X.C254543se.A00(r0)
            r9.A05(r1, r0)
            java.util.List r1 = r10.A7k
            java.lang.String r0 = "attribution_type"
            r9.A0C(r0, r1)
            X.0j9 r2 = X.C271774jZ.A5a
            int r0 = r10.A8C
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A05(r2, r0)
            java.lang.String r1 = r10.A8l
            java.lang.String r0 = "media_type_for_merlin"
            if (r1 == 0) goto L_0x0065
            r9.A0A(r0, r1)
        L_0x0065:
            X.0j9 r1 = X.C271774jZ.A57
            java.lang.Long r0 = r10.A3c
            r9.A05(r1, r0)
            int r0 = r10.A0V
            java.lang.String r2 = "h_position_on_hscroll"
            r8 = -1
            if (r0 == r8) goto L_0x007c
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x007c:
            X.0j9 r1 = X.C271774jZ.A5w
            java.lang.Long r0 = r10.A3m
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6Y
            java.lang.Long r0 = r10.A3x
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9L
            java.lang.String r0 = r10.A7J
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A58
            java.lang.String r0 = r10.A5s
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9D
            java.lang.String r0 = r10.A7G
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9F
            java.lang.String r0 = r10.A7H
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9G
            java.lang.String r0 = r10.A7I
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7x
            java.lang.String r0 = r10.A6t
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8A
            java.lang.String r0 = r10.A6x
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2v
            java.lang.String r0 = r10.A5I
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9Y
            java.lang.String r0 = r10.A8m
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3m
            java.lang.Long r0 = r10.A8c
            r9.A05(r1, r0)
            int r0 = r10.A07
            java.lang.String r2 = "recs_ix"
            if (r0 == r8) goto L_0x00df
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x00df:
            X.0j9 r1 = X.C271774jZ.A98
            java.lang.Long r0 = r10.A8g
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5U
            java.lang.Double r0 = r10.A2Q
            r9.A05(r1, r0)
            java.lang.Long r0 = r10.A8g
            if (r0 == 0) goto L_0x010d
            long r3 = r0.longValue()
            X.0j9 r2 = X.C271774jZ.A99
            double r0 = (double) r3
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.A05(r2, r0)
            X.0j9 r1 = X.C271774jZ.A9B
            java.lang.Long r0 = r10.A8g
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9A
            java.lang.String r0 = r10.A7F
            r9.A05(r1, r0)
        L_0x010d:
            java.lang.String r0 = r10.A6o
            java.lang.String r11 = "response"
            if (r0 == 0) goto L_0x0116
            r9.A0A(r11, r0)
        L_0x0116:
            X.0j9 r1 = X.C271774jZ.A4D
            java.lang.Boolean r0 = r10.A1Q
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8U
            java.lang.String r0 = r10.A78
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A79
            java.lang.String r0 = "survey_type"
            if (r1 == 0) goto L_0x012d
            r9.A0A(r0, r1)
        L_0x012d:
            X.0j9 r1 = X.C271774jZ.A6W
            java.lang.Long r0 = r10.A4C
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A6X
            java.lang.String r0 = "question_id"
            if (r1 == 0) goto L_0x013d
            r9.A0A(r0, r1)
        L_0x013d:
            X.0j9 r1 = X.C271774jZ.A8W
            java.lang.String r0 = r10.A6X
            r9.A05(r1, r0)
            int r0 = r10.A0Z
            java.lang.String r2 = "question_index"
            if (r0 == r8) goto L_0x0153
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x0153:
            X.0j9 r1 = X.C271774jZ.A8X
            int r0 = r10.A0Z
            r9.A03(r1, r0)
            java.lang.String r1 = r10.A6G
            java.lang.String r0 = "page_id"
            if (r1 == 0) goto L_0x0163
            r9.A0A(r0, r1)
        L_0x0163:
            X.0j9 r1 = X.C271774jZ.A8V
            java.lang.String r0 = r10.A6G
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A6H
            java.lang.String r0 = "page_status"
            if (r1 == 0) goto L_0x0173
            r9.A0A(r0, r1)
        L_0x0173:
            java.lang.String r1 = r10.A5E
            java.lang.String r0 = "exit_type"
            if (r1 == 0) goto L_0x017c
            r9.A0A(r0, r1)
        L_0x017c:
            X.0j9 r1 = X.C271774jZ.A8T
            java.lang.String r0 = r10.A5E
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8f
            java.lang.Boolean r0 = r10.A1q
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8Y
            X.0jB r0 = r10.A0t
            r9.A05(r1, r0)
            java.util.Map r1 = r10.A86
            r15 = 1
            if (r1 == 0) goto L_0x01a1
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a1
            r9.A0D(r1)
        L_0x01a1:
            java.lang.String r1 = r10.A5d
            java.lang.String r0 = "id"
            if (r1 == 0) goto L_0x01aa
            r9.A0A(r0, r1)
        L_0x01aa:
            X.0j9 r1 = X.C271774jZ.A62
            java.lang.String r0 = r10.A66
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A67
            java.lang.String r0 = "tracking_token"
            if (r1 == 0) goto L_0x01ba
            r9.A0A(r0, r1)
        L_0x01ba:
            X.0j9 r1 = X.C271774jZ.A64
            java.lang.String r0 = r10.A68
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A63
            java.lang.Integer r0 = r10.A32
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2z
            java.lang.String r0 = r10.A5K
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5d
            java.lang.String r0 = r10.A5x
            r9.A05(r1, r0)
            java.lang.Boolean r2 = r10.A2D
            java.lang.String r1 = "is_context_sheet"
            if (r2 == 0) goto L_0x01e1
            java.util.Map r0 = r9.A00
            r0.put(r1, r2)
        L_0x01e1:
            int r0 = r10.A0L
            java.lang.String r2 = "height"
            if (r0 == r8) goto L_0x01f0
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x01f0:
            X.0j9 r0 = X.C271774jZ.A6T
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9.A05(r0, r7)
            X.0j9 r2 = X.C271774jZ.A6U
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            r9.A05(r2, r6)
            X.0j9 r2 = X.C271774jZ.A2K
            double r0 = r10.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.A05(r2, r0)
            X.0j9 r1 = X.C271774jZ.A0R
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8w
            java.lang.Integer r0 = r10.A3C
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3M
            java.lang.Integer r0 = r10.A2s
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0z
            java.lang.Long r0 = r10.A8W
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A10
            java.lang.String r0 = r10.A4f
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0x
            java.lang.String r0 = r10.A4e
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5A
            java.lang.String r0 = r10.A5t
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A12
            java.lang.Long r0 = r10.A3M
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A15
            java.lang.Long r0 = r10.A3O
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A11
            java.lang.String r0 = r10.A4f
            java.lang.Long r0 = X.C254543se.A00(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0y
            java.lang.String r0 = r10.A4e
            java.lang.Long r0 = X.C254543se.A00(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0w
            java.lang.Long r0 = r10.A3L
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A16
            java.lang.Long r0 = r10.A3P
            r9.A05(r1, r0)
            java.lang.String r16 = "1"
            java.lang.String r12 = "0"
            java.lang.String r1 = r10.A5r
            java.lang.String r0 = "location_id"
            if (r1 == 0) goto L_0x0283
            r9.A0A(r0, r1)
        L_0x0283:
            java.lang.String r1 = r10.A5S
            java.lang.String r0 = "hashtag"
            if (r1 == 0) goto L_0x028c
            r9.A0A(r0, r1)
        L_0x028c:
            com.instagram.model.hashtag.Hashtag r2 = r10.A8G
            if (r2 == 0) goto L_0x02ad
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = "hashtag_id"
            if (r1 == 0) goto L_0x029b
            r9.A0A(r0, r1)
        L_0x029b:
            X.0j9 r1 = X.C271774jZ.A3Q
            java.lang.String r0 = r2.getName()
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3P
            com.instagram.model.hashtag.HashtagFollowStatus r0 = com.instagram.model.hashtag.HashtagFollowStatus.FOLLOWING
            java.lang.String r0 = r0.A00
            r9.A05(r1, r0)
        L_0x02ad:
            java.lang.String r1 = r10.A5U
            java.lang.String r0 = "hashtag_type"
            if (r1 == 0) goto L_0x02b6
            r9.A0A(r0, r1)
        L_0x02b6:
            X.0j9 r1 = X.C271774jZ.A3q
            java.lang.String r0 = r10.A5m
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A88
            java.lang.String r0 = r10.A6v
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A26
            java.lang.String r0 = r10.A50
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2N
            java.lang.Long r0 = r10.A3U
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A4r
            java.lang.String r0 = "composer_type"
            if (r1 == 0) goto L_0x02db
            r9.A0A(r0, r1)
        L_0x02db:
            X.0j9 r1 = X.C271774jZ.A00
            java.lang.String r0 = r10.A4J
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0E
            java.lang.String r0 = r10.A4O
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A09
            java.lang.String r0 = r10.A4L
            r9.A05(r1, r0)
            java.lang.Boolean r0 = r10.A13
            r17 = 1
            if (r0 == 0) goto L_0x0307
            boolean r0 = r0.booleanValue()
            X.0j9 r2 = X.C271774jZ.A08
            if (r0 == 0) goto L_0x086a
            r0 = 1
        L_0x0300:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A04(r2, r0)
        L_0x0307:
            X.3s8 r13 = r10.A0v
            if (r13 == 0) goto L_0x033b
            long r4 = r13.A02
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0866
            double r2 = r13.A01
            double r0 = (double) r4
            double r2 = r2 / r0
        L_0x0317:
            float r0 = (float) r2
            java.lang.String r2 = "avgViewPercent"
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0329
            java.util.Map r1 = r9.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.put(r2, r0)
        L_0x0329:
            double r0 = r13.A00
            float r2 = (float) r0
            java.lang.String r3 = "maxViewPercent"
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x033b
            java.util.Map r1 = r9.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.put(r3, r0)
        L_0x033b:
            X.0j9 r1 = X.C271774jZ.A8C
            java.lang.String r0 = r10.A6z
            r9.A05(r1, r0)
            java.lang.Boolean r1 = r10.A23
            if (r1 == 0) goto L_0x034b
            X.0j9 r0 = X.C271774jZ.A4x
            r9.A05(r0, r1)
        L_0x034b:
            java.util.List r0 = r10.A8o
            if (r0 == 0) goto L_0x035e
            int r0 = r10.A8D
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 709(0x2c5, float:9.94E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A07(r1, r0)
        L_0x035e:
            X.0j9 r1 = X.C271774jZ.A8D
            java.lang.String r0 = r10.A71
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0l
            java.lang.String r0 = r10.A4a
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2D
            java.lang.String r0 = r10.A56
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2C
            java.lang.String r0 = r10.A55
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2E
            java.lang.String r0 = r10.A57
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1x
            java.lang.Long r0 = r10.A3T
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1Z
            java.lang.Long r0 = r10.A3R
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7P
            java.lang.Long r0 = r10.A40
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1a
            java.lang.Long r0 = r10.A3S
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7Q
            java.lang.Long r0 = r10.A41
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A06
            java.lang.Long r0 = r10.A8U
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7R
            java.lang.Long r0 = r10.A42
            r9.A05(r1, r0)
            java.lang.Integer r1 = r10.A38
            java.lang.String r0 = "adpod_reel_gap"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A2x
            java.lang.String r0 = "adpod_media_gap"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A2l
            java.lang.String r0 = "adpod_media_hp"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A2m
            java.lang.String r0 = "adpod_reel_hp"
            r9.A07(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6A
            java.lang.Long r0 = r10.A3p
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6B
            java.lang.Long r0 = r10.A3r
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A61
            java.lang.Long r0 = r10.A3n
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7S
            java.lang.Long r0 = r10.A43
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5j
            java.lang.Long r0 = r10.A3i
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5k
            java.lang.Long r0 = r10.A3j
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5h
            java.lang.Long r0 = r10.A3g
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5i
            java.lang.Long r0 = r10.A3h
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5l
            java.lang.Long r0 = r10.A3k
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A91
            java.lang.Double r0 = r10.A2Y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6g
            java.lang.Long r0 = r10.A3z
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3U
            java.lang.Long r0 = r10.A3a
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5B
            java.lang.Long r0 = r10.A8e
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0G
            java.lang.String r0 = r10.A4P
            r9.A05(r1, r0)
            java.lang.Integer r1 = r10.A39
            java.lang.String r0 = "multi_ad_carousel_reel_gap"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A2z
            java.lang.String r0 = "multi_ad_carousel_media_gap"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A30
            java.lang.String r0 = "multi_ad_carousel_media_hp"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A31
            java.lang.String r0 = "multi_ad_carousel_reel_hp"
            r9.A07(r1, r0)
            java.lang.Long r2 = r10.A3q
            java.lang.String r1 = "num_ads_or_netegoes_before_first_multi_ad_carousel"
            if (r2 == 0) goto L_0x0457
            java.util.Map r0 = r9.A00
            r0.put(r1, r2)
        L_0x0457:
            java.lang.Long r2 = r10.A3s
            java.lang.String r1 = "num_ads_or_netegoes_since_previous_multi_ad_carousel"
            if (r2 == 0) goto L_0x0462
            java.util.Map r0 = r9.A00
            r0.put(r1, r2)
        L_0x0462:
            java.lang.Integer r0 = r10.A2r
            if (r0 == 0) goto L_0x046f
            java.lang.String r1 = X.C271804jc.A00(r0)
            java.lang.String r0 = "source_of_delivery"
            r9.A0A(r0, r1)
        L_0x046f:
            java.lang.Boolean r0 = r10.A1p
            if (r0 == 0) goto L_0x0484
            boolean r0 = r0.booleanValue()
            X.0j9 r1 = X.C271774jZ.A4h
            if (r0 != 0) goto L_0x047d
            r17 = 0
        L_0x047d:
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r9.A05(r1, r0)
        L_0x0484:
            X.0j9 r1 = X.C271774jZ.A3n
            java.lang.Long r0 = r10.A3b
            r9.A05(r1, r0)
            X.0j9 r3 = X.C271774jZ.A2P
            double r0 = r10.A02
            r13 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x049e
            java.util.Map r2 = r9.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.put(r3, r0)
        L_0x049e:
            X.0j9 r2 = X.C271774jZ.A03
            int r0 = r10.A08
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A05(r2, r0)
            int r0 = r10.A0G
            java.lang.String r2 = "desired_insert_position"
            if (r0 == r8) goto L_0x04b9
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x04b9:
            X.0j9 r1 = X.C271774jZ.A9c
            java.lang.String r0 = r10.A7P
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A6p
            java.lang.String r0 = "result"
            if (r1 == 0) goto L_0x04c9
            r9.A0A(r0, r1)
        L_0x04c9:
            X.0j9 r1 = X.C271774jZ.A7z
            java.lang.String r0 = r10.A4I
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6P
            java.lang.String r0 = r10.A6I
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9a
            java.lang.String r0 = r10.A7N
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A5c
            java.lang.String r0 = "click_id"
            if (r1 == 0) goto L_0x04e7
            r9.A0A(r0, r1)
        L_0x04e7:
            X.0j9 r1 = X.C271774jZ.A8E
            java.lang.String r0 = r10.A70
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8F
            java.lang.Long r0 = r10.A8f
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9b
            java.lang.String r0 = r10.A7O
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8s
            java.lang.String r0 = r10.A7D
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A01
            java.lang.String r0 = r10.A4K
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5J
            java.lang.String r0 = r10.A5v
            r9.A05(r1, r0)
            java.lang.Boolean r0 = r10.A8O
            if (r0 == 0) goto L_0x0523
            boolean r0 = r0.booleanValue()
            r1 = r12
            if (r0 == 0) goto L_0x051e
            r1 = r16
        L_0x051e:
            java.lang.String r0 = "is_live_streaming"
            r9.A0A(r0, r1)
        L_0x0523:
            java.lang.Boolean r0 = r10.A8N
            if (r0 == 0) goto L_0x0535
            boolean r0 = r0.booleanValue()
            r1 = r12
            if (r0 == 0) goto L_0x0530
            r1 = r16
        L_0x0530:
            java.lang.String r0 = "is_live_questions"
            r9.A0A(r0, r1)
        L_0x0535:
            X.0j9 r1 = X.C271774jZ.A3x
            java.lang.String r0 = r10.A5n
            r9.A05(r1, r0)
            java.lang.Boolean r0 = r10.A1i
            if (r0 == 0) goto L_0x054e
            boolean r2 = r0.booleanValue()
            X.0j9 r1 = X.C271774jZ.A5z
            r0 = r12
            if (r2 == 0) goto L_0x054b
            r0 = r16
        L_0x054b:
            r9.A05(r1, r0)
        L_0x054e:
            X.0j9 r1 = X.C271774jZ.A6G
            java.lang.Long r0 = r10.A3v
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9q
            X.0sn r2 = X.0sn.A00
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A56
            java.lang.String r0 = r10.A5q
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8h
            java.lang.String r0 = r10.A7A
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8B
            java.lang.String r0 = r10.A6y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1b
            int r0 = r10.A0F
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.A05(r1, r0)
            X.0j9 r3 = X.C271774jZ.A1U
            double r0 = r10.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.A05(r3, r0)
            X.0j9 r1 = X.C271774jZ.A9i
            java.lang.String r0 = r10.A7Q
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A52
            java.lang.Integer r0 = r10.A2v
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A54
            java.lang.Integer r0 = r10.A2w
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A05
            java.lang.String r0 = r10.A4M
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2G
            java.lang.String r0 = r10.A8k
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7X
            java.lang.String r0 = r10.A6g
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7T
            java.lang.String r0 = r10.A6c
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3V
            java.lang.String r0 = r10.A5V
            r9.A05(r1, r0)
            java.lang.Boolean r3 = r10.A1B
            java.lang.String r1 = "has_translation"
            if (r3 == 0) goto L_0x05cf
            java.util.Map r0 = r9.A00
            r0.put(r1, r3)
        L_0x05cf:
            X.0j9 r1 = X.C271774jZ.A4K
            java.lang.Boolean r0 = r10.A1X
            r9.A04(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4T
            java.lang.Boolean r0 = r10.A1d
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A93
            java.lang.Double r0 = r10.A2Z
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8y
            java.lang.Double r0 = r10.A2H
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1H
            java.lang.String r0 = r10.A4j
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8O
            java.lang.String r0 = r10.A72
            r9.A04(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6n
            java.lang.String r0 = r10.A6W
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6r
            java.lang.String r0 = r10.A6Y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A44
            java.lang.Boolean r0 = r10.A1I
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A47
            java.lang.Boolean r0 = r10.A1L
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A46
            java.lang.Boolean r0 = r10.A1K
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1o
            java.lang.String r0 = r10.A4v
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1m
            java.lang.Boolean r0 = r10.A15
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1n
            java.lang.String r0 = r10.A4u
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1p
            java.lang.String r0 = r10.A4w
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1s
            java.lang.String r0 = r10.A4x
            r9.A04(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4o
            java.lang.Boolean r0 = r10.A1x
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4A
            java.lang.Boolean r0 = r10.A1O
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A48
            java.lang.Boolean r0 = r10.A1M
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A49
            java.lang.Boolean r0 = r10.A1N
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A45
            java.lang.Boolean r0 = r10.A1J
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1u
            java.lang.Boolean r0 = r10.A16
            r9.A05(r1, r0)
            X.0j9 r4 = X.C271774jZ.A1j
            java.lang.Double r5 = r10.A2I
            java.lang.Double r3 = r10.A2J
            if (r5 == 0) goto L_0x0863
            if (r3 == 0) goto L_0x0863
            X.0jB r1 = new X.0jB
            r1.<init>()
            X.0j9 r0 = X.C271774jZ.A1k
            r1.A05(r0, r5)
            X.0j9 r0 = X.C271774jZ.A1l
            r1.A05(r0, r3)
        L_0x0682:
            r9.A05(r4, r1)
            X.0j9 r4 = X.C271774jZ.A1t
            java.lang.Double r5 = r10.A2K
            java.lang.Double r3 = r10.A2L
            if (r5 == 0) goto L_0x0860
            if (r3 == 0) goto L_0x0860
            X.0jB r1 = new X.0jB
            r1.<init>()
            X.0j9 r0 = X.C271774jZ.A1q
            r1.A05(r0, r5)
            X.0j9 r0 = X.C271774jZ.A1v
            r1.A05(r0, r3)
        L_0x069e:
            r9.A05(r4, r1)
            X.0j9 r3 = X.C271774jZ.A1r
            java.util.List r1 = r10.A7o
            if (r1 != 0) goto L_0x06a8
            r1 = r2
        L_0x06a8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r9.A05(r3, r0)
            X.0j9 r1 = X.C271774jZ.A5M
            java.lang.Boolean r0 = r10.A28
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A7E
            java.lang.String r0 = "thread_id"
            if (r1 == 0) goto L_0x06c0
            r9.A0A(r0, r1)
        L_0x06c0:
            X.0j9 r1 = X.C271774jZ.A7U
            java.lang.Long r0 = r10.A44
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7b
            java.lang.Long r0 = r10.A48
            r9.A04(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4a
            java.lang.Boolean r0 = r10.A1l
            r9.A05(r1, r0)
            X.0j9 r2 = X.C271774jZ.A8q
            float r0 = r10.A05
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.A05(r2, r0)
            X.0j9 r2 = X.C271774jZ.A8r
            float r0 = r10.A06
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.A05(r2, r0)
            X.0j9 r1 = X.C271774jZ.A3H
            java.lang.Boolean r0 = r10.A18
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3I
            java.lang.String r0 = r10.A5M
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3J
            java.lang.String r0 = r10.A5N
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3K
            java.lang.Boolean r0 = r10.A19
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3F
            java.lang.Float r0 = r10.A2h
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3G
            java.lang.Float r0 = r10.A2i
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3E
            java.lang.Float r0 = r10.A2g
            r9.A05(r1, r0)
            X.5sM r2 = r10.A12
            if (r2 == 0) goto L_0x0764
            X.0j9 r1 = X.C271774jZ.A8L
            float r0 = r2.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8M
            float r0 = r2.A03
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2S
            float r0 = r2.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2T
            float r0 = r2.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9u
            float r0 = r2.A04
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9v
            float r0 = r2.A05
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
        L_0x0764:
            X.0j9 r1 = X.C271774jZ.A7Y
            java.lang.String r0 = r10.A6h
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7V
            java.lang.Long r0 = r10.A45
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4z
            java.lang.Boolean r0 = r10.A24
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4R
            java.lang.Boolean r0 = r10.A1b
            r9.A05(r1, r0)
            java.util.List r3 = r10.A8q
            if (r3 == 0) goto L_0x079c
            X.0j9 r1 = X.C271774jZ.A9g
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r9.A05(r1, r0)
            X.0j9 r2 = X.C271774jZ.A7r
            int r0 = r3.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A05(r2, r0)
        L_0x079c:
            java.util.List r3 = r10.A7n
            if (r3 == 0) goto L_0x07b7
            X.0j9 r1 = X.C271774jZ.A17
            java.util.ArrayList r0 = X.AnonymousClass6LD.A00(r3)
            r9.A05(r1, r0)
            X.0j9 r2 = X.C271774jZ.A7r
            int r0 = r3.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A05(r2, r0)
        L_0x07b7:
            X.0jB r1 = r10.A0j
            if (r1 == 0) goto L_0x07c0
            X.0j9 r0 = X.C271774jZ.A18
            r9.A04(r0, r1)
        L_0x07c0:
            X.0j9 r1 = X.C271774jZ.A7s
            java.lang.Long r0 = r10.A4A
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9P
            java.lang.Long r0 = r10.A4G
            r9.A05(r1, r0)
            int r0 = r10.A0N
            java.lang.String r2 = "is_replay"
            if (r0 == r8) goto L_0x07dd
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x07dd:
            X.0j9 r1 = X.C271774jZ.A0D
            java.lang.Long r0 = r10.A3G
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0I
            java.lang.Long r0 = r10.A3H
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0J
            java.lang.Long r0 = r10.A3I
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0L
            java.lang.Long r0 = r10.A8V
            r9.A05(r1, r0)
            int r0 = r10.A0Q
            java.lang.String r2 = "netego_request_position"
            if (r0 == r8) goto L_0x0808
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x0808:
            X.0j9 r1 = X.C271774jZ.A7Z
            java.lang.Long r0 = r10.A47
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A95
            java.lang.Long r0 = r10.A4E
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A96
            java.lang.Double r0 = r10.A2b
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A97
            java.lang.Long r0 = r10.A4F
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9t
            java.lang.Boolean r0 = r10.A2G
            r9.A05(r1, r0)
            java.util.List r0 = r10.A7s
            if (r0 == 0) goto L_0x0878
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0878
            X.0j9 r2 = X.C271774jZ.A8j
            java.util.List r3 = r10.A7s
            if (r3 == 0) goto L_0x086e
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x084c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0870
            java.lang.Object r0 = r3.next()
            com.instagram.tagging.model.Tag r0 = (com.instagram.tagging.model.Tag) r0
            java.lang.String r0 = r0.getId()
            r1.add(r0)
            goto L_0x084c
        L_0x0860:
            r1 = 0
            goto L_0x069e
        L_0x0863:
            r1 = 0
            goto L_0x0682
        L_0x0866:
            double r2 = r13.A00
            goto L_0x0317
        L_0x086a:
            r0 = 0
            goto L_0x0300
        L_0x086e:
            r0 = 0
            goto L_0x0875
        L_0x0870:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
        L_0x0875:
            r9.A05(r2, r0)
        L_0x0878:
            java.util.ArrayList r1 = r10.A7c
            if (r1 == 0) goto L_0x0934
            X.0j9 r3 = X.C271774jZ.A6j
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x0887:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0899
            java.lang.Object r0 = r4.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r0 = r0.A0H
            r2.add(r0)
            goto L_0x0887
        L_0x0899:
            r9.A05(r3, r2)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x08d8
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x08d8
        L_0x08a6:
            r0 = 0
        L_0x08a7:
            X.0j9 r1 = X.C271774jZ.A41
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A04(r1, r0)
            X.0j9 r3 = X.C271774jZ.A2H
            java.util.ArrayList r4 = r10.A7c
            r0 = 0
            if (r4 == 0) goto L_0x08fb
            r1 = 10
            int r1 = X.0Yv.A1E(r4, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x08c6:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x08f0
            java.lang.Object r1 = r4.next()
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r1 = r1.A0H
            r2.add(r1)
            goto L_0x08c6
        L_0x08d8:
            java.util.Iterator r1 = r1.iterator()
        L_0x08dc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08a6
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x08dc
            r0 = 1
            goto L_0x08a7
        L_0x08f0:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x08fb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
        L_0x08fb:
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A2I
            java.util.ArrayList r1 = r10.A7c
            r0 = 0
            if (r1 == 0) goto L_0x0931
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x090e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0926
            java.lang.Object r1 = r4.next()
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r1 = r1.A0H
            java.lang.Long r1 = X.C254543se.A00(r1)
            if (r1 == 0) goto L_0x090e
            r2.add(r1)
            goto L_0x090e
        L_0x0926:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0931
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
        L_0x0931:
            r9.A05(r3, r0)
        L_0x0934:
            java.util.List r1 = r10.A84
            if (r1 == 0) goto L_0x095b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x095b
            X.0j9 r3 = X.C271774jZ.A6j
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0949:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0966
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r0 = r0.A0H
            r2.add(r0)
            goto L_0x0949
        L_0x095b:
            java.util.List r0 = r10.A7u
            if (r0 == 0) goto L_0x0969
            X.0j9 r3 = X.C271774jZ.A6j
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
        L_0x0966:
            r9.A05(r3, r2)
        L_0x0969:
            java.lang.String r1 = r10.A6V
            java.lang.String r0 = "ig_profile_user_id"
            if (r1 == 0) goto L_0x0972
            r9.A0A(r0, r1)
        L_0x0972:
            X.0j9 r1 = X.C271774jZ.A6i
            java.lang.String r0 = r10.A6U
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6k
            java.lang.String r0 = r10.A6U
            java.lang.Long r0 = X.C254543se.A00(r0)
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A80
            java.lang.String r0 = r10.A6u
            r9.A05(r1, r0)
            X.3xf r0 = r10.A0h
            if (r0 == 0) goto L_0x09a2
            X.0j9 r3 = X.C271774jZ.A0k
            X.0jB r2 = new X.0jB
            r2.<init>()
            java.lang.String r1 = r0.BGl()
            java.lang.String r0 = "incentive_id"
            r2.A0A(r0, r1)
            r9.A05(r3, r2)
        L_0x09a2:
            java.lang.Boolean r0 = r10.A1o
            if (r0 == 0) goto L_0x09b4
            boolean r2 = r0.booleanValue()
            X.0j9 r1 = X.C271774jZ.A4f
            r0 = r12
            if (r2 == 0) goto L_0x09b1
            r0 = r16
        L_0x09b1:
            r9.A05(r1, r0)
        L_0x09b4:
            X.0j9 r1 = X.C271774jZ.A5e
            java.lang.String r0 = r10.A5y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5R
            java.lang.String r0 = r10.A5w
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5S
            java.lang.String r0 = r10.A5w
            java.lang.Long r0 = X.C254543se.A00(r0)
            r9.A05(r1, r0)
            long r0 = r10.A8E
            java.lang.String r3 = "drops_launch_date"
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x09e0
            java.util.Map r2 = r9.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
        L_0x09e0:
            java.lang.Boolean r2 = r10.A8J
            java.lang.String r1 = "has_drops_launched"
            if (r2 == 0) goto L_0x09eb
            java.util.Map r0 = r9.A00
            r0.put(r1, r2)
        L_0x09eb:
            X.0j9 r1 = X.C271774jZ.A3S
            java.lang.Boolean r0 = r10.A1A
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7j
            java.lang.String r0 = r10.A6n
            r9.A05(r1, r0)
            com.instagram.api.schemas.ProductReviewStatus r0 = r10.A0i
            if (r0 == 0) goto L_0x0a06
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "product_review_status"
            if (r1 == 0) goto L_0x0a06
            r9.A0A(r0, r1)
        L_0x0a06:
            com.instagram.user.model.Product r0 = r10.A8I
            if (r0 == 0) goto L_0x0a19
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = r0.A0H
            r1.add(r0)
            java.lang.String r0 = "shared_product_ids"
            r9.A0C(r0, r1)
        L_0x0a19:
            X.0j9 r1 = X.C271774jZ.A41
            java.lang.Boolean r0 = r10.A8K
            r9.A05(r1, r0)
            java.lang.Integer r0 = r10.A8T
            if (r0 == 0) goto L_0x0a37
            int r0 = r0.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 366(0x16e, float:5.13E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            if (r1 == 0) goto L_0x0a37
            r9.A0A(r0, r1)
        L_0x0a37:
            java.lang.Boolean r0 = r10.A1Z
            if (r0 == 0) goto L_0x0a4d
            boolean r0 = r0.booleanValue()
            r1 = r12
            if (r0 == 0) goto L_0x0a44
            r1 = r16
        L_0x0a44:
            r0 = 312(0x138, float:4.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0A(r0, r1)
        L_0x0a4d:
            X.0j9 r1 = X.C271774jZ.A9T
            java.lang.String r0 = r10.A7M
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A4k
            java.lang.String r0 = "guest_id"
            if (r1 == 0) goto L_0x0a5d
            r9.A0A(r0, r1)
        L_0x0a5d:
            X.0j9 r0 = X.C271774jZ.A7a
            r9.A05(r0, r6)
            X.0j9 r1 = X.C271774jZ.A7y
            java.lang.Long r0 = r10.A4B
            r9.A05(r1, r0)
            X.0j9 r0 = X.C271774jZ.A1d
            r9.A05(r0, r6)
            X.0j9 r1 = X.C271774jZ.A8z
            java.lang.Double r0 = r10.A2X
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5Y
            java.lang.Double r0 = r10.A2R
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5Z
            java.lang.Double r0 = r10.A2S
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5F
            java.lang.Double r0 = r10.A2N
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5T
            java.lang.Double r0 = r10.A2P
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5Q
            java.lang.Double r0 = r10.A2O
            r9.A05(r1, r0)
            X.0j9 r0 = X.C271774jZ.A0F
            r9.A05(r0, r6)
            X.0j9 r0 = X.C271774jZ.A0P
            r9.A05(r0, r7)
            X.0j9 r1 = X.C271774jZ.A7W
            java.lang.Long r0 = r10.A46
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A94
            java.lang.Double r0 = r10.A2a
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4r
            java.lang.Boolean r0 = r10.A1z
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A25
            java.lang.String r0 = r10.A4z
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4j
            java.lang.Boolean r0 = r10.A1s
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7h
            java.lang.String r0 = r10.A6l
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7i
            java.lang.String r0 = r10.A6m
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2w
            java.lang.String r0 = r10.A5J
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3r
            java.lang.Long r0 = r10.A8b
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9M
            java.lang.String r0 = r10.A7K
            r9.A05(r1, r0)
            java.lang.Boolean r0 = r10.A1T
            if (r0 == 0) goto L_0x0afa
            boolean r0 = r0.booleanValue()
            r1 = r12
            if (r0 == 0) goto L_0x0af5
            r1 = r16
        L_0x0af5:
            java.lang.String r0 = "first_request"
            r9.A0A(r0, r1)
        L_0x0afa:
            X.0j9 r1 = X.C271774jZ.A89
            java.lang.String r0 = r10.A6w
            r9.A05(r1, r0)
            int r0 = r10.A0U
            java.lang.String r2 = "percent_visible"
            if (r0 == r8) goto L_0x0b10
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x0b10:
            java.lang.String r1 = r10.A7R
            java.lang.String r0 = "visibility_unit"
            if (r1 == 0) goto L_0x0b19
            r9.A0A(r0, r1)
        L_0x0b19:
            java.lang.Boolean r0 = r10.A1Y
            if (r0 == 0) goto L_0x0b2b
            boolean r2 = r0.booleanValue()
            X.0j9 r1 = X.C271774jZ.A3R
            r0 = r12
            if (r2 == 0) goto L_0x0b28
            r0 = r16
        L_0x0b28:
            r9.A05(r1, r0)
        L_0x0b2b:
            X.0j9 r1 = X.C271774jZ.A36
            java.lang.String r0 = r10.A5L
            r9.A05(r1, r0)
            java.util.List r1 = r10.A7j
            java.lang.String r0 = "added_collection_ids"
            r9.A0C(r0, r1)
            java.util.List r1 = r10.A7y
            java.lang.String r0 = "removed_collection_ids"
            r9.A0C(r0, r1)
            java.util.List r1 = r10.A7i
            java.lang.String r0 = "ad_ids"
            r9.A0C(r0, r1)
            X.0j9 r1 = X.C271774jZ.A1N
            java.lang.String r0 = r10.A6q
            r9.A05(r1, r0)
            java.lang.Integer r0 = r10.A3A
            if (r0 == 0) goto L_0x0b64
            X.0j9 r2 = X.C271774jZ.A7k
            java.lang.String r1 = X.C49125Epo.A00(r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            X.0qQ.A07(r0)
            r9.A05(r2, r0)
        L_0x0b64:
            X.0j9 r1 = X.C271774jZ.A0S
            int r0 = r10.A0A
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0T
            int r0 = r10.A0B
            r9.A03(r1, r0)
            X.0j9 r0 = X.C271774jZ.A0U
            r9.A05(r0, r7)
            java.lang.Boolean r0 = r10.A1V
            if (r0 == 0) goto L_0x0b88
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0b83
            r12 = r16
        L_0x0b83:
            java.lang.String r0 = "is_from_inline_composer"
            r9.A0A(r0, r12)
        L_0x0b88:
            X.0j9 r1 = X.C271774jZ.A0p
            java.lang.String r0 = r10.A4c
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A60
            java.lang.String r0 = r10.A65
            if (r0 != 0) goto L_0x0b9b
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
        L_0x0b9b:
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0W
            java.lang.String r0 = r10.A4U
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1w
            float r0 = r10.A04
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A7S
            java.lang.String r0 = "reply_type"
            if (r1 == 0) goto L_0x0bb9
            r9.A0A(r0, r1)
        L_0x0bb9:
            X.0j9 r1 = X.C271774jZ.A1G
            java.lang.String r0 = r10.A4i
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6Q
            java.lang.String r0 = r10.A6J
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7g
            java.lang.String r0 = r10.A6k
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8k
            java.lang.String r0 = r10.A7C
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9J
            java.lang.Long r0 = r10.A8i
            r9.A05(r1, r0)
            long r0 = r10.A0b
            java.lang.String r3 = "latency"
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0bed
            java.util.Map r2 = r9.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
        L_0x0bed:
            long r0 = r10.A0c
            java.lang.String r3 = "waiting_time"
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0bfe
            java.util.Map r2 = r9.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
        L_0x0bfe:
            int r0 = r10.A0a
            java.lang.String r2 = "status_code"
            if (r0 == r8) goto L_0x0c0d
            java.util.Map r1 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L_0x0c0d:
            X.0j9 r1 = X.C271774jZ.A0V
            java.lang.String r0 = r10.A4T
            r9.A05(r1, r0)
            java.lang.Boolean r1 = r10.A8L
            if (r1 == 0) goto L_0x0c1d
            X.0j9 r0 = X.C271774jZ.A4G
            r9.A05(r0, r1)
        L_0x0c1d:
            X.0j9 r1 = X.C271774jZ.A27
            java.lang.String r0 = r10.A53
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1Q
            java.lang.String r0 = r10.A4m
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A51
            java.lang.Long r0 = r10.A8a
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2q
            java.util.ArrayList r0 = r10.A7W
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6h
            java.lang.String r0 = r10.A6S
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A6T
            java.lang.String r0 = "prior_submodule"
            if (r1 == 0) goto L_0x0c49
            r9.A0A(r0, r1)
        L_0x0c49:
            X.0j9 r1 = X.C271774jZ.A8P
            java.lang.String r0 = r10.A75
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A73
            java.lang.String r0 = "sub_module"
            if (r1 == 0) goto L_0x0c59
            r9.A0A(r0, r1)
        L_0x0c59:
            X.0j9 r1 = X.C271774jZ.A2e
            java.lang.String r0 = r10.A5C
            r9.A05(r1, r0)
            java.lang.String r0 = r10.A76
            java.lang.String r2 = "surface"
            if (r0 == 0) goto L_0x0c69
            r9.A0A(r2, r0)
        L_0x0c69:
            r1 = 0
            java.lang.Boolean r4 = r10.A2E
            java.lang.String r3 = "guide_open_status"
            if (r4 == 0) goto L_0x0c75
            java.util.Map r0 = r9.A00
            r0.put(r3, r4)
        L_0x0c75:
            X.0j9 r3 = X.C271774jZ.A3h
            java.lang.String r0 = r10.A5g
            r9.A05(r3, r0)
            java.lang.String r3 = r10.A5f
            java.lang.String r0 = "igtv_series_id"
            if (r3 == 0) goto L_0x0c85
            r9.A0A(r0, r3)
        L_0x0c85:
            java.lang.String r3 = r10.A5e
            java.lang.String r0 = "igtv_composer_session_id"
            if (r3 == 0) goto L_0x0c8e
            r9.A0A(r0, r3)
        L_0x0c8e:
            X.0j9 r3 = X.C271774jZ.A6S
            java.lang.String r0 = r10.A6L
            r9.A05(r3, r0)
            X.0j9 r0 = X.C271774jZ.A3g
            r9.A05(r0, r7)
            int r0 = r10.A0M
            java.lang.String r4 = "ads_toggle_state"
            if (r0 == r8) goto L_0x0ca9
            java.util.Map r3 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r4, r0)
        L_0x0ca9:
            java.lang.Boolean r4 = r10.A1W
            java.lang.String r3 = "smart_ad_selector"
            if (r4 == 0) goto L_0x0cb4
            java.util.Map r0 = r9.A00
            r0.put(r3, r4)
        L_0x0cb4:
            java.lang.String r3 = r10.A6N
            java.lang.String r0 = "prev_imp_container_module"
            if (r3 == 0) goto L_0x0cbd
            r9.A0A(r0, r3)
        L_0x0cbd:
            java.lang.Long r4 = r10.A3y
            java.lang.String r3 = "prev_imp_timestamp_ms"
            if (r4 == 0) goto L_0x0cc8
            java.util.Map r0 = r9.A00
            r0.put(r3, r4)
        L_0x0cc8:
            java.lang.String r3 = r10.A5z
            java.lang.String r0 = "meta_ids_new_ad"
            if (r3 == 0) goto L_0x0cd1
            r9.A0A(r0, r3)
        L_0x0cd1:
            java.lang.String r3 = r10.A6B
            java.lang.String r0 = "old_ad_qs_data"
            if (r3 == 0) goto L_0x0cda
            r9.A0A(r0, r3)
        L_0x0cda:
            X.0j9 r3 = X.C271774jZ.A4w
            java.lang.Boolean r0 = r10.A22
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A4M
            java.lang.Boolean r0 = r10.A8M
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A2F
            java.lang.String r0 = r10.A58
            r9.A05(r3, r0)
            java.lang.String r3 = r10.A4b
            java.lang.String r0 = "camera_session_id"
            if (r3 == 0) goto L_0x0cf8
            r9.A0A(r0, r3)
        L_0x0cf8:
            X.0j9 r3 = X.C271774jZ.A7p
            java.lang.String r0 = r10.A6r
            r9.A05(r3, r0)
            com.instagram.search.common.analytics.SearchContext r0 = r10.A11
            if (r0 == 0) goto L_0x0d0c
            X.0j9 r3 = X.C271774jZ.A7o
            java.util.HashMap r0 = r0.A00()
            r9.A04(r3, r0)
        L_0x0d0c:
            X.0j9 r3 = X.C271774jZ.A7v
            java.lang.String r0 = r10.A6s
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5G
            java.lang.Long r0 = r10.A3V
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A2O
            java.lang.Long r0 = r10.A3V
            r9.A05(r3, r0)
            int r0 = r10.A0I
            java.lang.String r4 = "row"
            if (r0 == r8) goto L_0x0d30
            java.util.Map r3 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r4, r0)
        L_0x0d30:
            int r0 = r10.A0H
            java.lang.String r4 = "position"
            if (r0 == r8) goto L_0x0d3f
            java.util.Map r3 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r4, r0)
        L_0x0d3f:
            r17 = 0
            X.0j9 r3 = X.C271774jZ.A6a
            java.lang.String r0 = r10.A6P
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A66
            java.lang.String r0 = r10.A69
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A6b
            java.lang.String r0 = r10.A6Q
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A67
            java.lang.String r0 = r10.A6A
            r9.A05(r3, r0)
            java.lang.String r3 = r10.A7B
            java.lang.String r0 = "tagged_profile_tapped"
            if (r3 == 0) goto L_0x0d66
            r9.A0A(r0, r3)
        L_0x0d66:
            X.0j9 r3 = X.C271774jZ.A33
            java.lang.Long r0 = r10.A8X
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A34
            java.lang.Long r0 = r10.A8Z
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A35
            java.lang.Long r0 = r10.A8Y
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A55
            java.lang.Long r0 = r10.A8d
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A6X
            java.lang.String r0 = r10.A6M
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1V
            java.lang.String r0 = r10.A4o
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1S
            java.lang.String r0 = r10.A4q
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1W
            java.lang.String r0 = r10.A4p
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A6R
            java.lang.String r0 = r10.A6K
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1F
            java.lang.String r0 = r10.A4h
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A4i
            java.lang.Boolean r0 = r10.A1r
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A4c
            java.lang.Boolean r0 = r10.A1m
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A4k
            java.lang.Boolean r0 = r10.A1t
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1L
            java.lang.String r0 = r10.A4l
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1R
            java.lang.String r0 = r10.A4n
            r9.A05(r3, r0)
            java.lang.String r3 = r10.A4s
            java.lang.String r0 = "container_module"
            if (r3 == 0) goto L_0x0dd8
            r9.A0A(r0, r3)
        L_0x0dd8:
            X.0j9 r3 = X.C271774jZ.A2u
            java.lang.String r0 = r10.A5H
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A3b
            java.lang.String r0 = r10.A5Z
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A3d
            java.lang.String r0 = r10.A5b
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A3c
            java.lang.String r0 = r10.A5a
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1C
            java.lang.String r0 = r10.A4g
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A6q
            java.lang.String r0 = r10.A6a
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5u
            java.lang.String r0 = r10.A62
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5y
            java.lang.String r0 = r10.A64
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5r
            java.util.ArrayList r0 = r10.A7X
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5t
            java.lang.String r0 = r10.A61
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A4W
            java.lang.Boolean r0 = r10.A1h
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5s
            java.lang.Long r0 = r10.A3l
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A0K
            java.lang.String r0 = r10.A4R
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A3l
            java.lang.String r0 = r10.A5h
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A6v
            java.lang.Boolean r0 = r10.A2A
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A0v
            java.lang.String r0 = r10.A4d
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A4m
            java.lang.Boolean r0 = r10.A1v
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A69
            java.lang.Long r0 = r10.A3o
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5v
            java.lang.String r0 = r10.A63
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A3p
            java.lang.String r0 = r10.A5j
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A3L
            java.lang.String r0 = r10.A5O
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A5g
            java.lang.String r0 = r10.A60
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A6p
            java.lang.String r0 = r10.A6Z
            r9.A05(r3, r0)
            X.0j9 r3 = X.C271774jZ.A1X
            java.lang.String r0 = r10.A8j
            r9.A05(r3, r0)
            java.lang.String r0 = r10.A6d
            java.lang.String r4 = "sticker_id"
            if (r0 == 0) goto L_0x0e89
            r9.A0A(r4, r0)
        L_0x0e89:
            java.lang.String r0 = r10.A6f
            java.lang.String r3 = "sticker_type"
            if (r0 == 0) goto L_0x0e92
            r9.A0A(r3, r0)
        L_0x0e92:
            java.lang.String r5 = r10.A6e
            java.lang.String r0 = "interact_result"
            if (r5 == 0) goto L_0x0e9b
            r9.A0A(r0, r5)
        L_0x0e9b:
            X.0j9 r5 = X.C271774jZ.A0j
            java.lang.String r0 = r10.A4Z
            r9.A05(r5, r0)
            X.0j9 r5 = X.C271774jZ.A2f
            java.lang.String r0 = r10.A5D
            r9.A04(r5, r0)
            X.0j9 r5 = X.C271774jZ.A4O
            java.lang.Boolean r0 = r10.A1a
            r9.A05(r5, r0)
            java.lang.String r5 = "product_collection_id"
            X.0jB r0 = r10.A8F
            if (r0 == 0) goto L_0x0eb9
            r9.A06(r0)
        L_0x0eb9:
            java.lang.Boolean r0 = r10.A29
            if (r0 == 0) goto L_0x0ecc
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0ecc
            X.0j9 r6 = X.C271774jZ.A6O
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r9.A04(r6, r0)
        L_0x0ecc:
            X.0j9 r6 = X.C271774jZ.A4l
            java.lang.Boolean r0 = r10.A1u
            r9.A05(r6, r0)
            java.lang.Boolean r6 = r10.A1f
            if (r6 == 0) goto L_0x0edc
            X.0j9 r0 = X.C271774jZ.A4U
            r9.A05(r0, r6)
        L_0x0edc:
            X.0j9 r6 = X.C271774jZ.A9r
            java.lang.Double r0 = r10.A2d
            r9.A05(r6, r0)
            java.lang.Boolean r6 = r10.A14
            if (r6 == 0) goto L_0x0eec
            X.0j9 r0 = X.C271774jZ.A1I
            r9.A05(r0, r6)
        L_0x0eec:
            java.lang.Boolean r6 = r10.A1e
            if (r6 == 0) goto L_0x0ef5
            X.0j9 r0 = X.C271774jZ.A4X
            r9.A04(r0, r6)
        L_0x0ef5:
            X.0j9 r6 = X.C271774jZ.A4V
            java.lang.Boolean r0 = r10.A1g
            r9.A05(r6, r0)
            java.lang.Boolean r6 = r10.A1H
            if (r6 == 0) goto L_0x0f05
            X.0j9 r0 = X.C271774jZ.A43
            r9.A04(r0, r6)
        L_0x0f05:
            X.0j9 r6 = X.C271774jZ.A7n
            java.lang.Double r0 = r10.A2U
            r9.A05(r6, r0)
            X.0j9 r6 = X.C271774jZ.A7m
            java.lang.Double r0 = r10.A2T
            r9.A05(r6, r0)
            X.0j9 r6 = X.C271774jZ.A2A
            java.lang.Double r0 = r10.A8R
            r9.A05(r6, r0)
            X.0j9 r6 = X.C271774jZ.A29
            java.lang.Double r0 = r10.A8Q
            r9.A05(r6, r0)
            X.0j9 r7 = X.C271774jZ.A8L
            java.lang.Double r0 = r10.A2V
            r8 = 0
            if (r0 == 0) goto L_0x0f31
            double r0 = r0.doubleValue()
            float r6 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
        L_0x0f31:
            r9.A05(r7, r1)
            X.0j9 r7 = X.C271774jZ.A8M
            java.lang.Double r0 = r10.A2W
            if (r0 == 0) goto L_0x0f43
            double r0 = r0.doubleValue()
            float r6 = (float) r0
            java.lang.Float r8 = java.lang.Float.valueOf(r6)
        L_0x0f43:
            r9.A05(r7, r8)
            X.0j9 r1 = X.C271774jZ.A7l
            java.lang.Double r0 = r10.A8S
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A14
            java.lang.Long r0 = r10.A3N
            r9.A05(r1, r0)
            X.0j9 r6 = X.C271774jZ.A4I
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r9.A05(r6, r1)
            X.0j9 r0 = X.C271774jZ.A4Q
            r9.A05(r0, r1)
            X.0j9 r1 = X.C271774jZ.A3X
            java.lang.String r0 = r10.A5W
            r9.A05(r1, r0)
            java.lang.String r6 = r10.A5X
            if (r6 == 0) goto L_0x0f79
            X.0j9 r1 = X.C271774jZ.A3Y
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r6)
            r9.A04(r1, r0)
        L_0x0f79:
            java.lang.String r6 = r10.A5Y
            if (r6 == 0) goto L_0x0f88
            X.0j9 r1 = X.C271774jZ.A3Z
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r6)
            r9.A04(r1, r0)
        L_0x0f88:
            X.0j9 r1 = X.C271774jZ.A2M
            java.lang.String r0 = r10.A5A
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2L
            java.lang.String r0 = r10.A59
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A42
            java.lang.String r0 = r10.A5o
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3s
            java.lang.Boolean r0 = r10.A1C
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4C
            boolean r0 = r10.A8B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A04(r1, r0)
            java.lang.Integer r0 = r10.A2u
            if (r0 == 0) goto L_0x0fc1
            int r0 = r0.intValue()
            X.0j9 r6 = X.C271774jZ.A4B
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A05(r6, r0)
        L_0x0fc1:
            X.0j9 r1 = X.C271774jZ.A1z
            java.lang.Integer r0 = r10.A2q
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3t
            boolean r0 = r10.A8A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A05(r1, r0)
            java.lang.String r1 = r10.A5F
            java.lang.String r0 = "failure_type"
            if (r1 == 0) goto L_0x0fdc
            r9.A0A(r0, r1)
        L_0x0fdc:
            X.0j9 r1 = X.C271774jZ.A4b
            java.lang.Boolean r0 = r10.A1n
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3u
            java.lang.Boolean r0 = r10.A1D
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0O
            java.lang.Float r0 = r10.A2f
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0N
            java.lang.Float r0 = r10.A2e
            r9.A05(r1, r0)
            com.instagram.model.shopping.reels.ProfileShopLinkIntf r7 = r10.A0y
            com.instagram.model.shopping.reels.ProductCollectionLinkIntf r6 = r10.A0x
            com.instagram.model.shopping.reels.ReelProductLink r1 = r10.A10
            com.instagram.model.shopping.reels.ReelMultiProductLinkIntf r0 = r10.A0z
            java.util.HashMap r0 = X.C271784ja.A00(r6, r7, r0, r1)
            if (r0 != 0) goto L_0x10cb
            r6 = 0
        L_0x1007:
            java.lang.String r1 = "profile_shop_link"
            if (r6 == 0) goto L_0x1010
            java.util.Map r0 = r9.A00
            r0.put(r1, r6)
        L_0x1010:
            X.0j9 r1 = X.C271774jZ.A1A
            java.lang.Long r0 = r10.A3Q
            r9.A05(r1, r0)
            X.57v r8 = r10.A8H
            if (r8 == 0) goto L_0x104a
            X.0j9 r7 = X.C271774jZ.A81
            X.0jB r6 = new X.0jB
            r6.<init>()
            java.lang.String r1 = r8.A04
            java.lang.String r0 = "shopping_sticker_id"
            r6.A0A(r0, r1)
            java.lang.String r1 = r8.A03
            java.lang.String r0 = "merchant_id"
            r6.A0A(r0, r1)
            java.util.List r1 = r8.A02
            java.lang.String r0 = "product_ids"
            r6.A0C(r0, r1)
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x103e
            r6.A0A(r5, r0)
        L_0x103e:
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "product_collection_type"
            if (r1 == 0) goto L_0x1047
            r6.A0A(r0, r1)
        L_0x1047:
            r9.A05(r7, r6)
        L_0x104a:
            X.0j9 r1 = X.C271774jZ.A5N
            X.0jB r0 = r10.A0m
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A84
            X.0jB r0 = r10.A0s
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A86
            java.lang.String r0 = r10.A6F
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A87
            java.util.ArrayList r0 = r10.A7b
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2l
            java.util.ArrayList r0 = r10.A7Y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2y
            java.util.ArrayList r0 = r10.A7a
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2x
            java.util.ArrayList r0 = r10.A7Z
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2p
            X.0jB r0 = r10.A0l
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4E
            java.lang.Boolean r0 = r10.A1R
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A28
            java.lang.String r0 = r10.A54
            r9.A05(r1, r0)
            java.util.Map r5 = r10.A89
            if (r5 == 0) goto L_0x109e
            X.0j9 r1 = X.C271774jZ.A9S
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r5)
            r9.A05(r1, r0)
        L_0x109e:
            java.util.Map r0 = r10.A85
            if (r0 == 0) goto L_0x10dc
            X.0jB r6 = new X.0jB
            r6.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x10af:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x10d5
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r6.A0A(r1, r0)
            goto L_0x10af
        L_0x10cb:
            X.0jB r6 = new X.0jB
            r6.<init>()
            r6.A0D(r0)
            goto L_0x1007
        L_0x10d5:
            java.lang.String r1 = "collections_logging_info"
            java.util.Map r0 = r9.A00
            r0.put(r1, r6)
        L_0x10dc:
            java.util.Map r5 = r10.A87
            if (r5 == 0) goto L_0x1175
            X.0jB r6 = new X.0jB
            r6.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x10ed:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1109
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r6.A0C(r1, r0)
            goto L_0x10ed
        L_0x1109:
            java.lang.String r1 = "product_merchant_ids"
            java.util.Map r0 = r9.A00
            r0.put(r1, r6)
            X.0j9 r8 = X.C271774jZ.A6l
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x111f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x1172
            java.lang.Object r12 = r16.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r1 = r12.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r6 = 0
            if (r1 == 0) goto L_0x113a
            r0 = 10
            java.lang.Long r6 = X.00y.A0n(r0, r1)     // Catch:{ NumberFormatException -> 0x113a }
        L_0x113a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r15 = r0.iterator()
        L_0x1149:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x1164
            java.lang.Object r12 = r15.next()
            java.lang.String r12 = (java.lang.String) r12
            r0 = 0
            if (r12 == 0) goto L_0x115e
            r1 = 10
            java.lang.Long r0 = X.00y.A0n(r1, r12)     // Catch:{ NumberFormatException -> 0x115e }
        L_0x115e:
            if (r0 == 0) goto L_0x1149
            r5.add(r0)
            goto L_0x1149
        L_0x1164:
            if (r6 == 0) goto L_0x111f
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x111f
            r7.put(r6, r5)
            goto L_0x111f
        L_0x1172:
            r9.A05(r8, r7)
        L_0x1175:
            java.util.ArrayList r1 = r10.A8n
            if (r1 == 0) goto L_0x11a7
            X.0j9 r0 = X.C271774jZ.A8G
            r9.A05(r0, r1)
            X.0j9 r6 = X.C271774jZ.A8H
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x1189:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x119f
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = X.C254543se.A00(r0)
            if (r0 == 0) goto L_0x1189
            r5.add(r0)
            goto L_0x1189
        L_0x119f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            r9.A05(r6, r0)
        L_0x11a7:
            java.util.List r0 = r10.A80
            if (r0 == 0) goto L_0x1222
            java.util.List r0 = X.00k.A0a(r0)
        L_0x11af:
            r9.A0C(r11, r0)
            java.util.List r0 = r10.A82
            java.lang.String r1 = "responses"
            r9.A0B(r1, r0)
            java.util.List r0 = r10.A83
            r9.A0C(r1, r0)
            X.0j9 r1 = X.C271774jZ.A83
            java.lang.Boolean r0 = r10.A2C
            r9.A05(r1, r0)
            java.util.List r5 = r10.A83
            if (r5 == 0) goto L_0x11d3
            X.0j9 r1 = X.C271774jZ.A8g
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            r9.A05(r1, r0)
        L_0x11d3:
            java.util.List r1 = r10.A8o
            java.lang.String r0 = "nav_stack"
            r9.A0B(r0, r1)
            java.util.List r0 = r10.A7t
            r5 = 0
            if (r0 == 0) goto L_0x1224
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x11e8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x1224
            java.lang.Object r7 = r8.next()
            X.3gp r7 = (X.C247733gp) r7
            java.lang.Integer r1 = r7.A0Z
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x11e8
            X.0jB r6 = new X.0jB
            r6.<init>()
            java.lang.String r1 = r7.A0G
            r0 = 2902(0xb56, float:4.067E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0A(r0, r1)
            com.instagram.user.model.User r0 = r7.A08
            if (r0 == 0) goto L_0x121f
            java.lang.String r1 = r0.getId()
        L_0x1212:
            r0 = 624(0x270, float:8.74E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0A(r0, r1)
            r5.add(r6)
            goto L_0x11e8
        L_0x121f:
            r1 = r17
            goto L_0x1212
        L_0x1222:
            r0 = 0
            goto L_0x11af
        L_0x1224:
            java.lang.String r0 = "c_pk_list"
            r9.A0B(r0, r5)
            java.util.List r1 = r10.A8p
            if (r1 == 0) goto L_0x125d
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x123c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1254
            java.lang.Object r1 = r5.next()
            java.util.Map r1 = (java.util.Map) r1
            X.0jB r0 = new X.0jB
            r0.<init>()
            r0.A0D(r1)
            r6.add(r0)
            goto L_0x123c
        L_0x1254:
            r0 = 395(0x18b, float:5.54E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A0B(r0, r6)
        L_0x125d:
            X.0j9 r1 = X.C271774jZ.A1e
            java.util.ArrayList r0 = r10.A7U
            r9.A05(r1, r0)
            X.0j9 r8 = X.C271774jZ.A8N
            java.util.Map r0 = r10.A88
            if (r0 == 0) goto L_0x12aa
            java.util.Set r1 = r0.entrySet()
            if (r1 == 0) goto L_0x12aa
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x127f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x12ac
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            X.0jB r1 = new X.0jB
            r1.<init>()
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x129b
            r1.A0A(r3, r0)
        L_0x129b:
            java.lang.Object r0 = r5.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x12a6
            r1.A0A(r4, r0)
        L_0x12a6:
            r7.add(r1)
            goto L_0x127f
        L_0x12aa:
            r0 = 0
            goto L_0x12b1
        L_0x12ac:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
        L_0x12b1:
            r9.A05(r8, r0)
            X.0j9 r1 = X.C271774jZ.A72
            X.0jB r0 = r10.A0p
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A75
            X.0jB r0 = r10.A0q
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8n
            X.0jB r0 = r10.A0u
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7K
            X.0jB r0 = r10.A0r
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A20
            X.0jB r0 = r10.A0k
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A23
            java.lang.Boolean r0 = r10.A1P
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6y
            X.0jB r0 = r10.A0o
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1O
            X.0jB r0 = r10.A0n
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0X
            java.lang.String r0 = r10.A4V
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7e
            java.lang.String r0 = r10.A6i
            r9.A05(r1, r0)
            java.util.List r1 = r10.A7x
            java.lang.String r0 = "reasons"
            r9.A0C(r0, r1)
            java.util.List r1 = r10.A81
            java.lang.String r0 = "invalidation_sub_reasons"
            r9.A0C(r0, r1)
            java.lang.Integer r1 = r10.A2k
            java.lang.String r0 = "ad_objective_type"
            r9.A07(r1, r0)
            java.lang.String r1 = r10.A6C
            java.lang.String r0 = "optimization_goal_name"
            if (r1 == 0) goto L_0x1318
            r9.A0A(r0, r1)
        L_0x1318:
            java.lang.String r1 = r10.A5l
            java.lang.String r0 = "invalidation_extras"
            if (r1 == 0) goto L_0x1321
            r9.A0A(r0, r1)
        L_0x1321:
            java.lang.String r1 = r10.A5k
            java.lang.String r0 = "invalidation_delivery_contexts"
            if (r1 == 0) goto L_0x132a
            r9.A0A(r0, r1)
        L_0x132a:
            java.lang.Boolean r3 = r10.A1G
            java.lang.String r1 = "is_basic_ads_enabled"
            if (r3 == 0) goto L_0x1335
            java.util.Map r0 = r9.A00
            r0.put(r1, r3)
        L_0x1335:
            java.lang.String r1 = r10.A4X
            java.lang.String r0 = "basic_ads_graphql_tier"
            if (r1 == 0) goto L_0x133e
            r9.A0A(r0, r1)
        L_0x133e:
            java.lang.String r1 = r10.A4Y
            java.lang.String r0 = "basic_ads_launcher_tier"
            if (r1 == 0) goto L_0x1347
            r9.A0A(r0, r1)
        L_0x1347:
            java.lang.String r1 = r10.A4S
            java.lang.String r0 = "afs_enablement_status"
            if (r1 == 0) goto L_0x1350
            r9.A0A(r0, r1)
        L_0x1350:
            java.util.List r1 = r10.A7p
            java.lang.String r0 = "in_pool_ad_ids"
            r9.A0C(r0, r1)
            java.util.List r1 = r10.A7q
            java.lang.String r0 = "inserted_ad_ids"
            r9.A0C(r0, r1)
            java.util.List r1 = r10.A7z
            java.lang.String r0 = "seen_ad_ids"
            r9.A0C(r0, r1)
            X.0j9 r1 = X.C271774jZ.A4y
            java.lang.Boolean r0 = r10.A21
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9l
            java.util.ArrayList r0 = r10.A7f
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2Q
            java.lang.String r0 = r10.A5B
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7d
            X.V1T r0 = r10.A0f
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9s
            java.lang.Boolean r0 = r10.A2F
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2t
            java.lang.Long r0 = r10.A3Y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2B
            java.lang.Boolean r0 = r10.A17
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4J
            java.lang.Boolean r0 = r10.A1U
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2o
            java.lang.Boolean r0 = r10.A26
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2n
            java.lang.Boolean r0 = r10.A25
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2m
            java.lang.Double r0 = r10.A2M
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1y
            java.lang.String r0 = r10.A4y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A31
            int r0 = r10.A0J
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6c
            int r0 = r10.A0W
            r9.A03(r1, r0)
            X.0j9 r5 = X.C271774jZ.A90
            double r3 = r10.A03
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x13d8
            java.util.Map r1 = r9.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.put(r5, r0)
        L_0x13d8:
            X.0j9 r1 = X.C271774jZ.A5m
            int r0 = r10.A0Y
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A32
            int r0 = r10.A0K
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6m
            int r0 = r10.A0X
            r9.A03(r1, r0)
            java.util.List r3 = r10.A7v
            if (r3 == 0) goto L_0x13fb
            X.0j9 r1 = X.C271774jZ.A30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r9.A05(r1, r0)
        L_0x13fb:
            java.util.List r3 = r10.A7w
            if (r3 == 0) goto L_0x1409
            X.0j9 r1 = X.C271774jZ.A9K
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r9.A05(r1, r0)
        L_0x1409:
            X.0j9 r1 = X.C271774jZ.A9W
            java.lang.Integer r0 = r10.A3D
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A7f
            java.lang.String r0 = r10.A6j
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6s
            java.lang.String r0 = r10.A6b
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6f
            java.lang.String r0 = r10.A6O
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5C
            int r0 = r10.A0O
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5D
            int r0 = r10.A0P
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8S
            java.lang.String r0 = r10.A77
            r9.A05(r1, r0)
            java.util.HashMap r3 = r10.A7g
            java.lang.String r1 = "tracking_tokens"
            if (r3 == 0) goto L_0x1445
            java.util.Map r0 = r9.A00
            r0.put(r1, r3)
        L_0x1445:
            java.lang.String r1 = r10.A74
            java.lang.String r0 = "sub_reason"
            if (r1 == 0) goto L_0x144e
            r9.A0A(r0, r1)
        L_0x144e:
            java.lang.Integer r1 = r10.A35
            java.lang.String r0 = "previous_time_gap"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A36
            java.lang.String r0 = "pushup_min_gap"
            r9.A07(r1, r0)
            java.lang.Integer r1 = r10.A33
            java.lang.String r0 = "previous_pushup_min_gap"
            r9.A07(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6d
            java.lang.Integer r0 = r10.A34
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6e
            java.lang.String r0 = r10.A6R
            r9.A05(r1, r0)
            java.util.List r1 = r10.A7r
            if (r1 == 0) goto L_0x14e0
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x1484:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x14db
            java.lang.Object r5 = r6.next()
            X.GXs r5 = (X.C52567GXs) r5
            X.0jB r4 = new X.0jB
            r4.<init>()
            X.3VL r0 = r5.A00
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x149e
            r4.A0A(r2, r0)
        L_0x149e:
            java.lang.Integer r0 = r5.A04
            java.lang.String r1 = X.C56321HwY.A00(r0)
            java.lang.String r0 = "reason"
            r4.A0A(r0, r1)
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "request_id"
            if (r1 == 0) goto L_0x14b2
            r4.A0A(r0, r1)
        L_0x14b2:
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "media_id"
            if (r1 == 0) goto L_0x14bb
            r4.A0A(r0, r1)
        L_0x14bb:
            java.lang.Integer r1 = r5.A03
            java.lang.String r0 = "index"
            r4.A07(r1, r0)
            java.lang.Integer r1 = r5.A01
            java.lang.String r0 = "dedup_existing_item_index"
            r4.A07(r1, r0)
            java.lang.Integer r1 = r5.A05
            java.lang.String r0 = "server_gap"
            r4.A07(r1, r0)
            java.lang.Integer r1 = r5.A02
            java.lang.String r0 = "gap_at_border"
            r4.A07(r1, r0)
            r3.add(r4)
            goto L_0x1484
        L_0x14db:
            java.lang.String r0 = "invalidation_arbiter_events"
            r9.A0B(r0, r3)
        L_0x14e0:
            X.0j9 r1 = X.C271774jZ.A6N
            java.lang.String r0 = r10.A6E
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6M
            java.lang.String r0 = r10.A6D
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6J
            int r0 = r10.A0D
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6I
            int r0 = r10.A0C
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0i
            int r0 = r10.A0E
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3O
            java.lang.Long r0 = r10.A3Z
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3Q
            java.lang.String r0 = r10.A4H
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3P
            java.lang.String r0 = r10.A5T
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3N
            java.lang.String r0 = r10.A5P
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A8i
            java.lang.Long r0 = r10.A4D
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3o
            java.lang.String r0 = r10.A5i
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A02
            int r0 = r10.A09
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4S
            java.lang.Boolean r0 = r10.A1c
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3v
            java.lang.Boolean r0 = r10.A1E
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A3w
            java.lang.Boolean r0 = r10.A1F
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0H
            java.lang.String r0 = r10.A4Q
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4q
            java.lang.Boolean r0 = r10.A1y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9R
            java.util.ArrayList r0 = r10.A7e
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6E
            int r0 = r10.A0S
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6D
            int r0 = r10.A0R
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6F
            int r0 = r10.A0T
            r9.A03(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6L
            java.lang.String r0 = r10.A52
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6K
            java.lang.String r0 = r10.A51
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A82
            java.lang.Boolean r0 = r10.A2B
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4Z
            java.lang.Boolean r0 = r10.A1k
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4Y
            java.lang.Boolean r0 = r10.A1j
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6H
            java.lang.Long r0 = r10.A3w
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9k
            java.lang.Integer r0 = r10.A3F
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9j
            java.lang.Integer r0 = r10.A3E
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4t
            java.lang.Boolean r0 = r10.A20
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A6t
            java.lang.Integer r0 = r10.A37
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A53
            java.lang.String r0 = r10.A5p
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4n
            java.lang.Boolean r0 = r10.A1w
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2U
            java.lang.Long r0 = r10.A3W
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2X
            X.5re r0 = r10.A0d
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2W
            java.util.ArrayList r0 = r10.A7V
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A2V
            java.lang.Long r0 = r10.A3X
            r9.A05(r1, r0)
            X.0j9 r3 = X.C271774jZ.A07
            java.util.List r2 = r10.A7h
            if (r2 == 0) goto L_0x15f3
            java.util.Map r1 = r9.A01
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.put(r3, r0)
        L_0x15f3:
            X.0j9 r3 = X.C271774jZ.A0f
            java.util.List r2 = r10.A7m
            if (r2 == 0) goto L_0x1603
            java.util.Map r1 = r9.A01
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.put(r3, r0)
        L_0x1603:
            X.0j9 r3 = X.C271774jZ.A0d
            java.util.List r2 = r10.A7l
            if (r2 == 0) goto L_0x1613
            java.util.Map r1 = r9.A01
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.put(r3, r0)
        L_0x1613:
            X.0j9 r1 = X.C271774jZ.A0g
            java.lang.Integer r0 = r10.A2o
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0e
            java.lang.Integer r0 = r10.A2n
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9N
            java.lang.String r0 = r10.A7L
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9O
            java.util.ArrayList r0 = r10.A7d
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1Y
            java.util.ArrayList r0 = r10.A7T
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A4F
            java.lang.Boolean r0 = r10.A1S
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A5f
            java.lang.Integer r0 = r10.A2y
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A1J
            java.lang.Double r0 = r10.A2c
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0b
            java.lang.Long r0 = r10.A3K
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A0a
            java.lang.Long r0 = r10.A3J
            r9.A05(r1, r0)
            X.0j9 r1 = X.C271774jZ.A59
            java.lang.Float r0 = r10.A2j
            r9.A05(r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254523sc.A01():X.0jB");
    }

    public final void A03() {
        this.A8a = 24L;
    }

    public final void A04(float f, float f2, float f3) {
        0jB r3 = this.A0m;
        if (r3 == null) {
            r3 = new 0jB();
            this.A0m = r3;
        }
        r3.A04(C271774jZ.A7n, Double.valueOf((double) f));
        0jB r32 = this.A0m;
        if (r32 != null) {
            r32.A04(C271774jZ.A7m, Double.valueOf((double) f2));
        }
        0jB r33 = this.A0m;
        if (r33 != null) {
            r33.A04(C271774jZ.A7l, Double.valueOf((double) f3));
        }
    }

    public final void A0E(0jB r2) {
        if (r2 != null) {
            0jB r0 = this.A8F;
            if (r0 != null) {
                r0.A06(r2);
            } else {
                this.A8F = r2;
            }
        }
    }

    public final void A0J(UserSession userSession, 1Xl r3) {
        if (r3 instanceof AnonymousClass3OA) {
            A0K(userSession, (AnonymousClass3OA) r3);
        } else {
            A0G(userSession, r3.BPf());
        }
    }

    public final void A0L(1Xj r6) {
        MoreInfoType BUD;
        AnonymousClass41Z BUC = r6.A0C.BUC();
        if (BUC != null) {
            0jB r0 = this.A0s;
            if (r0 == null) {
                r0 = new 0jB();
            }
            this.A0s = r0;
            C270854hQ BCd = BUC.BCd();
            if ((BCd != null || (BCd = BUC.B7C()) != null || (BCd = BUC.B1Z()) != null) && (BUD = BCd.BUD()) != null) {
                0jB r3 = this.A0s;
                if (r3 != null) {
                    r3.A04(C271774jZ.A85, Long.valueOf((long) BUD.ordinal()));
                }
                0jB r2 = this.A0s;
                if (r2 != null) {
                    r2.A04(C271774jZ.A86, BUD.name());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r3.A0U == null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C270194gL r3) {
        /*
            r2 = this;
            com.instagram.user.model.User r0 = r3.A09
            r0.getClass()
            java.lang.String r0 = r0.getId()
            r2.A4K = r0
            java.lang.String r0 = r3.A0e
            r0.getClass()
            r2.A5u = r0
            long r0 = r3.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A8h = r0
            X.4wI r0 = r3.A06
            if (r0 != 0) goto L_0x0022
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x0022:
            boolean r1 = r0.A01()
            if (r1 == 0) goto L_0x0096
            X.1iA r0 = X.1iA.A0M
        L_0x002a:
            int r0 = r0.A00
            r2.A8C = r0
            if (r1 == 0) goto L_0x0093
            X.1iA r0 = X.1iA.A0M
        L_0x0032:
            java.lang.String r0 = r0.name()
            r2.A8l = r0
            X.4DU r0 = r2.A8r
            java.lang.String r0 = r0.getModuleName()
            r2.A6x = r0
            com.instagram.user.model.User r0 = r3.A09
            r0.getClass()
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
            java.lang.String r0 = X.1aC.A06(r0)
            r2.A5I = r0
            X.4wI r0 = r3.A06
            if (r0 != 0) goto L_0x0055
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x0055:
            boolean r1 = r0.A01()
            r0 = r1 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A8O = r0
            if (r1 != 0) goto L_0x0068
            java.lang.Long r1 = r3.A0U
            r0 = 1
            if (r1 != 0) goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A8N = r0
            java.util.Set r0 = r3.A06()
            X.0qQ.A07(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0092
            java.util.Set r0 = r3.A06()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            r2.A4k = r0
        L_0x0092:
            return
        L_0x0093:
            X.1iA r0 = X.1iA.A0L
            goto L_0x0032
        L_0x0096:
            X.1iA r0 = X.1iA.A0L
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254523sc.A0M(X.4gL):void");
    }

    public final void A0O(C233472vm r3) {
        if (r3 != null) {
            this.A3i = Long.valueOf((long) r3.A07());
            this.A3j = Long.valueOf((long) r3.A08());
            this.A3g = Long.valueOf((long) r3.A01());
            this.A3h = Long.valueOf((long) r3.A02());
            this.A3a = Long.valueOf((long) r3.A03());
            this.A8e = Long.valueOf((long) r3.A04());
            this.A3k = Long.valueOf((long) r3.A06());
            this.A2Y = Double.valueOf(r3.A00());
        }
    }

    public final void A0P(Float f, Float f2) {
        0jB r3 = this.A0m;
        if (r3 == null) {
            r3 = new 0jB();
            this.A0m = r3;
        }
        if (f2 != null && f != null) {
            r3.A04(C271774jZ.A5H, Double.valueOf((double) f.floatValue()));
            0jB r32 = this.A0m;
            if (r32 != null) {
                r32.A04(C271774jZ.A5c, Double.valueOf((double) f2.floatValue()));
            }
        }
    }

    public final void A0Q(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf((long) num.intValue());
        } else {
            l = null;
        }
        this.A8X = l;
    }

    public final void A0R(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf((long) num.intValue());
        } else {
            l = null;
        }
        this.A8Y = l;
    }

    public final void A0S(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf((long) num.intValue());
        } else {
            l = null;
        }
        this.A8Z = l;
    }

    public final void A0T(Integer num) {
        if (num != null) {
            this.A8b = Long.valueOf((long) num.intValue());
        }
    }

    public final void A0U(Integer num) {
        Long l;
        if (num != null) {
            l = Long.valueOf((long) num.intValue());
        } else {
            l = null;
        }
        this.A8d = l;
    }

    public final void A0V(List list) {
        List list2;
        if (list != null) {
            list2 = 00k.A0a(list);
        } else {
            list2 = null;
        }
        this.A7r = list2;
    }

    public final void A0W(List list) {
        0jB r7 = this.A0m;
        if (r7 == null) {
            r7 = new 0jB();
            this.A0m = r7;
        }
        if (list != null) {
            0j9 r6 = C271774jZ.A0s;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                0jB r2 = new 0jB();
                r2.A04(C271774jZ.A0t, (Serializable) map.get("token"));
                0j9 r1 = C271774jZ.A0r;
                String str = (String) map.get("category");
                if (str == null) {
                    str = "";
                }
                r2.A04(r1, str);
                arrayList.add(r2);
            }
            r7.A05(r6, new ArrayList(arrayList));
        }
    }

    public final void A0X(List list) {
        if (list != null && (!list.isEmpty())) {
            this.A8q = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                double doubleValue = ((Number) it.next()).doubleValue();
                List list2 = this.A8q;
                if (list2 != null) {
                    list2.add(String.valueOf(doubleValue));
                }
            }
        }
    }

    public final void A0Y(Map map) {
        0jB r0 = this.A0m;
        if (r0 == null) {
            r0 = new 0jB();
            this.A0m = r0;
        }
        r0.A0D(map);
    }

    public final void A0B(long j) {
        this.A8g = Long.valueOf(j);
    }

    public final void A0C(Activity activity, 0lg r11) {
        int i;
        ArrayList arrayList;
        AnonymousClass3LV r0 = (AnonymousClass3LV) C71342cb.A00(r11).A0M.get(activity.toString());
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        this.A8D = i;
        AnonymousClass3LV r02 = (AnonymousClass3LV) C71342cb.A00(r11).A0M.get(activity.toString());
        if (r02 != null) {
            arrayList = new ArrayList();
            LinkedList linkedList = r02.A01;
            int size = linkedList.size();
            for (int i2 = 0; i2 < size; i2++) {
                0jB r4 = new 0jB();
                for (Map.Entry entry : ((Map) linkedList.get(i2)).entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!0qQ.A0K(str, "instance_id")) {
                        r4.A0A(str, str2);
                    }
                }
                arrayList.add(r4);
            }
        } else {
            arrayList = null;
        }
        this.A8o = arrayList;
    }

    public final void A0H(UserSession userSession, 1Xj r6, ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf, ProductLaunchInformation productLaunchInformation, Boolean bool, String str, String str2) {
        FollowStatus followStatus;
        long j;
        A0F(userSession);
        this.A6U = str;
        this.A4W = str2;
        this.A5y = str2;
        this.A8K = bool;
        if (!(bool == null || !bool.booleanValue() || productCheckoutPropertiesIntf == null)) {
            this.A8T = productCheckoutPropertiesIntf.BIk();
        }
        if (productLaunchInformation != null) {
            Long BLg = productLaunchInformation.BLg();
            if (BLg != null) {
                j = BLg.longValue();
            } else {
                j = 0;
            }
            this.A8E = j;
            this.A8J = productLaunchInformation.BBR();
        }
        if (r6 != null) {
            User A2A2 = r6.A2A(userSession);
            this.A5u = r6.getId();
            A0N(r6.BR7());
            String str3 = null;
            if (A2A2 != null) {
                followStatus = A2A2.B6o();
            } else {
                followStatus = null;
            }
            Parcelable.Creator creator = User.CREATOR;
            this.A5I = 1aC.A06(followStatus);
            this.A7c = r6.A3K(true);
            if (A2A2 != null) {
                str3 = A2A2.getId();
            }
            this.A5w = str3;
            this.A1a = Boolean.valueOf(!0qQ.A0K(str3, str2));
        }
    }

    public final void A0I(UserSession userSession, 1Xj r4, AnonymousClass3OA r5) {
        String organicTrackingToken;
        A0F(userSession);
        if (r4 == null) {
            r4 = r5.A0K;
        }
        A0G(userSession, r4);
        this.A4N = r5.A0S;
        if (this.A8r.isSponsoredEligible()) {
            organicTrackingToken = r5.A0j;
        } else {
            organicTrackingToken = r4.A0C.getOrganicTrackingToken();
        }
        this.A7J = organicTrackingToken;
        this.A8i = Long.valueOf((long) C243483Yy.A00.A06(userSession, r4).size());
        if (this.A0m == null) {
            this.A0m = new 0jB();
        }
        0jB r0 = this.A0s;
        if (r0 == null) {
            r0 = new 0jB();
        }
        this.A0s = r0;
        0jB r02 = this.A0l;
        if (r02 == null) {
            r02 = new 0jB();
        }
        this.A0l = r02;
    }

    public final /* bridge */ /* synthetic */ Object EjI(float f, float f2, float f3, float f4, float f5) {
        A05(f, f2, f3, f4, f5);
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C254523sc(AnonymousClass4DU r2, String str) {
        this((C270594gz) null, r2, str);
        0qQ.A0B(str, 1);
        0qQ.A0B(r2, 2);
    }
}
