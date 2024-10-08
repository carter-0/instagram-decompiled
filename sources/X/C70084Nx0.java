package X;

import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nx0  reason: case insensitive filesystem */
public abstract class C70084Nx0 {
    public static SendMentionData$MentionData parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            SendMentionData$MentionData sendMentionData$MentionData = new SendMentionData$MentionData();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("mentioned_entity_list".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            MentionedEntity parseFromJson = C277314us.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    sendMentionData$MentionData.A00 = arrayList;
                }
                r5.A0z();
            }
            return sendMentionData$MentionData;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
