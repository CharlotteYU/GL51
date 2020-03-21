package gl51.service.lmpl

import gl51.data.Picture
import gl51.service.FetchService
import gl51.service.FiligraneService
import gl51.service.ThumbnailService

import javax.inject.Inject
@Singleton
class Thumbnaillmpl implements ThumbnailService {

    @Inject FiligraneService filigraneService

    Picture thumbnail() {
        Picture picture = Fetchlmpl.fetch()
        picture.px_x(50)
        picture.px_y(50)
        filigraneService.addfiligrane(picture)

        return picture


    }
}
