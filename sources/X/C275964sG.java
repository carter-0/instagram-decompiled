package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.RIXUActionSource;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.RIXUPlayType;
import com.instagram.api.schemas.RIXUTextLinkImpl;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4sG  reason: invalid class name and case insensitive filesystem */
public abstract class C275964sG {
    public static C276124sb parseFromJson(16F r45) {
        String str;
        String A1P;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        16F r13 = r45;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            RIXUActionSource rIXUActionSource = null;
            C61079JwH jwH = null;
            RIXUAspectRatio rIXUAspectRatio = null;
            Boolean bool = null;
            C376559Il r15 = null;
            ArrayList arrayList = null;
            ClipsIFUType clipsIFUType = null;
            C61074JwC jwC = null;
            RIXUCtaType rIXUCtaType = null;
            Boolean bool2 = null;
            Integer num = null;
            Boolean bool3 = null;
            String str9 = null;
            Boolean bool4 = null;
            C250533lb r20 = null;
            RIXUCoverSize rIXUCoverSize = null;
            RIXULayoutFormat rIXULayoutFormat = null;
            RIXULayoutStyle rIXULayoutStyle = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            Integer num2 = null;
            Boolean bool5 = null;
            C276104sZ r19 = null;
            Boolean bool6 = null;
            RIXUPlayType rIXUPlayType = null;
            Boolean bool7 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Boolean bool8 = null;
            Integer num3 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("action_source".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r13.A1P();
                    }
                    rIXUActionSource = (RIXUActionSource) RIXUActionSource.A01.get(str8);
                    if (rIXUActionSource == null) {
                        rIXUActionSource = RIXUActionSource.UNRECOGNIZED;
                    }
                } else if ("additional_cover_cta".equals(A0q)) {
                    jwH = C63025KqG.parseFromJson(r13);
                } else if ("aspect_ratio".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r13.A1P();
                    }
                    rIXUAspectRatio = (RIXUAspectRatio) RIXUAspectRatio.A01.get(str7);
                    if (rIXUAspectRatio == null) {
                        rIXUAspectRatio = RIXUAspectRatio.UNRECOGNIZED;
                    }
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("chaining_behavior_definition".equals(A0q)) {
                    r15 = C276084sV.parseFromJson(r13);
                } else if ("clips".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            C276014sL parseFromJson = C275974sH.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("clips_ifu_type".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                    clipsIFUType = (ClipsIFUType) ClipsIFUType.A01.get(str6);
                    if (clipsIFUType == null) {
                        clipsIFUType = ClipsIFUType.UNRECOGNIZED;
                    }
                } else if ("cover_definition".equals(A0q)) {
                    jwC = C63026KqH.parseFromJson(r13);
                } else if ("cta_type".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                    rIXUCtaType = (RIXUCtaType) RIXUCtaType.A01.get(str5);
                    if (rIXUCtaType == null) {
                        rIXUCtaType = RIXUCtaType.UNRECOGNIZED;
                    }
                } else if ("disable_chaining".equals(A0q)) {
                    bool2 = Boolean.valueOf(r13.A0d());
                } else if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(r13.A1D());
                } else if ("hide_unit_if_seen".equals(A0q)) {
                    bool3 = Boolean.valueOf(r13.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r13.A1P();
                    }
                } else if ("is_from_bloks".equals(A0q)) {
                    bool4 = Boolean.valueOf(r13.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r20 = C250523la.parseFromJson(r13);
                } else if ("layout_cover_size".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                    rIXUCoverSize = (RIXUCoverSize) RIXUCoverSize.A01.get(str4);
                    if (rIXUCoverSize == null) {
                        rIXUCoverSize = RIXUCoverSize.UNRECOGNIZED;
                    }
                } else if ("layout_format".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                    rIXULayoutFormat = (RIXULayoutFormat) RIXULayoutFormat.A01.get(str3);
                    if (rIXULayoutFormat == null) {
                        rIXULayoutFormat = RIXULayoutFormat.UNRECOGNIZED;
                    }
                } else if ("layout_style".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                    rIXULayoutStyle = (RIXULayoutStyle) RIXULayoutStyle.A01.get(str2);
                    if (rIXULayoutStyle == null) {
                        rIXULayoutStyle = RIXULayoutStyle.UNRECOGNIZED;
                    }
                } else if ("links".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            RIXUTextLinkImpl parseFromJson2 = C44298Ccg.parseFromJson(r13);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("medias_to_render".equals(A0q)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r13.A1J() != 16L.A08) {
                            if (!(r13.A11() == 16L.A0G || (A1P = r13.A1P()) == null)) {
                                arrayList3.add(A1P);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("netego_subtype".equals(A0q)) {
                    num2 = Integer.valueOf(r13.A1D());
                } else if ("netego_unit".equals(A0q)) {
                    bool5 = Boolean.valueOf(r13.A0d());
                } else if ("paging_info".equals(A0q)) {
                    r19 = C276094sY.parseFromJson(r13);
                } else if ("play_preview_only_wifi".equals(A0q)) {
                    bool6 = Boolean.valueOf(r13.A0d());
                } else if ("play_type".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    rIXUPlayType = (RIXUPlayType) RIXUPlayType.A01.get(str);
                    if (rIXUPlayType == null) {
                        rIXUPlayType = RIXUPlayType.UNRECOGNIZED;
                    }
                } else if ("show_tab_upsell_on_last_item".equals(A0q)) {
                    bool7 = Boolean.valueOf(r13.A0d());
                } else if ("subtitle".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r13.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r13.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r13.A1P();
                    }
                } else if ("uses_multiple_songs".equals(A0q)) {
                    bool8 = Boolean.valueOf(r13.A0d());
                } else if ("view_state_item_type".equals(A0q)) {
                    num3 = Integer.valueOf(r13.A1D());
                }
                r13.A0z();
            }
            return new C276124sb(r15, jwC, jwH, clipsIFUType, r19, r20, rIXUActionSource, rIXUAspectRatio, rIXUCoverSize, rIXUCtaType, rIXULayoutFormat, rIXULayoutStyle, rIXUPlayType, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, num, num2, num3, str9, str10, str11, str12, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
