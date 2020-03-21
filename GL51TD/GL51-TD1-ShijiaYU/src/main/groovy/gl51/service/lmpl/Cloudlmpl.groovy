package gl51.service.lmpl

import gl51.data.Picture
import gl51.service.CloudService
import gl51.service.RedimensionService
import gl51.service.ThumbnailService

import javax.inject.Inject
@Singleton
class Cloudlmpl implements CloudService {
    @Inject RedimensionService redimensionService
    @Inject ThumbnailService thumbnailService

    boolean transferCloud() {

        Picture picture, thumnail
        picture = redimensionService.redimension()
        thumnail = thumbnailService.thumbnail()
        // to cloud
        return true
    }
}
