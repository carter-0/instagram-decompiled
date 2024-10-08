package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.Collection;
import com.instagram.direct.armadilloexpress.transportpayload.Link;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class OZ8 {
    public static final OZ8 A00 = new Object();

    public static final void A00(Media media, Set set) {
        String str;
        int i = media.mediaCase_;
        boolean z = true;
        if (i == 1) {
            str = "PHOTO";
        } else if (i == 5) {
            str = "GIF";
        } else if (i == 3) {
            str = "VIDEO";
        } else {
            if (i != 2) {
                z = false;
            }
            if (z) {
                set.add("AUDIO");
                set.add("EPHEMERAL");
                return;
            } else if (i == 4) {
                set.add("RAVEN");
                set.add("EPHEMERAL");
                int ordinal = media.A0M().A0L().ordinal();
                if (ordinal == 1) {
                    str = "RAVEN_READ_ONCE";
                } else if (ordinal == 2) {
                    str = "RAVEN_REPLAYABLE";
                } else if (ordinal == 3) {
                    str = "RAVEN_PERMANENT";
                } else if (ordinal != 0) {
                    throw AnonymousClass7TE.A1K();
                } else {
                    return;
                }
            } else if (i == 6) {
                str = "SHARE_LINK";
            } else {
                return;
            }
        }
        set.add(str);
    }

    public final List A01(AddMessagePayload addMessagePayload, int i) {
        Integer num;
        String str;
        Collection collection;
        Link link;
        LinkedHashSet A0y = DbS.A0y();
        if (addMessagePayload != null) {
            AddMessageContent addMessageContent = addMessagePayload.content_;
            if (addMessageContent == null) {
                addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
            }
            0qQ.A07(addMessageContent);
            int intValue = addMessageContent.A0O().intValue();
            if (intValue == 4) {
                Media A0L = addMessageContent.A0L();
                0qQ.A07(A0L);
                A00(A0L, A0y);
            } else if (intValue == 6) {
                if (addMessageContent.addMessageContentCase_ == 7) {
                    collection = (Collection) addMessageContent.addMessageContent_;
                } else {
                    collection = Collection.DEFAULT_INSTANCE;
                }
                0qQ.A07(collection);
                if (collection.media_.size() > 0) {
                    for (Media media : collection.media_) {
                        0qQ.A0A(media);
                        A00(media, A0y);
                    }
                }
            } else if (intValue == 2) {
                if (addMessageContent.addMessageContentCase_ == 3) {
                    link = (Link) addMessageContent.addMessageContent_;
                } else {
                    link = Link.DEFAULT_INSTANCE;
                }
                0qQ.A07(link);
                if ((link.bitField0_ & 2) != 0) {
                    A0y.add("SHARE_LINK");
                }
            } else if (intValue == 3) {
                ReceiverFetchXma A0M = addMessageContent.A0M();
                0qQ.A07(A0M);
                if ((A0M.bitField0_ & 1) != 0) {
                    try {
                        JSONObject A17 = C66580MXl.A17(A0M.contentRef_);
                        C69421Nl3 nl3 = (C69421Nl3) EnumHelper.A00(A17.optString(TraceFieldType.ContentType), C69421Nl3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        0qQ.A07(nl3);
                        int ordinal = nl3.ordinal();
                        String str2 = "SHARE_LINK";
                        if (ordinal == 4) {
                            A0y.add("SHARE_IG_MEDIA");
                            A0y.add(str2);
                            str2 = "SHARE_IG_CLIPS";
                        } else if (ordinal == 5) {
                            A0y.add("SHARE_IG_MEDIA");
                        } else if (ordinal != 3) {
                            if (ordinal == 2 || ordinal == 11) {
                                str2 = "STORY_REPLY";
                            }
                        }
                        A0y.add(str2);
                    } catch (JSONException e) {
                        0KC.A0H("ArmadilloExpressProtoTransportTagProcessor", "cannot parse incoming json", e);
                    }
                }
            }
            AddMessageMetadata addMessageMetadata = addMessagePayload.metadata_;
            if (addMessageMetadata == null) {
                addMessageMetadata = AddMessageMetadata.DEFAULT_INSTANCE;
            }
            0qQ.A07(addMessageMetadata);
        }
        if (i != 1) {
            if (i == 2) {
                num = AnonymousClass05K.A07;
            }
            return 00k.A0a(A0y);
        }
        num = AnonymousClass05K.A05;
        switch (num.intValue()) {
            case 13:
                str = "SHH";
                break;
            case 14:
                str = "STORY_REPLY";
                break;
            default:
                str = "DISAPPEARING_MESSAGE";
                break;
        }
        A0y.add(str);
        return 00k.A0a(A0y);
    }
}
