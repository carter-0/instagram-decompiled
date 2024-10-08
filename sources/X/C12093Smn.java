package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Smn  reason: case insensitive filesystem */
public final class C12093Smn implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;

    public C12093Smn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void invoke(AnonymousClass3JD r22) {
        String str;
        C250663lr A0U;
        C250663lr optionalTreeField;
        ImmutableList immutableList;
        Integer num;
        String string;
        C250663lr A03;
        ImmutableList requiredCompactedTreeListField;
        boolean z;
        String str2;
        C250663lr A0U2;
        C250663lr A032;
        AnonymousClass3FZ r3;
        AnonymousClass3FZ A002;
        String str3;
        Integer num2;
        AnonymousClass3JD r0 = r22;
        switch (this.A00) {
            case 0:
            case 10:
                ((C2818659w) this.A01).A02(C11097S9y.A00(r0.Bny()));
                return;
            case 1:
                if (r22 == null || (A0U = C41845B3m.A0U(r0)) == null || (optionalTreeField = A0U.getOptionalTreeField(0, "bloks_component_query(bk_context:$bk_context,params:$params)", Q47.class, 827398988)) == null) {
                    str = null;
                } else {
                    str = optionalTreeField.getOptionalStringField(0, "bloks_bundle_component_query");
                }
                ((Q3C) this.A01).A00.A00(new C7313Q3p(), str, 0sn.A00);
                return;
            case 6:
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (r22 == null || (A0U2 = C41845B3m.A0U(r0)) == null || (A032 = A0U2.A03(QWU.class, "xfb_get_ig_wearables_contacts", -442742710)) == null) {
                    immutableList = null;
                } else {
                    immutableList = A032.A06(QWS.class, "contacts", -401618160);
                }
                boolean z2 = true;
                if (immutableList != null && !immutableList.isEmpty()) {
                    C249803kO A0J = C66580MXl.A0J(immutableList);
                    while (A0J.hasNext()) {
                        C250663lr A0V = C41845B3m.A0V(A0J);
                        String A07 = A0V.A07("igid");
                        Class<QWR> cls = QWR.class;
                        C250663lr optionalTreeField2 = A0V.getOptionalTreeField(2, "thread", cls, -878227095);
                        if (optionalTreeField2 != null) {
                            optionalTreeField2.getOptionalStringField(0, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                        }
                        String A02 = C66955Mfo.A02(27, 8, 109);
                        String A0A = A0V.A0A(A02);
                        String A0B = A0V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        if (A0B != null && !00l.A0W(A0B)) {
                            A0A = A0V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }
                        if (A07 != null && !00l.A0W(A07) && A0A != null && !00l.A0W(A0A)) {
                            C250663lr optionalTreeField3 = A0V.getOptionalTreeField(2, "thread", cls, -878227095);
                            if (optionalTreeField3 != null) {
                                z = optionalTreeField3.getCoercedBooleanField(1, "is_e2ee");
                            } else {
                                z = false;
                            }
                            String A0A2 = A0V.A0A(A02);
                            if (A0A2 == null) {
                                A0A2 = "";
                            }
                            C250663lr optionalTreeField4 = A0V.getOptionalTreeField(2, "thread", cls, -878227095);
                            if (optionalTreeField4 == null || (str2 = optionalTreeField4.getOptionalStringField(2, C66955Mfo.A02(9, 8, 99))) == null) {
                                str2 = "";
                            }
                            A1C.add(new C70781OLb(A07, A0A, A0A2, str2, false, z));
                        }
                    }
                }
                if (r22 != null) {
                    C250663lr A0U3 = C41845B3m.A0U(r0);
                    if (!(A0U3 == null || (A03 = A0U3.A03(QWU.class, "xfb_get_ig_wearables_contacts", -442742710)) == null || (requiredCompactedTreeListField = A03.getRequiredCompactedTreeListField(1, "group_threads", QWT.class, 909549267)) == null || requiredCompactedTreeListField.isEmpty())) {
                        C249803kO A0J2 = C66580MXl.A0J(requiredCompactedTreeListField);
                        while (A0J2.hasNext()) {
                            C250663lr A0V2 = C41845B3m.A0V(A0J2);
                            String A072 = A0V2.A07(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                            String A0A3 = A0V2.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            if (A072 != null && !00l.A0W(A072) && A0A3 != null && !00l.A0W(A0A3)) {
                                A1C.add(new C70781OLb(A072, A0A3, "", "", true, A0V2.getCoercedBooleanField(2, "is_e2ee")));
                            }
                        }
                    }
                    num = r0.B87();
                } else {
                    num = null;
                }
                if (num == AnonymousClass05K.A00 || (string = 0xn.A01(AnonymousClass000.A00(91)).getString("stella_contact_sync_timestamp", (String) null)) == null || 00l.A0W(string)) {
                    0xn.A01(AnonymousClass000.A00(91)).AR4().E5g("stella_contact_sync_timestamp", String.valueOf(System.currentTimeMillis()));
                } else {
                    z2 = false;
                }
                ((C74418PuY) this.A01).D62(A1C, z2);
                return;
            case 7:
                ((C229022mi) this.A01).onSuccess(r0);
                return;
            case 9:
                if (!(r22 == null || (r3 = (AnonymousClass3FZ) r0.Bny()) == null || (A002 = r3.A00(C7587QNc.class, "dcp_create_iap_purchase_quote")) == null)) {
                    S2K s2k = (S2K) this.A01;
                    String A05 = A002.A05("quote_id");
                    String A052 = A002.A05("external_product_id");
                    String A053 = A002.A05("offer_id");
                    AnonymousClass3FZ A003 = A002.A00(C7586QNb.class, "multitier_response");
                    if (!(A05 == null || A052 == null)) {
                        if (A003 != null) {
                            str3 = A003.A05("active_inuse_sku");
                            Enum A04 = A003.A04("xgrade_strategy", C8943RGl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            if (A04 != null) {
                                int i = 0;
                                if (A04 == C8943RGl.DEFERRED) {
                                    i = 4;
                                } else if (A04 == C8943RGl.IMMEDIATE_AND_CHARGE_FULL_PRICE) {
                                    i = 5;
                                } else if (A04 == C8943RGl.IMMEDIATE_SWITCH_WITH_PRORATED_CHARGE) {
                                    i = 2;
                                } else if (A04 != C8943RGl.IMMEDIATE_SWITCH_WITH_PRORATED_REFUNDS) {
                                    if (A04 == C8943RGl.IMMEDIATE_WITHOUT_PRORATION) {
                                        i = 3;
                                    } else if (A04 == C8943RGl.IMMEDIATE_SWITCH_WITH_TIME_PRORATION) {
                                        i = 1;
                                    }
                                }
                                num2 = Integer.valueOf(i);
                            }
                            num2 = null;
                        } else {
                            str3 = null;
                            num2 = null;
                        }
                        SPQ spq = s2k.A00.A06;
                        Map map = s2k.A02;
                        0qQ.A0B(map, 3);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        Pxe.A1U(RH0.A0U, A052, linkedHashMap);
                        Pxe.A1U(RH0.A0r, A05, linkedHashMap);
                        if (A053 != null) {
                            Pxe.A1U(RH0.A0e, A053, linkedHashMap);
                        }
                        spq.A00.Cgp(linkedHashMap, (Map) null, "client_create_dcpquote_success");
                        C7610QOs qOs = s2k.A01;
                        qOs.A02 = A052;
                        qOs.A04 = A05;
                        qOs.A01 = str3;
                        qOs.A00 = num2;
                        qOs.A03 = A053;
                        s2k.A03.resumeWith(AnonymousClass7TE.A1L(qOs, linkedHashMap));
                        return;
                    }
                }
                ((S2K) this.A01).A00(new Throwable());
                return;
            default:
                ((2IR) this.A01).onSuccess(r0);
                return;
        }
    }
}
