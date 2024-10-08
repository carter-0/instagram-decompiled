package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.002;
import X.00l;
import X.0Yt;
import X.0eP;
import X.0qQ;
import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10145RnM;
import X.C51974G9v;
import X.C66580MXl;
import X.C66581MXm;
import X.C7379QAf;
import X.C7386QAn;
import X.C7399QBc;
import X.C7400QBd;
import X.C8969RJk;
import X.C8987RKd;
import X.C8988RKe;
import X.DbS;
import X.DbT;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.QB8;
import X.QB9;
import X.QBA;
import X.QBC;
import X.QBD;
import X.QBJ;
import X.QBL;
import X.QBN;
import X.QBP;
import X.QBQ;
import X.QBV;
import X.QBX;
import X.QBZ;
import X.S3L;
import android.util.Log;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class PublicKeyCredentialControllerUtility {
    public static final Companion Companion = new Object();
    public static final int FLAGS = 11;
    public static final String JSON_KEY_ALG = "alg";
    public static final String JSON_KEY_APPID = "appid";
    public static final String JSON_KEY_ATTESTATION = "attestation";
    public static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    public static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    public static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    public static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    public static final String JSON_KEY_CHALLENGE = "challenge";
    public static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    public static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    public static final String JSON_KEY_CRED_PROPS = "credProps";
    public static final String JSON_KEY_DISPLAY_NAME = "displayName";
    public static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    public static final String JSON_KEY_EXTENSTIONS = "extensions";
    public static final String JSON_KEY_ICON = "icon";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    public static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    public static final String JSON_KEY_RAW_ID = "rawId";
    public static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    public static final String JSON_KEY_RESPONSE = "response";
    public static final String JSON_KEY_RES_KEY = "residentKey";
    public static final String JSON_KEY_RK = "rk";
    public static final String JSON_KEY_RP = "rp";
    public static final String JSON_KEY_RPID = "rpId";
    public static final String JSON_KEY_SIGNATURE = "signature";
    public static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    public static final String JSON_KEY_TIMEOUT = "timeout";
    public static final String JSON_KEY_TRANSPORTS = "transports";
    public static final String JSON_KEY_TYPE = "type";
    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_USER_HANDLE = "userHandle";
    public static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    public static final String TAG = "PublicKeyUtility";
    public static final LinkedHashMap orderedErrorCodeToExceptions = 0Yt.A05(new 0eP[]{AnonymousClass7TE.A1L(ErrorCode.UNKNOWN_ERR, new QBZ()), AnonymousClass7TE.A1L(ErrorCode.ABORT_ERR, new QB9()), AnonymousClass7TE.A1L(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new QBP()), AnonymousClass7TE.A1L(ErrorCode.CONSTRAINT_ERR, new QBA()), AnonymousClass7TE.A1L(ErrorCode.DATA_ERR, new QBC()), AnonymousClass7TE.A1L(ErrorCode.INVALID_STATE_ERR, new QBJ()), AnonymousClass7TE.A1L(ErrorCode.ENCODING_ERR, new QBD()), AnonymousClass7TE.A1L(ErrorCode.NETWORK_ERR, new QBL()), AnonymousClass7TE.A1L(ErrorCode.NOT_ALLOWED_ERR, new QBN()), AnonymousClass7TE.A1L(ErrorCode.NOT_SUPPORTED_ERR, new QBQ()), AnonymousClass7TE.A1L(ErrorCode.SECURITY_ERR, new QBV()), AnonymousClass7TE.A1L(ErrorCode.TIMEOUT_ERR, new QBX())});

    public final class Companion {
        public final byte[] b64Decode(String str) {
            0qQ.A0B(str, 0);
            return Pxg.A1X(str);
        }

        public final String b64Encode(byte[] bArr) {
            0qQ.A0B(bArr, 0);
            return Pxg.A0z(bArr);
        }

        public final C8988RKe beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode errorCode, String str) {
            0qQ.A0B(errorCode, 0);
            C10145RnM rnM = (C10145RnM) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
            if (rnM == null) {
                return new C7400QBd(new QBZ(), 002.A0R("unknown fido gms exception - ", str));
            }
            if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && 00l.A0d(str, "Unable to get sync account", false)) {
                return new C8988RKe("android.credentials.GetCredentialException.TYPE_USER_CANCELED", "Passkey retrieval was cancelled by the user.");
            }
            return new C7400QBd(rnM, str);
        }

        public final PublicKeyCredentialCreationOptions convert(C7379QAf qAf) {
            0qQ.A0B(qAf, 0);
            return convertJSON$credentials_play_services_auth_release(C66580MXl.A17(qAf.A00));
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [X.S3L, java.lang.Object] */
        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) {
            0qQ.A0B(jSONObject, 0);
            ? obj = new Object();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, obj);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, obj);
            return obj.A00();
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(C7386QAn qAn) {
            0qQ.A0B(qAn, 0);
            return new BeginSignInRequest.PasskeyJsonRequestOptions(true, qAn.A00);
        }

        @Deprecated(message = "Upgrade GMS version so 'convertToPlayAuthPasskeyJsonRequest' is used")
        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(C7386QAn qAn) {
            0qQ.A0B(qAn, 0);
            JSONObject A17 = C66580MXl.A17(qAn.A00);
            String optString = A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RPID, "");
            if (C66580MXl.A06(optString) != 0) {
                return new BeginSignInRequest.PasskeysRequestOptions(optString, getChallenge(A17), true);
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, S3L s3l) {
            String obj;
            String obj2;
            AnonymousClass7TF.A1H(jSONObject, s3l);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                Attachment attachment = null;
                boolean optBoolean = jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY, false);
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY, "");
                ResidentKeyRequirement residentKeyRequirement = null;
                if (C66580MXl.A06(optString) > 0) {
                    residentKeyRequirement = ResidentKeyRequirement.A00(optString);
                }
                Boolean valueOf = Boolean.valueOf(optBoolean);
                String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT, "");
                if (C66580MXl.A06(optString2) > 0) {
                    attachment = Attachment.A00(optString2);
                }
                if (attachment == null) {
                    obj = null;
                } else {
                    obj = attachment.toString();
                }
                if (residentKeyRequirement == null) {
                    obj2 = null;
                } else {
                    obj2 = residentKeyRequirement.toString();
                }
                s3l.A02 = new AuthenticatorSelectionCriteria(valueOf, obj, (String) null, obj2);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, S3L s3l) {
            S3L s3l2 = s3l;
            JSONObject jSONObject2 = jSONObject;
            boolean A1U = AnonymousClass7TF.A1U(0, jSONObject2, s3l2);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
            if (jSONObject2.has(str)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                FidoAppIdExtension fidoAppIdExtension = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                String optString = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, "");
                if (C66580MXl.A06(optString) > 0) {
                    fidoAppIdExtension = new FidoAppIdExtension(optString);
                }
                if (jSONObject3.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT, false)) {
                    googleThirdPartyPaymentExtension = new GoogleThirdPartyPaymentExtension(A1U);
                }
                if (jSONObject3.optBoolean("uvm", false)) {
                    userVerificationMethodExtension = new UserVerificationMethodExtension(A1U);
                }
                s3l2.A01 = new AuthenticationExtensions(fidoAppIdExtension, googleThirdPartyPaymentExtension, userVerificationMethodExtension, (zzab) null, (zzad) null, (zzag) null, (zzai) null, (zzak) null, (zzaw) null, (zzs) null, (zzu) null, (zzz) null);
            }
        }

        public final C8987RKd publicKeyCredentialResponseContainsError(PublicKeyCredential publicKeyCredential) {
            0qQ.A0B(publicKeyCredential, 0);
            Object obj = publicKeyCredential.A02;
            if (obj == null && (obj = publicKeyCredential.A01) == null && (obj = publicKeyCredential.A03) == null) {
                throw AnonymousClass7TE.A0z("No response set.");
            } else if (!(obj instanceof AuthenticatorErrorResponse)) {
                return null;
            } else {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
                ErrorCode errorCode = authenticatorErrorResponse.A00;
                0qQ.A07(errorCode);
                C10145RnM rnM = (C10145RnM) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
                String str = authenticatorErrorResponse.A01;
                if (rnM == null) {
                    return new C7399QBc(new QBZ(), 002.A0R("unknown fido gms exception - ", str));
                }
                if (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && 00l.A0d(str, "Unable to get sync account", false)) {
                    return new C8987RKd("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", "Passkey registration was cancelled by the user.");
                }
                return new C7399QBc(rnM, str);
            }
        }

        public final String toAssertPasskeyResponse(SignInCredential signInCredential) {
            Object obj;
            0qQ.A0B(signInCredential, 0);
            JSONObject A11 = DbS.A11();
            PublicKeyCredential publicKeyCredential = signInCredential.A01;
            if (publicKeyCredential != null) {
                obj = publicKeyCredential.A02;
                if (obj == null && (obj = publicKeyCredential.A01) == null && (obj = publicKeyCredential.A03) == null) {
                    throw AnonymousClass7TE.A0z("No response set.");
                }
            } else {
                obj = null;
            }
            0qQ.A0A(obj);
            if (obj instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
                ErrorCode errorCode = authenticatorErrorResponse.A00;
                0qQ.A07(errorCode);
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCode, authenticatorErrorResponse.A01);
            } else if (obj instanceof AuthenticatorAssertionResponse) {
                try {
                    String A00 = publicKeyCredential.A00();
                    0qQ.A07(A00);
                    return A00;
                } catch (Throwable th) {
                    throw QB8.A00(AnonymousClass7TF.A0m("The PublicKeyCredential response json had an unexpected exception when parsing: ", th));
                }
            } else {
                Log.e(PublicKeyCredentialControllerUtility.TAG, 002.A0R("AuthenticatorResponse expected assertion response but got: ", C66581MXm.A0y(obj)));
                return DbT.A10(A11);
            }
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, "");
            if (C66580MXl.A06(optString) != 0) {
                return Pxg.A1X(optString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) {
            C51974G9v.A1O(bArr, bArr2, strArr, jSONObject);
            JSONObject A11 = DbS.A11();
            A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA, Pxf.A0p(bArr, 11));
            A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ, Pxf.A0p(bArr2, 11));
            A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, new JSONArray(strArr));
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A11);
        }

        public final boolean checkAlgSupported(int i) {
            try {
                COSEAlgorithmIdentifier.A00(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, S3L s3l) {
            AnonymousClass7TG.A1N(jSONObject, s3l);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
            if (jSONObject.has(str)) {
                s3l.A05 = Double.valueOf(((double) jSONObject.getLong(str)) / 1000.0d);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, S3L s3l) {
            AnonymousClass7TG.A1N(jSONObject, s3l);
            ArrayList A1C = AnonymousClass7TE.A1C();
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    byte[] A1X = Pxg.A1X(Pxe.A0y(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2));
                    String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (C66580MXl.A06(string) == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    } else if (A1X.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    } else {
                        ArrayList arrayList = null;
                        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
                        if (jSONObject2.has(str2)) {
                            arrayList = AnonymousClass7TE.A1C();
                            JSONArray jSONArray2 = jSONObject2.getJSONArray(str2);
                            int length2 = jSONArray2.length();
                            int i2 = 0;
                            while (i2 < length2) {
                                try {
                                    arrayList.add(Transport.A00(jSONArray2.getString(i2)));
                                    i2++;
                                } catch (C8969RJk e) {
                                    throw new C7399QBc(new QBD(), e.getMessage());
                                }
                            }
                        }
                        A1C.add(new PublicKeyCredentialDescriptor(string, arrayList, A1X));
                        i++;
                    }
                }
            }
            s3l.A07 = A1C;
            String str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
            String str4 = NetInfoModule.CONNECTION_TYPE_NONE;
            String optString = jSONObject.optString(str3, str4);
            if (C66580MXl.A06(optString) != 0) {
                str4 = optString;
            }
            s3l.A00 = AttestationConveyancePreference.A00(str4);
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, S3L s3l) {
            AnonymousClass7TG.A1N(jSONObject, s3l);
            byte[] challenge = getChallenge(jSONObject);
            AnonymousClass3Qk.A02(challenge);
            s3l.A08 = challenge;
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            byte[] A1X = Pxg.A1X(Pxe.A0y(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2));
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            if (C66580MXl.A06(string2) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            } else if (A1X.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            } else if (C66580MXl.A06(string) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            } else {
                s3l.A04 = new PublicKeyCredentialUserEntity(string, A1X, optString, string2);
            }
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, S3L s3l) {
            AnonymousClass7TG.A1N(jSONObject, s3l);
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "");
            String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            0qQ.A0A(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            if (C66580MXl.A06(optString) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            } else if (C66580MXl.A06(string) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            } else {
                s3l.A03 = new PublicKeyCredentialRpEntity(string, optString, optString2);
                JSONArray jSONArray = jSONObject.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
                ArrayList A1C = AnonymousClass7TE.A1C();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    int i2 = (int) jSONObject3.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ALG);
                    String optString3 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                    if (C66580MXl.A06(optString3) == 0) {
                        throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                    }
                    try {
                        COSEAlgorithmIdentifier.A00(i2);
                        A1C.add(new PublicKeyCredentialParameters(optString3, i2));
                    } catch (Throwable unused) {
                    }
                }
                s3l.A06 = A1C;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final PublicKeyCredentialCreationOptions convert(C7379QAf qAf) {
        return Companion.convert(qAf);
    }
}
