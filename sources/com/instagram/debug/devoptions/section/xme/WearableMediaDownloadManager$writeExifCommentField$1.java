package com.instagram.debug.devoptions.section.xme;

import X.0KC;
import X.0Yt;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11354SOn;
import X.C13589TdH;
import X.C262224Cq;
import X.C60340gF;
import X.C66093MBb;
import X.C9598Rdc;
import X.C9606Rdk;
import X.DbW;
import X.Pxh;
import X.SFQ;
import X.SRj;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$writeExifCommentField$1", f = "WearableMediaDownloadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WearableMediaDownloadManager$writeExifCommentField$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ String $commentText;
    public final /* synthetic */ ExecutorService $executorService;
    public final /* synthetic */ File $resultFile;
    public final /* synthetic */ MediaMetadataRetriever $retriever;
    public final /* synthetic */ C13589TdH $tempFileProvider;
    public int label;
    public final /* synthetic */ WearableMediaDownloadManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WearableMediaDownloadManager$writeExifCommentField$1(MediaMetadataRetriever mediaMetadataRetriever, File file, WearableMediaDownloadManager wearableMediaDownloadManager, String str, ExecutorService executorService, C13589TdH tdH, AnonymousClass4D7 r8) {
        super(2, r8);
        this.$retriever = mediaMetadataRetriever;
        this.$resultFile = file;
        this.this$0 = wearableMediaDownloadManager;
        this.$commentText = str;
        this.$executorService = executorService;
        this.$tempFileProvider = tdH;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$writeExifCommentField$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        return new WearableMediaDownloadManager$writeExifCommentField$1(this.$retriever, this.$resultFile, this.this$0, this.$commentText, this.$executorService, this.$tempFileProvider, r10);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((WearableMediaDownloadManager$writeExifCommentField$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            try {
                this.$retriever.setDataSource(this.$resultFile.getCanonicalPath());
                int A07 = Pxh.A07(this.$retriever, 18);
                int A072 = Pxh.A07(this.$retriever, 19);
                int A073 = Pxh.A07(this.$retriever, 9);
                this.$retriever.release();
                Context context = this.this$0.context;
                File file = this.$resultFile;
                LinkedHashMap A074 = 0Yt.A07(DbW.A1b(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, this.$commentText));
                0qQ.A0B(file, 1);
                C11354SOn A00 = C9606Rdk.A00(context, file, true);
                if (A00 == null) {
                    A00 = null;
                } else {
                    SRj.A03(A00, (String) null, A074, A07, A072, true);
                }
                Context context2 = this.this$0.context;
                ExecutorService executorService = this.$executorService;
                File file2 = this.$resultFile;
                C13589TdH tdH = this.$tempFileProvider;
                0qQ.A0B(context2, 0);
                AnonymousClass7TF.A1B(executorService, 1, file2);
                0qQ.A0B(tdH, 7);
                this.this$0.copyFile(C9598Rdc.A00(context2, (C66093MBb) null, A00, tdH, (MediaComposition) null, (SFQ) null, file2, executorService, 0, A073, 1, -1, true, false, false, false, false, false, false, false, false), this.$resultFile);
            } catch (IllegalArgumentException e) {
                0KC.A0F(WearableMediaDownloadManager.TAG, "Error with MediaMetadataRetriever", e);
            }
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0x();
    }
}
