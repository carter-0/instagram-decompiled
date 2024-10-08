package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9j1  reason: invalid class name and case insensitive filesystem */
public final class C385489j1 extends 1P0 {
    public final /* synthetic */ C312926fP A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Set A03;

    public C385489j1(C312926fP r1, SettableFuture settableFuture, Map map, Set set) {
        this.A00 = r1;
        this.A01 = settableFuture;
        this.A03 = set;
        this.A02 = map;
    }

    public static void A00(C312926fP r1, 1K2 r2, Object obj, String str) {
        r2.setException(new IllegalStateException(str));
        r1.A04.remove(obj);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        Object obj2;
        IllegalStateException A0z;
        String str;
        String obj3;
        Object[] objArr;
        String str2;
        int A032 = AnonymousClass0fD.A03(1190828685);
        AnonymousClass3JC r1 = (AnonymousClass3JC) obj;
        int A033 = AnonymousClass0fD.A03(1896977104);
        if (r1 == null || (obj2 = r1.A01) == null) {
            A00(this.A00, this.A01, this.A03, "Server response is empty.");
            i = 1483466564;
        } else {
            C250663lr optionalTreeField = ((C250663lr) obj2).getOptionalTreeField(0, AnonymousClass000.A00(1081), BX1.class, 543548346);
            if (optionalTreeField == null) {
                A00(this.A00, this.A01, this.A03, "Server returns empty manifest.");
                i = -1218042058;
            } else {
                ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "models", BX0.class, 557494686);
                if (requiredCompactedTreeListField == null) {
                    A00(this.A00, this.A01, this.A03, "Server returns empty model list.");
                    i = 742496000;
                } else {
                    int size = requiredCompactedTreeListField.size();
                    Set set = this.A03;
                    if (size != set.size()) {
                        A00(this.A00, this.A01, set, 0mp.A06("# of capabilities requested and received are different. requested: %s, received: %s", new Object[]{set, requiredCompactedTreeListField}));
                        i = 1073317976;
                    } else {
                        HashMap hashMap = new HashMap(set.size());
                        C249803kO it = requiredCompactedTreeListField.iterator();
                        while (it.hasNext()) {
                            C250663lr r11 = (C250663lr) it.next();
                            C312926fP r3 = this.A00;
                            SettableFuture settableFuture = this.A01;
                            Map map = this.A02;
                            String optionalStringField = r11.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            if (optionalStringField == null) {
                                A00(r3, settableFuture, set, "NMLML model name is null.");
                            } else {
                                VersionedCapability fromServerValue = VersionedCapability.fromServerValue(optionalStringField);
                                if (fromServerValue == null) {
                                    A00(r3, settableFuture, set, "NMLML model name does not match VersionedCapability enum.");
                                } else if (!map.containsKey(fromServerValue)) {
                                    A00(r3, settableFuture, set, 0mp.A06("client does not request a capability that server sends. requested: %s, received: %s", new Object[]{set, fromServerValue}));
                                } else {
                                    if (r11.hasFieldValue("version")) {
                                        long coercedIntField = (long) r11.getCoercedIntField(1, "version");
                                        long j = coercedIntField;
                                        if (coercedIntField != -1) {
                                            ImmutableList requiredCompactedTreeListField2 = r11.getRequiredCompactedTreeListField(2, "assets", C42255BWy.class, 70526919);
                                            if (requiredCompactedTreeListField2 == null) {
                                                A00(r3, settableFuture, set, 0mp.A06("Asset list is null for model: %s", new Object[]{fromServerValue}));
                                            } else {
                                                try {
                                                    ArrayList A1C = AnonymousClass7TE.A1C();
                                                    Iterator it2 = requiredCompactedTreeListField2.iterator();
                                                    while (it2.hasNext()) {
                                                        C250663lr r12 = (C250663lr) it2.next();
                                                        String optionalStringField2 = r12.getOptionalStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                                        if (optionalStringField2 != null) {
                                                            Class<C382659eJ> cls = C382659eJ.class;
                                                            if (r12.getOptionalTreeField(10, "metadata", cls, 2125716249) == null || r12.getOptionalTreeField(10, "metadata", cls, 2125716249).getOptionalStringField(2, "file_name") == null) {
                                                                str = "";
                                                            } else {
                                                                str = r12.getOptionalTreeField(10, "metadata", cls, 2125716249).getOptionalStringField(2, "file_name");
                                                            }
                                                            String optionalStringField3 = r12.getOptionalStringField(7, "url");
                                                            if (optionalStringField3 != null) {
                                                                String A0B = r12.A0B("md5_hash");
                                                                long coercedIntField2 = (long) r12.getCoercedIntField(8, "filesize_bytes");
                                                                C391359sl r122 = C391359sl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                                                if (r12.getOptionalEnumField(9, TraceFieldType.CompressionType, r122) != null) {
                                                                    obj3 = r12.getOptionalEnumField(9, TraceFieldType.CompressionType, r122).toString();
                                                                } else {
                                                                    obj3 = ARRequestAsset.CompressionMethod.NONE.toString();
                                                                }
                                                                ARRequestAsset.CompressionMethod fromString = ARRequestAsset.CompressionMethod.fromString(obj3);
                                                                String A0A = r12.A0A(C273654mx.A00(962));
                                                                String optionalStringField4 = r12.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                                                if (optionalStringField4 != null) {
                                                                    Object obj4 = C39612A2c.A01.get(optionalStringField2.toUpperCase(Locale.US));
                                                                    AnonymousClass8LN r6 = null;
                                                                    if (obj4 == null) {
                                                                        objArr = new Object[]{str};
                                                                        str2 = "graphQLModelAssetType is null, file name: %s";
                                                                    } else {
                                                                        r6 = (AnonymousClass8LN) C39612A2c.A00.get(obj4);
                                                                        if (r6 == null) {
                                                                            objArr = new Object[]{obj4.toString()};
                                                                            str2 = "Could not convert GraphQL model asset type: %s";
                                                                        }
                                                                        if (str.isEmpty() || r6 != null) {
                                                                            ArrayList arrayList = A1C;
                                                                            arrayList.add(new ARRequestAsset(ARAssetType.SUPPORT, fromString, (EffectAssetType) null, (C371118xc) null, r6, (SparkVisionCapability) null, fromServerValue, AnonymousClass05K.A00, optionalStringField4, (String) null, str, str, optionalStringField3, A0B, A0A, (String) null, (List) null, (List) null, (int) j, coercedIntField2, 0, false, false, false));
                                                                        } else {
                                                                            A0z = AnonymousClass7TE.A0z(StringFormatUtil.formatStrLocaleSafe("File name and model asset type are both null. Invalid model metadata. Model id: %s", optionalStringField4));
                                                                        }
                                                                    }
                                                                    0KC.A0Q("IgNmlmlModelMetadataDownloader", str2, objArr);
                                                                    if (str.isEmpty()) {
                                                                    }
                                                                    ArrayList arrayList2 = A1C;
                                                                    arrayList2.add(new ARRequestAsset(ARAssetType.SUPPORT, fromString, (EffectAssetType) null, (C371118xc) null, r6, (SparkVisionCapability) null, fromServerValue, AnonymousClass05K.A00, optionalStringField4, (String) null, str, str, optionalStringField3, A0B, A0A, (String) null, (List) null, (List) null, (int) j, coercedIntField2, 0, false, false, false));
                                                                } else {
                                                                    A0z = AnonymousClass7TE.A0z(StringFormatUtil.formatStrLocaleSafe("modelAssetId is null. Invalid model metadata. Model asset name: %s", optionalStringField2));
                                                                }
                                                            }
                                                        } else {
                                                            A0z = AnonymousClass7TE.A0z("Asset name is not set");
                                                        }
                                                        throw A0z;
                                                    }
                                                    hashMap.put(fromServerValue, A1C);
                                                } catch (IllegalStateException e) {
                                                    settableFuture.setException(new IllegalStateException("error generating request assets: ", e));
                                                    r3.A04.remove(set);
                                                }
                                            }
                                        }
                                    }
                                    A00(r3, settableFuture, set, 0mp.A06("Version is not valid for %s", new Object[]{fromServerValue.toServerValue()}));
                                }
                            }
                        }
                        this.A01.set(hashMap);
                        i = -488180308;
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-735249588, A032);
    }

    public final void onFailInBackground(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(-753551260);
        A00(this.A00, this.A01, this.A03, Pxd.A00(554));
        AnonymousClass0fD.A0A(-2093992769, A032);
    }
}
