package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.CreatorViewerInsightInfo;
import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalDetails;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalInfo;
import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.CreatorViewerSignalModelImpl;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalType;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfoImpl;
import com.instagram.api.schemas.FormattedString;
import com.instagram.api.schemas.FormattedStringImpl;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CyB  reason: case insensitive filesystem */
public abstract class C45537CyB {
    public static BEV parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            CreatorViewerBottomCTAImpl creatorViewerBottomCTAImpl = null;
            ArrayList arrayList = null;
            CreatorViewerContextCTAImpl creatorViewerContextCTAImpl = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("bottom_cta".equals(A17)) {
                    creatorViewerBottomCTAImpl = C44113CWe.parseFromJson(r13);
                } else if ("bottom_cta_list".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            CreatorViewerBottomCTAImpl parseFromJson = C44113CWe.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("context_cta".equals(A17)) {
                    creatorViewerContextCTAImpl = C44115CWg.parseFromJson(r13);
                } else if ("signal_with_insights_list".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            CreatorViewerSignalWithInsightsInfoImpl parseFromJson2 = C44134CWz.parseFromJson(r13);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("signals".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            CreatorViewerSignalModelImpl parseFromJson3 = C44128CWt.parseFromJson(r13);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (arrayList == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("bottom_cta_list", r13, "CreatorViewerInsightV2Impl");
            } else if (arrayList2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("signal_with_insights_list", r13, "CreatorViewerInsightV2Impl");
            } else if (arrayList3 != null || !(r13 instanceof 0c9)) {
                return new BEV(creatorViewerBottomCTAImpl, creatorViewerContextCTAImpl, str, arrayList, arrayList2, arrayList3);
            } else {
                AnonymousClass7TF.A1L("signals", r13, "CreatorViewerInsightV2Impl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r7, BEV bev) {
        r7.A0c();
        CreatorViewerBottomCTA creatorViewerBottomCTA = bev.A00;
        if (creatorViewerBottomCTA != null) {
            r7.A0q("bottom_cta");
            CreatorViewerBottomCTAImpl F2J = creatorViewerBottomCTA.F2J();
            r7.A0c();
            CreatorViewerBottomCTAType creatorViewerBottomCTAType = F2J.A00;
            if (creatorViewerBottomCTAType != null) {
                r7.A0R("bottom_cta_type", creatorViewerBottomCTAType.A00);
            }
            C41846B3n.A0z(r7, F2J.A01);
            r7.A0Z();
        }
        List list = bev.A03;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r7, "bottom_cta_list", list);
            while (A0s.hasNext()) {
                CreatorViewerBottomCTA creatorViewerBottomCTA2 = (CreatorViewerBottomCTA) A0s.next();
                if (creatorViewerBottomCTA2 != null) {
                    CreatorViewerBottomCTAImpl F2J2 = creatorViewerBottomCTA2.F2J();
                    r7.A0c();
                    CreatorViewerBottomCTAType creatorViewerBottomCTAType2 = F2J2.A00;
                    if (creatorViewerBottomCTAType2 != null) {
                        r7.A0R("bottom_cta_type", creatorViewerBottomCTAType2.A00);
                    }
                    C41846B3n.A0z(r7, F2J2.A01);
                    r7.A0Z();
                }
            }
            r7.A0Y();
        }
        CreatorViewerContextCTA creatorViewerContextCTA = bev.A01;
        if (creatorViewerContextCTA != null) {
            r7.A0q("context_cta");
            CreatorViewerContextCTAImpl F2K = creatorViewerContextCTA.F2K();
            r7.A0c();
            CreatorViewerContextCTAType creatorViewerContextCTAType = F2K.A01;
            if (creatorViewerContextCTAType != null) {
                r7.A0R("context_cta_type", creatorViewerContextCTAType.A00);
            }
            CreatorViewerContextCTATarget creatorViewerContextCTATarget = F2K.A00;
            if (creatorViewerContextCTATarget != null) {
                r7.A0R("cta_target", creatorViewerContextCTATarget.A00);
            }
            FormattedString formattedString = F2K.A02;
            if (formattedString != null) {
                r7.A0q("extended_text");
                FormattedStringImpl F3F = formattedString.F3F();
                r7.A0c();
                C41846B3n.A0z(r7, F3F.A00);
                r7.A0Z();
            }
            String str = F2K.A03;
            if (str != null) {
                r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str);
            }
            C41846B3n.A0z(r7, F2K.A04);
            r7.A0Z();
        }
        List list2 = bev.A04;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r7, "signal_with_insights_list", list2);
            while (A0s2.hasNext()) {
                CreatorViewerSignalWithInsightsInfo creatorViewerSignalWithInsightsInfo = (CreatorViewerSignalWithInsightsInfo) A0s2.next();
                if (creatorViewerSignalWithInsightsInfo != null) {
                    CreatorViewerSignalWithInsightsInfoImpl F2Y = creatorViewerSignalWithInsightsInfo.F2Y();
                    r7.A0c();
                    String str2 = F2Y.A01;
                    if (str2 != null) {
                        r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str2);
                    }
                    String str3 = F2Y.A02;
                    if (str3 != null) {
                        r7.A0R("image", str3);
                    }
                    List list3 = F2Y.A03;
                    if (list3 != null) {
                        Iterator A0s3 = C41845B3m.A0s(r7, "insights", list3);
                        while (A0s3.hasNext()) {
                            CreatorViewerInsightInfo creatorViewerInsightInfo = (CreatorViewerInsightInfo) A0s3.next();
                            if (creatorViewerInsightInfo != null) {
                                CreatorViewerInsightInfoImpl F2M = creatorViewerInsightInfo.F2M();
                                r7.A0c();
                                FormattedString formattedString2 = F2M.A01;
                                if (formattedString2 != null) {
                                    r7.A0q("formatted_text");
                                    FormattedStringImpl F3F2 = formattedString2.F3F();
                                    r7.A0c();
                                    C41846B3n.A0z(r7, F3F2.A00);
                                    r7.A0Z();
                                }
                                CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2 = F2M.A00;
                                if (creatorViewerInsightTypeV2 != null) {
                                    r7.A0R("insight_type_v2", creatorViewerInsightTypeV2.A00);
                                }
                                C41846B3n.A0z(r7, F2M.A02);
                                r7.A0Z();
                            }
                        }
                        r7.A0Y();
                    }
                    CreatorViewerSignalInfo creatorViewerSignalInfo = F2Y.A00;
                    if (creatorViewerSignalInfo != null) {
                        r7.A0q("signal");
                        CreatorViewerSignalInfoImpl F2T = creatorViewerSignalInfo.F2T();
                        r7.A0c();
                        CreatorViewerSignalType creatorViewerSignalType = F2T.A00;
                        if (creatorViewerSignalType != null) {
                            r7.A0R("signal_type", creatorViewerSignalType.A00);
                        }
                        C41846B3n.A0z(r7, F2T.A01);
                        r7.A0Z();
                    }
                    r7.A0Z();
                }
            }
            r7.A0Y();
        }
        List list4 = bev.A05;
        if (list4 != null) {
            Iterator A0s4 = C41845B3m.A0s(r7, "signals", list4);
            while (A0s4.hasNext()) {
                CreatorViewerSignalModel creatorViewerSignalModel = (CreatorViewerSignalModel) A0s4.next();
                if (creatorViewerSignalModel != null) {
                    CreatorViewerSignalModelImpl F2V = creatorViewerSignalModel.F2V(new 1hu((UserSession) null));
                    r7.A0c();
                    CreatorViewerSignalDetails creatorViewerSignalDetails = F2V.A00;
                    if (creatorViewerSignalDetails != null) {
                        r7.A0q("details");
                        CreatorViewerSignalDetailsImpl F2S = creatorViewerSignalDetails.F2S(new 1hu((UserSession) null));
                        r7.A0c();
                        CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails = F2S.A00;
                        if (creatorViewerSignalAudioDetails != null) {
                            r7.A0q("audio_details");
                            CreatorViewerSignalAudioDetailsImpl F2Q = creatorViewerSignalAudioDetails.F2Q(new 1hu((UserSession) null));
                            r7.A0c();
                            TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = F2Q.A01;
                            if (trackOrOriginalSoundSchema != null) {
                                r7.A0q("audio_info");
                                r7.A0c();
                                TrackMetadata trackMetadata = trackOrOriginalSoundSchema.A02;
                                if (trackMetadata != null) {
                                    r7.A0q("metadata");
                                    D0F.A00(r7, trackMetadata.FCw());
                                }
                                OriginalSoundData originalSoundData = trackOrOriginalSoundSchema.A00;
                                if (originalSoundData != null) {
                                    r7.A0q("original_sound");
                                    1dk.A00(r7, originalSoundData);
                                }
                                TrackData trackData = trackOrOriginalSoundSchema.A01;
                                if (trackData != null) {
                                    r7.A0q("track");
                                    AnonymousClass3UP.A00(r7, trackData.FCv());
                                }
                                r7.A0Z();
                            }
                            FormattedString formattedString3 = F2Q.A00;
                            if (formattedString3 != null) {
                                r7.A0q("subtitle");
                                FormattedStringImpl F3F3 = formattedString3.F3F();
                                r7.A0c();
                                C41846B3n.A0z(r7, F3F3.A00);
                                r7.A0Z();
                            }
                            r7.A0Z();
                        }
                        CreatorViewerSignalPlainDetails creatorViewerSignalPlainDetails = F2S.A01;
                        if (creatorViewerSignalPlainDetails != null) {
                            r7.A0q("plain_details");
                            CreatorViewerSignalPlainDetailsImpl F2W = creatorViewerSignalPlainDetails.F2W();
                            r7.A0c();
                            String str4 = F2W.A01;
                            if (str4 != null) {
                                r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str4);
                            }
                            FormattedString formattedString4 = F2W.A00;
                            if (formattedString4 != null) {
                                r7.A0q("subtitle");
                                FormattedStringImpl F3F4 = formattedString4.F3F();
                                r7.A0c();
                                C41846B3n.A0z(r7, F3F4.A00);
                                r7.A0Z();
                            }
                            r7.A0Z();
                        }
                        CreatorViewerSignalReelsTextDetails creatorViewerSignalReelsTextDetails = F2S.A02;
                        if (creatorViewerSignalReelsTextDetails != null) {
                            r7.A0q("reels_text_details");
                            CreatorViewerSignalReelsTextDetailsImpl F2X = creatorViewerSignalReelsTextDetails.F2X();
                            r7.A0c();
                            FormattedString formattedString5 = F2X.A01;
                            if (formattedString5 != null) {
                                r7.A0q("subtitle");
                                FormattedStringImpl F3F5 = formattedString5.F3F();
                                r7.A0c();
                                C41846B3n.A0z(r7, F3F5.A00);
                                r7.A0Z();
                            }
                            ClipsTextFormatType clipsTextFormatType = F2X.A00;
                            if (clipsTextFormatType != null) {
                                r7.A0R("text_format_type", clipsTextFormatType.A00);
                            }
                            r7.A0Z();
                        }
                        r7.A0Z();
                    }
                    InspirationSignalType inspirationSignalType = F2V.A01;
                    if (inspirationSignalType != null) {
                        r7.A0R("signal_type", inspirationSignalType.A00);
                    }
                    C41846B3n.A10(r7, F2V.A02);
                    r7.A0Z();
                }
            }
            r7.A0Y();
        }
        C41846B3n.A10(r7, bev.A02);
        r7.A0Z();
    }
}
