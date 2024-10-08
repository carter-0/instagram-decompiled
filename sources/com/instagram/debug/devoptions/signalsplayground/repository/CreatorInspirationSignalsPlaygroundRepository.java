package com.instagram.debug.devoptions.signalsplayground.repository;

import X.02z;
import X.05G;
import X.106;
import X.1vm;
import X.AnonymousClass000;
import X.AnonymousClass0Ud;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16181Uq6;
import X.C59702JUj;
import X.LT9;
import android.net.Uri;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundRepository {
    public final 05G _signalDetailsState;
    public final 05G _signalRecommendationsState;
    public final 05G _signalsState;
    public final CreatorInspirationSignalsPlaygroundDataSource dataSource;
    public final AnonymousClass0Ud signalDetailsState;
    public final AnonymousClass0Ud signalRecommendationsState;
    public final AnonymousClass0Ud signalsState;
    public final UserSession userSession;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreatorInspirationSignalsPlaygroundRepository(UserSession userSession2, CreatorInspirationSignalsPlaygroundDataSource creatorInspirationSignalsPlaygroundDataSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession2, (i & 2) != 0 ? new CreatorInspirationSignalsPlaygroundDataSource(userSession2, 1vm.A01(userSession2)) : creatorInspirationSignalsPlaygroundDataSource);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalDetails$1, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchSignalDetails(java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalDetails$1
            if (r0 == 0) goto L_0x00c2
            r3 = r10
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalDetails$1 r3 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalDetails$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c2
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r2 = r3.result
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.label
            r5 = 1
            if (r0 == 0) goto L_0x00ae
            if (r0 != r5) goto L_0x00ef
            java.lang.Object r9 = r3.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r4 = r3.L$0
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository r4 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository) r4
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00e6
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r3 = r2.A00
            X.3JC r3 = (X.AnonymousClass3JC) r3
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r0 = r4.userSession
            X.17i r1 = X.17h.A00(r0)
            com.instagram.common.session.UserSession r0 = r4.userSession
            java.lang.String r0 = r0.A06
            com.instagram.user.model.User r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x005b
            r1 = 2131957086(0x7f13155e, float:1.9550746E38)
            com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserHeader r0 = new com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserHeader
            r0.<init>(r1)
            r6.add(r0)
            com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserItem r0 = new com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserItem
            r0.<init>(r2)
            r6.add(r0)
        L_0x005b:
            r1 = 2131957098(0x7f13156a, float:1.955077E38)
            com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserHeader r0 = new com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserHeader
            r0.<init>(r1)
            r6.add(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse r0 = (com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse) r0
            if (r0 == 0) goto L_0x00f4
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse$XdtGetCreatorsSignalPlayground r0 = r0.getXdtGetCreatorsSignalPlayground()
            if (r0 == 0) goto L_0x00f4
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse$XdtGetCreatorsSignalPlayground$Signal r0 = r0.getSignal()
            if (r0 == 0) goto L_0x00f4
            com.google.common.collect.ImmutableList r0 = r0.getTestCases()
            if (r0 == 0) goto L_0x00f4
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0086:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r2.next()
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse$XdtGetCreatorsSignalPlayground$Signal$TestCases r0 = (com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases) r0
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse$XdtGetCreatorsSignalPlayground$Signal$TestCases$User r0 = r0.getUser()
            if (r0 == 0) goto L_0x0086
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser r1 = r0.asCreatorInspirationSignalsPlaygroundTestUser()
            if (r1 == 0) goto L_0x0086
            com.instagram.common.session.UserSession r0 = r4.userSession
            X.1E5 r0 = X.1E4.A00(r0)
            com.instagram.user.model.User r0 = r1.asApiTypeModel(r0)
            if (r0 == 0) goto L_0x0086
            r7.add(r0)
            goto L_0x0086
        L_0x00ae:
            X.0eS.A00(r2)
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundDataSource r0 = r8.dataSource
            r3.L$0 = r8
            r3.L$1 = r9
            r3.label = r5
            java.lang.Object r2 = r0.getSignalDetails(r9, r3)
            if (r2 == r1) goto L_0x011c
            r4 = r8
            goto L_0x0028
        L_0x00c2:
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalDetails$1 r3 = new com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalDetails$1
            r3.<init>(r8, r10)
            goto L_0x0012
        L_0x00c9:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x00d1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserItem r0 = new com.instagram.debug.devoptions.signalsplayground.model.TestUserListItem$TestUserItem
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x00d1
        L_0x00e6:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0106
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f4:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
        L_0x00f8:
            r6.addAll(r3)
            X.05G r0 = r4._signalDetailsState
            X.C41847B3o.A1T(r6, r0, r5)
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x0106:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x011a
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x011d
            X.05G r2 = r4._signalDetailsState
            java.lang.String r0 = "error fetching signal details for "
            java.lang.String r1 = X.002.A0R(r0, r9)
            r0 = 0
            X.C41847B3o.A1T(r1, r2, r0)
        L_0x011a:
            X.0gF r1 = X.C60340gF.A00
        L_0x011c:
            return r1
        L_0x011d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository.fetchSignalDetails(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        if (r5 == null) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchSignalRecommendations(java.lang.String r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1
            if (r0 == 0) goto L_0x00b7
            r5 = r13
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1 r5 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b7
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x00a1
            if (r0 != r3) goto L_0x010d
            java.lang.Object r12 = r5.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r5.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r5.L$0
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository r2 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository) r2
            X.0eS.A00(r4)
        L_0x002c:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0104
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r7 = r0.A01
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse r7 = (com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse) r7
            r5 = 0
            if (r7 == 0) goto L_0x0116
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground r0 = r7.getXdtGetCreatorsSignalPlayground()
            if (r0 == 0) goto L_0x00be
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground$TestCase r0 = r0.getTestCase()
            if (r0 == 0) goto L_0x00be
            com.google.common.collect.ImmutableList r0 = r0.getClips()
            if (r0 == 0) goto L_0x00be
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x0059:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r9.next()
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground$TestCase$Clips r0 = (com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse.XdtGetCreatorsSignalPlayground.TestCase.Clips) r0
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground$TestCase$Clips$Media r0 = r0.getMedia()
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia r8 = r0.asCreatorInspirationSignalsPlaygroundClipsMedia()
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia$User r0 = r8.getUser()
            if (r0 == 0) goto L_0x009f
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTestUser r1 = r0.asCreatorInspirationSignalsPlaygroundTestUser()
            if (r1 == 0) goto L_0x009f
            com.instagram.common.session.UserSession r0 = r2.userSession
            X.1E5 r0 = X.1E4.A00(r0)
            com.instagram.user.model.User r6 = r1.asApiTypeModel(r0)
        L_0x0083:
            com.instagram.common.session.UserSession r0 = r2.userSession
            X.1E5 r0 = X.1E4.A00(r0)
            X.1Xj r1 = r8.asApiTypeModel(r0)
            X.1Xy r0 = r1.A0C
            r0.Epn(r6)
            X.4bN r1 = X.C295375o3.A02(r1)
            com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$ClipsRecommendation r0 = new com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$ClipsRecommendation
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x0059
        L_0x009f:
            r6 = r5
            goto L_0x0083
        L_0x00a1:
            X.0eS.A00(r4)
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundDataSource r0 = r10.dataSource
            r5.L$0 = r10
            r5.L$1 = r11
            r5.L$2 = r12
            r5.label = r3
            java.lang.Object r4 = r0.getSignalRecommendations(r11, r12, r5)
            if (r4 == r1) goto L_0x013e
            r2 = r10
            goto L_0x002c
        L_0x00b7:
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1 r5 = new com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1
            r5.<init>(r10, r13)
            goto L_0x0012
        L_0x00be:
            r4 = r5
        L_0x00bf:
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground r0 = r7.getXdtGetCreatorsSignalPlayground()
            if (r0 == 0) goto L_0x0112
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground$TestCase r0 = r0.getTestCase()
            if (r0 == 0) goto L_0x0112
            com.google.common.collect.ImmutableList r0 = r0.getAudios()
            if (r0 == 0) goto L_0x0112
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x00d9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r6.next()
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground$TestCase$Audios r0 = (com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse.XdtGetCreatorsSignalPlayground.TestCase.Audios) r0
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse$XdtGetCreatorsSignalPlayground$TestCase$Audios$AudioInfo r0 = r0.getAudioInfo()
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio r1 = r0.asCreatorInspirationSignalsPlaygroundAudio()
            com.instagram.common.session.UserSession r0 = r2.userSession
            X.1E5 r0 = X.1E4.A00(r0)
            com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf r0 = r1.asApiTypeModel(r0)
            X.Uq6 r1 = r2.createAudioTrackItem(r0)
            com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$AudioRecommendation r0 = new com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$AudioRecommendation
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x00d9
        L_0x0104:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0126
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0112:
            if (r4 != 0) goto L_0x011b
            if (r5 != 0) goto L_0x011a
        L_0x0116:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
        L_0x011a:
            r4 = r5
        L_0x011b:
            X.05G r0 = r2._signalRecommendationsState
            X.C41847B3o.A1T(r4, r0, r3)
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x0126:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x013c
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x013f
            X.05G r2 = r2._signalRecommendationsState
            java.lang.String r1 = "error fetching signal details for "
            java.lang.String r0 = ", "
            java.lang.String r1 = X.002.A0u(r1, r11, r0, r12)
            r0 = 0
            X.C41847B3o.A1T(r1, r2, r0)
        L_0x013c:
            X.0gF r1 = X.C60340gF.A00
        L_0x013e:
            return r1
        L_0x013f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository.fetchSignalRecommendations(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchSignals(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1
            if (r0 == 0) goto L_0x007f
            r5 = r7
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1 r5 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x006e
            if (r0 != r3) goto L_0x008a
            java.lang.Object r2 = r5.L$0
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository r2 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository) r2
            X.0eS.A00(r4)
        L_0x0024:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0065
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse r0 = (com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse) r0
            if (r0 == 0) goto L_0x0060
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse$XdtGetCreatorsSignalPlayground r0 = r0.getXdtGetCreatorsSignalPlayground()
            if (r0 == 0) goto L_0x0060
            com.google.common.collect.ImmutableList r1 = r0.getSignals()
            if (r1 == 0) goto L_0x0060
        L_0x0042:
            X.05G r0 = r2._signalsState
            X.C41847B3o.A1T(r1, r0, r3)
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x004d:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x005d
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0085
            X.05G r2 = r2._signalsState
            java.lang.String r1 = "error fetching signals"
            r0 = 0
            X.C41847B3o.A1T(r1, r2, r0)
        L_0x005d:
            X.0gF r1 = X.C60340gF.A00
        L_0x005f:
            return r1
        L_0x0060:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            goto L_0x0042
        L_0x0065:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x006e:
            X.0eS.A00(r4)
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundDataSource r0 = r6.dataSource
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r4 = r0.getSignals(r5)
            if (r4 == r1) goto L_0x005f
            r2 = r6
            goto L_0x0024
        L_0x007f:
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1 r5 = new com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0085:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository.fetchSignals(X.4D7):java.lang.Object");
    }

    public final AnonymousClass0Ud getSignalDetailsState() {
        return this.signalDetailsState;
    }

    public final AnonymousClass0Ud getSignalRecommendationsState() {
        return this.signalRecommendationsState;
    }

    public final AnonymousClass0Ud getSignalsState() {
        return this.signalsState;
    }

    private final C16181Uq6 createAudioTrackItem(TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf) {
        String str;
        boolean z;
        Integer num;
        Integer num2;
        Boolean Cde;
        if (trackOrOriginalSoundSchemaIntf.C92() != null) {
            TrackData C92 = trackOrOriginalSoundSchemaIntf.C92();
            if (C92 != null) {
                String audioClusterId = C92.getAudioClusterId();
                if (audioClusterId != null) {
                    String title = C92.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String displayArtist = C92.getDisplayArtist();
                    if (displayArtist == null) {
                        displayArtist = "";
                    }
                    TrackMetadata BSi = trackOrOriginalSoundSchemaIntf.BSi();
                    if (BSi != null) {
                        str = BSi.getFormattedClipsMediaCount();
                    } else {
                        str = null;
                    }
                    ImageUrl Arr = C92.Arr();
                    boolean isExplicit = C92.isExplicit();
                    TrackMetadata BSi2 = trackOrOriginalSoundSchemaIntf.BSi();
                    if (BSi2 == null || (Cde = BSi2.Cde()) == null) {
                        z = false;
                    } else {
                        z = Cde.booleanValue();
                    }
                    MusicDataSource musicDataSource = new MusicDataSource((Uri) null, AudioType.MUSIC, C92.getProgressiveDownloadUrl(), C92.getDashManifest(), C92.getId(), C92.getArtistId());
                    List BDX = C92.BDX();
                    AudioPageMetadata A03 = LT9.A03(C92, false);
                    TrackMetadata BSi3 = trackOrOriginalSoundSchemaIntf.BSi();
                    if (BSi3 != null) {
                        num = BSi3.C9r();
                    } else {
                        num = null;
                    }
                    TrackMetadata BSi4 = trackOrOriginalSoundSchemaIntf.BSi();
                    if (BSi4 != null) {
                        num2 = BSi4.BfI();
                    } else {
                        num2 = null;
                    }
                    return new C16181Uq6(A03, Arr, musicDataSource, (Integer) null, num, num2, audioClusterId, title, displayArtist, str, (String) null, C92.getAudioAssetId(), BDX, isExplicit, z, false, false);
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (trackOrOriginalSoundSchemaIntf.BZA() != null) {
            OriginalSoundDataIntf BZA = trackOrOriginalSoundSchemaIntf.BZA();
            if (BZA != null) {
                String audioAssetId = BZA.getAudioAssetId();
                String originalAudioTitle = BZA.getOriginalAudioTitle();
                String username = BZA.BEv().getUsername();
                String formattedClipsMediaCount = BZA.getFormattedClipsMediaCount();
                return new C16181Uq6(LT9.A01((AudioFilterType) null, BZA, false), BZA.BEv().Bh3(), new MusicDataSource((Uri) null, AudioType.ORIGINAL_AUDIO, BZA.getProgressiveDownloadUrl(), BZA.getDashManifest(), BZA.getAudioAssetId(), BZA.BEv().getId()), (Integer) null, BZA.C9r(), BZA.BfI(), audioAssetId, originalAudioTitle, username, formattedClipsMediaCount, (String) null, (String) null, AnonymousClass7TE.A1I(0), BZA.isExplicit(), BZA.AqB().isTrendingInClips(), false, true);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A00(2515));
        }
    }

    public CreatorInspirationSignalsPlaygroundRepository(UserSession userSession2, CreatorInspirationSignalsPlaygroundDataSource creatorInspirationSignalsPlaygroundDataSource) {
        AnonymousClass7TG.A1O(userSession2, creatorInspirationSignalsPlaygroundDataSource);
        this.userSession = userSession2;
        this.dataSource = creatorInspirationSignalsPlaygroundDataSource;
        C59702JUj jUj = C59702JUj.A00;
        02z A01 = 106.A01(jUj);
        this._signalsState = A01;
        this.signalsState = A01;
        02z A012 = 106.A01(jUj);
        this._signalDetailsState = A012;
        this.signalDetailsState = A012;
        02z A013 = 106.A01(jUj);
        this._signalRecommendationsState = A013;
        this.signalRecommendationsState = A013;
    }
}
