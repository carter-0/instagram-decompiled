package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.audio.Audio;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public abstract class B5T {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: com.instagram.api.schemas.NoteBackgroundColor} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C279864zZ parseFromJson(X.16F r62) {
        /*
            r11 = 0
            r1 = r62
            X.0qQ.A0B(r1, r11)
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r32 = 0
            if (r2 == r0) goto L_0x0014
            r1.A0z()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            return r32
        L_0x0014:
            r31 = r32
            r19 = r32
            r44 = r32
            r18 = r32
            r33 = r32
            r30 = r32
            r35 = r32
            r17 = r32
            r29 = r32
            r15 = r32
            r45 = r15
            r28 = r15
            r46 = r15
            r27 = r15
            r26 = r15
            r39 = r15
            r25 = r15
            r36 = r15
            r16 = r15
            r38 = r15
            r40 = r15
            r41 = r15
            r47 = r15
            r48 = r15
            r43 = r15
            r42 = r15
            r49 = r15
        L_0x004a:
            X.16L r9 = r1.A1J()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r2 = X.16L.A09     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.String r24 = "user_id"
            java.lang.String r23 = "user"
            java.lang.String r22 = "text"
            java.lang.String r21 = "reactions"
            java.lang.String r20 = "note_style"
            java.lang.String r14 = "is_unseen"
            java.lang.String r13 = "is_emoji_only"
            java.lang.String r12 = "id"
            java.lang.String r10 = "has_translation"
            java.lang.String r8 = "font_style"
            java.lang.String r7 = "expires_at"
            java.lang.String r6 = "created_at"
            java.lang.String r5 = "can_reply"
            java.lang.String r4 = "background_color"
            java.lang.String r3 = "audience"
            java.lang.String r0 = "NoteResponse"
            if (r9 == r2) goto L_0x02e4
            java.lang.String r2 = r1.A0q()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r1.A1J()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            boolean r0 = r3.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x008b
            int r0 = r1.A1D()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Integer r32 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x0087:
            r1.A0z()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x004a
        L_0x008b:
            java.lang.String r0 = "audience_facepile_users"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x00b9
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x00b6
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r19.<init>()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x00a0:
            X.16L r2 = r1.A1J()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == r0) goto L_0x0087
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            com.instagram.user.model.User r2 = X.1aC.A00(r1, r11)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x00a0
            r0 = r19
            r0.add(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x00a0
        L_0x00b6:
            r19 = 0
            goto L_0x0087
        L_0x00b9:
            java.lang.String r0 = "audience_size"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x00ca
            int r0 = r1.A1D()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Integer r44 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x00ca:
            boolean r0 = r4.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x00ef
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x00da
            r0 = 0
            goto L_0x00de
        L_0x00da:
            java.lang.String r0 = r1.A1P()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x00de:
            java.util.Map r2 = com.instagram.api.schemas.NoteBackgroundColor.A01     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Object r18 = r2.get(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r0 = r18
            com.instagram.api.schemas.NoteBackgroundColor r0 = (com.instagram.api.schemas.NoteBackgroundColor) r0     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r18 = r0
            if (r0 != 0) goto L_0x0087
            com.instagram.api.schemas.NoteBackgroundColor r18 = com.instagram.api.schemas.NoteBackgroundColor.UNRECOGNIZED     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x00ef:
            boolean r0 = r5.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r1.A0d()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x00fe:
            java.lang.String r0 = "collab_note_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x010c
            X.60J r33 = X.C44103CVu.parseFromJson(r1)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x010c:
            boolean r0 = r6.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x011c
            long r2 = r1.A0y()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Long r30 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x011c:
            java.lang.String r0 = "custom_theme"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x012a
            com.instagram.api.schemas.NoteCustomThemeImpl r35 = X.C2809154s.parseFromJson(r1)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x012a:
            java.lang.String r0 = "e2ee_mentioned_user_list"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x0159
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x0155
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r17.<init>()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x013f:
            X.16L r2 = r1.A1J()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == r0) goto L_0x0087
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            com.instagram.user.model.User r2 = X.1aC.A00(r1, r11)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x013f
            r0 = r17
            r0.add(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x013f
        L_0x0155:
            r17 = 0
            goto L_0x0087
        L_0x0159:
            boolean r0 = r7.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x0169
            long r2 = r1.A0y()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Long r29 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x0169:
            boolean r0 = r8.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x018b
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x0179
            r0 = 0
            goto L_0x017d
        L_0x0179:
            java.lang.String r0 = r1.A1P()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x017d:
            java.util.Map r2 = com.instagram.api.schemas.NoteFontStyle.A01     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Object r15 = r2.get(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            com.instagram.api.schemas.NoteFontStyle r15 = (com.instagram.api.schemas.NoteFontStyle) r15     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r15 != 0) goto L_0x0087
            com.instagram.api.schemas.NoteFontStyle r15 = com.instagram.api.schemas.NoteFontStyle.UNRECOGNIZED     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x018b:
            java.lang.String r0 = "group_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x01a5
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x019f
            r45 = 0
            goto L_0x0087
        L_0x019f:
            java.lang.String r45 = r1.A1P()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x01a5:
            boolean r0 = r10.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r1.A0d()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x01b5:
            boolean r0 = r12.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x01cd
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x01c7
            r46 = 0
            goto L_0x0087
        L_0x01c7:
            java.lang.String r46 = r1.A1P()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x01cd:
            boolean r0 = r13.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x01dd
            boolean r0 = r1.A0d()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x01dd:
            boolean r0 = r14.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r1.A0d()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x01ed:
            java.lang.String r0 = "note_response_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x01fb
            X.5y2 r39 = X.B5U.parseFromJson(r1)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x01fb:
            r0 = r20
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x020d
            int r0 = r1.A1D()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x020d:
            java.lang.String r0 = "reaction_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x021b
            X.5y4 r36 = X.B5V.parseFromJson(r1)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x021b:
            r0 = r21
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x0248
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x0244
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r16.<init>()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x0230:
            X.16L r2 = r1.A1J()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == r0) goto L_0x0087
            com.instagram.api.schemas.NoteEmojiReactionInfo r2 = X.C45601CzD.parseFromJson(r1)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0230
            r0 = r16
            r0.add(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0230
        L_0x0244:
            r16 = 0
            goto L_0x0087
        L_0x0248:
            java.lang.String r0 = "reshare_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x0256
            X.60L r38 = X.Cb2.parseFromJson(r1)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x0256:
            java.lang.String r0 = "story_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x0264
            X.60N r40 = X.C44404CeO.parseFromJson(r1)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x0264:
            java.lang.String r0 = "target_profile"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x0274
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            com.instagram.user.model.User r41 = X.1aC.A00(r1, r11)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x0274:
            java.lang.String r0 = "target_profile_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x028e
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x0288
            r47 = 0
            goto L_0x0087
        L_0x0288:
            java.lang.String r47 = r1.A1P()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x028e:
            r0 = r22
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x02a8
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x02a2
            r48 = 0
            goto L_0x0087
        L_0x02a2:
            java.lang.String r48 = r1.A1P()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x02a8:
            java.lang.String r0 = "update_viewer_birthday_visibility"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x02ba
            boolean r0 = r1.A0d()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            java.lang.Boolean r43 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x02ba:
            r0 = r23
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x02ca
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            com.instagram.user.model.User r42 = X.1aC.A00(r1, r11)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x02ca:
            r0 = r24
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r0 == 0) goto L_0x0087
            X.16L r2 = r1.A11()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 != r0) goto L_0x02de
            r49 = 0
            goto L_0x0087
        L_0x02de:
            java.lang.String r49 = r1.A1P()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0087
        L_0x02e4:
            if (r32 != 0) goto L_0x02ef
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x02ef
            X.AnonymousClass7TF.A1L(r3, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x02ef:
            if (r18 != 0) goto L_0x02f3
            goto L_0x0381
        L_0x02f3:
            if (r31 != 0) goto L_0x02fe
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x02fe
            X.AnonymousClass7TF.A1L(r5, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x02fe:
            if (r30 != 0) goto L_0x0309
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0309
            X.AnonymousClass7TF.A1L(r6, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0309:
            if (r29 != 0) goto L_0x0313
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0313
            X.AnonymousClass7TF.A1L(r7, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0313:
            if (r15 != 0) goto L_0x031d
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x031d
            X.AnonymousClass7TF.A1L(r8, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x031d:
            if (r28 != 0) goto L_0x0327
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0327
            X.AnonymousClass7TF.A1L(r10, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0327:
            if (r46 != 0) goto L_0x0331
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0331
            X.AnonymousClass7TF.A1L(r12, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0331:
            if (r27 != 0) goto L_0x033b
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x033b
            X.AnonymousClass7TF.A1L(r13, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x033b:
            if (r26 != 0) goto L_0x0345
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0345
            X.AnonymousClass7TF.A1L(r14, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0345:
            if (r25 != 0) goto L_0x0351
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0351
            r2 = r20
            X.AnonymousClass7TF.A1L(r2, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0351:
            if (r16 != 0) goto L_0x035d
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x035d
            r2 = r21
            X.AnonymousClass7TF.A1L(r2, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x035d:
            if (r48 != 0) goto L_0x0369
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0369
            r2 = r22
            X.AnonymousClass7TF.A1L(r2, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0369:
            if (r42 != 0) goto L_0x0375
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x0375
            r2 = r23
            X.AnonymousClass7TF.A1L(r2, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0375:
            if (r49 != 0) goto L_0x038d
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x038d
            r2 = r24
            X.AnonymousClass7TF.A1L(r2, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            goto L_0x0388
        L_0x0381:
            boolean r2 = r1 instanceof X.0c9     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            if (r2 == 0) goto L_0x02f3
            X.AnonymousClass7TF.A1L(r4, r1, r0)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x0388:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            throw r0     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
        L_0x038d:
            int r53 = r32.intValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            boolean r59 = r31.booleanValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            long r55 = r30.longValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            long r57 = r29.longValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            boolean r60 = r28.booleanValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            boolean r61 = r27.booleanValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            boolean r62 = r26.booleanValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            int r54 = r25.intValue()     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            X.4zZ r32 = new X.4zZ     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            r34 = r18
            r37 = r15
            r50 = r19
            r51 = r17
            r52 = r16
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57, r59, r60, r61, r62)     // Catch:{ IOException -> 0x03c3, Exception -> 0x03bd }
            return r32
        L_0x03bd:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x03c3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5T.parseFromJson(X.16F):X.4zZ");
    }

    public static void A00(17Z r5, C279864zZ r6) {
        r5.A0c();
        r5.A0P("audience", r6.A00);
        List list = r6.A0L;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r5, "audience_facepile_users", list);
            while (A0s.hasNext()) {
                C41846B3n.A19(r5, A0s);
            }
            r5.A0Y();
        }
        Integer num = r6.A0F;
        if (num != null) {
            r5.A0P("audience_size", num.intValue());
        }
        NoteBackgroundColor noteBackgroundColor = r6.A05;
        if (noteBackgroundColor != null) {
            r5.A0R("background_color", noteBackgroundColor.A00);
        }
        r5.A0S("can_reply", r6.A0O);
        AnonymousClass60J r3 = r6.A04;
        if (r3 != null) {
            r5.A0q("collab_note_info");
            r5.A0c();
            List list2 = r3.A00;
            if (list2 != null) {
                Iterator A0s2 = C41845B3m.A0s(r5, "collaborators", list2);
                while (A0s2.hasNext()) {
                    BEK bek = (BEK) A0s2.next();
                    if (bek != null) {
                        r5.A0c();
                        r5.A0P("audience", bek.A00);
                        User user = bek.A01;
                        if (user != null) {
                            C41845B3m.A0w(r5, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                        }
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            List list3 = r3.A01;
            if (list3 != null) {
                Iterator A0s3 = C41845B3m.A0s(r5, "invitees", list3);
                while (A0s3.hasNext()) {
                    C41846B3n.A19(r5, A0s3);
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        r5.A0Q("created_at", r6.A02);
        NoteCustomThemeImpl noteCustomThemeImpl = r6.A06;
        if (noteCustomThemeImpl != null) {
            r5.A0q("custom_theme");
            C2809154s.A00(r5, noteCustomThemeImpl);
        }
        List list4 = r6.A0M;
        if (list4 != null) {
            Iterator A0s4 = C41845B3m.A0s(r5, "e2ee_mentioned_user_list", list4);
            while (A0s4.hasNext()) {
                C41846B3n.A19(r5, A0s4);
            }
            r5.A0Y();
        }
        r5.A0Q("expires_at", r6.A03);
        NoteFontStyle noteFontStyle = r6.A08;
        if (noteFontStyle != null) {
            r5.A0R("font_style", noteFontStyle.A00);
        }
        String str = r6.A0G;
        if (str != null) {
            r5.A0R("group_id", str);
        }
        r5.A0S("has_translation", r6.A0P);
        C41846B3n.A0y(r5, r6.A0H);
        r5.A0S("is_emoji_only", r6.A0Q);
        r5.A0S("is_unseen", r6.A0R);
        C300845y2 r2 = r6.A0A;
        if (r2 != null) {
            r5.A0q("note_response_info");
            r5.A0c();
            AudioNoteResponseInfo audioNoteResponseInfo = r2.A00;
            if (audioNoteResponseInfo != null) {
                r5.A0q("audio_note_response_info");
                r5.A0c();
                Audio audio = audioNoteResponseInfo.A00;
                if (audio != null) {
                    r5.A0q("audio_info");
                    C2610047w.A00(r5, audio);
                }
                String str2 = audioNoteResponseInfo.A01;
                if (str2 != null) {
                    r5.A0R("logging_id", str2);
                }
                r5.A0Z();
            }
            AvatarNoteResponseInfo avatarNoteResponseInfo = r2.A01;
            if (avatarNoteResponseInfo != null) {
                r5.A0q("avatar_note_response_info");
                AvatarNoteResponseInfoImpl F0i = avatarNoteResponseInfo.F0i();
                r5.A0c();
                MediaType mediaType = F0i.A00;
                if (mediaType != null) {
                    r5.A0R("avatar_sticker_media_type", mediaType.A00);
                }
                String str3 = F0i.A01;
                if (str3 != null) {
                    r5.A0R("avatar_sticker_template_id", str3);
                }
                String str4 = F0i.A02;
                if (str4 != null) {
                    r5.A0R("cdn_url", str4);
                }
                r5.A0Z();
            }
            GIFNoteResponseInfo gIFNoteResponseInfo = r2.A02;
            if (gIFNoteResponseInfo != null) {
                r5.A0q("gif_note_response_info");
                GIFNoteResponseInfoImpl F3I = gIFNoteResponseInfo.F3I();
                r5.A0c();
                CommentGiphyMediaInfo commentGiphyMediaInfo = F3I.A00;
                if (commentGiphyMediaInfo != null) {
                    r5.A0q("gif_info");
                    C45527Cy1.A00(r5, commentGiphyMediaInfo);
                }
                r5.A0Z();
            }
            AnonymousClass605 r1 = r2.A03;
            if (r1 != null) {
                C42043BEv F3W = r1.F3W(C41846B3n.A0T(r5, "group_note_response_info"));
                r5.A0c();
                List list5 = F3W.A02;
                if (list5 != null) {
                    Iterator A0s5 = C41845B3m.A0s(r5, "featured_user_list", list5);
                    while (A0s5.hasNext()) {
                        C41846B3n.A19(r5, A0s5);
                    }
                    r5.A0Y();
                }
                User user2 = F3W.A00;
                if (user2 != null) {
                    C41845B3m.A0w(r5, user2, "group");
                }
                Integer num2 = F3W.A01;
                if (num2 != null) {
                    r5.A0P("num_total_notes", num2.intValue());
                }
                r5.A0Z();
            }
            ListeningNowResponseInfo listeningNowResponseInfo = r2.A04;
            if (listeningNowResponseInfo != null) {
                r5.A0q("listening_now_response_info");
                r5.A0c();
                Boolean bool = listeningNowResponseInfo.A02;
                if (bool != null) {
                    r5.A0S("is_spotify_save_eligible", bool.booleanValue());
                }
                ListeningNowState listeningNowState = listeningNowResponseInfo.A00;
                if (listeningNowState != null) {
                    r5.A0R("listening_now_state", listeningNowState.A00);
                }
                MusicInfo musicInfo = listeningNowResponseInfo.A01;
                if (musicInfo != null) {
                    1dj.A00(r5, musicInfo.F6W(C41846B3n.A0T(r5, "music_info")));
                }
                Integer num3 = listeningNowResponseInfo.A03;
                if (num3 != null) {
                    r5.A0P("num_spotify_saves", num3.intValue());
                }
                r5.A0Z();
            }
            LiveNoteResponseInfo liveNoteResponseInfo = r2.A05;
            if (liveNoteResponseInfo != null) {
                r5.A0q("live_note_response_info");
                r5.A0c();
                List list6 = liveNoteResponseInfo.A01;
                if (list6 != null) {
                    Iterator A0s6 = C41845B3m.A0s(r5, "subscribed_users", list6);
                    while (A0s6.hasNext()) {
                        C41846B3n.A19(r5, A0s6);
                    }
                    r5.A0Y();
                }
                r5.A0Q("timer_end_timestamp", liveNoteResponseInfo.A00);
                r5.A0Z();
            }
            LocationNoteResponseInfo locationNoteResponseInfo = r2.A06;
            if (locationNoteResponseInfo != null) {
                r5.A0q("location_note_response_info");
                LocationNoteResponseInfoImpl F5d = locationNoteResponseInfo.F5d();
                r5.A0c();
                String str5 = F5d.A00;
                if (str5 != null) {
                    r5.A0R("location_id", str5);
                }
                String str6 = F5d.A01;
                if (str6 != null) {
                    r5.A0R("location_name", str6);
                }
                r5.A0Z();
            }
            MusicNoteResponseInfo musicNoteResponseInfo = r2.A07;
            if (musicNoteResponseInfo != null) {
                r5.A0q("music_note_response_info");
                r5.A0c();
                Boolean bool2 = musicNoteResponseInfo.A02;
                if (bool2 != null) {
                    r5.A0S("is_reshare_eligible", bool2.booleanValue());
                }
                Boolean bool3 = musicNoteResponseInfo.A03;
                if (bool3 != null) {
                    r5.A0S("is_spotify_save_eligible", bool3.booleanValue());
                }
                MusicInfo musicInfo2 = musicNoteResponseInfo.A00;
                if (musicInfo2 != null) {
                    1dj.A00(r5, musicInfo2.F6W(C41846B3n.A0T(r5, "music_info")));
                }
                Integer num4 = musicNoteResponseInfo.A04;
                if (num4 != null) {
                    r5.A0P("num_spotify_saves", num4.intValue());
                }
                User user3 = musicNoteResponseInfo.A01;
                if (user3 != null) {
                    C41845B3m.A0w(r5, user3, "original_author");
                }
                String str7 = musicNoteResponseInfo.A05;
                if (str7 != null) {
                    r5.A0R("selected_lyrics", str7);
                }
                r5.A0Z();
            }
            NoteChatResponseInfo noteChatResponseInfo = r2.A08;
            if (noteChatResponseInfo != null) {
                NoteChatResponseInfoImpl F6p = noteChatResponseInfo.F6p(C41846B3n.A0T(r5, "note_chat_response_info"));
                r5.A0c();
                String str8 = F6p.A02;
                if (str8 != null) {
                    r5.A0R("group_chat_hash", str8);
                }
                r5.A0S("is_member", F6p.A04);
                Integer num5 = F6p.A01;
                if (num5 != null) {
                    r5.A0P("last_num_members", num5.intValue());
                }
                r5.A0P("num_members", F6p.A00);
                List list7 = F6p.A03;
                if (list7 != null) {
                    Iterator A0s7 = C41845B3m.A0s(r5, "social_context_users", list7);
                    while (A0s7.hasNext()) {
                        C41846B3n.A19(r5, A0s7);
                    }
                    r5.A0Y();
                }
                r5.A0Z();
            }
            AnonymousClass60C r4 = r2.A09;
            if (r4 != null) {
                r5.A0q("note_pog_video_response_info");
                r5.A0c();
                NotePogImageDict notePogImageDict = r4.A00;
                if (notePogImageDict != null) {
                    r5.A0q("image_dict");
                    r5.A0c();
                    C41846B3n.A0y(r5, notePogImageDict.A00);
                    String str9 = notePogImageDict.A01;
                    if (str9 != null) {
                        r5.A0R("image_url", str9);
                    }
                    String str10 = notePogImageDict.A02;
                    if (str10 != null) {
                        r5.A0R("pk", str10);
                    }
                    r5.A0Z();
                }
                NotePogVideoDict notePogVideoDict = r4.A01;
                if (notePogVideoDict != null) {
                    r5.A0q("video_dict");
                    r5.A0c();
                    C41846B3n.A0y(r5, notePogVideoDict.A01);
                    C41847B3o.A1J(r5, notePogVideoDict.A00);
                    String str11 = notePogVideoDict.A02;
                    if (str11 != null) {
                        r5.A0R("pk", str11);
                    }
                    List list8 = notePogVideoDict.A03;
                    if (list8 != null) {
                        Iterator A0s8 = C41845B3m.A0s(r5, "video_versions", list8);
                        while (A0s8.hasNext()) {
                            VideoVersion videoVersion = (VideoVersion) A0s8.next();
                            if (videoVersion != null) {
                                1rY.A00(r5, videoVersion);
                            }
                        }
                        r5.A0Y();
                    }
                    r5.A0Z();
                }
                r5.A0Z();
            }
            AnonymousClass60E r12 = r2.A0A;
            if (r12 != null) {
                r5.A0q("presence_note_response_info");
                C42065BFs F7g = r12.F7g();
                r5.A0c();
                String str12 = F7g.A00;
                if (str12 != null) {
                    r5.A0R("presence_id", str12);
                }
                r5.A0Z();
            }
            AnonymousClass60F r32 = r2.A0B;
            if (r32 != null) {
                r5.A0q("prompt_pog_response_info");
                r5.A0c();
                List list9 = r32.A04;
                if (list9 != null) {
                    Iterator A0s9 = C41845B3m.A0s(r5, "facepile_users", list9);
                    while (A0s9.hasNext()) {
                        C41846B3n.A19(r5, A0s9);
                    }
                    r5.A0Y();
                }
                Integer num6 = r32.A01;
                if (num6 != null) {
                    r5.A0P("num_items", num6.intValue());
                }
                String str13 = r32.A02;
                if (str13 != null) {
                    r5.A0R("prompt_id", str13);
                }
                String str14 = r32.A03;
                if (str14 != null) {
                    r5.A0R("prompt_text", str14);
                }
                Boolean bool4 = r32.A00;
                if (bool4 != null) {
                    r5.A0S("should_show_unseen_response_indicator", bool4.booleanValue());
                }
                r5.A0Z();
            }
            AnonymousClass60H r13 = r2.A0C;
            if (r13 != null) {
                r5.A0q("prompt_reply_note_response_info");
                r5.A0c();
                String str15 = r13.A00;
                if (str15 != null) {
                    r5.A0R("prompt_text", str15);
                }
                r5.A0Z();
            }
            r5.A0Z();
        }
        r5.A0P("note_style", r6.A01);
        C300865y4 r33 = r6.A07;
        if (r33 != null) {
            r5.A0q("reaction_info");
            r5.A0c();
            C276104sZ r22 = r33.A00;
            if (r22 != null) {
                r5.A0q("paging_info");
                r5.A0c();
                String str16 = r22.A00;
                if (str16 != null) {
                    r5.A0R("max_id", str16);
                }
                r5.A0S("more_available", r22.A01);
                r5.A0Z();
            }
            List list10 = r33.A01;
            if (list10 != null) {
                Iterator A0s10 = C41845B3m.A0s(r5, "reactions", list10);
                while (A0s10.hasNext()) {
                    NoteEmojiReactionInfo noteEmojiReactionInfo = (NoteEmojiReactionInfo) A0s10.next();
                    if (noteEmojiReactionInfo != null) {
                        C45601CzD.A00(r5, noteEmojiReactionInfo);
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        List list11 = r6.A0N;
        if (list11 != null) {
            Iterator A0s11 = C41845B3m.A0s(r5, "reactions", list11);
            while (A0s11.hasNext()) {
                NoteEmojiReactionInfo noteEmojiReactionInfo2 = (NoteEmojiReactionInfo) A0s11.next();
                if (noteEmojiReactionInfo2 != null) {
                    C45601CzD.A00(r5, noteEmojiReactionInfo2);
                }
            }
            r5.A0Y();
        }
        AnonymousClass60L r14 = r6.A09;
        if (r14 != null) {
            r5.A0q("reshare_info");
            r5.A0c();
            List list12 = r14.A00;
            if (list12 != null) {
                Iterator A0s12 = C41845B3m.A0s(r5, "resharers", list12);
                while (A0s12.hasNext()) {
                    C41846B3n.A19(r5, A0s12);
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        AnonymousClass60N r34 = r6.A0B;
        if (r34 != null) {
            r5.A0q("story_info");
            r5.A0c();
            Boolean bool5 = r34.A00;
            if (bool5 != null) {
                r5.A0S("is_bestie", bool5.booleanValue());
            }
            Long l = r34.A02;
            if (l != null) {
                r5.A0Q("latest_reel_media", l.longValue());
            }
            Float f = r34.A01;
            if (f != null) {
                r5.A0O("story_seen_time", f.floatValue());
            }
            String str17 = r34.A03;
            if (str17 != null) {
                r5.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str17);
            }
            r5.A0Z();
        }
        User user4 = r6.A0C;
        if (user4 != null) {
            C41845B3m.A0w(r5, user4, "target_profile");
        }
        String str18 = r6.A0I;
        if (str18 != null) {
            r5.A0R("target_profile_id", str18);
        }
        C41846B3n.A0z(r5, r6.A0J);
        Boolean bool6 = r6.A0E;
        if (bool6 != null) {
            r5.A0S("update_viewer_birthday_visibility", bool6.booleanValue());
        }
        User user5 = r6.A0D;
        if (user5 != null) {
            C41845B3m.A0w(r5, user5, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        String str19 = r6.A0K;
        if (str19 != null) {
            r5.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str19);
        }
        r5.A0Z();
    }
}
