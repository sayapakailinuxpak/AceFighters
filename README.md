# AceFighters
My favorite fighter jets from fighter to multirole class :sunglasses:

<img src="https://user-images.githubusercontent.com/55786451/114050117-32484900-98b6-11eb-8778-f8c04915a9a6.jpeg" width="250px"/>

## Unit Test Cases
**MoviewRepository**
- **getAllMovies_success_notNullReturned()** = memastikan data movie tidak null
- **getAllMovies_success_numberOfMoviesIsEqualToNumberOfDummyMovies()** = memastikan jumlah data movie sudah sesuai harapan
- **getAllTVs_success_notNullReturned()** = memastikan data tv show tidak null
- **getAllTVs_success_numberOfTVsIsEqualToNumberOfDummyTVs()** = memastikan jumlah data tv show sudah sesuai harapan
- **getMovieDetailById_success_notNullReturned()** = memastikan data movie detail tidak null
- **getMovieDetailById_success_movieDataIsEqualToDummyMovieData()** = memastikan data movie detail sudah sesuai harapan 
- **getTVDetailById_success_notNullReturned()** = memastikan data tv show detail tidak null
- **getTVDetailById_success_tvDataIsEqualToDummyTVData()** = memastikan data tv show detail sudah sesuai harapan 
- **getAllBookmarkedMovies_success_bookmarkedMoviesNotNullAndSizeIsValid()** = memastikan data movie favorite tidak null dan jumlahnya sudah sesuai harapan
- **getAllBookmarkedTVs_success_bookmarkedTVsNotNullAndSizeIsValid()** = memastikan data tv show favorite tidak null dan jumlahnya sudah sesuai harapan

**MovieViewModel**
- **getAllMovies_success_shouldBeSuccessReturned()** = memastikan data movie berhasil didapatkan dan jumlahnya sudah sesuai harapan
- **getAllMovies_success_butAllMoviesIsEmpty()** = memastikan data movie boleh empty
- **getAllMovies_error_shouldBeError()** = memastikan data movie error dan menampilkan pesan error sesuai dengan harapan 

**TVShowViewModel**
- **getAllTVs_success_shouldBeSuccessReturned()** = memastikan data tv show berhasil didapatkan dan jumlahnya sudah sesuai harapan 
- **getAllTVs_success_butAllTVsIsEmpty()** = memastikan data tv show boleh empty
- **getAllTVs_error_shouldBeError()** = memastikan data tv show error dan menampilkan pesan error sesuai dengan harapan

**DetailViewModel**
- **getMovieDetailById_success_validMovieReturned()** = memastikan data movie detail tidak null dan sudah sesuai dengan harapan 
- **getTVDetailById_success_validTVReturned()** = memastikan data tv show detail tidak null dan sudah sesuai dengan harapan

**FavoriteMovieViewModel**
- **getAllBookmarkedMovies_success_shouldBeSuccessReturned()** = memastikan data favorite movie berhasil didapatkan dan jumlahnya sudah sesuai dengan harapan 
- **getAllBookmarkedMovies_success_butAllMoviesIsEmpty()** = memastikan data favorite movie boleh empty

**FavoriteTVViewModel**
- **getAllBookmarkedTVs_success_shouldBeSuccessReturned()** = memastikan data favorite tv show berhasil didapatkan dan jumlahnya sudah sesuai dengan harapan 
- **getAllBookmarkedTVs_success_butAllTVsIsEmpty()** = memastikan data favorite tv show boleh empty


## Instrumentation Test Cases
**HomeActivityTest**
- **tc1_testLoadAllMoviesAsync_checkIsDisplayedAndScrollToLastItem()**
  - Memastikan recyclerview movie berhasil ditampilkan
  - Memastikan data movie berhasil ditampilkan semua
  - Scroll recyclerview ke item terakhir
 
- **tc2_testLoadMovieItemDetail()**
  - Melakukan klik pada recyclerview movie di item ke-0
  - Memastikan semua view component movie detail berhasil ditampilkan
  - Bookmark movie detail tersebut
  - Menekan tombol back
  
- **tc3_testLoadAllTVShowsAsync_checkIsDisplayedAndScrollToLastItem()** 
  - Melakukan swipe ke kiri pada view pager di HomeActivity
  - Memastikan recyclerview tv show berhasil ditampilkan
  - Memastikan data tv show sudah ditampilkan semua
  - Scroll recyclerview ke item terakhir

- **tc4_testLoadTVShowItemDetail()**
  - Melakukan klik pada recyclerview tv show item di item ke-0
  - Memastikan semua view component tv show detail berhasil ditampilkan
  - Bookmark tv show detail tersebut
  - Menekan tombol back

- **tc5_testBookmarkMovieFromDetailActivity()
