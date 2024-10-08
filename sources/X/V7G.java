package X;

import com.instagram.api.schemas.GroupMetadataImpl;
import com.instagram.api.schemas.RingSpecImpl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class V7G {
    public static GroupMetadataImpl parseFromJson(16F r73) {
        String str;
        String A00;
        0LH r0;
        16F r7 = r73;
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Long l = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            ArrayList arrayList3 = null;
            RingSpecImpl ringSpecImpl = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r27 = 16L.A09;
                str = "is_group_notes_allowed";
                A00 = AnonymousClass000.A00(153);
                if (A1J == r27) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                if ("admin_ids".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r7, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("blocked_user_ids".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r7, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("can_post".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("channel_admin_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("chat_thread_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("group_fbid".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if ("group_pk".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r7.A1P();
                    }
                } else if (A00.equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r7);
                } else if ("has_pending_admin_invite".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r7);
                } else if ("hidden".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r7);
                } else if ("is_group".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r7);
                } else if ("is_group_full".equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r7);
                } else if (str.equals(A17)) {
                    bool7 = AnonymousClass7TF.A0S(r7);
                } else if ("is_recommendable".equals(A17)) {
                    bool8 = AnonymousClass7TF.A0S(r7);
                } else if ("is_viewer_admin".equals(A17)) {
                    bool9 = AnonymousClass7TF.A0S(r7);
                } else if ("is_viewer_in_chat_thread".equals(A17)) {
                    bool10 = AnonymousClass7TF.A0S(r7);
                } else if ("is_viewer_invited".equals(A17)) {
                    bool11 = AnonymousClass7TF.A0S(r7);
                } else if ("mandatory_approvals_expire_at".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r7);
                } else if ("num_admins".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("num_blocked_users".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r7);
                } else if ("num_pending_follow_requests".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r7);
                } else if ("num_pending_invites".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r7);
                } else if ("num_pending_notes".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r7);
                } else if ("num_pending_notes_by_viewer".equals(A17)) {
                    num6 = AnonymousClass7TF.A0X(r7);
                } else if ("num_pending_posts".equals(A17)) {
                    num7 = AnonymousClass7TF.A0X(r7);
                } else if ("num_pending_posts_by_viewer".equals(A17)) {
                    num8 = AnonymousClass7TF.A0X(r7);
                } else if ("pending_admin_ids".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r7, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("ring_spec".equals(A17)) {
                    ringSpecImpl = C45620CzW.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (arrayList == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("admin_ids", r7, "GroupMetadataImpl");
            } else if (arrayList2 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("blocked_user_ids", r7, "GroupMetadataImpl");
            } else if (bool == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_post", r7, "GroupMetadataImpl");
            } else if (str4 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("group_fbid", r7, "GroupMetadataImpl");
            } else if (str5 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("group_pk", r7, "GroupMetadataImpl");
            } else if (bool2 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r7, "GroupMetadataImpl");
            } else if (bool3 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_pending_admin_invite", r7, "GroupMetadataImpl");
            } else if (bool5 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_group", r7, "GroupMetadataImpl");
            } else if (bool6 != null || !(r7 instanceof 0c9)) {
                if (bool7 == null && (r7 instanceof 0c9)) {
                    r0 = ((0c9) r7).A03;
                } else if (bool8 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("is_recommendable", r7, "GroupMetadataImpl");
                } else if (bool9 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("is_viewer_admin", r7, "GroupMetadataImpl");
                } else if (bool10 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("is_viewer_in_chat_thread", r7, "GroupMetadataImpl");
                } else if (bool11 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("is_viewer_invited", r7, "GroupMetadataImpl");
                } else if (num == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("num_admins", r7, "GroupMetadataImpl");
                } else if (num2 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("num_blocked_users", r7, "GroupMetadataImpl");
                } else if (num3 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("num_pending_follow_requests", r7, "GroupMetadataImpl");
                } else if (num4 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("num_pending_invites", r7, "GroupMetadataImpl");
                } else if (num5 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("num_pending_notes", r7, "GroupMetadataImpl");
                } else if (num6 == null && (r7 instanceof 0c9)) {
                    AnonymousClass7TF.A1L("num_pending_notes_by_viewer", r7, "GroupMetadataImpl");
                } else if (num7 == null && (r7 instanceof 0c9)) {
                    r0 = ((0c9) r7).A03;
                    str = "num_pending_posts";
                } else if (num8 == null && (r7 instanceof 0c9)) {
                    r0 = ((0c9) r7).A03;
                    str = "num_pending_posts_by_viewer";
                } else if (arrayList3 != null || !(r7 instanceof 0c9)) {
                    return new GroupMetadataImpl(ringSpecImpl, bool4, l, str2, str3, str4, str5, arrayList, arrayList2, arrayList3, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue(), num7.intValue(), num8.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), bool8.booleanValue(), bool9.booleanValue(), bool10.booleanValue(), bool11.booleanValue());
                } else {
                    r0 = ((0c9) r7).A03;
                    str = "pending_admin_ids";
                }
                r0.A00(str, "GroupMetadataImpl");
            } else {
                AnonymousClass7TF.A1L("is_group_full", r7, "GroupMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
