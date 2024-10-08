package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.94X  reason: invalid class name */
public final class AnonymousClass94X {
    public final AnonymousClass94W A00;

    public final AnonymousClass40G A00(C61058Jvw jvw) {
        Exception exc;
        Integer num;
        C383569fn r0;
        C382749eS A0E;
        try {
            AnonymousClass94W r6 = this.A00;
            C61058Jvw jvw2 = jvw;
            String str = jvw2.A03;
            String str2 = jvw2.A05;
            String str3 = jvw2.A04;
            Integer num2 = (Integer) jvw2.A01;
            int intValue = num2.intValue();
            if (intValue == 1) {
                num = AnonymousClass05K.A00;
            } else if (intValue == 3) {
                num = AnonymousClass05K.A01;
            } else {
                String A0R = 002.A0R("unsupported flow ", C393049vo.A00(num2));
                0qQ.A0B(A0R, 1);
                exc = new Exception(A0R);
                throw exc;
            }
            AnonymousClass3JD A002 = r6.A00(num, str, str2, str3, jvw2.A02, (List) jvw2.A00);
            if (A002 == null || (r0 = (C383569fn) A002.Bny()) == null || (A0E = r0.A0E()) == null) {
                exc = new Exception("Got null server features response from network");
                throw exc;
            } else if (A0E.getOptionalStringField(0, "usecase") == null || A0E.getOptionalStringField(1, "version") == null || !A0E.hasFieldValue("time_stamp")) {
                exc = new Exception("Got invalid server features response from network");
                throw exc;
            } else {
                Class<C382739eR> cls = C382739eR.class;
                if (!A0E.getRequiredCompactedTreeListField(2, "features", cls, 605516421).isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ImmutableList requiredCompactedTreeListField = A0E.getRequiredCompactedTreeListField(2, "features", cls, 605516421);
                    0qQ.A07(requiredCompactedTreeListField);
                    C249803kO it = requiredCompactedTreeListField.iterator();
                    0qQ.A07(it);
                    while (it.hasNext()) {
                        C250663lr r3 = (C250663lr) it.next();
                        String optionalStringField = r3.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (optionalStringField == null) {
                            return new AnonymousClass40G(0sn.A00, "Example ID missing in server feature response", false);
                        }
                        C250663lr optionalTreeField = r3.getOptionalTreeField(1, "context", C382699eN.class, 1302468840);
                        ExampleContext exampleContext = new ExampleContext((Type) null, (String) null, 31);
                        if (optionalTreeField != null) {
                            C249803kO it2 = optionalTreeField.getRequiredCompactedTreeListField(0, "int_features", C382679eL.class, 1385380849).iterator();
                            0qQ.A07(it2);
                            while (it2.hasNext()) {
                                C250663lr r13 = (C250663lr) it2.next();
                                if (r13.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && r13.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                    exampleContext.A03.put(String.valueOf(r13.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), Long.valueOf((long) r13.getCoercedIntField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                                }
                            }
                            C249803kO it3 = optionalTreeField.getRequiredCompactedTreeListField(1, "float_features", C382669eK.class, -1592771456).iterator();
                            0qQ.A07(it3);
                            while (it3.hasNext()) {
                                C250663lr r132 = (C250663lr) it3.next();
                                if (r132.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && r132.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                    exampleContext.A02.put(String.valueOf(r132.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), Double.valueOf(r132.getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                                }
                            }
                            C249803kO it4 = optionalTreeField.getRequiredCompactedTreeListField(2, "string_features", C382689eM.class, -2019814762).iterator();
                            0qQ.A07(it4);
                            while (it4.hasNext()) {
                                C250663lr r11 = (C250663lr) it4.next();
                                String optionalStringField2 = r11.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                                if (r11.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && optionalStringField2 != null) {
                                    exampleContext.A04.put(String.valueOf(r11.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), optionalStringField2);
                                }
                            }
                        }
                        HashMap hashMap = new HashMap();
                        C249803kO it5 = r3.getRequiredCompactedTreeListField(2, "int_features", C382719eP.class, 1634003159).iterator();
                        0qQ.A07(it5);
                        while (it5.hasNext()) {
                            C250663lr r12 = (C250663lr) it5.next();
                            if (r12.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && r12.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                String valueOf = String.valueOf(r12.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                C255463uA[] r62 = FeatureData.A0E;
                                hashMap.put(valueOf, new FeatureData(Type.LONG, String.valueOf(r12.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), (String) null, (List) null, 0.0d, 16376, (long) r12.getCoercedIntField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                            }
                        }
                        C249803kO it6 = r3.getRequiredCompactedTreeListField(3, "float_features", C382709eO.class, 176701209).iterator();
                        0qQ.A07(it6);
                        while (it6.hasNext()) {
                            C250663lr r122 = (C250663lr) it6.next();
                            if (r122.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID) && r122.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                                String valueOf2 = String.valueOf(r122.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                C255463uA[] r63 = FeatureData.A0E;
                                hashMap.put(valueOf2, new FeatureData(Type.DOUBLE, String.valueOf(r122.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), (String) null, (List) null, r122.getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE), 16372, 0));
                            }
                        }
                        C249803kO it7 = r3.getRequiredCompactedTreeListField(4, "string_features", C382729eQ.class, -2110747301).iterator();
                        0qQ.A07(it7);
                        while (it7.hasNext()) {
                            C250663lr r8 = (C250663lr) it7.next();
                            if (r8.hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                                String valueOf3 = String.valueOf(r8.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                C255463uA[] r32 = FeatureData.A0E;
                                hashMap.put(valueOf3, new FeatureData(Type.STRING, String.valueOf(r8.getCoercedIntField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)), r8.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE), (List) null, 0.0d, 16364, 0));
                            }
                        }
                        arrayList.add(new Example(exampleContext, optionalStringField, hashMap));
                    }
                    return new AnonymousClass40G(arrayList, (String) null, true);
                }
                exc = new Exception("Got empty server features response from network");
                throw exc;
            }
        } catch (C375979Fz e) {
            0sn r2 = 0sn.A00;
            String message = e.getMessage();
            if (message == null) {
                message = "Server features fetch failed due to unknown reason";
            }
            return new AnonymousClass40G(r2, message, false);
        }
    }

    public AnonymousClass94X(AnonymousClass94W r1) {
        this.A00 = r1;
    }
}
