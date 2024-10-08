package X;

import android.os.Bundle;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.chat.model.ChatStickerStickerType;

/* renamed from: X.OaN  reason: case insensitive filesystem */
public abstract class C71045OaN {
    public static final NKN A03(GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success, ChatStickerStickerType chatStickerStickerType, String str, String str2, boolean z, boolean z2) {
        C69318NjJ njJ;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("GroupPreviewFragment.STORY_ID_KEY", str);
        int ordinal = chatStickerStickerType.ordinal();
        if (ordinal != 4) {
            if (ordinal != 6) {
                njJ = C69318NjJ.UNSPECIFIED;
            } else if (z) {
                njJ = C69318NjJ.MESSAGE_SHARE_STICKER_ATTRIBUTION;
            } else {
                njJ = C69318NjJ.MESSAGE_SHARE_STICKER;
            }
        } else if (z2) {
            njJ = C69318NjJ.CLIPS_CHAT_STICKER;
        } else {
            njJ = C69318NjJ.CHAT_STICKER;
        }
        A0a.putSerializable("GroupPreviewFragment.JOINING_SURFACE", njJ);
        A0a.putString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE", str2);
        NKN nkn = new NKN();
        nkn.setArguments(A0a);
        nkn.A0D = groupLinkPreviewResponse$Success;
        return nkn;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.NKN A00(android.os.Bundle r3, X.C74469PvP r4, com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r5) {
        /*
            X.NKN r1 = new X.NKN
            r1.<init>()
            java.lang.String r0 = "GroupPreviewFragment.INVITE_LINK_SOURCE_KEY"
            java.lang.String r2 = r3.getString(r0)
            if (r2 == 0) goto L_0x0014
            int r0 = r2.hashCode()
            switch(r0) {
                case -1711269324: goto L_0x006c;
                case -1362237225: goto L_0x0065;
                case -833802316: goto L_0x005a;
                case -443204946: goto L_0x004f;
                case -334510404: goto L_0x0044;
                case 100344454: goto L_0x0039;
                case 906349059: goto L_0x002e;
                case 1780466565: goto L_0x0023;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.NjJ r2 = X.C69318NjJ.UNSPECIFIED
        L_0x0016:
            java.lang.String r0 = "GroupPreviewFragment.JOINING_SURFACE"
            r3.putSerializable(r0, r2)
            r1.setArguments(r3)
            r1.A0C = r4
            r1.A0D = r5
            return r1
        L_0x0023:
            java.lang.String r0 = "note_chat"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.NjJ r2 = X.C69318NjJ.NOTE_CHAT
            goto L_0x0016
        L_0x002e:
            java.lang.String r0 = "channel_link_xma"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.NjJ r2 = X.C69318NjJ.INVITE_XMA
            goto L_0x0016
        L_0x0039:
            java.lang.String r0 = "inbox"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.NjJ r2 = X.C69318NjJ.INVITES_SECTION
            goto L_0x0016
        L_0x0044:
            java.lang.String r0 = "stories_netego"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.NjJ r2 = X.C69318NjJ.STORIES_NETEGO
            goto L_0x0016
        L_0x004f:
            java.lang.String r0 = "inbox_channel_invitation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.NjJ r2 = X.C69318NjJ.DISCOVERY_INVITES_SECTION
            goto L_0x0016
        L_0x005a:
            java.lang.String r0 = "channel_link_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.NjJ r2 = X.C69318NjJ.CHAT_STICKER
            goto L_0x0016
        L_0x0065:
            r0 = 93
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x006e
        L_0x006c:
            java.lang.String r0 = "channel_link_bottom_sheet"
        L_0x006e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.NjJ r2 = X.C69318NjJ.PROFILE
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71045OaN.A00(android.os.Bundle, X.PvP, com.instagram.direct.request.response.GroupLinkPreviewResponse$Success):X.NKN");
    }

    public static final NKN A01(C69318NjJ njJ, C74469PvP pvP, String str, String str2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("GroupPreviewFragment.GROUP_LINK_HASH", str);
        A0a.putSerializable("GroupPreviewFragment.JOINING_SURFACE", njJ);
        A0a.putString("GroupPreviewFragment.SC_INVITE_ID", str2);
        NKN nkn = new NKN();
        nkn.setArguments(A0a);
        nkn.A0C = pvP;
        return nkn;
    }

    public static final NKN A02(C69318NjJ njJ, C74469PvP pvP, String str, String str2, String str3) {
        AnonymousClass7TG.A1N(str, str2);
        NKN nkn = new NKN();
        nkn.A0C = pvP;
        DbT.A1N(nkn, AnonymousClass7TH.A0h("GroupPreviewFragment.JOINING_SURFACE", njJ, AnonymousClass7TE.A1L("GroupPreviewFragment.SC_INVITE_ID", str3), AnonymousClass7TE.A1L("GroupPreviewFragment.PINNED_SSC_THREAD_ID", str), AnonymousClass7TE.A1L("GroupPreviewFragment.FAN_CLUB_ID", str2)));
        return nkn;
    }
}
