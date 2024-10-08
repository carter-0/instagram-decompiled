package X;

import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UcY  reason: case insensitive filesystem */
public final class C15422UcY extends C15623Ufp {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARNING: type inference failed for: r3v1, types: [android.content.Context, com.instagram.business.promote.activity.PromoteActivity, android.app.Activity] */
    public static PromoteActivity A00(UKM ukm, C15422UcY ucY, String str) {
        List list = ukm.A04;
        ? r3 = (PromoteActivity) ucY.A03;
        String str2 = str;
        if (list != null) {
            W3M.A02(r3, r3, str2, ukm.A02, ((UMu) ((C21011X9n) list.get(0))).A00, ((UMu) ((C21011X9n) list.get(0))).A01);
            return r3;
        }
        String str3 = ukm.A02;
        if (str != null) {
            W3M.A04(r3, str, str3);
            return r3;
        }
        PromoteActivity.A08(r3, str3);
        return r3;
    }

    public C15422UcY(C16678UzE uzE, WGU wgu, PromoteActivity promoteActivity, X3R x3r, int i) {
        this.A00 = i;
        this.A03 = promoteActivity;
        this.A02 = uzE;
        this.A01 = x3r;
        this.A02 = "";
        this.A01 = C51968G9o.A0u();
        this.A00 = wgu;
    }

