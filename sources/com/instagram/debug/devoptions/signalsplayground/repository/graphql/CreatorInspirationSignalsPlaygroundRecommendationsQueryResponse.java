package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C250673ls;
import com.google.common.collect.ImmutableList;

public interface CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse extends C250673ls {

    public interface XdtGetCreatorsSignalPlayground extends C250673ls {

        public interface TestCase extends C250673ls {

            public interface Audios extends C250673ls {

                public interface AudioInfo extends C250673ls {
                    CreatorInspirationSignalsPlaygroundAudio asCreatorInspirationSignalsPlaygroundAudio();
                }

                AudioInfo getAudioInfo();
            }

            public interface Clips extends C250673ls {

                public interface Media extends C250673ls {
                    CreatorInspirationSignalsPlaygroundClipsMedia asCreatorInspirationSignalsPlaygroundClipsMedia();
                }

                Media getMedia();
            }

            ImmutableList getAudios();

            ImmutableList getClips();
        }

        TestCase getTestCase();
    }

    XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground();
}
