package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Fb  reason: invalid class name and case insensitive filesystem */
public final class C239123Fb {
    public 0lg A00;
    public C239133Fc A01;
    public C239153Fe A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final 1OC A06() {
        C239133Fc r1 = this.A01;
        if (r1 != null) {
            0lg r5 = this.A00;
            if (r5 != null) {
                C239153Fe r6 = this.A02;
                if (r6 != null) {
                    try {
                        String aSCIIString = 1Ma.A06().toASCIIString();
                        C239183Fh A002 = C239173Fg.A00();
                        String str = r1.A01;
                        1Fc A012 = A01(this, A002.clientDocIdForQuery(str));
                        String str2 = r1.A02;
                        if (str2 != null) {
                            A012.A05("variables", str2);
                        }
                        String str3 = null;
                        String A042 = 182.A04(0Tu.A05, r5, 36875257763594307L);
                        ConcurrentHashMap concurrentHashMap = C253253qS.A01;
                        if (!concurrentHashMap.containsKey(A042)) {
                            concurrentHashMap.put(A042, new C253253qS(A042));
                        }
                        if (((C253253qS) 0k2.A0I(A042, concurrentHashMap)).A00.contains(str)) {
                            AnonymousClass2ZH A003 = AnonymousClass2ZH.A02.A00();
                            synchronized (A003) {
                                str3 = A003.A00;
                            }
                        }
                        0qQ.A0A(aSCIIString);
                        return A00(A012, r5, r6, aSCIIString, str, str3);
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    } catch (JSONException e2) {
                        throw new IllegalStateException(e2);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException(Pxd.A00(563));
            }
        } else {
            throw new IllegalStateException(Pxd.A00(62));
        }
    }

    public final 1OC A07(Integer num) {
        String str;
        String str2;
        String clientDocIdForQuery;
        C239133Fc r2 = this.A01;
        if (r2 != null) {
            0lg r5 = this.A00;
            if (r5 != null) {
                C239153Fe r6 = this.A02;
                if (r6 != null) {
                    if (num.intValue() != 0) {
                        str = "/api/v1/wwwgraphql/ig/query/";
                    } else {
                        str = "/api/v1/ads/graphql/";
                    }
                    String A032 = 1Ma.A03(str);
                    try {
                        if (num.intValue() != 0) {
                            C239183Fh A002 = C239173Fg.A00();
                            str2 = r2.A01;
                            clientDocIdForQuery = A002.clientDocIdForQuery(str2);
                        } else {
                            AnonymousClass4LT A003 = AnonymousClass4LT.A01.A00();
                            str2 = r2.A01;
                            clientDocIdForQuery = A003.clientDocIdForQuery(str2);
                        }
                        1Fc A012 = A01(this, clientDocIdForQuery);
                        String str3 = r2.A02;
                        if (str3 != null) {
                            A012.A05("variables", str3);
                        }
                        return A00(A012, r5, r6, A032, str2, (String) null);
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    } catch (JSONException e2) {
                        throw new IllegalStateException(e2);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("User session required for proxied GraphQL call");
            }
        } else {
            throw new IllegalStateException(Pxd.A00(62));
        }
    }

    public final void A08(1Ef r6) {
        0qQ.A0B(r6, 0);
        String callName = r6.getCallName();
        0qQ.A07(callName);
        this.A01 = new C239133Fc((Class) null, callName, new JSONObject(r6.getQueryParams().getParamsCopy()).toString(), false);
        this.A02 = new C239143Fd(r6);
    }

    public final void A09(C239133Fc r4) {
        0qQ.A0B(r4, 0);
        this.A01 = r4;
        this.A02 = new C298345tH(r4.A00, r4.A03);
    }

    private final 1OC A00(1Fc r23, 0lg r24, C239153Fe r25, String str, String str2, String str3) {
        1HW r4;
        1Fc r3 = r23;
        r3.A05("strip_nulls", "true");
        r3.A05("strip_defaults", "true");
        0lg r5 = r24;
        if (182.A06(0Tu.A05, r5, 36311745169457913L)) {
            r4 = null;
        } else {
            r4 = new 1HV(r5);
        }
        AnonymousClass1O8 r1 = new AnonymousClass1O8();
        String str4 = str;
        C239203Fj A022 = 1GK.A06.A00(new C239193Fi(r3, r4, r5, this, str4, str2, str3), -6, 2, false, true).A02(new 1QY(r1.A00), 528, 2, true, true).A02(r25, 529, 2, false, true);
        0qQ.A0B(str4, 3);
        return new 1OC(r1, AnonymousClass3Fk.A00(A022), "GraphQLApi", str4);
    }

    public static final 1XR A02(1Fc r2, 0lg r3, C239123Fb r4, C239153Fe r5, String str, String str2) {
        1Pq r1 = new 1Pq(new 1HV(r3));
        r1.A02(str2);
        r1.A01(AnonymousClass05K.A01);
        r1.A05 = true;
        AnonymousClass1Px A002 = r2.A00(true);
        if (A002 != null) {
            r1.A00 = A002;
        }
        2ZL A012 = AnonymousClass1C7.A00().A01(new AnonymousClass1QX(r1.A00(), A03(r4, str).A00()));
        0qQ.A07(A012);
        return (1XR) r5.then(A012);
    }

    public static final AnonymousClass1QT A03(C239123Fb r6, String str) {
        AnonymousClass1QT r5 = new AnonymousClass1QT();
        r5.A04 = 1CE.A05;
        r5.A03 = 1Fe.A02;
        r5.A0A = str;
        r5.A0C = "graphql:api";
        String str2 = r6.A05;
        if (!(str2 == null || str2.length() == 0)) {
            r5.A08 = str2;
        }
        Integer num = r6.A03;
        if (num != null) {
            r5.A07 = num;
        }
        Long l = r6.A04;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue >= 0) {
                r5.A01 = longValue;
            }
        }
        return r5;
    }

    public final 1OC A04() {
        C239133Fc r5 = this.A01;
        if (r5 != null) {
            C239153Fe r6 = this.A02;
            if (r6 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (this.A06 != null) {
                try {
                    String A002 = AnonymousClass1Q2.A00();
                    String clientDocIdForQuery = AnonymousClass4LT.A01.A00().clientDocIdForQuery(r5.A01);
                    SIZ siz = new SIZ();
                    siz.A03 = AnonymousClass000.A00(3200);
                    siz.A02 = this.A06;
                    if (clientDocIdForQuery == null) {
                        clientDocIdForQuery = "";
                    }
                    1Fc r2 = siz.A04;
                    r2.A05("client_doc_id", clientDocIdForQuery);
                    r2.A05("locale", A002);
                    r2.A05("oss_response_format", "true");
                    r2.A05("oss_request_format", "true");
                    r2.A05("strip_nulls", "true");
                    r2.A05("strip_defaults", "true");
                    siz.A00 = r6;
                    siz.A01 = AnonymousClass05K.A01;
                    String str = r5.A02;
                    if (str != null) {
                        r2.A05("variables", str);
                    }
                    1OC A012 = siz.A01();
                    0qQ.A0C(A012, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<ResponseType of com.instagram.graphql.network.GraphQLApi.Builder, ResponseType of com.instagram.graphql.network.GraphQLApi.Builder>");
                    return A012;
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                } catch (JSONException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                throw new IllegalStateException("non-proxied graphql request must have facebook access token");
            }
        } else {
            throw new IllegalStateException(Pxd.A00(62));
        }
    }

    public final 1OC A05() {
        return A07(AnonymousClass05K.A01);
    }

    public C239123Fb(0lg r1) {
        this.A00 = r1;
    }

    public static final 1Fc A01(C239123Fb r4, String str) {
        String A002 = AnonymousClass1Q2.A00();
        1Fc r2 = new 1Fc();
        r2.A05("signed_body", 0mp.A06("SIGNATURE.%s", new Object[]{""}));
        String str2 = r4.A08;
        if (str2 == null) {
            str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        r2.A05("vc_policy", str2);
        r2.A05("locale", A002);
        if (str != null) {
            r2.A05("client_doc_id", str);
        }
        String str3 = r4.A07;
        if (str3 != null) {
            r2.A05("surface", str3);
        }
        return r2;
    }
}
