package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.OVe  reason: case insensitive filesystem */
public final class C70990OVe {
    public N49 A00;
    public C70816OMl A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public boolean A0x;

    public final String A00() {
        try {
            StringWriter A0v2 = JTO.A0v();
            17W A0K2 = AnonymousClass7TF.A0K(A0v2);
            A0K2.A0R("is_shh_mode", this.A0O);
            C70816OMl oMl = this.A01;
            if (oMl != null) {
                A0K2.A0q("poll");
                A0K2.A0t(C70065Nwh.A00(oMl));
            }
            String str = this.A0p;
            if (str != null) {
                A0K2.A0R(DcV.A02(114, 10, 118), str);
            }
            String str2 = this.A0w;
            if (str2 != null) {
                A0K2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            }
            A0K2.A0R("action", this.A0D);
            String str3 = this.A0Q;
            if (str3 != null) {
                A0K2.A0R("item_type", str3);
            }
            String str4 = this.A0t;
            if (str4 != null) {
                A0K2.A0R("target_item_type", str4);
            }
            String str5 = this.A0u;
            if (str5 != null) {
                A0K2.A0R("text", str5);
            }
            String str6 = this.A0R;
            if (str6 != null) {
                A0K2.A0R("mentioned_user_ids", str6);
            }
            Boolean bool = this.A03;
            if (bool != null) {
                A0K2.A0S("send_silently", bool.booleanValue());
            }
            String str7 = this.A0v;
            if (str7 != null) {
                A0K2.A0R("text_sent_with_reshare_type", str7);
            }
            String str8 = this.A0L;
            if (str8 != null) {
                A0K2.A0R("client_context", str8);
            }
            String str9 = this.A0X;
            if (str9 != null) {
                A0K2.A0R("offline_threading_id", str9);
            }
            String str10 = this.A0E;
            if (str10 != null) {
                A0K2.A0R("activity_status", str10);
            }
            Boolean bool2 = this.A02;
            if (bool2 != null) {
                A0K2.A0S("is_x_transport_forward", bool2.booleanValue());
            }
            String str11 = this.A0h;
            if (str11 != null) {
                A0K2.A0R(AnonymousClass000.A00(360), str11);
            }
            String str12 = this.A0g;
            if (str12 != null) {
                A0K2.A0R(AnonymousClass000.A00(1738), str12);
            }
            String str13 = this.A0N;
            if (str13 != null) {
                A0K2.A0R("emoji", str13);
            }
            String str14 = this.A0q;
            if (str14 != null) {
                A0K2.A0R("super_react_type", str14);
            }
            String str15 = this.A0f;
            if (str15 != null) {
                A0K2.A0R("reaction_action_source", str15);
            }
            String str16 = this.A0K;
            if (str16 != null) {
                A0K2.A0R("avatar_reaction", str16);
            }
            String str17 = this.A0P;
            if (str17 != null) {
                A0K2.A0R("item_id", str17);
            }
            String str18 = this.A0Z;
            if (str18 != null) {
                A0K2.A0R("original_message_client_context", str18);
            }
            String str19 = this.A0W;
            if (str19 != null) {
                A0K2.A0R("node_type", str19);
            }
            A0K2.A0S("sampled", this.A0x);
            String str20 = this.A0U;
            if (str20 != null) {
                A0K2.A0R("mutation_token", str20);
            }
            String str21 = this.A0o;
            if (str21 != null) {
                A0K2.A0R("send_attribution", str21);
            }
            String str22 = this.A0l;
            if (str22 != null) {
                A0K2.A0R(AnonymousClass000.A00(1763), str22);
            }
            String str23 = this.A0k;
            if (str23 != null) {
                A0K2.A0R(AnonymousClass000.A00(1762), str23);
            }
            String str24 = this.A0m;
            if (str24 != null) {
                A0K2.A0R("replied_to_target_type", str24);
            }
            String str25 = this.A0j;
            if (str25 != null) {
                A0K2.A0R("replied_to_action_source", str25);
            }
            String str26 = this.A0n;
            if (str26 != null) {
                A0K2.A0R("replied_to_user_id", str26);
            }
            Long l = this.A0A;
            if (l != null) {
                A0K2.A0Q("ephemeral_duration_sec", l.longValue());
            }
            Long l2 = this.A0B;
            if (l2 != null) {
                A0K2.A0Q("ephemeral_view_duration_sec", l2.longValue());
            }
            String str27 = this.A0e;
            if (str27 != null) {
                A0K2.A0R("profile_user_id", str27);
            }
            String str28 = this.A0S;
            if (str28 != null) {
                A0K2.A0R("media_id", str28);
            }
            String str29 = this.A0a;
            if (str29 != null) {
                A0K2.A0R(AnonymousClass000.A00(1697), str29);
            }
            String str30 = this.A0b;
            if (str30 != null) {
                A0K2.A0R("power_up_data", str30);
            }
            String str31 = this.A0d;
            if (str31 != null) {
                A0K2.A0R("private_reply_post_link", str31);
            }
            String str32 = this.A0c;
            if (str32 != null) {
                A0K2.A0R("private_reply_comment_id", str32);
            }
            String str33 = this.A0V;
            if (str33 != null) {
                A0K2.A0R("nav_chain", str33);
            }
            String str34 = this.A0T;
            if (str34 != null) {
                A0K2.A0R("mentioned_entities", str34);
            }
            String str35 = this.A0M;
            if (str35 != null) {
                A0K2.A0R("commands", str35);
            }
            String str36 = this.A0J;
            if (str36 != null) {
                A0K2.A0R(AnonymousClass000.A00(1116), str36);
            }
            Boolean bool3 = this.A05;
            if (bool3 != null) {
                A0K2.A0S("should_xpost", bool3.booleanValue());
            }
            N49 n49 = this.A00;
            if (n49 != null) {
                A0K2.A0q(AnonymousClass000.A00(1726));
                OPv.A00(n49, A0K2);
            }
            Integer num = this.A06;
            if (num != null) {
                A0K2.A0P("seed", num.intValue());
            }
            String str37 = this.A0G;
            if (str37 != null) {
                A0K2.A0R("ai_product", str37);
            }
            String str38 = this.A0I;
            if (str38 != null) {
                A0K2.A0R("associated_multimodal_item_id", str38);
            }
            String str39 = this.A0H;
            if (str39 != null) {
                A0K2.A0R("associated_multimodal_client_context", str39);
            }
            Integer num2 = this.A07;
            if (num2 != null) {
                A0K2.A0P("is_written_with_ai", num2.intValue());
            }
            String str40 = this.A0F;
            if (str40 != null) {
                A0K2.A0R("ai_assistant_extras", str40);
            }
            Boolean bool4 = this.A04;
            if (bool4 != null) {
                A0K2.A0S("should_skip_genai_eval", bool4.booleanValue());
            }
            Integer num3 = this.A09;
            if (num3 != null) {
                A0K2.A0P("thread_label", C69999Nvd.A00(num3));
            }
            Long l3 = this.A0C;
            if (l3 != null) {
                A0K2.A0Q(AnonymousClass000.A00(1779), l3.longValue());
            }
            String str41 = this.A0Y;
            if (str41 != null) {
                A0K2.A0R(AnonymousClass000.A00(1652), str41);
            }
            Integer num4 = this.A08;
            if (num4 != null) {
                A0K2.A0P("opaque_message_type", num4.intValue());
            }
            String str42 = this.A0s;
            if (str42 != null) {
                A0K2.A0R("target_item_id", str42);
            }
            String str43 = this.A0r;
            if (str43 != null) {
                A0K2.A0R("supplemental_key", str43);
            }
            String str44 = this.A0i;
            if (str44 != null) {
                A0K2.A0R("recipient_users", str44);
            }
            return AnonymousClass7TG.A0k(A0K2, A0v2);
        } catch (IOException e) {
            throw C41845B3m.A0j(e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [X.OKl, java.lang.Object] */
    public C70990OVe(N49 n49, C70816OMl oMl, OW8 ow8, 2FW r8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, boolean z, boolean z2) {
        String str31;
        String str32 = null;
        this.A0p = str;
        this.A0w = str2;
        this.A0D = str3;
        this.A0Q = null;
        this.A0t = null;
        this.A0u = str4;
        this.A0R = str5;
        this.A03 = bool;
        this.A0v = str6;
        String str33 = str7;
        this.A0L = str33;
        this.A0E = str8;
        this.A02 = bool2;
        this.A0h = null;
        this.A0g = null;
        this.A0N = null;
        this.A0q = null;
        this.A0f = null;
        this.A0K = null;
        this.A0P = null;
        this.A0Z = null;
        this.A0W = null;
        this.A0x = z;
        this.A0U = str9;
        this.A0o = str10;
        this.A0l = str11;
        this.A0k = str12;
        this.A0m = str13;
        this.A0j = str14;
        this.A0n = str15;
        this.A0A = l;
        this.A0B = l2;
        this.A0e = null;
        this.A0S = null;
        this.A0a = str16;
        this.A0b = str17;
        this.A0d = str18;
        this.A0c = str19;
        this.A0V = null;
        this.A0T = str20;
        this.A0M = str21;
        this.A0J = str22;
        this.A05 = bool3;
        this.A00 = n49;
        this.A06 = num;
        this.A0G = str23;
        this.A0I = str24;
        this.A0H = str25;
        this.A07 = num2;
        this.A0F = str26;
        this.A04 = bool4;
        this.A09 = num3;
        this.A0C = l3;
        this.A0Y = str27;
        this.A08 = num4;
        this.A0s = str28;
        this.A0r = str29;
        this.A0i = str30;
        this.A0X = str33;
        1QJ r1 = AnonymousClass1QI.A00;
        0qQ.A07(r1);
        this.A0V = r1.A02.A02;
        if (z2) {
            str31 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str31 = "0";
        }
        this.A0O = str31;
        if (r8 != null) {
            this.A0Q = r8.A00;
            C70142Nxw nxw = C70142Nxw.$redex_init_class;
            switch (r8.ordinal()) {
                case 2:
                case 5:
                case 108:
                    return;
                case 9:
                case 10:
                    if (ow8 != null) {
                        this.A0h = ow8.A09;
                        this.A0g = ow8.A07;
                        this.A0P = ow8.A02;
                        this.A0Z = ow8.A04;
                        this.A0W = "item";
                        this.A0t = ow8.A03;
                        this.A0N = ow8.A01;
                        this.A0q = ow8.A08;
                        this.A0f = ow8.A05;
                        C70765OKl oKl = ow8.A00;
                        if (oKl != null) {
                            String str34 = oKl.A00;
                            String str35 = oKl.A01;
                            ? obj = new Object();
                            obj.A00 = str34;
                            obj.A01 = str35;
                            obj.A02 = null;
                            StringWriter A0v2 = JTO.A0v();
                            17W A0A2 = AnonymousClass15o.A00.A0A(A0v2);
                            C70872OPl.A00(A0A2, obj);
                            A0A2.close();
                            str32 = A0v2.toString();
                        }
                        this.A0K = str32;
                        return;
                    }
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Content type == ");
                    A1A.append(r8);
                    throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" but DirectReactionMutation is null", A1A));
                case 15:
                case 19:
                    this.A0e = this.A0P;
                    return;
                case 37:
                case 46:
                    this.A0S = this.A0P;
                    return;
                case 69:
                    this.A01 = oMl;
                    return;
                default:
                    throw C51973G9u.A0g(r8, "Unhandled direct share type: ", AnonymousClass7TE.A1A());
            }
        }
    }

    public C70990OVe() {
        this((N49) null, (C70816OMl) null, (OW8) null, (2FW) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, "send_item", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false);
    }
}
