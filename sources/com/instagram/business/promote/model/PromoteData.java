package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass4KJ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.BBT;
import X.C13990Tnq;
import X.C13992Tns;
import X.C16616UyC;
import X.C16655Uyr;
import X.C16664Uz0;
import X.C21011X9n;
import X.C41847B3o;
import X.C41848B3p;
import X.C51968G9o;
import X.C53351Gmb;
import X.C66582MXn;
import X.DbU;
import X.GSY;
import X.JTS;
import X.N4Q;
import X.Pxf;
import X.UKM;
import X.UKW;
import X.ULZ;
import X.UMu;
import X.W6D;
import X.X9w;
import X.XA0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.DEPProgramLevelContentResponse;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

public class PromoteData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(38);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
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
    public C53351Gmb A0M;
    public N4Q A0N;
    public GSY A0O;
    public ULZ A0P;
    public BillingWizardName A0Q;
    public DEPProgramLevelContentResponse A0R;
    public DestinationRecommendationReason A0S;
    public Estimate A0T;
    public Estimate A0U;
    public X9w A0V;
    public NonDiscInfo A0W;
    public PaymentInfo A0X;
    public UKM A0Y;
    public XA0 A0Z;
    public XFBCTXWelcomeMessageStatus A0a;
    public XIGIGBoostCallToAction A0b;
    public XIGIGBoostCallToAction A0c;
    public XIGIGBoostCallToAction A0d;
    public XIGIGBoostCallToAction A0e;
    public XIGIGBoostDestination A0f;
    public XIGIGBoostDestination A0g;
    public XIGIGBoostDestination A0h;
    public XIGIGBoostDestination A0i;
    public XIGIGBoostDestination A0j;
    public AdCreativeAuthorizationCategory A0k;
    public BoostFlowType A0l;
    public IGBoostPackagesFlowInfo A0m;
    public LinkingAuthState A0n;
    public PendingLocation A0o;
    public PromoteAudienceInfo A0p;
    public PromoteAudienceInfo A0q;
    public PromoteAudiencePotentialReachStore A0r;
    public PromoteDataSnapshot A0s;
    public PromoteEnrollCouponInfo A0t;
    public PromoteIntegrityCheckDataModel A0u;
    public PromoteLaunchOrigin A0v;
    public PromoteReachEstimationStore A0w;
    public PromoteWhatsAppAccountType A0x;
    public UserSession A0y;
    public ImageUrl A0z;
    public ImageUrl A10;
    public ImageUrl A11;
    public C16616UyC A12;
    public C16655Uyr A13;
    public C16664Uz0 A14;
    public C16664Uz0 A15;
    public LeadForm A16;
    public ProductType A17;
    public AudioOverlayTrack A18;
    public Boolean A19;
    public String A1A;
    public String A1B;
    public String A1C = null;
    public String A1D = null;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public String A1T;
    public String A1U;
    public String A1V;
    public String A1W;
    public String A1X;
    public String A1Y;
    public String A1Z;
    public String A1a;
    public String A1b;
    public String A1c;
    public String A1d;
    public String A1e;
    public String A1f;
    public String A1g;
    public String A1h;
    public String A1i;
    public Currency A1j;
    public Date A1k;
    public List A1l;
    public List A1m;
    public List A1n;
    public List A1o;
    public List A1p;
    public List A1q;
    public List A1r;
    public List A1s;
    public List A1t;
    public List A1u;
    public List A1v;
    public List A1w;
    public List A1x;
    public List A1y;
    public List A1z;
    public List A20;
    public List A21;
    public Map A22;
    public Map A23;
    public Set A24;
    public Set A25 = new HashSet();
    public Set A26;
    public Set A27;
    public boolean A28;
    public boolean A29;
    public boolean A2A;
    public boolean A2B;
    public boolean A2C = false;
    public boolean A2D;
    public boolean A2E;
    public boolean A2F;
    public boolean A2G;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;
    public boolean A2K;
    public boolean A2L;
    public boolean A2M;
    public boolean A2N;
    public boolean A2O;
    public boolean A2P;
    public boolean A2Q;
    public boolean A2R;
    public boolean A2S;
    public boolean A2T;
    public boolean A2U;
    public boolean A2V;
    public boolean A2W;
    public boolean A2X;
    public boolean A2Y;
    public boolean A2Z;
    public boolean A2a;
    public boolean A2b;
    public boolean A2c;
    public boolean A2d;
    public boolean A2e;
    public boolean A2f;
    public boolean A2g;
    public boolean A2h;
    public boolean A2i;
    public boolean A2j;
    public boolean A2k;
    public boolean A2l;
    public boolean A2m;
    public boolean A2n;
    public boolean A2o;
    public boolean A2p;
    public boolean A2q;
    public boolean A2r;
    public boolean A2s;
    public boolean A2t;
    public boolean A2u;
    public boolean A2v;
    public boolean A2w;
    public boolean A2x;
    public boolean A2y = false;
    public boolean A2z;
    public boolean A30;
    public boolean A31;
    public boolean A32;
    public boolean A33;
    public boolean A34 = false;
    public String[] A35;

    public static void A01(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        Iterator A1F2 = C41848B3p.A1F(parcel, list);
        while (A1F2.hasNext()) {
            BBT bbt = (BBT) A1F2.next();
            parcel.writeString(bbt.A02);
            parcel.writeInt(AnonymousClass7TG.A0A((Number) bbt.A01));
            parcel.writeLong(bbt.A00);
            parcel.writeString(bbt.A03);
            parcel.writeString(bbt.A04);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public static void A02(PromoteData promoteData) {
        if (promoteData.A0i == XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE) {
            List list = promoteData.A20;
            if (list == null || list.size() < 2) {
                promoteData.A20 = Pxf.A0q(new XIGIGBoostDestination[]{XIGIGBoostDestination.DIRECT_MESSAGE, XIGIGBoostDestination.WHATSAPP_MESSAGE});
            }
        }
    }

    public final ImmutableList A03() {
        ArrayList arrayList = new ArrayList();
        for (Object A1X2 : this.A21) {
            DbU.A1X(A1X2, arrayList);
        }
        if (arrayList.isEmpty()) {
            return ImmutableList.of();
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public final PromoteAudience A06() {
        String str = this.A1Z;
        if (str == null) {
            return null;
        }
        Map map = this.A22;
        if (map.containsKey(str)) {
            return (PromoteAudience) map.get(str);
        }
        return null;
    }

    public final PromoteAudience A07() {
        String str = this.A1Z;
        if (str == null) {
            return null;
        }
        Map map = this.A22;
        if (map.containsKey(str)) {
            return (PromoteAudience) map.get(str);
        }
        return null;
    }

    public final PromoteAudience A08() {
        String str = this.A1Z;
        if (str == null || AnonymousClass4KJ.A00(this.A1m)) {
            return null;
        }
        for (PromoteAudience promoteAudience : this.A1m) {
            String str2 = promoteAudience.A05;
            if (str2 != null && str2.equals(str)) {
                return promoteAudience;
            }
        }
        return null;
    }

    public final ArrayList A0A() {
        boolean z = this.A31;
        if (!z && !this.A2z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "MULTI_ADVERTISERS_CONTEXTUAL_ADS");
            hashMap.put("eligibility", "ELIGIBLE");
            C16664Uz0 uz0 = this.A15;
            uz0.getClass();
            hashMap.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, uz0.name());
            arrayList.add(hashMap);
        }
        if (!this.A2z) {
            return arrayList;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "AUTOMATIC_CREATIVE_OPTIMIZATION");
        hashMap2.put("eligibility", "ELIGIBLE");
        C16664Uz0 uz02 = this.A14;
        uz02.getClass();
        hashMap2.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, uz02.name());
        arrayList.add(hashMap2);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r1 = X.AnonymousClass7TG.A0F(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(int r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.A1n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002e
            java.util.List r1 = r5.A1n
            r0 = 0
            int r4 = X.C51971G9r.A0I(r1, r0)
            int r3 = X.C13988Tno.A06(r6, r4)
            java.util.List r0 = r5.A1n
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            int r1 = X.AnonymousClass7TG.A0F(r2)
            int r0 = X.C13988Tno.A06(r6, r1)
            if (r0 > r3) goto L_0x002c
            r4 = r1
            r3 = r0
            goto L_0x0019
        L_0x002c:
            r5.A08 = r4
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.model.PromoteData.A0B(int):void");
    }

    public final boolean A0C() {
        if (this.A21.contains(SpecialRequirementCategory.A06) || this.A21.contains(SpecialRequirementCategory.A05) || this.A21.contains(SpecialRequirementCategory.A04)) {
            return true;
        }
        return false;
    }

    public final boolean A0D() {
        if (this.A0v == PromoteLaunchOrigin.AB_TESTING_PICKER && this.A1v.size() == 2) {
            return true;
        }
        return false;
    }

    public final boolean A0E() {
        Integer num;
        int intValue;
        int intValue2;
        PaymentInfo paymentInfo = this.A0X;
        if (paymentInfo == null || (num = paymentInfo.A01) == null || (intValue = num.intValue()) <= 0) {
            return false;
        }
        Integer num2 = paymentInfo.A02;
        if (num2 == null) {
            intValue2 = 0;
        } else {
            intValue2 = num2.intValue();
        }
        if ((intValue - intValue2) - this.A0I <= 0) {
            return true;
        }
        return false;
    }

    public final boolean A0F(String str) {
        if (this.A1A == null || this.A0y == null || this.A1S == null || str == null || this.A0i == null || this.A1Z == null || this.A0I <= 0) {
            return false;
        }
        if ((this.A0A > 0 || this.A2v) && this.A07 > 0) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A1S);
        parcel.writeStringList(this.A1v);
        parcel.writeParcelable(this.A0m, i);
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A17, i);
        parcel.writeParcelable(this.A0l, i);
        parcel.writeParcelable(this.A11, i);
        parcel.writeStringList(this.A1w);
        parcel.writeString(this.A1A);
        parcel.writeString(this.A1B);
        parcel.writeString(this.A1Q);
        parcel.writeString(this.A1R);
        parcel.writeParcelable(this.A10, i);
        parcel.writeString(this.A1K);
        parcel.writeString(this.A1L);
        parcel.writeByte(this.A2t ? (byte) 1 : 0);
        parcel.writeByte(this.A2K ? (byte) 1 : 0);
        parcel.writeByte(this.A28 ? (byte) 1 : 0);
        parcel.writeByte(this.A31 ? (byte) 1 : 0);
        parcel.writeByte(this.A2z ? (byte) 1 : 0);
        parcel.writeByte(this.A2S ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0i, i);
        parcel.writeParcelable(this.A0g, i);
        parcel.writeParcelable(this.A0f, i);
        parcel.writeParcelable(this.A0h, i);
        parcel.writeParcelable(this.A0j, i);
        parcel.writeTypedList(this.A20);
        parcel.writeParcelable(this.A0S, i);
        parcel.writeString(this.A1I);
        parcel.writeString(this.A1W);
        parcel.writeParcelable(this.A0b, i);
        parcel.writeParcelable(this.A0c, i);
        parcel.writeTypedList(this.A1m);
        parcel.writeByte(this.A2d ? (byte) 1 : 0);
        parcel.writeByte(this.A2e ? (byte) 1 : 0);
        parcel.writeByte(this.A2q ? (byte) 1 : 0);
        parcel.writeByte(this.A2T ? (byte) 1 : 0);
        parcel.writeString(this.A1Z);
        parcel.writeString(this.A1V);
        parcel.writeString(this.A1X);
        parcel.writeString(this.A1b);
        parcel.writeParcelable(this.A18, i);
        Map map = this.A22;
        C13990Tnq.A0r(parcel, map);
        Iterator A0u2 = AnonymousClass7TF.A0u(map);
        while (A0u2.hasNext()) {
            parcel.writeParcelable((Parcelable) JTS.A0f(parcel, A0u2), i);
        }
        parcel.writeSerializable(this.A1j);
        parcel.writeInt(this.A06);
        parcel.writeByte(this.A2O ? (byte) 1 : 0);
        parcel.writeByte(this.A2R ? (byte) 1 : 0);
        parcel.writeByte(this.A2Q ? (byte) 1 : 0);
        parcel.writeByte(this.A2P ? (byte) 1 : 0);
        parcel.writeByte(this.A2G ? (byte) 1 : 0);
        parcel.writeByte(this.A2H ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A1n);
        parcel.writeList(this.A1y);
        parcel.writeList(this.A1o);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A09);
        parcel.writeByte(this.A2v ? (byte) 1 : 0);
        Date date = this.A1k;
        if (date != null) {
            parcel.writeLong(date.getTime());
        }
        parcel.writeParcelable(this.A0u, i);
        parcel.writeString(this.A1F);
        parcel.writeInt(this.A04);
        parcel.writeByte(this.A2r ? (byte) 1 : 0);
        parcel.writeByte(this.A2c ? (byte) 1 : 0);
        parcel.writeTypedList(this.A1r);
        parcel.writeTypedList(this.A1x);
        parcel.writeTypedList(this.A1p);
        parcel.writeByte(this.A2n ? (byte) 1 : 0);
        parcel.writeByte(this.A33 ? (byte) 1 : 0);
        parcel.writeString(this.A1U);
        C53351Gmb gmb = this.A0M;
        if (gmb == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(gmb.A00);
        }
        parcel.writeParcelable(this.A0X, i);
        parcel.writeParcelable(this.A0W, i);
        parcel.writeString(this.A1H);
        parcel.writeByte(this.A2D ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0t, i);
        parcel.writeByte(this.A32 ? (byte) 1 : 0);
        parcel.writeByte(this.A2w ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0w, i);
        parcel.writeByte(this.A2o ? (byte) 1 : 0);
        parcel.writeByte(this.A2X ? (byte) 1 : 0);
        parcel.writeByte(this.A2u ? (byte) 1 : 0);
        parcel.writeTypedList(this.A1q);
        parcel.writeTypedList(new ArrayList(this.A24));
        parcel.writeParcelable(this.A0x, i);
        parcel.writeParcelable(this.A0k, i);
        parcel.writeByte(this.A2s ? (byte) 1 : 0);
        parcel.writeByte(this.A2j ? (byte) 1 : 0);
        parcel.writeByte(this.A2k ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0U, i);
        parcel.writeParcelable(this.A0T, i);
        parcel.writeParcelable(this.A0q, i);
        parcel.writeParcelable(this.A0p, i);
        parcel.writeString(this.A1J);
        Boolean bool = this.A19;
        if (bool == null) {
            i2 = 0;
        } else {
            i2 = 2;
            if (bool.booleanValue()) {
                i2 = 1;
            }
        }
        parcel.writeByte((byte) i2);
        parcel.writeByte(this.A2Z ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0R, i);
        A01(parcel, this.A1l);
        parcel.writeString(this.A1c);
        parcel.writeParcelable(this.A0v, i);
        UKM ukm = this.A0Y;
        if (ukm == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            List list = ukm.A04;
            if (list == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                Iterator A1F2 = C41848B3p.A1F(parcel, list);
                while (A1F2.hasNext()) {
                    UMu uMu = (UMu) ((C21011X9n) A1F2.next());
                    parcel.writeString(uMu.A00);
                    parcel.writeString(uMu.A01);
                }
            }
            parcel.writeString(ukm.A02);
            UKW ukw = ukm.A00;
            if (ukw == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeString(ukw.A02);
                A01(parcel, ukw.A06);
                parcel.writeString(ukw.A03);
                parcel.writeParcelable(ukw.A01, i);
                parcel.writeString(ukw.A04);
                parcel.writeString(ukw.A05);
                parcel.writeParcelable(ukw.A00, i);
            }
            parcel.writeParcelable(ukm.A01, i);
            parcel.writeString(ukm.A03);
        }
        parcel.writeByte(this.A2x ? (byte) 1 : 0);
        parcel.writeString(this.A1T);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A0G);
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0o, i);
        parcel.writeParcelable(this.A0r, i);
        Map map2 = this.A23;
        if (map2 != null) {
            parcel.writeByte((byte) 1);
            C13990Tnq.A0r(parcel, map2);
            Iterator A0u3 = AnonymousClass7TF.A0u(map2);
            while (A0u3.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u3);
                parcel.writeInt(AnonymousClass7TE.A0M(A1J2.getKey()));
                parcel.writeInt(C66582MXn.A08(A1J2));
            }
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A2W ? (byte) 1 : 0);
        parcel.writeString(this.A1P);
        parcel.writeByte(this.A2f ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0Q, i);
        parcel.writeString(this.A1E);
        parcel.writeString(this.A1Y);
        parcel.writeByte(this.A2g ? (byte) 1 : 0);
        parcel.writeByte(this.A2Y ? (byte) 1 : 0);
        parcel.writeByte(this.A2i ? (byte) 1 : 0);
        parcel.writeByte(this.A2h ? (byte) 1 : 0);
        parcel.writeByte(this.A2m ? (byte) 1 : 0);
        parcel.writeByte(this.A2l ? (byte) 1 : 0);
        parcel.writeByte(this.A2J ? (byte) 1 : 0);
        parcel.writeByte(this.A30 ? (byte) 1 : 0);
        C16655Uyr uyr = this.A13;
        if (uyr != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(uyr.toString());
        } else {
            parcel.writeByte((byte) 0);
        }
        C16664Uz0 uz0 = this.A15;
        if (uz0 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(uz0.toString());
        } else {
            parcel.writeByte((byte) 0);
        }
        C16664Uz0 uz02 = this.A14;
        if (uz02 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(uz02.toString());
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeParcelable(this.A0n, i);
        parcel.writeByte(this.A2a ? (byte) 1 : 0);
        parcel.writeByte(this.A2I ? (byte) 1 : 0);
        parcel.writeByte(this.A2L ? (byte) 1 : 0);
        parcel.writeParcelable(this.A0s, i);
        parcel.writeByte(this.A2V ? (byte) 1 : 0);
        parcel.writeByte(this.A2p ? (byte) 1 : 0);
        parcel.writeString(this.A1C);
        parcel.writeString(this.A1D);
        parcel.writeParcelable(this.A0a, i);
        parcel.writeList(this.A21);
        parcel.writeByte(this.A2U ? (byte) 1 : 0);
        parcel.writeTypedList(new ArrayList(this.A26));
        parcel.writeString(this.A1a);
        parcel.writeString(this.A1G);
        parcel.writeByte(this.A29 ? (byte) 1 : 0);
        parcel.writeByte(this.A2b ? (byte) 1 : 0);
        parcel.writeTypedList(new ArrayList(this.A25));
        parcel.writeByte(this.A2C ? (byte) 1 : 0);
        parcel.writeString(this.A1d);
        parcel.writeString(this.A1g);
        parcel.writeString(this.A1e);
        parcel.writeString(this.A1h);
        parcel.writeString(this.A1f);
        parcel.writeString(this.A1i);
        parcel.writeSerializable(this.A12);
        parcel.writeByte(this.A2y ? (byte) 1 : 0);
        parcel.writeByte(this.A34 ? (byte) 1 : 0);
    }

    public PromoteData() {
        C13992Tns.A0v(this);
        C13992Tns.A0w(this);
    }

    public static ArrayList A00(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            arrayList.add(new BBT(C41847B3o.A12(parcel), readString, parcel.readString(), parcel.readString(), parcel.readLong()));
        }
        return arrayList;
    }

    public final Estimate A04(String str) {
        int i;
        if (!A0F(str)) {
            return null;
        }
        PromoteReachEstimationStore promoteReachEstimationStore = this.A0w;
        String str2 = this.A1S;
        XIGIGBoostDestination xIGIGBoostDestination = this.A0i;
        xIGIGBoostDestination.getClass();
        String obj = xIGIGBoostDestination.toString();
        String str3 = this.A1Z;
        str3.getClass();
        boolean z = this.A2e;
        boolean z2 = this.A2r;
        if (this.A2v) {
            i = this.A07;
        } else {
            i = this.A0I;
        }
        AnonymousClass7TG.A1N(str2, obj);
        if (!0qQ.A0K(promoteReachEstimationStore.A03, str2) || !0qQ.A0K(promoteReachEstimationStore.A02, obj) || !0qQ.A0K(promoteReachEstimationStore.A01, str3) || promoteReachEstimationStore.A06 != z || promoteReachEstimationStore.A07 != z2) {
            return null;
        }
        return (Estimate) C51968G9o.A10(promoteReachEstimationStore.A04, i);
    }

    public final Estimate A05(String str) {
        int i;
        if (!A0F(str)) {
            return null;
        }
        PromoteReachEstimationStore promoteReachEstimationStore = this.A0w;
        String str2 = this.A1S;
        XIGIGBoostDestination xIGIGBoostDestination = this.A0i;
        xIGIGBoostDestination.getClass();
        String obj = xIGIGBoostDestination.toString();
        String str3 = this.A1Z;
        str3.getClass();
        boolean z = this.A2e;
        boolean z2 = this.A2r;
        if (this.A2v) {
            i = this.A07;
        } else {
            i = this.A0I;
        }
        AnonymousClass7TG.A1T(str2, obj, str);
        if (!0qQ.A0K(promoteReachEstimationStore.A03, str2) || !0qQ.A0K(promoteReachEstimationStore.A02, obj) || !0qQ.A0K(promoteReachEstimationStore.A00, str) || !0qQ.A0K(promoteReachEstimationStore.A01, str3) || promoteReachEstimationStore.A06 != z || promoteReachEstimationStore.A07 != z2) {
            return null;
        }
        return (Estimate) C51968G9o.A10(promoteReachEstimationStore.A05, i);
    }

    public final String A09() {
        A02(this);
        if (AnonymousClass4KJ.A00(this.A20)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : this.A20) {
            jSONArray.put(obj.toString());
        }
        return jSONArray.toString();
    }
}