    public final void onFail(C268654dm r7) {
        int A0D;
        int i;
        if (this.A00 != 0) {
            A0D = AnonymousClass7TG.A0D(r7, -721585025);
            PromoteActivity promoteActivity = (PromoteActivity) this.A03;
            String str = null;
            PromoteActivity.A08(promoteActivity, (String) null);
            WGU A0M = C13990Tnq.A0M(promoteActivity.A07);
            C16678UzE uzE = (C16678UzE) this.A02;
            Throwable A012 = r7.A01();
            if (A012 != null) {
                str = A012.getMessage();
            }
            PromoteData promoteData = promoteActivity.A00;
            if (promoteData != null) {
                A0M.A0J(uzE, str, promoteData.A0l.toString());
                super.onFail(r7);
                i = 1251570085;
            }
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        A0D = AnonymousClass7TG.A0D(r7, -1722045409);
        PromoteActivity promoteActivity2 = (PromoteActivity) this.A03;
        String str2 = null;
        PromoteActivity.A08(promoteActivity2, (String) null);
        WGU A0M2 = C13990Tnq.A0M(promoteActivity2.A07);
        C16678UzE uzE2 = (C16678UzE) this.A02;
        Throwable A013 = r7.A01();
        if (A013 != null) {
            str2 = A013.getMessage();
        }
        PromoteData promoteData2 = promoteActivity2.A00;
        if (promoteData2 != null) {
            A0M2.A0J(uzE2, str2, promoteData2.A0l.toString());
            super.onFail(r7);
            i = -122056347;
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void onFinish() {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-604088842);
            C15422UcY.super.onFinish();
            ((X3R) this.A01).D6r(false);
            i = 316952567;
        } else {
            A032 = AnonymousClass0fD.A03(-110077161);
            C15422UcY.super.onFinish();
            ((X3R) this.A01).D6r(false);
            i = -2082825484;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.content.Context, com.instagram.business.promote.activity.PromoteActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.content.Context, com.instagram.business.promote.activity.PromoteActivity, android.app.Activity] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        IllegalStateException illegalStateException;
        int i2;
        int A032;
        PromoteActivity promoteActivity;
        String str2;
        WGU A0M;
        C16678UzE uzE;
        Boolean bool;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus;
        int i3;
        Boolean bool2;
        String str3;
        int i4;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus2;
        UMs uMs;
        String str4;
        Object obj2 = obj;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(2017334585);
            CD1 cd1 = (CD1) obj2;
            i = AnonymousClass0fD.A03(922328940);
            0qQ.A0B(cd1, 0);
            X9m x9m = cd1.A00;
            if (x9m != null) {
                Iterator it = ((UMt) x9m).A00.iterator();
                do {
                    boolean z = false;
                    str = "promoteData";
                    if (it.hasNext()) {
                        uMs = (UMs) ((C21010X9l) it.next());
                        UKM ukm = uMs.A01;
                        if (ukm != null) {
                            UKW ukw = ukm.A00;
                            if (ukw != null) {
                                str4 = ukw.A03;
                            } else {
                                str4 = null;
                            }
                            PromoteActivity A002 = A00(ukm, this, str4);
                            WGU A0M2 = C13990Tnq.A0M(A002.A07);
                            C16678UzE uzE2 = (C16678UzE) this.A02;
                            String str5 = ukm.A03;
                            PromoteData promoteData = A002.A00;
                            if (promoteData != null) {
                                A0M2.A0J(uzE2, str5, promoteData.A0l.toString());
                                i4 = 1038025566;
                            }
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else {
                        ? r8 = (PromoteActivity) this.A03;
                        C16678UzE uzE3 = (C16678UzE) this.A02;
                        PromoteData promoteData2 = r8.A00;
                        if (promoteData2 != null) {
                            if (promoteData2.A0i != XIGIGBoostDestination.DIRECT_MESSAGE || (xFBCTXWelcomeMessageStatus2 = promoteData2.A0a) == XFBCTXWelcomeMessageStatus.WELCOME_MESSAGE_INELIGIBLE) {
                                bool2 = null;
                            } else {
                                if (xFBCTXWelcomeMessageStatus2 == XFBCTXWelcomeMessageStatus.DEFAULT_WELCOME_MESSAGE_OPTED_IN) {
                                    z = true;
                                }
                                bool2 = Boolean.valueOf(z);
                            }
                            AnonymousClass0eM r13 = r8.A07;
                            WGU A0M3 = C13990Tnq.A0M(r13);
                            PromoteData promoteData3 = r8.A00;
                            if (promoteData3 != null) {
                                if (W3x.A0P(promoteData3.A06())) {
                                    str3 = null;
                                } else {
                                    PromoteData promoteData4 = r8.A00;
                                    if (promoteData4 != null) {
                                        str3 = promoteData4.A1Z;
                                    }
                                }
                                PromoteData promoteData5 = r8.A00;
                                if (promoteData5 != null) {
                                    int i5 = promoteData5.A0I;
                                    int i6 = promoteData5.A0A;
                                    String currencyCode = promoteData5.A1j.getCurrencyCode();
                                    PromoteData promoteData6 = r8.A00;
                                    if (promoteData6 != null) {
                                        int i7 = promoteData6.A0H;
                                        XIGIGBoostDestination xIGIGBoostDestination = promoteData6.A0i;
                                        Estimate estimate = promoteData6.A0U;
                                        A0M3.A09(estimate, xIGIGBoostDestination, uzE3, bool2, str3, currencyCode, promoteData6.A0l.toString(), i5, i6, i7);
                                        C13990Tnq.A0M(r13).A0R(uzE3.toString(), "submit_ad_creation_success_2");
                                        WGU A0M4 = C13990Tnq.A0M(r13);
                                        PromoteData promoteData7 = r8.A00;
                                        if (promoteData7 != null) {
                                            XIGIGBoostDestination xIGIGBoostDestination2 = promoteData7.A0h;
                                            A0M4.A08(promoteData7.A0S, xIGIGBoostDestination2, promoteData7.A0i, uzE3, promoteData7.A1S);
                                            PromoteData promoteData8 = r8.A00;
                                            if (promoteData8 != null) {
                                                if (!0qQ.A0K(promoteData8.A1K, "DEEP_LINK_UNKNOWN")) {
                                                    Intent intent = new Intent();
                                                    PromoteData promoteData9 = r8.A00;
                                                    if (promoteData9 != null) {
                                                        intent.putExtra(AnonymousClass000.A00(698), promoteData9.A11);
                                                        PromoteData promoteData10 = r8.A00;
                                                        if (promoteData10 != null) {
                                                            intent.putExtra("is_ab_test", promoteData10.A0D());
                                                            r8.setResult(1797, intent);
                                                        }
                                                    }
                                                } else {
                                                    r8.setResult(1793);
                                                    PromoteData promoteData11 = r8.A00;
                                                    if (promoteData11 != null) {
                                                        ImageUrl imageUrl = promoteData11.A11;
                                                        0qQ.A06(imageUrl);
                                                        C63097KrQ.A00(r8, AnonymousClass7TE.A0l(r8.A0A), imageUrl);
                                                    }
                                                }
                                                PromoteData promoteData12 = r8.A00;
                                                if (promoteData12 != null) {
                                                    promoteData12.A2w = true;
                                                    WGU A0M5 = C13990Tnq.A0M(r13);
                                                    PromoteData promoteData13 = r8.A00;
                                                    if (promoteData13 != null) {
                                                        A0M5.A0B(uzE3, promoteData13);
                                                        r8.finish();
                                                        A03(cd1);
                                                        i4 = -1581506207;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AnonymousClass0fD.A0A(i4, i);
                    i3 = 1837390771;
                } while (uMs.A02);
                BAY bay = uMs.A00;
                PromoteActivity promoteActivity2 = (PromoteActivity) this.A03;
                if (bay != null) {
                    String str6 = bay.A00;
                    PromoteActivity.A08(promoteActivity2, str6);
                    WGU A0M6 = C13990Tnq.A0M(promoteActivity2.A07);
                    C16678UzE uzE4 = (C16678UzE) this.A02;
                    PromoteData promoteData14 = promoteActivity2.A00;
                    if (promoteData14 != null) {
                        A0M6.A0J(uzE4, str6, promoteData14.A0l.toString());
                        i4 = -1091571914;
                        AnonymousClass0fD.A0A(i4, i);
                        i3 = 1837390771;
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                illegalStateException = new IllegalStateException("In submission failure cases, message should never be null");
                i2 = -533569317;
                AnonymousClass0fD.A0A(i2, i);
                throw illegalStateException;
            }
            str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        A032 = AnonymousClass0fD.A03(-582630345);
        CEY cey = (CEY) obj2;
        i = AnonymousClass0fD.A03(1300526674);
        0qQ.A0B(cey, 0);
        C21010X9l x9l = cey.A01;
        if (x9l != null) {
            UMs uMs2 = (UMs) x9l;
            UKM ukm2 = uMs2.A01;
            boolean z2 = false;
            str = "promoteData";
            String str7 = null;
            if (ukm2 != null) {
                UKW ukw2 = ukm2.A00;
                if (ukw2 != null) {
                    str7 = ukw2.A03;
                }
                promoteActivity = A00(ukm2, this, str7);
                A0M = C13990Tnq.A0M(promoteActivity.A07);
                uzE = (C16678UzE) this.A02;
                str2 = ukm2.A03;
            } else if (uMs2.A02) {
                ? r82 = (PromoteActivity) this.A03;
                PromoteData promoteData15 = r82.A00;
                if (promoteData15 != null) {
                    if (promoteData15.A0i != XIGIGBoostDestination.DIRECT_MESSAGE || (xFBCTXWelcomeMessageStatus = promoteData15.A0a) == XFBCTXWelcomeMessageStatus.WELCOME_MESSAGE_INELIGIBLE) {
                        bool = null;
                    } else {
                        if (xFBCTXWelcomeMessageStatus == XFBCTXWelcomeMessageStatus.DEFAULT_WELCOME_MESSAGE_OPTED_IN) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                    }
                    AnonymousClass0eM r14 = r82.A07;
                    WGU A0M7 = C13990Tnq.A0M(r14);
                    C16678UzE uzE5 = (C16678UzE) this.A02;
                    PromoteData promoteData16 = r82.A00;
                    if (promoteData16 != null) {
                        if (!W3x.A0P(promoteData16.A06())) {
                            PromoteData promoteData17 = r82.A00;
                            if (promoteData17 != null) {
                                str7 = promoteData17.A1Z;
                            }
                        }
                        PromoteData promoteData18 = r82.A00;
                        if (promoteData18 != null) {
                            int i8 = promoteData18.A0I;
                            int i9 = promoteData18.A0A;
                            String currencyCode2 = promoteData18.A1j.getCurrencyCode();
                            PromoteData promoteData19 = r82.A00;
                            if (promoteData19 != null) {
                                int i10 = promoteData19.A0H;
                                XIGIGBoostDestination xIGIGBoostDestination3 = promoteData19.A0i;
                                Estimate estimate2 = promoteData19.A0U;
                                A0M7.A09(estimate2, xIGIGBoostDestination3, uzE5, bool, str7, currencyCode2, promoteData19.A0l.toString(), i8, i9, i10);
                                C13990Tnq.A0M(r14).A0R(uzE5.toString(), "submit_ad_creation_success_1");
                                WGU A0M8 = C13990Tnq.A0M(r14);
                                PromoteData promoteData20 = r82.A00;
                                if (promoteData20 != null) {
                                    XIGIGBoostDestination xIGIGBoostDestination4 = promoteData20.A0h;
                                    A0M8.A08(promoteData20.A0S, xIGIGBoostDestination4, promoteData20.A0i, uzE5, promoteData20.A1S);
                                    PromoteData promoteData21 = r82.A00;
                                    if (promoteData21 != null) {
                                        if (!0qQ.A0K(promoteData21.A1K, "DEEP_LINK_UNKNOWN")) {
                                            Intent intent2 = new Intent();
                                            PromoteData promoteData22 = r82.A00;
                                            if (promoteData22 != null) {
                                                intent2.putExtra(AnonymousClass000.A00(698), promoteData22.A11);
                                                PromoteData promoteData23 = r82.A00;
                                                if (promoteData23 != null) {
                                                    XIGIGBoostDestination xIGIGBoostDestination5 = promoteData23.A0i;
                                                    0qQ.A0C(xIGIGBoostDestination5, "null cannot be cast to non-null type android.os.Parcelable");
                                                    intent2.putExtra(AnonymousClass000.A00(2993), xIGIGBoostDestination5);
                                                    PromoteData promoteData24 = r82.A00;
                                                    if (promoteData24 != null) {
                                                        intent2.putExtra(AnonymousClass000.A00(1508), promoteData24.A2b);
                                                        PromoteData promoteData25 = r82.A00;
                                                        if (promoteData25 != null) {
                                                            intent2.putExtra("is_ab_test", promoteData25.A0D());
                                                            r82.setResult(1797, intent2);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            r82.setResult(1793);
                                            PromoteData promoteData26 = r82.A00;
                                            if (promoteData26 != null) {
                                                ImageUrl imageUrl2 = promoteData26.A11;
                                                0qQ.A06(imageUrl2);
                                                C63097KrQ.A00(r82, AnonymousClass7TE.A0l(r82.A0A), imageUrl2);
                                            }
                                        }
                                        PromoteData promoteData27 = r82.A00;
                                        if (promoteData27 != null) {
                                            promoteData27.A2w = true;
                                            WGU A0M9 = C13990Tnq.A0M(r14);
                                            PromoteData promoteData28 = r82.A00;
                                            if (promoteData28 != null) {
                                                A0M9.A0B(uzE5, promoteData28);
                                                r82.finish();
                                                A03(cey);
                                                AnonymousClass0fD.A0A(-2071960744, i);
                                                i3 = 963711215;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            } else {
                BAY bay2 = uMs2.A00;
                promoteActivity = (PromoteActivity) this.A03;
                if (bay2 != null) {
                    str2 = bay2.A00;
                    PromoteActivity.A08(promoteActivity, str2);
                    A0M = C13990Tnq.A0M(promoteActivity.A07);
                    uzE = (C16678UzE) this.A02;
                } else {
                    illegalStateException = new IllegalStateException("In submission failure cases, message should never be null");
                    i2 = -289910334;
                    AnonymousClass0fD.A0A(i2, i);
                    throw illegalStateException;
                }
            }
            PromoteData promoteData29 = promoteActivity.A00;
            if (promoteData29 != null) {
                A0M.A0J(uzE, str2, promoteData29.A0l.toString());
                A03(cey);
                AnonymousClass0fD.A0A(-2071960744, i);
                i3 = 963711215;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        AnonymousClass0fD.A0A(i3, A032);
    }
}
