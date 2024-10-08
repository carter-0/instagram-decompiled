package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.arads.ArAdsUIModel;
import org.json.JSONObject;

public final class WGV implements C74290PsI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WGV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AnonymousClass3FZ A002;
        AnonymousClass3FZ A003;
        AnonymousClass3FZ A004;
        AnonymousClass3FZ A005;
        String str6;
        Object obj2 = obj;
        if (this.A00 != 0) {
            V29 v29 = (V29) obj2;
            if (v29 instanceof UHU) {
                AnonymousClass3FZ r3 = (AnonymousClass3FZ) ((UHU) v29).A00;
                0qQ.A0B(r3, 0);
                String string = C60960kU.A00.getString(2131973741);
                Class<C60884Jsr> cls = C60884Jsr.class;
                String A006 = AnonymousClass000.A00(3828);
                AnonymousClass3FZ A007 = r3.A00(cls, A006);
                if (A007 != null) {
                    String A05 = A007.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    AnonymousClass3FZ A008 = r3.A00(cls, A006);
                    if (A008 != null) {
                        ArAdsUIModel arAdsUIModel = new ArAdsUIModel(string, (String) null, (String) null, (String) null, (String) null, (String) null, A05, A008.A05(C273654mx.A00(385)));
                        ((WT1) this.A01).A02(C16612Uy8.AD_QUERY_SUCCESS, "", (String) null);
                        C17620VbC vbC = (C17620VbC) this.A02;
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("camera_entry_point", vbC.A03);
                        AnonymousClass3FZ A009 = r3.A00(C60876Jsj.class, AnonymousClass000.A00(2620));
                        if (A009 != null) {
                            str6 = A009.A05("effect_id");
                        } else {
                            str6 = null;
                        }
                        bundle.putString("effect_id", str6);
                        bundle.putString("encoded_token", vbC.A06);
                        bundle.putParcelable("ads_ui_model", arAdsUIModel);
                        bundle.putString("device_position", vbC.A00);
                        bundle.putBoolean("is_test_link", true);
                        bundle.putString(DatePickerDialogModule.ARG_MODE, vbC.A01);
                        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(vbC.A02, bundle, vbC.A05, TransparentModalActivity.class, "ar_ads_camera");
                        Dbc.A0y(A022);
                        11Z.A02(new C20183Wmh(vbC, A022));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            } else if (v29 instanceof UHV) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to fetch ProductArMetadata ");
                str = AnonymousClass7TF.A0i(((UHV) v29).A00, sb);
            } else {
                return;
            }
        } else {
            V29 v292 = (V29) obj2;
            if (v292 instanceof UHU) {
                AnonymousClass3FZ r4 = (AnonymousClass3FZ) ((UHU) v292).A00;
                C17943ViY viY = (C17943ViY) this.A02;
                String str7 = viY.A07;
                String str8 = viY.A06;
                0qQ.A0B(r4, 0);
                String A052 = r4.A05("cta_text");
                Class<C60872Jsf> cls2 = C60872Jsf.class;
                AnonymousClass3FZ A0010 = r4.A00(cls2, "effect");
                if (A0010 != null) {
                    str2 = A0010.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                } else {
                    str2 = null;
                }
                AnonymousClass3FZ A0011 = r4.A00(cls2, "effect");
                if (A0011 == null || (A005 = A0011.A00(C60871Jse.class, "thumbnail")) == null) {
                    str3 = null;
                } else {
                    str3 = A005.A05("uri");
                }
                String A053 = r4.A05("outbound_uri");
                if (str7 == null || str7.length() == 0) {
                    AnonymousClass3FZ A0012 = r4.A00(cls2, "effect");
                    if (A0012 == null || (A004 = A0012.A00(C15000UJa.class, "attribution_user")) == null) {
                        str7 = null;
                    } else {
                        str7 = A004.A05(Dbg.A01());
                    }
                }
                if (str8 == null || str8.length() == 0) {
                    AnonymousClass3FZ A0013 = r4.A00(cls2, "effect");
                    if (A0013 == null || (A002 = A0013.A00(C15000UJa.class, "attribution_user")) == null || (A003 = A002.A00(UJZ.class, C66579MXk.A00(154))) == null) {
                        str8 = null;
                    } else {
                        str8 = A003.A05("uri");
                    }
                }
                Class<C60874Jsh> cls3 = C60874Jsh.class;
                AnonymousClass3FZ A0014 = r4.A00(cls3, "product");
                if (A0014 != null) {
                    JSONObject jSONObject = A0014.A00;
                    if (jSONObject.isNull(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                        str4 = null;
                    } else {
                        str4 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    }
                } else {
                    str4 = null;
                }
                AnonymousClass3FZ A0015 = r4.A00(cls3, "product");
                if (A0015 != null) {
                    JSONObject jSONObject2 = A0015.A00;
                    String A0016 = C273654mx.A00(385);
                    if (jSONObject2.isNull(A0016)) {
                        str5 = null;
                    } else {
                        str5 = jSONObject2.optString(A0016);
                    }
                } else {
                    str5 = null;
                }
                ArAdsUIModel arAdsUIModel2 = new ArAdsUIModel(A052, str2, str3, A053, str7, str8, str4, str5);
                str = r4.A05("effect_fetch_failure_reason");
                if (str == null) {
                    ((WT1) this.A01).A02(C16612Uy8.AD_QUERY_SUCCESS, "", (String) null);
                    C226132fh.A03(viY.A08, viY.A0A, new WUI(viY, arAdsUIModel2));
                    return;
                }
            } else if (v292 instanceof UHV) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to fetch Ad context ");
                str = AnonymousClass7TF.A0i(((UHV) v292).A00, sb2);
            } else {
                return;
            }
        }
        ((WT1) this.A01).A02(C16612Uy8.AD_QUERY_ERROR, "", str);
    }
}
