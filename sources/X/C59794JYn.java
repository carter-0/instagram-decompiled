package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.JYn  reason: case insensitive filesystem */
public final class C59794JYn {
    public MediaUploadMetadata A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C59794JYn(AnonymousClass3Q2 r1) {
        this();
        this.A01 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.LBT, java.lang.Object] */
    public static LBT A00(C279294yP r15, AnonymousClass9J6 r16, C61069Jw7 jw7, BrandedContentGatingInfo brandedContentGatingInfo, BrandedContentProjectMetadata brandedContentProjectMetadata, C272044k0 r20, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, MediaUploadMetadata mediaUploadMetadata, AnonymousClass3QO r23, InstagramAudioApplySource instagramAudioApplySource, MusicOverlayStickerModel musicOverlayStickerModel, BrandedContentTag brandedContentTag, ClipInfo clipInfo, C273884nL r28, C63739L4x l4x, AnonymousClass3QG r30, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HashMap hashMap, HashMap hashMap2, List list, List list2, List list3, double d, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ? obj = new Object();
        obj.A0I = new AnonymousClass3QG();
        obj.A0M = false;
        obj.A0A = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        obj.A04 = C279294yP.NONE;
        obj.A0Q = str3;
        obj.A08 = r20;
        obj.A03 = i3;
        obj.A0a = list2;
        obj.A0F = clipInfo;
        obj.A00 = d;
        obj.A0g = z3;
        obj.A0k = z6;
        obj.A0I = r30;
        obj.A0B = r23;
        obj.A0f = z2;
        obj.A0G = r28;
        obj.A0X = hashMap;
        obj.A0h = z4;
        obj.A0R = str4;
        obj.A0J = bool;
        obj.A0E = brandedContentTag;
        obj.A0Z = list;
        obj.A06 = brandedContentGatingInfo;
        obj.A07 = brandedContentProjectMetadata;
        obj.A0j = z7;
        obj.A0e = z;
        obj.A0Y = hashMap2;
        obj.A0W = str9;
        obj.A02 = i2;
        obj.A01 = i;
        obj.A0P = str2;
        obj.A0D = musicOverlayStickerModel;
        obj.A05 = r16;
        obj.A0M = bool4;
        obj.A0T = str6;
        obj.A0L = bool3;
        obj.A0O = str;
        obj.A0C = instagramAudioApplySource;
        obj.A0U = str7;
        C61069Jw7 jw72 = jw7;
        if (jw7 != null) {
            obj.A0d = (List) jw72.A01;
            obj.A0N = (Integer) jw72.A02;
            obj.A0c = (List) jw72.A00;
        }
        obj.A0i = z5;
        obj.A0V = str8;
        obj.A0S = str5;
        obj.A0A = mediaUploadMetadata;
        obj.A0b = list3;
        obj.A09 = mediaGenAIDetectionMethod;
        obj.A0H = l4x;
        obj.A0K = bool2;
        obj.A04 = r15;
        return obj;
    }

    public C59794JYn() {
        this.A00 = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
