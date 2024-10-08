package X;

import java.io.StringWriter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6zm  reason: invalid class name and case insensitive filesystem */
public final class C324716zm {
    public static C59721JVf A00;
    public static String A01;
    public static final C324716zm A02 = new Object();

    public static final String A00() {
        String str;
        synchronized (A02) {
            str = A01;
            if (str == null) {
                C59721JVf jVf = A00;
                if (jVf != null) {
                    StringWriter stringWriter = new StringWriter();
                    17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                    A0A.A0c();
                    List<C61070Jw8> list = (List) jVf.A01;
                    if (list != null) {
                        16P.A03(A0A, "push_notifications");
                        for (C61070Jw8 jw8 : list) {
                            if (jw8 != null) {
                                A0A.A0c();
                                if (((Integer) jw8.A01) != null) {
                                    String lowerCase = "NOTIFICATION_CLICKED".toLowerCase(Locale.ROOT);
                                    0qQ.A07(lowerCase);
                                    A0A.A0R("source_event_type", lowerCase);
                                }
                                Long l = (Long) jw8.A00;
                                if (l != null) {
                                    A0A.A0Q("timestamp", l.longValue());
                                }
                                String str2 = jw8.A03;
                                if (str2 != null) {
                                    A0A.A0R("landing_path", str2);
                                }
                                QP8 qp8 = (QP8) jw8.A02;
                                if (qp8 != null) {
                                    A0A.A0q("notification_context");
                                    A0A.A0c();
                                    String str3 = qp8.A01;
                                    if (str3 != null) {
                                        A0A.A0R("notification_delivery_id", str3);
                                    }
                                    String str4 = qp8.A03;
                                    if (str4 != null) {
                                        A0A.A0R("recipient_ig_id", str4);
                                    }
                                    String str5 = qp8.A02;
                                    if (str5 != null) {
                                        A0A.A0R("notification_type", str5);
                                    }
                                    String str6 = qp8.A04;
                                    if (str6 != null) {
                                        A0A.A0R("sender_ig_id", str6);
                                    }
                                    Integer num = (Integer) qp8.A00;
                                    if (num != null) {
                                        A0A.A0P("notification_channel", num.intValue());
                                    }
                                    A0A.A0Z();
                                }
                                A0A.A0Z();
                            }
                        }
                        A0A.A0Y();
                    }
                    List<C53401GnY> list2 = (List) jVf.A00;
                    if (list2 != null) {
                        16P.A03(A0A, "af_notifications");
                        for (C53401GnY gnY : list2) {
                            if (gnY != null) {
                                A0A.A0c();
                                if (((Integer) gnY.A00) != null) {
                                    String lowerCase2 = "NOTIFICATION_CLICKED".toLowerCase(Locale.ROOT);
                                    0qQ.A07(lowerCase2);
                                    A0A.A0R("source_event_type", lowerCase2);
                                }
                                Long l2 = (Long) gnY.A02;
                                if (l2 != null) {
                                    A0A.A0Q("timestamp", l2.longValue());
                                }
                                String str7 = gnY.A03;
                                if (str7 != null) {
                                    A0A.A0R("af_agg_id", str7);
                                }
                                String str8 = gnY.A04;
                                if (str8 != null) {
                                    A0A.A0R("landing_path", str8);
                                }
                                C61073JwB jwB = (C61073JwB) gnY.A01;
                                if (jwB != null) {
                                    A0A.A0q("notification_context");
                                    A0A.A0c();
                                    String str9 = jwB.A02;
                                    if (str9 != null) {
                                        A0A.A0R("notification_type", str9);
                                    }
                                    String str10 = jwB.A03;
                                    if (str10 != null) {
                                        A0A.A0R("recipient_ig_id", str10);
                                    }
                                    List<Long> list3 = (List) jwB.A00;
                                    if (list3 != null) {
                                        16P.A03(A0A, "mentioned_user_ids");
                                        for (Long l3 : list3) {
                                            if (l3 != null) {
                                                A0A.A0h(l3.longValue());
                                            }
                                        }
                                        A0A.A0Y();
                                    }
                                    String str11 = jwB.A01;
                                    if (str11 != null) {
                                        A0A.A0R("notification_channel", str11);
                                    }
                                    A0A.A0Z();
                                }
                                A0A.A0Z();
                            }
                        }
                        A0A.A0Y();
                    }
                    A0A.A0Z();
                    A0A.close();
                    str = stringWriter.toString();
                    0qQ.A07(str);
                } else {
                    str = null;
                }
                A01 = str;
            }
        }
        return str;
    }

    public static final void A01(C59721JVf jVf) {
        synchronized (A02) {
            A01 = null;
            A00 = jVf;
        }
    }
}
